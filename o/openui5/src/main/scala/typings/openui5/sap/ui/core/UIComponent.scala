package typings.openui5.sap.ui.core

import typings.openui5.sap.m.routing.Router
import typings.openui5.sap.ui.core.mvc.Controller
import typings.openui5.sap.ui.core.mvc.View
import typings.openui5.sap.ui.core.routing.Targets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIComponent extends Component {
  /**
    * Returns an element by its ID in the context of the component.
    * @param sId Component local ID of the element
    * @returns element by its ID or <code>undefined</code>
    */
  def byId(sId: String): Element = js.native
  /**
    * The method to create the content (UI Control Tree) of the Component.This method has to be
    * overwritten in the implementation of the componentif the root view is not declared in the component
    * metadata.
    */
  def createContent(): Unit = js.native
  /**
    * Convert the given component local element ID to a globally unique IDby prefixing it with the
    * component ID.
    * @param sId Component local ID of the element
    * @returns prefixed id
    */
  def createId(sId: String): String = js.native
  /**
    * A method to be implemented by UIComponents, returning the flag whether to prefixthe IDs of controls
    * automatically or not if the controls are created insidethe {@link
    * sap.ui.core.UIComponent#createContent} function. By default thisfeature is not activated.You can
    * overwrite this function and return <code>true</code> to activate the automaticprefixing. In addition
    * the default behavior can be configured in the manifestby specifying the entry
    * <code>sap.ui5/autoPrefixId</code>.
    * @since 1.15.1
    * @returns true, if the Controls IDs should be prefixed automatically
    */
  def getAutoPrefixId(): Boolean = js.native
  /**
    * Returns the local ID of an element by removing the component ID prefix or<code>null</code> if the ID
    * does not contain a prefix.
    * @since 1.39.0
    * @param sId Prefixed ID
    * @returns ID without prefix or <code>null</code>
    */
  def getLocalId(sId: String): String = js.native
  /**
    * Returns the reference to the router instance which has been created bythe UIComponent once the
    * routes in the routing metadata has been defined.
    * @since 1.16.1
    * @returns the router instance
    */
  def getRouter(): Router = js.native
  def getRouterFor(oControllerOrView: Controller): Router = js.native
  /**
    * Returns the reference to the router instance. The passed controller or viewhas to be created in the
    * context of a UIComponent to return the routerinstance. Otherwise this function will return
    * undefined.You may define the routerClass property in the config section of the routing to make the
    * Component create your router extension.Example:routing: {    config: {        routerClass :
    * myAppNamespace.MyRouterClass        ...}...
    * @since 1.16.1
    * @param oControllerOrView either a view or controller
    * @returns the router instance
    */
  def getRouterFor(oControllerOrView: View): Router = js.native
  /**
    * Returns the reference to the Targets instance which has been created bythe UIComponent once the
    * targets in the routing metadata has been defined.If routes have been defined, it will be the Targets
    * instance created and used by the router.
    * @since 1.28
    * @returns the targets instance
    */
  def getTargets(): Targets = js.native
  /**
    * Returns the reference to the UIArea of the container.
    * @returns reference to the UIArea of the container
    */
  def getUIArea(): UIArea = js.native
  /**
    * Function is called when the rendering of the ComponentContainer is completed.Applications must not
    * call this hook method directly, it is called from ComponentContainer.Subclasses of UIComponent
    * override this hook to implement any necessary actions after the rendering.
    */
  def onAfterRendering(): Unit = js.native
  /**
    * Function is called when the rendering of the ComponentContainer is started.Applications must not
    * call this hook method directly, it is called from ComponentContainer.Subclasses of UIComponent
    * override this hook to implement any necessary actions before the rendering.
    */
  def onBeforeRendering(): Unit = js.native
  /**
    * Renders the the root control of the UIComponent.
    * @param oRenderManager a RenderManager instance
    */
  def render(oRenderManager: RenderManager): Unit = js.native
  /**
    * Sets the reference to the ComponentContainer - later required for thedetermination of the UIArea for
    * the UIComponent.
    * @param oContainer reference to a ComponentContainer
    * @returns reference to this instance to allow method chaining
    */
  def setContainer(oContainer: ComponentContainer): UIComponent = js.native
}

