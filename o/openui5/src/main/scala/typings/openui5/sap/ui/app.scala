package typings.openui5.sap.ui

import typings.openui5.sap.ui.base.ManagedObject
import typings.openui5.sap.ui.core.Component
import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.UIComponent
import typings.openui5.sap.ui.model.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.app")
@js.native
object app extends js.Object {
  @js.native
  trait Application extends Component {
    /**
      * Creates and returns the root component. Override this method in your application implementation, if
      * you want to override the default creation by metadata.
      * @returns the root component
      */
    def createRootComponent(): UIComponent = js.native
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
    def getRoot(): String = js.native
    /**
      * Gets content of aggregation <code>rootComponent</code>.
      */
    def getRootComponent(): UIComponent = js.native
    /**
      * Returns the application root component.
      * @since 1.13.1
      * @returns The root component
      */
    def getView(): Control = js.native
    /**
      * The main method is called when the DOM and UI5 is completely loaded. Override this method in your
      * Application class implementation to execute code which relies on a loaded DOM / UI5.
      */
    def main(): Unit = js.native
    /**
      * On before exit application hook. Override this method in your Application class implementation, to
      * handle cleanup before the real exit or to prompt a question to the user,if the application should be
      * exited.
      * @returns return a string if a prompt should be displayed to the user confirming closing the
      * application (e.g. when the application is not yet saved).
      */
    def onBeforeExit(): String = js.native
    /**
      * On error hook. Override this method in your Application class implementation to listen to unhandled
      * errors.
      * @param sMessage The error message.
      * @param sFile The file where the error occurred
      * @param iLine The line number of the error
      */
    def onError(sMessage: String, sFile: String, iLine: Double): Unit = js.native
    /**
      * On exit application hook. Override this method in your Application class implementation, to handle
      * cleanup of the application.
      */
    def onExit(): Unit = js.native
    /**
      * Sets the configuration model.
      * @since 1.13.1
      * @param vConfig the configuration model, the configuration object or a URI string to load a JSON
      * configuration file.
      */
    def setConfig(vConfig: String): Unit = js.native
    def setConfig(vConfig: js.Any): Unit = js.native
    def setConfig(vConfig: Model): Unit = js.native
    /**
      * Sets a new value for property <code>root</code>.When called with a value of <code>null</code> or
      * <code>undefined</code>, the default value of the property will be restored.
      * @param sRoot New value for property <code>root</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setRoot(sRoot: String): js.Any = js.native
    /**
      * Sets the aggregated <code>rootComponent</code>.
      * @param oRootComponent The rootComponent to set
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setRootComponent(oRootComponent: UIComponent): js.Any = js.native
  }
  
  type MockServer = ManagedObject
}

