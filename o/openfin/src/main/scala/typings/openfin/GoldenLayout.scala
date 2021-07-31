package typings.openfin

import typings.jquery.JQuery
import typings.openfin.anon.Content
import typings.openfin.anon.HeightLeft
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GoldenLayout {
  
  trait BrowserWindow extends StObject {
    
    /**
      * Closes the popout
      */
    def close(): Unit
    
    /**
      * Returns the GoldenLayout instance from the child window
      */
    def getGlInstance(): typings.openfin.GoldenLayout.GoldenLayout
    
    /**
      * Returns the native Window object
      */
    def getWindow(): Window
    
    /**
      * True if the window has been opened and its GoldenLayout instance initialised.
      */
    var isInitialised: Boolean
    
    /**
      * Returns the popout to its original position as specified in parentId and indexInParent
      */
    def popIn(): Unit
    
    /**
      * Creates a window configuration object from the Popout.
      */
    def toConfig(): Content
  }
  object BrowserWindow {
    
    @scala.inline
    def apply(
      close: () => Unit,
      getGlInstance: () => typings.openfin.GoldenLayout.GoldenLayout,
      getWindow: () => Window,
      isInitialised: Boolean,
      popIn: () => Unit,
      toConfig: () => Content
    ): BrowserWindow = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getGlInstance = js.Any.fromFunction0(getGlInstance), getWindow = js.Any.fromFunction0(getWindow), isInitialised = isInitialised.asInstanceOf[js.Any], popIn = js.Any.fromFunction0(popIn), toConfig = js.Any.fromFunction0(toConfig))
      __obj.asInstanceOf[BrowserWindow]
    }
    
    @scala.inline
    implicit class BrowserWindowMutableBuilder[Self <: BrowserWindow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetGlInstance(value: () => typings.openfin.GoldenLayout.GoldenLayout): Self = StObject.set(x, "getGlInstance", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWindow(value: () => Window): Self = StObject.set(x, "getWindow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsInitialised(value: Boolean): Self = StObject.set(x, "isInitialised", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopIn(value: () => Unit): Self = StObject.set(x, "popIn", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToConfig(value: () => Content): Self = StObject.set(x, "toConfig", js.Any.fromFunction0(value))
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.openfin.GoldenLayout.ItemConfigType because Already inherited */ trait ComponentConfig
    extends StObject
       with ItemConfig {
    
    /**
      * The name of the component as specified in layout.registerComponent. Mandatory if type is 'component'.
      */
    var componentName: String
    
    /**
      * A serialisable object. Will be passed to the component constructor function and will be the value returned by
      * container.getState().
      */
    var componentState: js.UndefOr[js.Any] = js.undefined
  }
  object ComponentConfig {
    
    @scala.inline
    def apply(componentName: String, `type`: String): ComponentConfig = {
      val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentConfig]
    }
    
    @scala.inline
    implicit class ComponentConfigMutableBuilder[Self <: ComponentConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentState(value: js.Any): Self = StObject.set(x, "componentState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentStateUndefined: Self = StObject.set(x, "componentState", js.undefined)
    }
  }
  
  trait Config extends StObject {
    
    var content: js.UndefOr[js.Array[ItemConfigType]] = js.undefined
    
    var dimensions: js.UndefOr[Dimensions] = js.undefined
    
    var labels: js.UndefOr[Labels] = js.undefined
    
    var settings: js.UndefOr[Settings] = js.undefined
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: js.Array[ItemConfigType]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setContentVarargs(value: ItemConfigType*): Self = StObject.set(x, "content", js.Array(value :_*))
      
      @scala.inline
      def setDimensions(value: Dimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
      
      @scala.inline
      def setLabels(value: Labels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    }
  }
  
  @js.native
  trait Container
    extends StObject
       with EventEmitter {
    
    /**
      * Closes the container or returns false if that is not possible
      */
    def close(): Boolean = js.native
    
    /**
      * This is similar to setState, but merges the provided state into the current one, rather than overwriting it.
      * @param state A serialisable object
      */
    def extendState(state: js.Any): Unit = js.native
    
    /**
      * Returns the container's inner element as a jQuery element
      */
    def getElement(): JQuery[HTMLElement] = js.native
    
    /**
      * Returns the current state.
      */
    def getState(): js.Any = js.native
    
    /**
      * The current height of the container in pixel
      */
    var height: Double = js.native
    
    /**
      * hides the container or returns false if hiding it is not possible
      */
    def hide(): Boolean = js.native
    
    /**
      * True if the item is currently hidden
      */
    var isHidden: Boolean = js.native
    
    /*
      * A reference to the GoldenLayout instance this container belongs to
      */
    var layoutManager: typings.openfin.GoldenLayout.GoldenLayout = js.native
    
    /**
      * A reference to the component-item that controls this container
      */
    var parent: ContentItem = js.native
    
    /**
      * Sets the container to the specified size or returns false if that's not possible
      * @param width the new width in pixel
      * @param height the new height in pixel
      */
    def setSize(width: Double, height: Double): Boolean = js.native
    
    /**
      * Overwrites the components state with the provided value. To only change parts of the componentState see
      * extendState below. This is the main mechanism for saving the state of a component. This state will be the
      * value of componentState when layout.toConfig() is called and will be passed back to the component's
      * constructor function. It will also be used when the component is opened in a new window.
      * @param state A serialisable object
      */
    def setState(state: js.Any): Unit = js.native
    
    /**
      * Sets the item's title to the provided value. Triggers titleChanged and stateChanged events
      * @param title the new title
      */
    def setTitle(title: String): Unit = js.native
    
    /**
      * shows the container or returns false if showing it is not possible
      */
    def show(): Boolean = js.native
    
    /**
      * A reference to the tab that controls this container. Will initially be null
      * (and populated once a tab event has been fired).
      */
    var tab: Tab = js.native
    
    /**
      * The current title of the container
      */
    var title: String = js.native
    
    /**
      * The current width of the container in pixel
      */
    var width: Double = js.native
  }
  
  @js.native
  trait ContentItem
    extends StObject
       with EventEmitter {
    
    var _splitter: js.Any = js.native
    
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
    def callDownwards(functionName: String, functionArguments: js.Array[js.Any]): Unit = js.native
    def callDownwards(functionName: String, functionArguments: js.Array[js.Any], bottomUp: Boolean): Unit = js.native
    def callDownwards(functionName: String, functionArguments: js.Array[js.Any], bottomUp: Boolean, skipSelf: Boolean): Unit = js.native
    def callDownwards(functionName: String, functionArguments: js.Array[js.Any], bottomUp: Unit, skipSelf: Boolean): Unit = js.native
    def callDownwards(functionName: String, functionArguments: Unit, bottomUp: Boolean): Unit = js.native
    def callDownwards(functionName: String, functionArguments: Unit, bottomUp: Boolean, skipSelf: Boolean): Unit = js.native
    def callDownwards(functionName: String, functionArguments: Unit, bottomUp: Unit, skipSelf: Boolean): Unit = js.native
    
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
      * Unselects the item. Only relevant if settings.selectionEnabled is set to true
      */
    def deselect(): Unit = js.native
    
    /**
      * The item's outer element
      */
    var element: JQuery[HTMLElement] = js.native
    
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
    
    /**
      * The type of the item. Can be row, column, stack, component or root
      */
    var `type`: String = js.native
  }
  
  trait Dimensions extends StObject {
    
    /**
      * The width of the borders between the layout items in pixel. Please note: The actual draggable area is wider
      * than the visible one, making it safe to set this to small values without affecting usability.
      * Default: 5
      */
    var borderWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * The height of the element that appears when an item is dragged (in pixel).
      * Default: 200
      */
    var dragProxyHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * The width of the element that appears when an item is dragged (in pixel).
      * Default: 300
      */
    var dragProxyWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * The height of the header elements in pixel. This can be changed, but your theme's header css needs to be
      * adjusted accordingly.
      * Default: 20
      */
    var headerHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum height an item can be resized to (in pixel).
      * Default: 10
      */
    var minItemHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum width an item can be resized to (in pixel).
      * Default: 10
      */
    var minItemWidth: js.UndefOr[Double] = js.undefined
  }
  object Dimensions {
    
    @scala.inline
    def apply(): Dimensions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dimensions]
    }
    
    @scala.inline
    implicit class DimensionsMutableBuilder[Self <: Dimensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      @scala.inline
      def setDragProxyHeight(value: Double): Self = StObject.set(x, "dragProxyHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragProxyHeightUndefined: Self = StObject.set(x, "dragProxyHeight", js.undefined)
      
      @scala.inline
      def setDragProxyWidth(value: Double): Self = StObject.set(x, "dragProxyWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragProxyWidthUndefined: Self = StObject.set(x, "dragProxyWidth", js.undefined)
      
      @scala.inline
      def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderHeightUndefined: Self = StObject.set(x, "headerHeight", js.undefined)
      
      @scala.inline
      def setMinItemHeight(value: Double): Self = StObject.set(x, "minItemHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinItemHeightUndefined: Self = StObject.set(x, "minItemHeight", js.undefined)
      
      @scala.inline
      def setMinItemWidth(value: Double): Self = StObject.set(x, "minItemWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinItemWidthUndefined: Self = StObject.set(x, "minItemWidth", js.undefined)
    }
  }
  
  @js.native
  trait EventEmitter extends StObject {
    
    /**
      * Notify listeners of an event and pass arguments along
      * @param eventName The name of the event to emit
      */
    def emit(eventName: String, arg1: js.Any, arg2: js.Any, argN: js.Any*): Unit = js.native
    def emit(eventName: String, arg1: js.Any, arg2: Unit, argN: js.Any*): Unit = js.native
    def emit(eventName: String, arg1: Unit, arg2: js.Any, argN: js.Any*): Unit = js.native
    def emit(eventName: String, arg1: Unit, arg2: Unit, argN: js.Any*): Unit = js.native
    
    /**
      * Alias for unbind
      */
    def off(eventName: String): Unit = js.native
    def off(eventName: String, callback: js.Function): Unit = js.native
    def off(eventName: String, callback: js.Function, context: js.Any): Unit = js.native
    def off(eventName: String, callback: Unit, context: js.Any): Unit = js.native
    
    /**
      * Subscribe to an event
      * @param eventName The name of the event to describe to
      * @param callback The function that should be invoked when the event occurs
      * @param context The value of the this pointer in the callback function
      */
    def on(eventName: String, callback: js.Function): Unit = js.native
    def on(eventName: String, callback: js.Function, context: js.Any): Unit = js.native
    
    /**
      * Alias for emit
      */
    def trigger(eventName: String, arg1: js.Any, arg2: js.Any, argN: js.Any*): Unit = js.native
    def trigger(eventName: String, arg1: js.Any, arg2: Unit, argN: js.Any*): Unit = js.native
    def trigger(eventName: String, arg1: Unit, arg2: js.Any, argN: js.Any*): Unit = js.native
    def trigger(eventName: String, arg1: Unit, arg2: Unit, argN: js.Any*): Unit = js.native
    
    /**
      * Unsubscribes either all listeners if just an eventName is provided, just a specific callback if invoked with
      * eventName and callback or just a specific callback with a specific context if invoked with all three
      * arguments.
      * @param eventName The name of the event to unsubscribe from
      * @param callback The function that should be invoked when the event occurs
      * @param context The value of the this pointer in the callback function
      */
    def unbind(eventName: String): Unit = js.native
    def unbind(eventName: String, callback: js.Function): Unit = js.native
    def unbind(eventName: String, callback: js.Function, context: js.Any): Unit = js.native
    def unbind(eventName: String, callback: Unit, context: js.Any): Unit = js.native
  }
  
  @js.native
  trait GoldenLayout
    extends StObject
       with EventEmitter {
    
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
    
    /**
      * Creates a new content item or tree of content items from configuration. Usually you wouldn't call this
      * directly, but instead use methods like layout.createDragSource(), item.addChild() or item.replaceChild() that
      * all call this method implicitly.
      * @param itemConfiguration An item configuration (can be an entire tree of items)
      * @param parent A parent item
      */
    def createContentItem(): ContentItem = js.native
    def createContentItem(itemConfiguration: Unit, parent: ContentItem): ContentItem = js.native
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
    
    def createPopout(configOrContentItem: ContentItem, dimensions: HeightLeft): Unit = js.native
    def createPopout(configOrContentItem: ContentItem, dimensions: HeightLeft, parentId: String): Unit = js.native
    def createPopout(configOrContentItem: ContentItem, dimensions: HeightLeft, parentId: String, indexInParent: Double): Unit = js.native
    def createPopout(configOrContentItem: ContentItem, dimensions: HeightLeft, parentId: Unit, indexInParent: Double): Unit = js.native
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
    def createPopout(configOrContentItem: ItemConfigType, dimensions: HeightLeft): Unit = js.native
    def createPopout(configOrContentItem: ItemConfigType, dimensions: HeightLeft, parentId: String): Unit = js.native
    def createPopout(
      configOrContentItem: ItemConfigType,
      dimensions: HeightLeft,
      parentId: String,
      indexInParent: Double
    ): Unit = js.native
    def createPopout(configOrContentItem: ItemConfigType, dimensions: HeightLeft, parentId: Unit, indexInParent: Double): Unit = js.native
    
    /**
      * Destroys the layout. Recursively calls destroy on all components and content items, removes all event
      * listeners and finally removes itself from the DOM.
      */
    def destroy(): Unit = js.native
    
    var dropTargetIndicator: js.Any = js.native
    
    /**
      * A singleton instance of EventEmitter that works across windows
      */
    var eventHub: EventEmitter = js.native
    
    /**
      * Returns a component that was previously registered with layout.registerComponent().
      * @param name The name of a previously registered component
      */
    def getComponent(name: String): js.Any = js.native
    
    /**
      * The current outer height of the layout in pixels.
      */
    var height: Double = js.native
    
    /**
      * Renders the layout into the container. If init() is called before the document is ready it attaches itself as
      * a listener to the document and executes once it becomes ready.
      */
    def init(): Unit = js.native
    
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
      * The topmost item in the layout item tree. In browser terms: Think of the GoldenLayout instance as window
      * object and of root as the document.
      */
    var root: ContentItem = js.native
    
    /**
      * If settings.selectionEnabled is set to true, this allows to select items programmatically.
      * @param contentItem A ContentItem instance
      */
    def selectItem(contentItem: ContentItem): Unit = js.native
    
    /**
      * The currently selected item or null if no item is selected. Only relevant if settings.selectionEnabled is set
      * to true.
      */
    var selectedItem: ContentItem = js.native
    
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
    def updateSize(width: Unit, height: Double): Unit = js.native
    
    /**
      * The current outer width of the layout in pixels.
      */
    var width: Double = js.native
  }
  
  @js.native
  trait Header extends StObject {
    
    /**
      * The currently selected activeContentItem
      */
    var activeContentItem: ContentItem = js.native
    
    /**
      * The (jQuery) DOM element containing the close, maximise and popout button
      */
    var controlsContainer: JQuery[HTMLElement] = js.native
    
    /**
      * Creates a new tab and associates it with a content item
      * @param contentItem The content item the tab will be associated with
      * @param index A zero based index, specifying the position of the new tab
      */
    def createTab(contentItem: ContentItem): Unit = js.native
    def createTab(contentItem: ContentItem, index: Double): Unit = js.native
    
    /**
      * The outer (jQuery) DOM element of this Header
      */
    var element: JQuery[HTMLElement] = js.native
    
    /**
      * A reference to the LayoutManager instance
      */
    var layoutManager: typings.openfin.GoldenLayout.GoldenLayout = js.native
    
    /**
      * A reference to the Stack this Header belongs to
      */
    var parent: ContentItem = js.native
    
    /**
      * Finds a tab by its contentItem and removes it
      * @param contentItem The content item the tab is associated with
      */
    def removeTab(contentItem: ContentItem): Unit = js.native
    
    /**
      * Hides the currently selected contentItem, shows the specified one and highlights its tab.
      * @param contentItem The content item that will be selected
      */
    def setActiveContentItem(contentItem: ContentItem): Unit = js.native
    
    /**
      * An array of the Tabs within this header
      */
    var tabs: js.Array[Tab] = js.native
    
    /**
      * The (jQuery) DOM element containing the tabs
      */
    var tabsContainer: JQuery[HTMLElement] = js.native
  }
  
  trait ItemConfig
    extends StObject
       with ItemConfigType {
    
    /**
      * An array of configurations for items that will be created as children of this item.
      */
    var content: js.UndefOr[js.Array[ItemConfigType]] = js.undefined
    
    /**
      * The height of this item, relative to the other children of its parent in percent
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * A String or an Array of Strings. Used to retrieve the item using item.getItemsById()
      */
    var id: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Determines if the item is closable. If false, the x on the items tab will be hidden and container.close()
      * will return false
      * Default: true
      */
    var isClosable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The title of the item as displayed on its tab and on popout windows
      * Default: componentName or ''
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * The type of the item. Possible values are 'row', 'column', 'stack', 'component' and 'react-component'.
      */
    var `type`: String
    
    /**
      * The width of this item, relative to the other children of its parent in percent
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ItemConfig {
    
    @scala.inline
    def apply(`type`: String): ItemConfig = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemConfig]
    }
    
    @scala.inline
    implicit class ItemConfigMutableBuilder[Self <: ItemConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: js.Array[ItemConfigType]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setContentVarargs(value: ItemConfigType*): Self = StObject.set(x, "content", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setId(value: String | js.Array[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIdVarargs(value: String*): Self = StObject.set(x, "id", js.Array(value :_*))
      
      @scala.inline
      def setIsClosable(value: Boolean): Self = StObject.set(x, "isClosable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsClosableUndefined: Self = StObject.set(x, "isClosable", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.openfin.GoldenLayout.ItemConfig
    - typings.openfin.GoldenLayout.ComponentConfig
    - typings.openfin.GoldenLayout.ReactComponentConfig
  */
  trait ItemConfigType extends StObject
  object ItemConfigType {
    
    @scala.inline
    def ComponentConfig(componentName: String, `type`: String): typings.openfin.GoldenLayout.ComponentConfig = {
      val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openfin.GoldenLayout.ComponentConfig]
    }
    
    @scala.inline
    def ItemConfig(`type`: String): typings.openfin.GoldenLayout.ItemConfig = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openfin.GoldenLayout.ItemConfig]
    }
    
    @scala.inline
    def ReactComponentConfig(component: String, `type`: String): typings.openfin.GoldenLayout.ReactComponentConfig = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openfin.GoldenLayout.ReactComponentConfig]
    }
  }
  
  trait Labels extends StObject {
    
    /**
      * The tooltip text that appears when hovering over the close icon.
      * Default: 'close'
      */
    var close: js.UndefOr[String] = js.undefined
    
    /**
      * The tooltip text that appears when hovering over the maximise icon.
      * Default: 'maximise'
      */
    var maximise: js.UndefOr[String] = js.undefined
    
    /**
      * The tooltip text that appears when hovering over the minimise icon.
      * Default: 'minimise'
      */
    var minimise: js.UndefOr[String] = js.undefined
    
    /**
      * The tooltip text that appears when hovering over the popout icon.
      * Default: 'open in new window'
      */
    var popout: js.UndefOr[String] = js.undefined
  }
  object Labels {
    
    @scala.inline
    def apply(): Labels = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Labels]
    }
    
    @scala.inline
    implicit class LabelsMutableBuilder[Self <: Labels] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setMaximise(value: String): Self = StObject.set(x, "maximise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximiseUndefined: Self = StObject.set(x, "maximise", js.undefined)
      
      @scala.inline
      def setMinimise(value: String): Self = StObject.set(x, "minimise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimiseUndefined: Self = StObject.set(x, "minimise", js.undefined)
      
      @scala.inline
      def setPopout(value: String): Self = StObject.set(x, "popout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoutUndefined: Self = StObject.set(x, "popout", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.openfin.GoldenLayout.ItemConfigType because Already inherited */ trait ReactComponentConfig
    extends StObject
       with ItemConfig {
    
    /**
      * The name of the component as specified in layout.registerComponent. Mandatory if type is 'react-component'
      */
    var component: String
    
    /**
      * Properties that will be passed to the component and accessible using this.props.
      */
    var props: js.UndefOr[js.Any] = js.undefined
  }
  object ReactComponentConfig {
    
    @scala.inline
    def apply(component: String, `type`: String): ReactComponentConfig = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactComponentConfig]
    }
    
    @scala.inline
    implicit class ReactComponentConfigMutableBuilder[Self <: ReactComponentConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: js.Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    }
  }
  
  trait Settings extends StObject {
    
    /**
      * Specifies if an error is thrown when a popout is blocked by the browser (e.g. by opening it programmatically).
      * If false, the popout call will fail silently.
      * Default: true
      */
    var blockedPopoutsThrowError: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies if all popouts should be closed when the page that created them is closed. Popouts don't have a
      * strong dependency on their parent and can exist on their own, but can be quite annoying to close by hand. In
      * addition, any changes made to popouts won't be stored after the parent is closed.
      * Default: true
      */
    var closePopoutsOnUnload: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Constrains the area in which items can be dragged to the layout's container. Will be set to false
      * automatically when layout.createDragSource() is called.
      * Default: true
      */
    var constrainDragToContainer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Turns headers on or off. If false, the layout will be displayed with splitters only.
      * Default: true
      */
    var hasHeaders: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Decides what will be opened in a new window if the user clicks the popout icon. If true the entire stack will
      * be transferred to the new window, if false only the active component will be opened.
      * Default: false
      */
    var popoutWholeStack: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the user can re-arrange the layout by dragging items by their tabs to the desired location.
      * Default: true
      */
    var reorderEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the user can select items by clicking on their header. This sets the value of layout.selectedItem to
      * the clicked item, highlights its header and the layout emits a 'selectionChanged' event.
      * Default: false
      */
    var selectionEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies if the close icon should be displayed in the header-bar.
      * Default: true
      */
    var showCloseIcon: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies if the maximise icon should be displayed in the header-bar.
      * Default: true
      */
    var showMaximiseIcon: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies if the popout icon should be displayed in the header-bar.
      * Default: true
      */
    var showPopoutIcon: js.UndefOr[Boolean] = js.undefined
  }
  object Settings {
    
    @scala.inline
    def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockedPopoutsThrowError(value: Boolean): Self = StObject.set(x, "blockedPopoutsThrowError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockedPopoutsThrowErrorUndefined: Self = StObject.set(x, "blockedPopoutsThrowError", js.undefined)
      
      @scala.inline
      def setClosePopoutsOnUnload(value: Boolean): Self = StObject.set(x, "closePopoutsOnUnload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosePopoutsOnUnloadUndefined: Self = StObject.set(x, "closePopoutsOnUnload", js.undefined)
      
      @scala.inline
      def setConstrainDragToContainer(value: Boolean): Self = StObject.set(x, "constrainDragToContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstrainDragToContainerUndefined: Self = StObject.set(x, "constrainDragToContainer", js.undefined)
      
      @scala.inline
      def setHasHeaders(value: Boolean): Self = StObject.set(x, "hasHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasHeadersUndefined: Self = StObject.set(x, "hasHeaders", js.undefined)
      
      @scala.inline
      def setPopoutWholeStack(value: Boolean): Self = StObject.set(x, "popoutWholeStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoutWholeStackUndefined: Self = StObject.set(x, "popoutWholeStack", js.undefined)
      
      @scala.inline
      def setReorderEnabled(value: Boolean): Self = StObject.set(x, "reorderEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReorderEnabledUndefined: Self = StObject.set(x, "reorderEnabled", js.undefined)
      
      @scala.inline
      def setSelectionEnabled(value: Boolean): Self = StObject.set(x, "selectionEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionEnabledUndefined: Self = StObject.set(x, "selectionEnabled", js.undefined)
      
      @scala.inline
      def setShowCloseIcon(value: Boolean): Self = StObject.set(x, "showCloseIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCloseIconUndefined: Self = StObject.set(x, "showCloseIcon", js.undefined)
      
      @scala.inline
      def setShowMaximiseIcon(value: Boolean): Self = StObject.set(x, "showMaximiseIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMaximiseIconUndefined: Self = StObject.set(x, "showMaximiseIcon", js.undefined)
      
      @scala.inline
      def setShowPopoutIcon(value: Boolean): Self = StObject.set(x, "showPopoutIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPopoutIconUndefined: Self = StObject.set(x, "showPopoutIcon", js.undefined)
    }
  }
  
  trait Tab extends StObject {
    
    var _dragListener: EventEmitter
    
    /**
      * The (jQuery) DOM element that closes the tab
      */
    var closeElement: JQuery[HTMLElement]
    
    /**
      * A reference to the content item this tab relates to
      */
    var contentItem: ContentItem
    
    /**
      * The tabs outer (jQuery) DOM element
      */
    var element: JQuery[HTMLElement]
    
    /**
      * A reference to the header this tab is a child of
      */
    var header: Header
    
    /**
      * True if this tab is the selected tab
      */
    var isActive: Boolean
    
    /**
      * Sets this tab's active state. To programmatically switch tabs, use header.setActiveContentItem( item ) instead.
      * @param isActive Whether the tab is active
      */
    def setActive(isActive: Boolean): Unit
    
    /**
      * Sets the tab's title. Does not affect the contentItem's title!
      * @param title The new title
      */
    def setTitle(title: String): Unit
    
    /**
      * The (jQuery) DOM element containing the title
      */
    var titleElement: JQuery[HTMLElement]
  }
  object Tab {
    
    @scala.inline
    def apply(
      _dragListener: EventEmitter,
      closeElement: JQuery[HTMLElement],
      contentItem: ContentItem,
      element: JQuery[HTMLElement],
      header: Header,
      isActive: Boolean,
      setActive: Boolean => Unit,
      setTitle: String => Unit,
      titleElement: JQuery[HTMLElement]
    ): Tab = {
      val __obj = js.Dynamic.literal(_dragListener = _dragListener.asInstanceOf[js.Any], closeElement = closeElement.asInstanceOf[js.Any], contentItem = contentItem.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], setActive = js.Any.fromFunction1(setActive), setTitle = js.Any.fromFunction1(setTitle), titleElement = titleElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tab]
    }
    
    @scala.inline
    implicit class TabMutableBuilder[Self <: Tab] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseElement(value: JQuery[HTMLElement]): Self = StObject.set(x, "closeElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentItem(value: ContentItem): Self = StObject.set(x, "contentItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElement(value: JQuery[HTMLElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: Header): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetActive(value: Boolean => Unit): Self = StObject.set(x, "setActive", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTitle(value: String => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleElement(value: JQuery[HTMLElement]): Self = StObject.set(x, "titleElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_dragListener(value: EventEmitter): Self = StObject.set(x, "_dragListener", value.asInstanceOf[js.Any])
    }
  }
}
