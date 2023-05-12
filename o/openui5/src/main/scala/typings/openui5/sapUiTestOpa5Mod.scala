package typings.openui5

import typings.openui5.QUnit.Assert
import typings.openui5.anon.AutoWait
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
      * Extends and overwrites default values of the {@link sap.ui.test.Opa.Config}. Most frequent usecase:
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
    options: Config): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendConfig")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * @SINCE 1.29.0
      *
      * Gives access to a singleton object you can save values in. See {@link sap.ui.test.Opa.getContext} for
      * the description
      *
      * @returns the context object
      */
    inline def getContext(): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")().asInstanceOf[Record[String, Any]]
    
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
    sTestLibName: String): Record[String, String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTestLibConfig")(sTestLibName.asInstanceOf[js.Any]).asInstanceOf[Record[String, String | Null]]
    
    /**
      * Returns the QUnit utils object in the current context. If an iframe is launched, it will return the iframe's
      * QUnit utils.
      *
      * @returns The QUnit utils
      */
    inline def getUtils(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getUtils")().asInstanceOf[Any]
    
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
  
  type Action = (js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default | Null, Unit]) | typings.openui5.sapUiTestActionsActionMod.default
  
  trait BaseParameters
    extends StObject
       with typings.openui5.sapUiTestOpaMod.BaseParameters {
    
    /**
      * @since 1.42 Only has an effect if set to true. Since 1.53 it can also be a plain object. When autoWait
      * is true, the waitFor statement will not execute success callbacks as long as there is pending asynchronous
      * work such as for example: open XMLHTTPRequests (requests to a server), scheduled delayed work and promises,
      * unfinished UI navigation. In addition, the control state will be checked with the {@link sap.ui.test.matchers.Interactable}
      * matcher, and the control will have to be enabled. So when autoWait is enabled, success behaves like an
      * action in terms of waiting. It is recommended to set this value to true for all your waitFor statements
      * using:
      * ```javascript
      *
      *     Opa5.extendConfig({
      *         autoWait: true
      *     });
      * ```
      *  Why it is recommended: When writing a huge set of tests and executing them frequently you might face
      * tests that are sometimes successful but sometimes they are not. Setting the autoWait to true should stabilize
      * most of those tests. The default "false" could not be changed since it causes existing tests to fail.
      * There are cases where you do not want to wait for controls to be "Interactable": For example when you
      * are testing the Busy indication of your UI during the sending of a request. But these cases are the exception
      * so it is better to explicitly adding autoWait: false to this waitFor.
      * ```javascript
      *
      *     this.waitFor({
      *         id: "myButton",
      *         autoWait: false,
      *         success: function (oButton) {
      *              Opa5.assert.ok(oButton.getBusy(), "My Button was busy");
      *         }
      *     });
      * ```
      *  This is also the easiest way of migrating existing tests. First extend the config, then see which waitFors
      * will time out and finally disable autoWait in these tests.
      */
    var autoWait: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @since 1.80 If set to true, Opa5 will match only editable controls. If set to false, Opa5 will match
      * both editable and non-editable controls.
      */
    var editable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @since 1.66 If set to false, Opa5 will look for both enabled and disabled controls. Note that this option's
      * default value is related to the autoWait mechanism:
      * 	 -  When autoWait is enabled globally or in the current waitFor, the default value for options.enabled
      * 			is true.
      * 	 -  When autoWait is not used, the default value for options.enabled is false.  This means that
      * 			if you use autoWait and you want to find a disabled control, you need to explicitly set options.enabled
      * 			to false.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * viewName prefix. Recommended to be set in {@link sap.ui.test.Opa5.extendConfig} instead.
      */
    var viewNamespace: js.UndefOr[String] = js.undefined
    
    /**
      * If set to false, Opa5 will also look for unrendered and invisible controls.
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object BaseParameters {
    
    inline def apply(): BaseParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseParameters] (val x: Self) extends AnyVal {
      
      inline def setAutoWait(value: Boolean): Self = StObject.set(x, "autoWait", value.asInstanceOf[js.Any])
      
      inline def setAutoWaitUndefined: Self = StObject.set(x, "autoWait", js.undefined)
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setViewNamespace(value: String): Self = StObject.set(x, "viewNamespace", value.asInstanceOf[js.Any])
      
      inline def setViewNamespaceUndefined: Self = StObject.set(x, "viewNamespace", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait Chain extends Opa5 {
    
    /**
      * A reference to the same `sap.ui.test.Opa5` instance that can be used for chaining statements
      */
    var and: Opa5 = js.native
  }
  
  trait Config
    extends StObject
       with BaseParameters {
    
    /**
      * A new Opa5 instance
      */
    var actions: js.UndefOr[Opa5] = js.undefined
    
    /**
      * object with URI parameters for the tested app - since 1.48
      */
    var appParams: js.UndefOr[Record[String, String]] = js.undefined
    
    /**
      * A new Opa5 instance
      */
    var arrangements: js.UndefOr[Opa5] = js.undefined
    
    /**
      * A new Opa5 instance
      */
    var assertions: js.UndefOr[Opa5] = js.undefined
    
    /**
      * The value is a number representing milliseconds. The default values are 0 or 50 (depending on the browser).
      * The executionDelay will slow down the execution of every single waitFor statement to be delayed by the
      * number of milliseconds. This does not effect the polling interval it just adds an initial pause. Use
      * this parameter to slow down OPA when you want to watch your test during development or checking the UI
      * of your app. It is not recommended to use this parameter in any automated test executions.
      */
    var executionDelay: js.UndefOr[int] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setActions(value: Opa5): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setAppParams(value: Record[String, String]): Self = StObject.set(x, "appParams", value.asInstanceOf[js.Any])
      
      inline def setAppParamsUndefined: Self = StObject.set(x, "appParams", js.undefined)
      
      inline def setArrangements(value: Opa5): Self = StObject.set(x, "arrangements", value.asInstanceOf[js.Any])
      
      inline def setArrangementsUndefined: Self = StObject.set(x, "arrangements", js.undefined)
      
      inline def setAssertions(value: Opa5): Self = StObject.set(x, "assertions", value.asInstanceOf[js.Any])
      
      inline def setAssertionsUndefined: Self = StObject.set(x, "assertions", js.undefined)
      
      inline def setExecutionDelay(value: int): Self = StObject.set(x, "executionDelay", value.asInstanceOf[js.Any])
      
      inline def setExecutionDelayUndefined: Self = StObject.set(x, "executionDelay", js.undefined)
    }
  }
  
  trait ControlsBaseSelector
    extends StObject
       with BaseParameters {
    
    /**
      * Available since 1.34.0. An array of functions or Actions or a mixture of both. An action has an 'executeOn'
      * function that will receive a single control as a parameter. If there are multiple actions defined all
      * of them will be executed (first in first out) on each control of, similar to the matchers. Here is one
      * of the most common usages: ` function (sButtonId) { // executes a Press on a button with a specific id
      * new Opa5().waitFor({ id: sButtonId, actions: new Press() }); }; ` But actions will only be executed once
      * and only after the check function returned true. Before actions are executed the {@link sap.ui.test.matchers.Interactable}
      * matcher and the internal autoWait logic will check if the Control is currently able to perform actions
      * if it is not, Opa5 will try again after the 'pollingInterval'. That means actions will only be executed
      * if:
      * 	 -  Controls and their parents are visible, not busy and not hidden behind a blocking layer
      * 	 -  The controls are not hidden behind static elements such as dialogs
      * 	 -  There is no pending asynchronous work performed by the application   If there are multiple
      * 			controls in Opa5's result set the action will be executed on all of them. The actions will be invoked
      * 			directly before success is called. In the documentation of the success parameter there is a list of conditions
      * 			that have to be fulfilled. They also apply for the actions. There are some predefined actions in the
      * 			{@link sap.ui.test.actions} namespace. since 1.42 an Action may add other waitFors. The next action or
      * 			the success handler will not be executed until the waitFor of the action has finished. An example:
      * ```javascript
      *
      *     this.waitFor({
      *         id: "myButton",
      *         actions: function (oButton) {
      *            // this action is executed first
      *            this.waitFor({
      *              id: "anotherButton",
      *              actions: function () {
      *                // This is the second function that will be executed
      *                // Opa will also wait until anotherButton is Interactable before executing this function
      *              },
      *              success: function () {
      *                // This is the third function that will be executed
      *              }
      *            })
      *         },
      *         success: function () {
      *             // This is the fourth function that will be executed
      *         }
      *     });
      *     ```
      *  Executing multiple actions will not wait between actions for a control to become "Interactable" again.
      * If you need waiting between actions you need to split the actions into multiple 'waitFor' statements.
      */
    var actions: js.UndefOr[Action | js.Array[Action]] = js.undefined
    
    /**
      * Selects all control by their type. It is usually combined with a viewName or searchOpenDialogs. If no
      * control is matching the type, an empty array will be returned. Here are some samples:
      * ```javascript
      *
      *         this.waitFor({
      *             controlType: "sap.m.Button",
      *             success: function (aButtons) {
      *                 // aButtons is an array of all visible buttons
      *             }
      *         });
      *
      *         // control type will also return controls that extend the control type
      *         // this will return an array of visible sap.m.List and sap.m.Table since both extend List base
      *         this.waitFor({
      *             controlType: "sap.m.ListBase",
      *             success: function (aLists) {
      *                 // aLists is an array of all visible Tables and Lists
      *             }
      *         });
      *
      *         // control type is often combined with viewName - only controls that are inside of the view
      *         // and have the correct type will be returned
      *         this.waitFor({
      *             viewName: "my.View"
      *             controlType: "sap.m.Input",
      *             success: function (aInputs) {
      *                 // aInputs are all sap.m.Inputs inside of a view called 'my.View'
      *             }
      *         });
      *     ```
      */
    var controlType: js.UndefOr[String] = js.undefined
    
    /**
      * Invoked when the timeout is reached and the check never returned true.
      */
    var error: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Will be displayed as an errorMessage depending on your unit test framework. Currently the only adapter
      * for Opa5 is QUnit. This message is displayed if Opa5 has reached its timeout before QUnit has reached
      * it.
      */
    var errorMessage: js.UndefOr[String] = js.undefined
    
    /**
      * @since 1.63 The ID of a fragment. If set, controls will match only if their IDs contain the fragment
      * ID prefix.
      */
    var fragmentId: js.UndefOr[String] = js.undefined
    
    /**
      * @since 1.80 If set to true, the {@link sap.ui.test.matchers.Interactable} matcher will be applied. If
      * autoWait is true, this option has no effect and interactable will always be true. If autoWait is false,
      * which is the default state, the value of the interactable property will have an effect. When interactable
      * is true, enabled will also be set to true, unless declared otherwise.
      */
    var interactable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Matchers used to filter controls. Could be a function, a single matcher instance, an array of matcher
      * instances, or, since version 1.72, a plain object to specify matchers declaratively. For a full list
      * of built-in matchers, see {@link sap.ui.test.matchers}.
      *
      * Matchers are applied to each control found by the `waitFor` function. The matchers are a pipeline: the
      * first matcher gets a control as an input parameter, each subsequent matcher gets the same input as the
      * previous one, if the previous output is `true`.
      *
      * If the previous output is a truthy value, the next matcher will receive this value as an input parameter.
      * If there is a matcher that does not match a control (for example, returns a falsy value), then the control
      * is filtered out.
      *
      * Check function is only called if the matchers matched at least one control, for example, it is not called
      * if matchers filter out all controls/values. Check and success are be called with all matching controls
      * as an input parameter. A matcher inline function has one parameter - an array of controls, and returns
      * an array of the filtered controls.
      *
      * A matcher instance could extend `sap.ui.test.matchers.Matcher` and must have a method with name `isMatching`,
      * that accepts an array of controls and returns an array of the filtered controls.
      *
      * A declarative matcher object is a set of key-value pairs created by the object literal notation, such
      * that:
      * 	Every key is a name of an OPA5 built-in matcher, starting with a lower case letter. The following example
      * declares an `sap.ui.test.matchers.Properties` matcher:
      * ```javascript
      *             matchers: {
      *                 properties: {<...>}
      *             }
      * ```
      *   Every value is an object or an array or objects. Each object represents the properties that
      * will be fed to one instance of the declared matcher. The following example declares one `sap.ui.test.matchers.Properties`
      * matcher for property "text" and value "hello":
      * ```javascript
      *             matchers: {
      *                 properties: {text: "hello"}
      *             }
      * ```
      *
      *
      * The following example declares two `sap.ui.test.matchers.Properties` matchers (the `text` property with
      * value `hello` and the `number` property with value `0`):
      * ```javascript
      *             matchers: {
      *                 properties: [
      *                     {text: "hello"},
      *                     {number: 0}
      *             ]}
      * ```
      */
    var matchers: js.UndefOr[Matcher | js.Array[Matcher]] = js.undefined
    
    /**
      * If set to true, Opa5 will only look in open dialogs. All the other values except control type will be
      * ignored
      */
    var searchOpenDialogs: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @since 1.62 The ID of a view. Can be used alone or in combination with viewName and viewNamespace. *
      * Always set view ID if there are multiple views with the same name.
      */
    var viewId: js.UndefOr[String] = js.undefined
    
    /**
      * The name of a view. If viewName is set, controls will be searched only inside this view. If control ID
      * is given, it will be considered to be relative to the view.
      */
    var viewName: js.UndefOr[String] = js.undefined
  }
  object ControlsBaseSelector {
    
    inline def apply(): ControlsBaseSelector = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ControlsBaseSelector]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ControlsBaseSelector] (val x: Self) extends AnyVal {
      
      inline def setActions(value: Action | js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsFunction1(value: /* p1 */ typings.openui5.sapUiCoreElementMod.default | Null => Unit): Self = StObject.set(x, "actions", js.Any.fromFunction1(value))
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setControlType(value: String): Self = StObject.set(x, "controlType", value.asInstanceOf[js.Any])
      
      inline def setControlTypeUndefined: Self = StObject.set(x, "controlType", js.undefined)
      
      inline def setError(value: js.Function): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFragmentId(value: String): Self = StObject.set(x, "fragmentId", value.asInstanceOf[js.Any])
      
      inline def setFragmentIdUndefined: Self = StObject.set(x, "fragmentId", js.undefined)
      
      inline def setInteractable(value: Boolean): Self = StObject.set(x, "interactable", value.asInstanceOf[js.Any])
      
      inline def setInteractableUndefined: Self = StObject.set(x, "interactable", js.undefined)
      
      inline def setMatchers(value: Matcher | js.Array[Matcher]): Self = StObject.set(x, "matchers", value.asInstanceOf[js.Any])
      
      inline def setMatchersFunction1(value: /* p1 */ typings.openui5.sapUiCoreElementMod.default => Unit): Self = StObject.set(x, "matchers", js.Any.fromFunction1(value))
      
      inline def setMatchersUndefined: Self = StObject.set(x, "matchers", js.undefined)
      
      inline def setMatchersVarargs(value: Matcher*): Self = StObject.set(x, "matchers", js.Array(value*))
      
      inline def setSearchOpenDialogs(value: Boolean): Self = StObject.set(x, "searchOpenDialogs", value.asInstanceOf[js.Any])
      
      inline def setSearchOpenDialogsUndefined: Self = StObject.set(x, "searchOpenDialogs", js.undefined)
      
      inline def setViewId(value: String): Self = StObject.set(x, "viewId", value.asInstanceOf[js.Any])
      
      inline def setViewIdUndefined: Self = StObject.set(x, "viewId", js.undefined)
      
      inline def setViewName(value: String): Self = StObject.set(x, "viewName", value.asInstanceOf[js.Any])
      
      inline def setViewNameUndefined: Self = StObject.set(x, "viewName", js.undefined)
    }
  }
  
  type Matcher = (js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit]) | (Record[String, js.Object]) | typings.openui5.sapUiTestMatchersMatcherMod.default
  
  trait MultiControlSelector
    extends StObject
       with ControlsBaseSelector {
    
    /**
      * Will get invoked in every polling interval. If it returns true, the check is successful and the polling
      * will stop. The first parameter passed into the function is the same value that gets passed to the success
      * function. Returning something other than boolean in check will not change the first parameter of success.
      */
    var check: js.UndefOr[
        js.Function1[/* p1 */ js.Array[typings.openui5.sapUiCoreElementMod.default], Boolean]
      ] = js.undefined
    
    /**
      * Regex for matching either the ID of a control, or the ID of a control inside a view.
      *
      * If both a regex and a viewName are provided, Opa5 only looks for controls in the view with a matching
      * ID.
      *
      * Example of a waitFor:
      * ```javascript
      *
      *
      *         this.waitFor({
      *             id: /my/,
      *             viewName: "myView"
      *         });
      *
      * ```
      *  The view that is searched in:
      * ```javascript
      *
      *
      *         <mvc:View xmlns:mvc="sap.ui.core.mvc" xmlns="sap.m">
      *             <Button id="myButton">
      *             </Button>
      *             <Button id="bar">
      *             </Button>
      *             <Button id="baz">
      *             </Button>
      *             <Image id="myImage"></Image>
      *         </mvc:View>
      *
      * ```
      *
      *
      * Will result in matching two controls, the image with the effective ID myView--myImage and the button
      * myView--myButton. Although the IDs of the controls myView--bar and myView--baz contain a my, they will
      * not be matched since only the part you really write in your views will be matched.
      */
    var id: js.UndefOr[js.RegExp] = js.undefined
    
    /**
      * Will get invoked after the following conditions are met:
      * 	 -  One or multiple controls were found using controlType, Id, viewName. If visible is true (it is by
      * 			default), the controls also need to be rendered.
      * 	 -  The whole matcher pipeline returned true for at least one control, or there are no matchers
      * 	 -  The check function returned true, or there is no check function   The first parameter passed
      * 			into the function is an array of controls (viewName, controlType, multiple ID's, regex ID's) that matched
      * 			all matchers. Matchers can alter the array to something different. Please read the documentation of waitFor's
      * 			matcher parameter.
      */
    var success: js.UndefOr[
        js.Function1[/* p1 */ js.Array[typings.openui5.sapUiCoreElementMod.default], Unit]
      ] = js.undefined
  }
  object MultiControlSelector {
    
    inline def apply(): MultiControlSelector = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiControlSelector]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiControlSelector] (val x: Self) extends AnyVal {
      
      inline def setCheck(value: /* p1 */ js.Array[typings.openui5.sapUiCoreElementMod.default] => Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
      
      inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      inline def setId(value: js.RegExp): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setSuccess(value: /* p1 */ js.Array[typings.openui5.sapUiCoreElementMod.default] => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
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
    
    def waitFor(
      /**
      * a superset of the parameters of {@link sap.ui.test.Opa#waitFor}
      */
    options: MultiControlSelector
    ): Chain = js.native
    /**
      *
      * @returns an object extending a jQuery promise. The object is essentially a jQuery promise with an additional
      * "and" method that can be used for chaining waitFor statements. The promise is resolved when the waitFor
      * completes successfully. The promise is rejected with the options object, if an error occurs. In this
      * case, options.errorMessage will contain a detailed error message containing the stack trace and Opa logs.
      */
    def waitFor(
      /**
      * a superset of the parameters of {@link sap.ui.test.Opa#waitFor}
      */
    options: SingleControlSelector
    ): Chain = js.native
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
  
  trait SingleControlSelector
    extends StObject
       with ControlsBaseSelector {
    
    /**
      * Will get invoked in every polling interval. If it returns true, the check is successful and the polling
      * will stop. The first parameter passed into the function is the same value that gets passed to the success
      * function. Returning something other than boolean in check will not change the first parameter of success.
      */
    var check: js.UndefOr[js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Boolean]] = js.undefined
    
    /**
      * The global ID of a control, or the ID of a control inside a view.
      */
    var id: String
    
    /**
      * Will get invoked if the following conditions are met:
      * 	 -  A control was found using viewName and Id that maches any addiotnally specified criteria e.g. controlType,
      * 			matchers. If visible is true (it is by default), the control also needs to be rendered.
      * 	 -  The check function returned true, or there is no check function
      */
    var success: js.UndefOr[js.Function1[/* p1 */ typings.openui5.sapUiCoreElementMod.default, Unit]] = js.undefined
  }
  object SingleControlSelector {
    
    inline def apply(id: String): SingleControlSelector = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleControlSelector]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SingleControlSelector] (val x: Self) extends AnyVal {
      
      inline def setCheck(value: /* p1 */ typings.openui5.sapUiCoreElementMod.default => Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
      
      inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: /* p1 */ typings.openui5.sapUiCoreElementMod.default => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
}
