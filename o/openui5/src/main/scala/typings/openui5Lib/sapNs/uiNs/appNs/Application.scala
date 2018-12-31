package typings
package openui5Lib.sapNs.uiNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.app.Application")
@js.native
abstract class Application protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Component {
  /**
    * Abstract application class. Extend this class to create a central application class.Only one
    * instance is allowed.Accepts an object literal <code>mSettings</code> that defines initialproperty
    * values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId optional id for the application; generated automatically if           no non-empty id is
    * given Note: this can be omitted, no matter           whether <code>mSettings</code> will be given or
    * not!
    * @param mSettings optional map/JSON-object with initial settings for the           new application
    * instance
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Creates and returns the root component. Override this method in your application implementation, if
    * you want to override the default creation by metadata.
    * @returns the root component
    */
  def createRootComponent(): openui5Lib.sapNs.uiNs.coreNs.UIComponent = js.native
  /**
    * Destroys the rootComponent in the aggregation <code>rootComponent</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyRootComponent(): js.Any = js.native
  /**
    * Gets current value of property <code>config</code>.
    * @returns Value of property <code>config</code>
    */
  def getConfig(): js.Any = js.native
  /**
    * Gets current value of property <code>root</code>.
    * @returns Value of property <code>root</code>
    */
  def getRoot(): java.lang.String = js.native
  /**
    * Gets content of aggregation <code>rootComponent</code>.
    */
  def getRootComponent(): openui5Lib.sapNs.uiNs.coreNs.UIComponent = js.native
  /**
    * Returns the application root component.
    * @since 1.13.1
    * @returns The root component
    */
  def getView(): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
    * The main method is called when the DOM and UI5 is completely loaded. Override this method in your
    * Application class implementation to execute code which relies on a loaded DOM / UI5.
    */
  def main(): scala.Unit = js.native
  /**
    * On before exit application hook. Override this method in your Application class implementation, to
    * handle cleanup before the real exit or to prompt a question to the user,if the application should be
    * exited.
    * @returns return a string if a prompt should be displayed to the user confirming closing the
    * application (e.g. when the application is not yet saved).
    */
  def onBeforeExit(): java.lang.String = js.native
  /**
    * On error hook. Override this method in your Application class implementation to listen to unhandled
    * errors.
    * @param sMessage The error message.
    * @param sFile The file where the error occurred
    * @param iLine The line number of the error
    */
  def onError(sMessage: java.lang.String, sFile: java.lang.String, iLine: scala.Double): scala.Unit = js.native
  /**
    * On exit application hook. Override this method in your Application class implementation, to handle
    * cleanup of the application.
    */
  def onExit(): scala.Unit = js.native
  /**
    * Sets the configuration model.
    * @since 1.13.1
    * @param vConfig the configuration model, the configuration object or a URI string to load a JSON
    * configuration file.
    */
  def setConfig(vConfig: java.lang.String): scala.Unit = js.native
  def setConfig(vConfig: js.Any): scala.Unit = js.native
  def setConfig(vConfig: openui5Lib.sapNs.uiNs.modelNs.Model): scala.Unit = js.native
  /**
    * Sets a new value for property <code>root</code>.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sRoot New value for property <code>root</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setRoot(sRoot: java.lang.String): js.Any = js.native
  /**
    * Sets the aggregated <code>rootComponent</code>.
    * @param oRootComponent The rootComponent to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setRootComponent(oRootComponent: openui5Lib.sapNs.uiNs.coreNs.UIComponent): js.Any = js.native
}

