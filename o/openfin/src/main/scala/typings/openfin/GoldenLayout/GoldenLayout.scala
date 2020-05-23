package typings.openfin.GoldenLayout

import typings.jquery.JQuery
import typings.openfin.anon.Top
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoldenLayout extends EventEmitter {
  var _dragProxy: js.Any = js.native
  /**
    * A reference to the current, extended top level config.
    *
    * Don't rely on this object for state saving / serialisation. Use layout.toConfig() instead.
    */
  var config: Config = js.native
  /**
    * A reference to the (jQuery) DOM element containing the layout
    */
  var container: JQuery[HTMLElement] = js.native
  var dropTargetIndicator: js.Any = js.native
  /**
    * A singleton instance of EventEmitter that works across windows
    */
  var eventHub: EventEmitter = js.native
  /**
    * The current outer height of the layout in pixels.
    */
  var height: Double = js.native
  /**
    * True once the layout item tree has been created and the initialised event has been fired
    */
  var isInitialised: Boolean = js.native
  /**
    * True if the layout has been opened as a popout by another layout.
    */
  var isSubWindow: Boolean = js.native
  /**
    * An array of BrowserWindow instances
    */
  var openPopouts: js.Array[BrowserWindow] = js.native
  /**
    * The topmost item in the layout item tree. In browser terms: Think of the GoldenLayout instance as window
    * object and of root as the document.
    */
  var root: ContentItem = js.native
  /**
    * The currently selected item or null if no item is selected. Only relevant if settings.selectionEnabled is set
    * to true.
    */
  var selectedItem: ContentItem = js.native
  /**
    * The current outer width of the layout in pixels.
    */
  var width: Double = js.native
  /**
    * Creates a new content item or tree of content items from configuration. Usually you wouldn't call this
    * directly, but instead use methods like layout.createDragSource(), item.addChild() or item.replaceChild() that
    * all call this method implicitly.
    * @param itemConfiguration An item configuration (can be an entire tree of items)
    * @param parent A parent item
    */
  def createContentItem(): ContentItem = js.native
  def createContentItem(itemConfiguration: ItemConfigType): ContentItem = js.native
  def createContentItem(itemConfiguration: ItemConfigType, parent: ContentItem): ContentItem = js.native
  def createDragSource(element: JQuery[HTMLElement], itemConfiguration: ItemConfigType): js.Object = js.native
  /**
    * Turns a DOM element into a dragSource, meaning that the user can drag the element directly onto the layout
    * where it turns into a contentItem.
    * @param element The DOM element that will be turned into a dragSource
    * @param itemConfiguration An item configuration (can be an entire tree of items)
    * @return the dragSource that was created. This can be used to remove the
    *         dragSource from the layout later.
    */
  def createDragSource(element: HTMLElement, itemConfiguration: ItemConfigType): js.Object = js.native
  def createPopout(configOrContentItem: ContentItem, dimensions: Top): Unit = js.native
  def createPopout(configOrContentItem: ContentItem, dimensions: Top, parentId: String): Unit = js.native
  def createPopout(configOrContentItem: ContentItem, dimensions: Top, parentId: String, indexInParent: Double): Unit = js.native
  /**
    * Creates a new popout window with configOrContentItem as contents at the position specified in dimensions
    * @param configOrContentItem   The content item or config that will be created in the new window. If a item is
    *                              provided its config will be read, if config is provided, only the content key
    *                              will be used
    * @param dimensions    A map containing the keys left, top, width and height. Left and top can be negative to
    *                      place the window in another screen.
    * @param parentId  The id of the item within the current layout the child window's content will be appended to
    *                  when popIn is clicked
    * @param indexInParent The index at which the child window's contents will be appended to. Default: null
    */
  def createPopout(configOrContentItem: ItemConfigType, dimensions: Top): Unit = js.native
  def createPopout(configOrContentItem: ItemConfigType, dimensions: Top, parentId: String): Unit = js.native
  def createPopout(configOrContentItem: ItemConfigType, dimensions: Top, parentId: String, indexInParent: Double): Unit = js.native
  /**
    * Destroys the layout. Recursively calls destroy on all components and content items, removes all event
    * listeners and finally removes itself from the DOM.
    */
  def destroy(): Unit = js.native
  /**
    * Returns a component that was previously registered with layout.registerComponent().
    * @param name The name of a previously registered component
    */
  def getComponent(name: String): js.Any = js.native
  /**
    * Renders the layout into the container. If init() is called before the document is ready it attaches itself as
    * a listener to the document and executes once it becomes ready.
    */
  def init(): Unit = js.native
  /*
    * @param name     The name of the component, as referred to by componentName in the component configuration.
    * @param component     A constructor or factory function. Will be invoked with new and two arguments, a
    *                      containerobject and a component state
    */
  def registerComponent(name: String, component: js.Any): Unit = js.native
  /**
    * Removes a dragSource from the layout.
    *
    * @param dragSource The dragSource to remove
    */
  def removeDragSource(dragSource: js.Object): Unit = js.native
  /**
    * If settings.selectionEnabled is set to true, this allows to select items programmatically.
    * @param contentItem A ContentItem instance
    */
  def selectItem(contentItem: ContentItem): Unit = js.native
  /**
    * Returns the current state of the layout and its components as a serialisable object.
    */
  def toConfig(): js.Any = js.native
  /**
    * Resizes the layout. If no arguments are provided GoldenLayout measures its container and resizes accordingly.
    * @param width The outer width the layout should be resized to. Default: The container elements width
    * @param height The outer height the layout should be resized to. Default: The container elements height
    */
  def updateSize(): Unit = js.native
  def updateSize(width: Double): Unit = js.native
  def updateSize(width: Double, height: Double): Unit = js.native
}

