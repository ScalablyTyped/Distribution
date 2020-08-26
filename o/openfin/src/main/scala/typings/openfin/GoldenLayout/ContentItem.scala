package typings.openfin.GoldenLayout

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentItem extends EventEmitter {
  var _splitter: js.Any = js.native
  /**
    * The item's inner element. Can be the same as the outer element.
    */
  var childElementContainer: Container = js.native
  /**
    * This items configuration in its current state
    */
  var config: ItemConfigType = js.native
  var container: Container = js.native
  /**
    * An array of items that are children of this item
    */
  var contentItems: js.Array[ContentItem] = js.native
  /**
    * The item's outer element
    */
  var element: JQuery[HTMLElement] = js.native
  var header: js.Any = js.native
  /**
    * A String or array of identifiers if provided in the configuration
    */
  var id: String = js.native
  var instance: js.Any = js.native
  /**
    * True if the item is a column
    */
  var isColumn: Boolean = js.native
  /**
    * True if the item is a component
    */
  var isComponent: Boolean = js.native
  /**
    * True if the item had been initialised
    */
  var isInitialised: Boolean = js.native
  /**
    * True if the item is maximised
    */
  var isMaximised: Boolean = js.native
  /**
    * True if the item is the layout's root item
    */
  var isRoot: Boolean = js.native
  /**
    * True if the item is a row
    */
  var isRow: Boolean = js.native
  /**
    * True if the item is a stack
    */
  var isStack: Boolean = js.native
  /**
    * A reference to the layoutManager that controls this item
    */
  var layoutManager: js.Any = js.native
  /**
    * The item that is this item's parent (or null if the item is root)
    */
  var parent: ContentItem = js.native
  /**
    * The type of the item. Can be row, column, stack, component or root
    */
  var `type`: String = js.native
  /**
    * Adds an item as a child to this item. If the item is already a part of a layout it will be removed
    * from its original position before adding it to this item.
    * @param itemOrItemConfig A content item (or tree of content items) or an ItemConfiguration to create the item from
    * @param index last index  An optional index that determines at which position the new item should be added. Default: last index.
    */
  def addChild(itemOrItemConfig: ContentItem): Unit = js.native
  def addChild(itemOrItemConfig: ContentItem, index: Double): Unit = js.native
  def addChild(itemOrItemConfig: ItemConfigType): Unit = js.native
  def addChild(itemOrItemConfig: ItemConfigType, index: Double): Unit = js.native
  /**
    * Adds an id to an item or does nothing if the id is already present
    * @param id The id to be added
    */
  def addId(id: String): Unit = js.native
  /**
    * A powerful, yet admittedly confusing method to recursively call methods on items in a tree. Usually you wouldn't need
    * to use it directly, but it's used internally to setSizes, destroy parts of the item tree etc.
    * @param functionName The name of the method to invoke
    * @param functionArguments An array of arguments to pass to every function
    * @param bottomUp If true, the method is invoked on the lowest parts of the tree first and then bubbles upwards. Default: false
    * @param skipSelf If true, the method will only be invoked on the item's children, but not on the item itself. Default: false
    */
  def callDownwards(functionName: String): Unit = js.native
  def callDownwards(
    functionName: String,
    functionArguments: js.UndefOr[scala.Nothing],
    bottomUp: js.UndefOr[scala.Nothing],
    skipSelf: Boolean
  ): Unit = js.native
  def callDownwards(functionName: String, functionArguments: js.UndefOr[scala.Nothing], bottomUp: Boolean): Unit = js.native
  def callDownwards(
    functionName: String,
    functionArguments: js.UndefOr[scala.Nothing],
    bottomUp: Boolean,
    skipSelf: Boolean
  ): Unit = js.native
  def callDownwards(functionName: String, functionArguments: js.Array[_]): Unit = js.native
  def callDownwards(
    functionName: String,
    functionArguments: js.Array[_],
    bottomUp: js.UndefOr[scala.Nothing],
    skipSelf: Boolean
  ): Unit = js.native
  def callDownwards(functionName: String, functionArguments: js.Array[_], bottomUp: Boolean): Unit = js.native
  def callDownwards(functionName: String, functionArguments: js.Array[_], bottomUp: Boolean, skipSelf: Boolean): Unit = js.native
  /**
    * Unselects the item. Only relevant if settings.selectionEnabled is set to true
    */
  def deselect(): Unit = js.native
  /**
    * Emits an event that bubbles up the item tree until it reaches the root element (and after a delay the layout manager). Useful e.g. for indicating state changes.
    */
  def emitBubblingEvent(name: String): Unit = js.native
  /**
    * Only Stacks have this method! Returns the currently selected contentItem.
    */
  def getActiveContentItem(): ContentItem = js.native
  /**
    * Returns all instances of the component with the specified componentName
    * @param componentName a componentName as specified in the itemConfig
    */
  def getComponentsByName(componentName: String): js.Any = js.native
  /**
    * Calls filterFunction recursively for every item in the tree. If the function returns true the item is added to the resulting array
    * @param filterFunction A function that determines whether an item matches certain criteria
    */
  def getItemsByFilter(filterFunction: js.Function1[/* contentItem */ this.type, Boolean]): js.Array[ContentItem] = js.native
  /**
    * Returns all items with the specified id.
    * @param id An id specified in the itemConfig
    */
  def getItemsById(id: String): js.Array[ContentItem] = js.native
  def getItemsById(id: js.Array[String]): js.Array[ContentItem] = js.native
  /**
    * Returns all items with the specified type
    * @param type 'row', 'column', 'stack', 'component' or 'root'
    */
  def getItemsByType(`type`: String): js.Array[ContentItem] = js.native
  /**
    * Returns true if the item has the specified id or false if not
    * @param id An id to check for
    */
  def hasId(id: String): Boolean = js.native
  /**
    * Removes the item from its current position in the layout and opens it in a window
    */
  def popout(): BrowserWindow = js.native
  /**
    * Convenience method for item.parent.removeChild( item )
    */
  def remove(): Unit = js.native
  /**
    * Destroys the item and all it's children
    * @param contentItem The contentItem that should be removed
    * @param keepChild If true the item won't be destroyed. (Use cautiosly, if the item isn't destroyed it's up to you to destroy it later). Default: false.
    */
  def removeChild(contentItem: ContentItem): Unit = js.native
  def removeChild(contentItem: ContentItem, keepChild: Boolean): Unit = js.native
  /**
    * Removes an id from an item or throws an error if the id couldn't be found
    * @param id The id to be removed
    */
  def removeId(id: String): Unit = js.native
  /**
    * The contentItem that should be removed
    * @param oldChild    ContentItem The contentItem that should be removed
    * @param newChild A content item (or tree of content items) or an ItemConfiguration to create the item from
    */
  def replaceChild(oldChild: ContentItem, newChild: ContentItem): Unit = js.native
  def replaceChild(oldChild: ContentItem, newChild: ItemConfigType): Unit = js.native
  /**
    * Selects the item. Only relevant if settings.selectionEnabled is set to true
    */
  def select(): Unit = js.native
  /**
    * Only Stacks have this method! It's the programmatical equivalent of clicking a tab.
    * @param contentItem The new active content item
    */
  def setActiveContentItem(contentItem: ContentItem): Unit = js.native
  /**
    * Updates the items size. To actually assign a new size from within a component, use container.setSize( width, height )
    */
  def setSize(): Unit = js.native
  /**
    * Sets the item's title to the provided value. Triggers titleChanged and stateChanged events
    * @param title the new title
    */
  def setTitle(title: String): Unit = js.native
  /**
    * Maximises the item or minimises it if it's already maximised
    */
  def toggleMaximise(): Unit = js.native
}

