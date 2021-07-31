package typings.packery

import typings.std.Element
import typings.std.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("packery", "Packery")
  @js.native
  class Packery protected () extends StObject {
    def this(element: Element) = this()
    def this(element: Element, options: js.Object) = this()
    
    /**
      * [addItems Add item elements to the Packery instance]
      * @param {Array<Element>} elements [description]
      */
    def addItems(elements: js.Array[Element]): Unit = js.native
    /**
      * [addItems Add item elements to the Packery instance]
      * @param {Element} elements [description]
      */
    def addItems(elements: Element): Unit = js.native
    /**
      * [addItems Add item elements to the Packery instance]
      * @param {NodeList} elements [description]
      */
    def addItems(elements: NodeList): Unit = js.native
    
    /**
      * [appended Add and lay out newly appended item elements]
      * @param {Array<Element>} elements [description]
      */
    def appended(elements: js.Array[Element]): Unit = js.native
    /**
      * [appended Add and lay out newly appended item elements]
      * @param {Element} elements [description]
      */
    def appended(elements: Element): Unit = js.native
    /**
      * [appended Add and lay out newly appended item elements]
      * @param {NodeList} elements [description]
      */
    def appended(elements: NodeList): Unit = js.native
    
    /**
      * [bindDraggabillyEvents Bind Draggabilly events, so that the Packery instance will layout around the dragged element]
      * @param {any} draggie [description]
      */
    def bindDraggabillyEvents(draggie: js.Any): Unit = js.native
    
    /**
      * [bindResize Binds event listener to window resize, so layout is triggered when the browser window is resized]
      */
    def bindResize(): Unit = js.native
    
    /**
      * [bindUIDraggableEvents Bind jQuery UI Draggable events, so that the Packery instance will layout around the dragged element]
      * @param {any} elements [jQuery UI]
      */
    def bindUIDraggableEvents($element: js.Any): Unit = js.native
    
    /**
      * [data Get the Packery instance from an element. Note this method is of Packery, rather than of a Packery instance]
      * @param  {Element} element [description]
      * @return {Packery}         [description]
      */
    def data(element: Element): Packery = js.native
    
    /**
      * [destroy Removes the Packery functionality completely. This will return the element back to its pre-initialized state]
      */
    def destroy(): Unit = js.native
    
    /**
      * [fit Fit an item element within the layout, and have other item elements laid out around it. This method is useful when expanding an element, and keeping it in its same position.]
      * @param {any}    element [description]
      * @param {number} x       [description]
      * @param {number} y       [description]
      */
    def fit(element: Element): Unit = js.native
    def fit(element: Element, x: Double): Unit = js.native
    def fit(element: Element, x: Double, y: Double): Unit = js.native
    def fit(element: Element, x: Unit, y: Double): Unit = js.native
    
    /**
      * [getItem Get a Packery.Item from an element]
      * @param  {Element} element [description]
      * @return {any}             [Packery.item]
      */
    def getItem(element: Element): js.Any = js.native
    
    /**
      * [getItemElements Get an array of elements used as the Packery instance's items.]
      * @return {Array<Element>}      [description]
      */
    def getItemElements(): js.Array[Element] = js.native
    
    /**
      * [layout Lay out all item elements.]
      */
    def layout(): Unit = js.native
    
    /**
      * [layoutItems Lay out specified items]
      * @param {Array<Packery.items>} items [description]
      */
    def layoutItems(items: js.Array[js.Any]): Unit = js.native
    
    /**
      * [off Remove an event listener]
      * @param  {string}   eventName [description]
      * @param  {Function} listener  [description]
      * @return {Packery}            [description]
      */
    def off(eventName: String, listener: js.Function): Packery = js.native
    
    /**
      * [on Add an event listener for certain events]
      * @param  {string}   eventName [description]
      * @param  {Function} listener  [description]
      * @return {Packery}            [description]
      */
    def on(eventName: String, listener: js.Function): Packery = js.native
    
    /**
      * [once Add an event listener for certain events, to be triggered once]
      * @param {string}   eventName [description]
      * @param {Function} listener  [description]
      */
    def once(eventName: String, listener: js.Function): Unit = js.native
    
    /**
      * [prepended Add and lay out newly prepended item elements at the beginning of layout]
      * @param {Array<Element>} elements [description]
      */
    def prepended(elements: js.Array[Element]): Unit = js.native
    /**
      * [prepended Add and lay out newly prepended item elements at the beginning of layout]
      * @param {Element} elements [description]
      */
    def prepended(elements: Element): Unit = js.native
    /**
      * [prepended Add and lay out newly prepended item elements at the beginning of layout]
      * @param {NodeList} elements [description]
      */
    def prepended(elements: NodeList): Unit = js.native
    
    /**
      * [reloadItems Recollect all item elements]
      */
    def reloadItems(): Unit = js.native
    
    /**
      * [remove Remove elements from the Packery instance, then from the DOM]
      * @param {Array<Element>} elements [description]
      */
    def remove(elements: js.Array[Element]): Unit = js.native
    /**
      * [remove Remove elements from the Packery instance, then from the DOM]
      * @param {Element} elements [description]
      */
    def remove(elements: Element): Unit = js.native
    /**
      * [remove Remove elements from the Packery instance, then from the DOM]
      * @param {NodeList} elements [description]
      */
    def remove(elements: NodeList): Unit = js.native
    
    /**
      * [stamp Stamp the elements in the layout. Packery will lay out item elements around stamped element]
      * @param {Array<Element>} elements [description]
      */
    def stamp(elements: js.Array[Element]): Unit = js.native
    /**
      * [stamp Stamp the elements in the layout. Packery will lay out item elements around stamped element]
      * @param {Element} elements [description]
      */
    def stamp(elements: Element): Unit = js.native
    /**
      * [stamp Stamp the elements in the layout. Packery will lay out item elements around stamped element]
      * @param {NodeList} elements [description]
      */
    def stamp(elements: NodeList): Unit = js.native
    
    /**
      * [unbindResize Un-bind layout to window resize event]
      */
    def unbindResize(): Unit = js.native
    
    /**
      * [unstamp Un-stamp the elements, so that Packery will no longer layout item elements around them]
      * @param {Array<Element>} element [description]
      */
    def unstamp(element: js.Array[Element]): Unit = js.native
    /**
      * [unstamp Un-stamp the elements, so that Packery will no longer layout item elements around them]
      * @param {Element} element [description]
      */
    def unstamp(element: Element): Unit = js.native
    /**
      * [unstamp Un-stamp the elements, so that Packery will no longer layout item elements around them]
      * @param {NodeList} element [description]
      */
    def unstamp(element: NodeList): Unit = js.native
  }
  
  trait PackeryOptions extends StObject {
    
    /**
      * [columnWidth The width of a column of a horizontal grid. When set, Packery will align item elements horizontally to this grid]
      * @type {number}
      */
    var columnWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * [containerStyle CSS styles that are applied to the container element. To disable Packery from setting any CSS to the container element, set containerStyle: null]
      * @type {Object}
      */
    var containerStyle: js.UndefOr[js.Object] = js.undefined
    
    /**
      * [gutter The space between item elements, both vertically and horizontally]
      * @type {number}
      */
    var gutter: js.UndefOr[Double] = js.undefined
    
    /**
      * [isHorizontal Arranges items horizontally instead of vertically]
      * @type {boolean}
      */
    var isHorizontal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * [isInitLayout Enables layout on initialization. Set this to false to disable layout on initialization, so you can use methods or add events before the initial layout]
      * @type {boolean}
      */
    var isInitLayout: js.UndefOr[Boolean] = js.undefined
    
    /**
      * [isOriginLeft Controls the horizontal flow of the layout. By default, item elements start positioning at the left. Set to false for right-to-left layouts]
      * @type {boolean}
      */
    var isOriginLeft: js.UndefOr[Boolean] = js.undefined
    
    /**
      * [isOriginTop Controls the vertical flow of the layout. By default, item elements start positioning at the top. Set to false for bottom-up layouts. It’s like Tetris!]
      * @type {boolean}
      */
    var isOriginTop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * [isResizeBound Binds layout to window resizing]
      * @type {boolean}
      */
    var isResizeBound: js.UndefOr[Boolean] = js.undefined
    
    /**
      * [itemSelector Specifies which child elements to be used as item elements. Setting itemSelector is always recommended. itemSelector is useful to exclude sizing elements]
      * @type {string}
      */
    var itemSelector: js.UndefOr[String] = js.undefined
    
    /**
      * [percentPosition Will set item position in percent values, rather than pixel values. percentPosition works well with percent-width items, as items will not transition their position on resize]
      * @type {boolean}
      */
    var percentPosition: js.UndefOr[Boolean] = js.undefined
    
    /**
      * [rowHeight Height of a row of a vertical grid. When set, Packery will align item elements vertically to this grid]
      * @type {number}
      */
    var rowHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * [stamp Specifies which elements are stamped within the layout. These are special layout elements which will not be laid out by Packery. Rather, Packery will layout item elements around stamped elements]
      * @type {string}
      */
    var stamp: js.UndefOr[String] = js.undefined
    
    /**
      * [transitionDuration The time duration of transitions for item elements]
      * @type {string}
      */
    var transitionDuration: js.UndefOr[String] = js.undefined
  }
  object PackeryOptions {
    
    @scala.inline
    def apply(): PackeryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PackeryOptions]
    }
    
    @scala.inline
    implicit class PackeryOptionsMutableBuilder[Self <: PackeryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      @scala.inline
      def setContainerStyle(value: js.Object): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      @scala.inline
      def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      @scala.inline
      def setIsHorizontal(value: Boolean): Self = StObject.set(x, "isHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHorizontalUndefined: Self = StObject.set(x, "isHorizontal", js.undefined)
      
      @scala.inline
      def setIsInitLayout(value: Boolean): Self = StObject.set(x, "isInitLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInitLayoutUndefined: Self = StObject.set(x, "isInitLayout", js.undefined)
      
      @scala.inline
      def setIsOriginLeft(value: Boolean): Self = StObject.set(x, "isOriginLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOriginLeftUndefined: Self = StObject.set(x, "isOriginLeft", js.undefined)
      
      @scala.inline
      def setIsOriginTop(value: Boolean): Self = StObject.set(x, "isOriginTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOriginTopUndefined: Self = StObject.set(x, "isOriginTop", js.undefined)
      
      @scala.inline
      def setIsResizeBound(value: Boolean): Self = StObject.set(x, "isResizeBound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResizeBoundUndefined: Self = StObject.set(x, "isResizeBound", js.undefined)
      
      @scala.inline
      def setItemSelector(value: String): Self = StObject.set(x, "itemSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemSelectorUndefined: Self = StObject.set(x, "itemSelector", js.undefined)
      
      @scala.inline
      def setPercentPosition(value: Boolean): Self = StObject.set(x, "percentPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentPositionUndefined: Self = StObject.set(x, "percentPosition", js.undefined)
      
      @scala.inline
      def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
      
      @scala.inline
      def setStamp(value: String): Self = StObject.set(x, "stamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStampUndefined: Self = StObject.set(x, "stamp", js.undefined)
      
      @scala.inline
      def setTransitionDuration(value: String): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    }
  }
}
