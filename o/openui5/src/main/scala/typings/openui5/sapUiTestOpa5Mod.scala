package typings.openui5

import typings.openui5.QUnit.Assert
import typings.openui5.anon.AutoWait
import typings.openui5.anon.Check
import typings.openui5.anon.ComponentConfig
import typings.openui5.jQuery.Promise
import typings.std.HTMLElement
import typings.std.Record
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTestOpa5Mod {
  
  @JSImport("sap/ui/test/Opa5", JSImport.Default)
  @js.native
  /**
    * See:
    * 	{@link topic:2696ab50faad458f9b4027ec2f9b884d Opa5}
    */
  open class default () extends Opa5
  /* static members */
  object default {
    
    @JSImport("sap/ui/test/Opa5", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A map of QUnit-style assertions to be used in an opaTest.
      *
      * Contains all methods available on `QUnit.assert` for the running QUnit version. Available assertions
      * are: `ok`, `equal`, `propEqual`, `deepEqual`, `strictEqual` and their negative counterparts. You can
      * define custom OPA5 assertions in the extensions section of {@link sap.ui.test.Opa5.extendConfig}.
      *
      * Example usage:
      * ```javascript
      *
      *   oOpa5.waitFor({
      *     success: function () {
      *       Opa5.assert.ok(true, "Should be true");
      *     }
      *   });
      * ```
      *
      *
      * For more information, see {@link module:sap/ui/test/opaQunit}.
      */
    @JSImport("sap/ui/test/Opa5", "default.assert")
    @js.native
    def assert: Assert = js.native
    inline def assert_=(x: Assert): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("assert")(x.asInstanceOf[js.Any])
    
    /**
      * @SINCE 1.25
      *
      * Creates a set of page objects, each consisting of actions and assertions and adds them to the Opa configuration.
      *
      * Use page objects to structure your actions and assertions based on parts of the screen. This helps to
      * avoid name clashes and to structure your tests.
      *
      * @returns The created page object. It will look like this:
      * ```javascript
      *
      *     {
      *       <your-page-object-name> : {
      *         actions: // an instance of baseClass or Opa5 with all the actions defined above
      *         assertions: // an instance of baseClass or Opa5 with all the assertions defined above
      *       }
      *     }
      *   ```
      */
    inline def createPageObjects(
      /**
      * Multiple page objects are possible, provide at least actions or assertions
      */
    mPageObjects: Record[String, PageObjectDefinition]
    ): Record[String, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPageObjects")(mPageObjects.asInstanceOf[js.Any]).asInstanceOf[Record[String, js.Object]]
    
    /**
      * Waits until all waitFor calls are done See {@link sap.ui.test.Opa.emptyQueue} for the description
      *
      * @returns If the waiting was successful, the promise will be resolved. If not it will be rejected
      */
    inline def emptyQueue(): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyQueue")().asInstanceOf[Promise[Any]]
    
    /**
      * @SINCE 1.49
      *
      * Extends and overwrites default values of the {@link sap.ui.test.Opa.config}. Most frequent usecase:
      * ```javascript
      *
      *
      *         // Every waitFor will append this namespace in front of your viewName
      *         Opa5.extendConfig({
      *            viewNamespace: "namespace.of.my.views."
      *         });
      *
      *         var oOpa = new Opa5();
      *
      *         // Looks for a control with the id "myButton" in a View with the name "namespace.of.my.views.Detail"
      *         oOpa.waitFor({
      *              id: "myButton",
      *              viewName: "Detail"
      *         });
      *
      *         // Looks for a control with the id "myList" in a View with the name "namespace.of.my.views.Master"
      *         oOpa.waitFor({
      *              id: "myList",
      *              viewName: "Master"
      *         });
      *
      * ```
      *
      *
      * Sample usage:
      * ```javascript
      *
      *
      *         var oOpa = new Opa5();
      *
      *         // this statement will  will time out after 15 seconds and poll every 400ms.
      *         // those two values come from the defaults of {@link sap.ui.test.Opa.config}.
      *         oOpa.waitFor({
      *         });
      *
      *         // All wait for statements added after this will take other defaults
      *         Opa5.extendConfig({
      *             timeout: 10,
      *             pollingInterval: 100
      *         });
      *
      *         // this statement will time out after 10 seconds and poll every 100 ms
      *         oOpa.waitFor({
      *         });
      *
      *         // this statement will time out after 20 seconds and poll every 100 ms
      *         oOpa.waitFor({
      *             timeout: 20;
      *         });
      *
      * ```
      */
    inline def extendConfig(/**
      * The values to be added to the existing config
      */
    options: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendConfig")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * @SINCE 1.29.0
      *
      * Gives access to a singleton object you can save values in. See {@link sap.ui.test.Opa.getContext} for
      * the description
      *
      * @returns the context object
      */
    inline def getContext(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")().asInstanceOf[js.Object]
    
    /**
      * Returns the HashChanger object in the current context. If an iframe is launched, it will return the iframe's
      * HashChanger.
      *
      * @returns The HashChanger instance
      */
    inline def getHashChanger(): typings.openui5.sapUiCoreRoutingHashChangerMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getHashChanger")().asInstanceOf[typings.openui5.sapUiCoreRoutingHashChangerMod.default]
    
    /**
      * Returns the jQuery object in the current context. If an iframe is launched, it will return the iframe's
      * jQuery object.
      *
      * @returns The jQuery object
      */
    inline def getJQuery(): jQuery[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJQuery")().asInstanceOf[jQuery[HTMLElement]]
    
    /**
      * Returns the Opa plugin used for retrieving controls. If an iframe is launched, it will return the iframe's
      * plugin.
      *
      * @returns The plugin instance
      */
    inline def getPlugin(): typings.openui5.sapUiTestOpaPluginMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")().asInstanceOf[typings.openui5.sapUiTestOpaPluginMod.default]
    
    /**
      * @SINCE 1.49
      *
      * Return particular test lib config object. This method is intended to be used by test libraries to access
      * their configuration provided by the test in the testLibs section in {@link sap.ui.test.Opa5.extendConfig}
      *
      * @returns this test library config object or empty object if configuration is not provided
      */
    inline def getTestLibConfig(/**
      * test library name
      */
    sTestLibName: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getTestLibConfig")(sTestLibName.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    /**
      * Returns the QUnit utils object in the current context. If an iframe is launched, it will return the iframe's
      * QUnit utils.
      *
      * @returns The QUnit utils
      */
    inline def getUtils(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getUtils")().asInstanceOf[js.Object]
    
    /**
      * Returns the window object in the current context. If an iframe is launched, it will return the iframe's
      * window.
      *
      * @returns The window of the iframe
      */
    inline def getWindow(): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindow")().asInstanceOf[Window]
    
    /**
      * @SINCE 1.48
      *
      * Starts an app in an iframe. Only works reliably if running on the same server.
      *
      * @returns A promise that gets resolved on success
      */
    inline def iStartMyAppInAFrame(
      /**
      * The source URL of the iframe or, since 1.53, you can provide a startup configuration object as the only
      * parameter.
      */
    vSourceOrOptions: String | AutoWait,
      /**
      * The timeout for loading the iframe in seconds - default is 80.
      */
    iTimeout: js.UndefOr[Double],
      /**
      * Since 1.53, activates autoWait while the application is starting up. This allows more time for application
      * startup and stabilizes tests for slow-loading applications. This parameter is false by default, regardless
      * of the global autoWait value, to prevent issues in existing tests.
      */
    autoWait: js.UndefOr[Boolean],
      /**
      * Since 1.57, sets a fixed width for the iframe.
      */
    width: js.UndefOr[String | Double],
      /**
      * Since 1.57, sets a fixed height for the iframe. Setting width and/or height is useful when testing responsive
      * applications on screens of varying sizes. By default, the iframe dimensions are 60% of the outer window
      * dimensions.
      */
    height: js.UndefOr[String | Double]
    ): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("iStartMyAppInAFrame")(vSourceOrOptions.asInstanceOf[js.Any], iTimeout.asInstanceOf[js.Any], autoWait.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
    
    /**
      * Removes the iframe from the DOM and removes all the references to its objects. Use {@link sap.ui.test.Opa5#hasAppStartedInAFrame}
      * to ensure that an iframe has been started and teardown can be safely performed.
      *
      * @returns A promise that gets resolved on success. If no iframe has been created or an error occurs, the
      * promise is rejected with the options object. A detailed error message containing the stack trace and
      * Opa logs is available in options.errorMessage.
      */
    inline def iTeardownMyAppFrame(): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("iTeardownMyAppFrame")().asInstanceOf[Promise[Any]]
    
    /**
      * @SINCE 1.25
      *
      * Resets Opa.config to its default values. See {@link sap.ui.test.Opa5#waitFor} for the description Default
      * values for OPA5 are:
      * 	 - viewNamespace: empty string
      * 	 - arrangements: instance of OPA5
      * 	 - actions: instance of OPA5
      * 	 - assertions: instance of OPA5
      * 	 - visible: true
      * 	 - enabled: false
      * 	 - editable: false
      * 	 - timeout : 15 seconds, 0 for infinite timeout
      * 	 - pollingInterval: 400 milliseconds
      * 	 - debugTimeout: 0 seconds, infinite timeout by default. This will be used instead of timeout if running
      * 			in debug mode.
      * 	 - autoWait: false - since 1.42
      * 	 - appParams: object with URI parameters for the tested app - since 1.48
      */
    inline def resetConfig(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetConfig")().asInstanceOf[Unit]
    
    /**
      * Clears the queue and stops running tests so that new tests can be run. This means all waitFor statements
      * registered by {@link sap.ui.test.Opa5#waitFor} will not be invoked anymore and the promise returned by
      * {@link sap.ui.test.Opa5.emptyQueue} will be rejected. When its called inside of a check in {@link sap.ui.test.Opa5#waitFor}
      * the success function of this waitFor will not be called.
      */
    inline def stopQueue(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopQueue")().asInstanceOf[Unit]
  }
  
  @js.native
  trait Opa5
    extends typings.openui5.sapUiBaseObjectMod.default {
    
    /**
      * Checks if the application has been started using {@link sap.ui.test.Opa5#iStartMyAppInAFrame} or {@link
      * sap.ui.test.Opa5#iStartMyUIComponent}
      *
      * @returns A boolean indicating whether the application has been started regardless of how it was started
      */
    def hasAppStarted(): Boolean = js.native
    
    /**
      * Checks if the application has been started using {@link sap.ui.test.Opa5#iStartMyAppInAFrame}
      *
      * @returns A boolean indicating whether the application has been started in an iframe
      */
    def hasAppStartedInAFrame(): Boolean = js.native
    
    /**
      * Checks if the application has been started using {@link sap.ui.test.Opa5#iStartMyUIComponent}
      *
      * @returns A boolean indicating whether the application has been started as a UIComponent
      */
    def hasUIComponentStarted(): Boolean = js.native
    
    /**
      * @SINCE 1.48
      *
      * Starts an app in an iframe. Only works reliably if running on the same server.
      *
      * @returns A promise that gets resolved on success
      */
    def iStartMyAppInAFrame(
      /**
      * The source URL of the iframe or, since 1.53, you can provide a startup configuration object as the only
      * parameter.
      */
    vSourceOrOptions: String | AutoWait,
      /**
      * The timeout for loading the iframe in seconds - default is 80
      */
    iTimeout: js.UndefOr[Double],
      /**
      * Since 1.53, activates autoWait while the application is starting up. This allows more time for application
      * startup and stabilizes tests for slow-loading applications. This parameter is false by default, regardless
      * of the global autoWait value, to prevent issues in existing tests.
      */
    autoWait: js.UndefOr[Boolean],
      /**
      * Since 1.57, sets a fixed width for the iframe.
      */
    width: js.UndefOr[String | Double],
      /**
      * Since 1.57, sets a fixed height for the iframe. Setting width and/or height is useful when testing responsive
      * applications on screens of varying sizes. By default, the iframe dimensions are 60% of the outer window
      * dimensions.
      */
    height: js.UndefOr[String | Double]
    ): Promise[Any] = js.native
    
    /**
      * @SINCE 1.48
      *
      * Starts a UIComponent.
      *
      * @returns A promise that gets resolved on success.
      */
    def iStartMyUIComponent(
      /**
      * An Object that contains the configuration for starting up a UIComponent.
      */
    oOptions: ComponentConfig
    ): Promise[Any] = js.native
    
    /**
      * Tears down the started application regardless of how it was started. Removes the iframe launched by {@link
      * sap.ui.test.Opa5#iStartMyAppInAFrame} or destroys the UIComponent launched by {@link sap.ui.test.Opa5#iStartMyUIComponent}.
      * This function is designed to make the test's teardown independent of the startup. Use {@link sap.ui.test.Opa5#hasAppStarted}
      * to ensure that the application has been started and teardown can be safely performed.
      *
      * @returns A promise that gets resolved on success. If nothing has been started or an error occurs, the
      * promise is rejected with the options object. A detailed error message containing the stack trace and
      * Opa logs is available in options.errorMessage.
      */
    def iTeardownMyApp(): Promise[Any] = js.native
    
    /**
      * Removes the iframe from the DOM and removes all the references to its objects Use {@link sap.ui.test.Opa5#hasAppStartedInAFrame}
      * to ensure that an iframe has been started and teardown can be safely performed.
      *
      * @returns A promise that gets resolved on success. If no iframe has been created or an error occurs, the
      * promise is rejected with the options object. A detailed error message containing the stack trace and
      * Opa logs is available in options.errorMessage.
      */
    def iTeardownMyAppFrame(): Promise[Any] = js.native
    
    /**
      * @SINCE 1.48
      *
      * Destroys the UIComponent and removes the div from the dom like all the references on its objects. Use
      * {@link sap.ui.test.Opa5#hasUIComponentStarted} to ensure that a UIComponent has been started and teardown
      * can be safely performed.
      *
      * @returns a promise that gets resolved on success. If no UIComponent has been started or an error occurs,
      * the promise is rejected with the options object. A detailed error message containing the stack trace
      * and Opa logs is available in options.errorMessage.
      */
    def iTeardownMyUIComponent(): Promise[Any] = js.native
    
    def iWaitForPromise(/**
      * promise to schedule on the Opa5 queue
      */
    oPromise: js.Promise[Any]): Promise[Any] = js.native
    /**
      * Schedule a promise on the OPA5 queue.The promise will be executed in order with all waitFors - any subsequent
      * waitFor will be executed after the promise is done. The promise is not directly chained, but instead
      * its result is awaited in a new waitFor statement. This means that any "thenable" should be acceptable.
      *
      * @returns promise which is the result of a {@link sap.ui.test.Opa5#waitFor}
      */
    def iWaitForPromise(/**
      * promise to schedule on the Opa5 queue
      */
    oPromise: Promise[Any]): Promise[Any] = js.native
    
    /**
      * @SINCE 1.48
      *
      * Takes a superset of the parameters of {@link sap.ui.test.Opa#waitFor}.
      *
      * @returns an object extending a jQuery promise. The object is essentially a jQuery promise with an additional
      * "and" method that can be used for chaining waitFor statements. The promise is resolved when the waitFor
      * completes successfully. The promise is rejected with the options object, if an error occurs. In this
      * case, options.errorMessage will contain a detailed error message containing the stack trace and Opa logs.
      */
    def waitFor(
      /**
      * An object containing conditions for waiting and callbacks.
      *
      * The allowed keys are listed below. If a key is not allowed, an error is thrown, stating that "the parameter
      * is not defined in the API".
      *
      * As of version 1.72, in addition to the listed keys, declarative matchers are also allowed. Any matchers
      * declared on the root level of the options object are merged with those declared in `options.matchers`.
      * For details on declarative matchers, see the `options.matchers` property.
      */
    options: Check
    ): js.Object = js.native
  }
  
  trait PageObjectDefinition extends StObject {
    
    /**
      * A map of functions that can be used as arrangement or action in Opa tests. Only the test decides whether
      * a function is used as arrangement or action. Each function typically contains one or multiple `waitFor`
      * statements.
      */
    var actions: js.UndefOr[Record[String, js.Function]] = js.undefined
    
    /**
      * A map of functions that can be used as assertions in Opa tests.
      */
    var assertions: js.UndefOr[Record[String, js.Function]] = js.undefined
    
    /**
      * Base class for the page object's actions and assertions
      */
    var baseClass: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Namespace prefix for the page object's actions and assertions. Use it if you use page objects from multiple
      * projects in the same test build.
      */
    var namespace: js.UndefOr[String] = js.undefined
    
    /**
      * When a `viewId` is given, all `waitFor` calls inside of the page object will get a `viewId` parameter.
      * Use when there are multiple views with the same viewName.
      */
    var viewId: js.UndefOr[String] = js.undefined
    
    /**
      * When a `viewName` is given, all `waitFor` calls inside of the page object will get a `viewName` parameter.
      *
      * Example:
      * ```javascript
      *
      *     Opa5.createPageObjects({
      *       viewName: "myView",
      *       onMyPageWithViewName: {
      *         assertions: {
      *           iWaitForAButtonInMyView: function () {
      *             this.waitFor({
      *               id: "myButton",
      *               success: function (oButton) {
      *                 // the button is defined in the view myView
      *               }
      *             });
      *           }
      *         }
      *       }
      *     });
      *   ```
      *  This saves you repeating the `viewName` in every `waitFor` statement of the page object. It is possible
      * to overwrite the `viewName` of the page object in a specific `waitFor` call. So if you have specified
      * a `viewName: "myView"` in your page object and you want to look for a control with a global ID, you may
      * use `viewName: ""` in a `waitFor` to overwrite the `viewName` of the page object.
      *
      * Example:
      * ```javascript
      *
      *     // waits for a button with the global id "myButton"
      *     this.waitFor({
      *       id: "myButton",
      *       viewName: "",
      *       success: function (oButton) {
      *         // act when button is found
      *       }
      *     });
      *   ```
      */
    var viewName: js.UndefOr[String] = js.undefined
  }
  object PageObjectDefinition {
    
    inline def apply(): PageObjectDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageObjectDefinition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageObjectDefinition] (val x: Self) extends AnyVal {
      
      inline def setActions(value: Record[String, js.Function]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setAssertions(value: Record[String, js.Function]): Self = StObject.set(x, "assertions", value.asInstanceOf[js.Any])
      
      inline def setAssertionsUndefined: Self = StObject.set(x, "assertions", js.undefined)
      
      inline def setBaseClass(value: js.Function): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
      
      inline def setBaseClassUndefined: Self = StObject.set(x, "baseClass", js.undefined)
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setViewId(value: String): Self = StObject.set(x, "viewId", value.asInstanceOf[js.Any])
      
      inline def setViewIdUndefined: Self = StObject.set(x, "viewId", js.undefined)
      
      inline def setViewName(value: String): Self = StObject.set(x, "viewName", value.asInstanceOf[js.Any])
      
      inline def setViewNameUndefined: Self = StObject.set(x, "viewName", js.undefined)
    }
  }
}
