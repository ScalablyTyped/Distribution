package typings.openui5.sap.ui.test

import typings.openui5.sap.ui.base.Object
import typings.openui5.sap.ui.core.routing.HashChanger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.test.Opa5")
@js.native
/**
  * Helps you when writing tests for UI5 applications.Provides convenience to wait and retrieve for UI5
  * controls without relying on global IDs.Makes it easy to wait until your UI is in the state you need
  * for testing, e.g.: waiting for backend data.
  */
class Opa5 () extends Object {
  /**
    * Create a page object configured as arrangement, action and assertion to the Opa.config.Use it to
    * structure your arrangement, action and assertion based on parts of the screen to avoid name clashes
    * and help to structure your tests.
    * @since 1.25
    * @param mPageObjects undefined
    * @returns mPageObject The created page object. It will look like this:<pre><code> { 
    * &lt;your-page-object-name&gt; : {      actions: // an instance of baseClass or Opa5 with all the
    * actions defined above      assertions: // an instance of baseClass or Opa5 with all the assertions
    * defined above  } }</code></pre>
    */
  def createPageObjects(mPageObjects: js.Any): js.Any = js.native
  /**
    * Waits until all waitFor calls are doneSee {@link sap.ui.test.Opa#.emptyQueue} for the description
    * @returns If the waiting was successful, the promise will be resolved. If not it will be rejected
    */
  def emptyQueue(): js.Any = js.native
  /**
    * Extends and overwrites default values of the {@link sap.ui.test.Opa#.config}.Most frequent
    * usecase:<pre>    <code>        // Every waitFor will append this namespace in front of your viewName
    *        Opa5.extendConfig({           viewNamespace: "namespace.of.my.views."        });        var
    * oOpa = new Opa5();        // Looks for a control with the id "myButton" in a View with the name
    * "namespace.of.my.views.Detail"        oOpa.waitFor({             id: "myButton",            
    * viewName: "Detail"        });        // Looks for a control with the id "myList" in a View with the
    * name "namespace.of.my.views.Master"        oOpa.waitFor({             id: "myList",            
    * viewName: "Master"        });    </code></pre>Sample usage:<pre>    <code>        var oOpa = new
    * Opa5();        // this statement will  will time out after 15 seconds and poll every 400ms.       
    * // those two values come from the defaults of {@link sap.ui.test.Opa#.config}.        oOpa.waitFor({
    *        });        // All wait for statements added after this will take other defaults       
    * Opa5.extendConfig({            timeout: 10,            pollingInterval: 100        });        //
    * this statement will time out after 10 seconds and poll every 100 ms        oOpa.waitFor({        });
    *        // this statement will time out after 20 seconds and poll every 100 ms        oOpa.waitFor({ 
    *           timeout: 20;        });    </code></pre>
    * @since 1.40
    * @param options The values to be added to the existing config
    */
  def extendConfig(options: js.Any): Unit = js.native
  /**
    * Gives access to a singleton object you can save values in.See {@link sap.ui.test.Opa#.getContext}
    * for the description
    * @since 1.29.0
    * @returns the context object
    */
  def getContext(): js.Any = js.native
  /**
    * Returns HashChanger object of the IFrame. If the IFrame is not loaded it will return null.
    * @returns The HashChanger instance
    */
  def getHashChanger(): HashChanger = js.native
  /**
    * Returns the jQuery object of the IFrame. If the IFrame is not loaded it will return null.
    * @returns The jQuery object
    */
  def getJQuery(): typings.jquery.JQueryStatic = js.native
  /**
    * Returns the Opa plugin used for retrieving controls. If an IFrame is used it will return the
    * iFrame's plugin.
    * @returns The plugin instance
    */
  def getPlugin(): OpaPlugin = js.native
  /**
    * Returns QUnit utils object of the IFrame. If the IFrame is not loaded it will return null.
    * @returns The QUnit utils
    */
  def getUtils(): js.Any = js.native
  /**
    * Returns the window object of the IFrame or the current window. If the IFrame is not loaded it will
    * return null.
    * @returns The window of the IFrame
    */
  def getWindow(): js.Any = js.native
  /**
    * Starts an app in an IFrame. Only works reliably if running on the same server.
    * @param sSource The source of the IFrame
    * @param iTimeout The timeout for loading the IFrame in seconds - default is 80
    * @returns A promise that gets resolved on success
    */
  def iStartMyAppInAFrame(sSource: String): js.Any = js.native
  def iStartMyAppInAFrame(sSource: String, iTimeout: Double): js.Any = js.native
  /**
    * Starts a UIComponent.
    * @param oOptions An Object that contains the configuration for starting up a UIComponent.
    * @returns A promise that gets resolved on success.
    */
  def iStartMyUIComponent(oOptions: js.Any): js.Any = js.native
  /**
    * Removes the IFrame from the DOM and removes all the references to its objects
    * @returns A promise that gets resolved on success
    */
  def iTeardownMyAppFrame(): js.Any = js.native
  /**
    * Destroys the UIComponent and removes the div from the dom like all the references on its objects
    * @returns a promise that gets resolved on success.
    */
  def iTeardownMyUIComponent(): js.Any = js.native
  /**
    * Resets Opa.config to its default values.See {@link sap.ui.test.Opa5#waitFor} for the
    * descriptionDefault values for OPA5 are:<ul>	<li>viewNamespace: empty string</li>	<li>arrangements:
    * instance of OPA5</li>	<li>actions: instance of OPA5</li>	<li>assertions: instance of OPA5</li>
    * <li>visible: true</li>	<li>timeout : 15 seconds, is increased to 5 minutes if running in debug mode
    * e.g. with URL parameter sap-ui-debug=true</li>	<li>pollingInterval: 400 milliseconds</li></ul>
    * @since 1.25
    */
  def resetConfig(): Unit = js.native
  /**
    * Clears the queue and stops running tests so that new tests can be run.This means all waitFor
    * statements registered by {@link sap.ui.test.Opa5#waitFor} will not be invoked anymore andthe promise
    * returned by {@link sap.ui.test.Opa5#.emptyQueue} will be rejected.When its called inside of a check
    * in {@link sap.ui.test.Opa5#waitFor}the success function of this waitFor will not be called.
    */
  def stopQueue(): Unit = js.native
  /**
    * Takes the same parameters as {@link sap.ui.test.Opa#waitFor}. Also allows you to specify additional
    * parameters:
    * @param oOptions An Object containing conditions for waiting and callbacks
    * @returns A promise that gets resolved on success
    */
  def waitFor(oOptions: js.Any): js.Any = js.native
}

