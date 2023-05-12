package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.jquery.JQuery.Duration
import typings.jquery.JQuery.Promise
import typings.oojsUi.OO.ui.Element.Props
import typings.oojsUi.OO.ui.Element.Prototype
import typings.oojsUi.OO.ui.mixin.GroupElement
import typings.oojsUi.anon.Bottom
import typings.std.Document
import typings.std.HTMLBodyElement
import typings.std.HTMLElement
import typings.std.HTMLHtmlElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Each Element represents a rendering in the DOM—a button or an icon, for example, or anything
  * that is visible to a user. Unlike {@link OO.ui.Widget widgets}, plain elements usually do not
  * have events connected to them and can't be interacted with.
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.Element
  */
@js.native
trait Element
  extends StObject
     with Props
     with Prototype
object Element {
  
  trait ConfigOptions extends StObject {
    
    /** Content elements to append (after {@link text}). */
    @JSName("$content")
    var $content: js.UndefOr[JQuery[HTMLElement]] = js.undefined
    
    /** Wrapper element. Defaults to a new element with {@link Prototype.getTagName getTagName}. */
    @JSName("$element")
    var $element: js.UndefOr[JQuery[HTMLElement]] = js.undefined
    
    /**
      * The names of the CSS classes to apply to the element. CSS styles are
      * added to the top level (e.g., the outermost div) of the element. See the
      * [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Buttons_and_Switches#cssExample)
      * for an example.
      */
    var classes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * An array of content elements to append (after {@link text}).
      * Strings will be html-escaped; use an {@link OO.ui.HtmlSnippet} to append raw HTML.
      * Instances of OO.ui.Element will have their {@link Props.$element $element}
      * appended.
      */
    var content: js.UndefOr[js.Array[String | HtmlSnippet | Element]] = js.undefined
    
    /**
      * Custom data of any type or combination of types (e.g., string, number, array, object).
      * Data can also be specified with the {@link Prototype.setData setData} method.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** The HTML id attribute used in the rendered tag. */
    var id: js.UndefOr[String] = js.undefined
    
    /** Text to insert */
    var text: js.UndefOr[String] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def set$content(value: JQuery[HTMLElement]): Self = StObject.set(x, "$content", value.asInstanceOf[js.Any])
      
      inline def set$contentUndefined: Self = StObject.set(x, "$content", js.undefined)
      
      inline def set$element(value: JQuery[HTMLElement]): Self = StObject.set(x, "$element", value.asInstanceOf[js.Any])
      
      inline def set$elementUndefined: Self = StObject.set(x, "$element", js.undefined)
      
      inline def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value*))
      
      inline def setContent(value: js.Array[String | HtmlSnippet | Element]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (String | HtmlSnippet | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[Element]
       with Instantiable1[/* config */ ConfigOptions, Element] {
    
    var static: Static = js.native
  }
  
  trait Dimension extends StObject {
    
    var border: Rectangle
    
    var rect: Rectangle
    
    var scroll: Coordinate
    
    var scrollbar: Bottom
  }
  object Dimension {
    
    inline def apply(border: Rectangle, rect: Rectangle, scroll: Coordinate, scrollbar: Bottom): Dimension = {
      val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], scrollbar = scrollbar.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dimension]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dimension] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: Rectangle): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setRect(value: Rectangle): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
      
      inline def setScroll(value: Coordinate): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollbar(value: Bottom): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props extends StObject {
    
    @JSName("$element")
    var $element: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply($element: JQuery[HTMLElement]): Props = {
      val __obj = js.Dynamic.literal($element = $element.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$element(value: JQuery[HTMLElement]): Self = StObject.set(x, "$element", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prototype extends StObject {
    
    /**
      * Get closest scrollable container.
      *
      * @return Closest scrollable container
      */
    def getClosestScrollableElementContainer(): HTMLElement = js.native
    
    /**
      * Get element data.
      *
      * @return Element data
      */
    def getData(): Any = js.native
    
    /**
      * Get the DOM document.
      *
      * @return Document object
      */
    def getElementDocument(): Document = js.native
    
    /**
      * Get group element is in.
      *
      * @return Group element, null if none
      */
    def getElementGroup(): GroupElement | Null = js.native
    
    /**
      * Ensure that the element has an 'id' attribute, setting it to an unique value if it's
      * missing, and return its value.
      *
      * @return
      */
    def getElementId(): String = js.native
    
    /**
      * Get the DOM window.
      *
      * @return Window object
      */
    def getElementWindow(): Any = js.native
    
    /**
      * Get the HTML tag name.
      *
      * Override this method to base the result on instance information.
      *
      * @return HTML tag name
      */
    def getTagName(): String = js.native
    
    /**
      * Check if the element is attached to the DOM
      *
      * @return The element is attached to the DOM
      */
    def isElementAttached(): Boolean = js.native
    
    /**
      * Check if element is visible.
      *
      * @return element is visible
      */
    def isVisible(): Boolean = js.native
    
    /**
      * Scroll element into view.
      *
      * @param config Configuration options
      * @return Promise which resolves when the scroll is complete
      */
    def scrollElementIntoView(): Promise[Unit, Any, Any] = js.native
    def scrollElementIntoView(config: ScrollIntoViewConfig): Promise[Unit, Any, Any] = js.native
    
    /**
      * Set element data.
      *
      * @param data Element data
      * @return The element, for chaining
      */
    def setData(data: Any): this.type = js.native
    
    /**
      * Set group element is in.
      *
      * @param group Group element, null if none
      * @return The element, for chaining
      */
    def setElementGroup(): this.type = js.native
    def setElementGroup(group: GroupElement): this.type = js.native
    
    /**
      * Set the element has an 'id' attribute.
      *
      * @param id
      * @return The element, for chaining
      */
    def setElementId(id: String): this.type = js.native
    
    /**
      * Check if element supports one or more methods.
      *
      * @param methods Method or list of methods to check
      * @return All methods are supported
      */
    def supports(methods: String): Boolean = js.native
    def supports(methods: js.Array[String]): Boolean = js.native
    
    /**
      * Toggle visibility of an element.
      *
      * @param show Make element visible, omit to toggle visibility
      * @return The element, for chaining
      */
    def toggle(): this.type = js.native
    def toggle(show: Boolean): this.type = js.native
    
    /**
      * Update the theme-provided classes.
      *
      * This is called in element mixins and widget classes any time state changes.
      * Updating is debounced, minimizing overhead of changing multiple attributes and
      * guaranteeing that theme updates do not occur within an element's constructor
      */
    def updateThemeClasses(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.oojsUi.oojsUiStrings.x
    - typings.oojsUi.oojsUiStrings.y
  */
  trait ScrollDirection extends StObject
  object ScrollDirection {
    
    inline def x: typings.oojsUi.oojsUiStrings.x = "x".asInstanceOf[typings.oojsUi.oojsUiStrings.x]
    
    inline def y: typings.oojsUi.oojsUiStrings.y = "y".asInstanceOf[typings.oojsUi.oojsUiStrings.y]
  }
  
  /**
    * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.Element-static-method-scrollIntoView
    */
  trait ScrollIntoViewConfig extends StObject {
    
    /** Aligns the top of the element to the top of the visible area of the scrollable ancestor. */
    var alignToTop: js.UndefOr[Boolean] = js.undefined
    
    /** Animate to the new scroll offset. */
    var animate: js.UndefOr[Boolean] = js.undefined
    
    /** Scroll in only one direction, e.g. 'x' or 'y', omit to scroll in both directions */
    var direction: js.UndefOr[ScrollDirection] = js.undefined
    
    /** jQuery animation duration value */
    var duration: js.UndefOr[Duration] = js.undefined
    
    /**
      * Additional padding on the container to scroll past. Object containing any of 'top',
      * 'bottom', 'left', or 'right' as numbers.
      */
    var padding: js.UndefOr[Rectangle] = js.undefined
    
    /**
      * Scroll container. Defaults to {@link Static.getClosestScrollableContainer getClosestScrollableContainer}
      * of the element.
      */
    var scrollContainer: js.UndefOr[HTMLElement] = js.undefined
  }
  object ScrollIntoViewConfig {
    
    inline def apply(): ScrollIntoViewConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollIntoViewConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollIntoViewConfig] (val x: Self) extends AnyVal {
      
      inline def setAlignToTop(value: Boolean): Self = StObject.set(x, "alignToTop", value.asInstanceOf[js.Any])
      
      inline def setAlignToTopUndefined: Self = StObject.set(x, "alignToTop", js.undefined)
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setDirection(value: ScrollDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setPadding(value: Rectangle): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setScrollContainer(value: HTMLElement): Self = StObject.set(x, "scrollContainer", value.asInstanceOf[js.Any])
      
      inline def setScrollContainerUndefined: Self = StObject.set(x, "scrollContainer", js.undefined)
    }
  }
  
  @js.native
  trait Static extends StObject {
    
    def computeNativeScrollLeft(
      normalizedOffset: Double,
      el: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Window */ Any
    ): Double = js.native
    /**
      * Convert our normalized `scrollLeft` value to a value for current browser.
      * See {@link getScrollLeft}.
      *
      * @param normalizedOffset Normalized `scrollLeft` value
      * @param el Element on which the value will be set
      * @return
      */
    def computeNativeScrollLeft(normalizedOffset: Double, el: HTMLElement): Double = js.native
    
    def computeNormalizedScrollLeft(
      nativeOffset: Double,
      el: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Window */ Any
    ): Double = js.native
    /**
      * Convert native `scrollLeft` value to a value consistent between browsers.
      * See {@link getScrollLeft}.
      *
      * @param nativeOffset Native `scrollLeft` value
      * @param el Element from which the value was obtained
      * @return
      */
    def computeNormalizedScrollLeft(nativeOffset: Double, el: HTMLElement): Double = js.native
    
    /**
      * Get element border sizes.
      *
      * @param el Element to measure
      * @return Dimensions object with `top`, `left`, `bottom` and `right` properties
      */
    def getBorders(el: HTMLElement): Rectangle = js.native
    
    /**
      * Get closest scrollable container.
      *
      * Traverses up until either a scrollable element or the root is reached, in which case
      * the root scrollable element will be returned (see {@link getRootScrollableElement}).
      *
      * @param el Element to find scrollable container for
      * @param dimension Dimension of scrolling to look for; `x`, `y` or omit for either
      * @return Closest scrollable container
      */
    def getClosestScrollableContainer(el: HTMLElement): HTMLElement = js.native
    def getClosestScrollableContainer(el: HTMLElement, dimension: ScrollDirection): HTMLElement = js.native
    
    def getDimensions(
      el: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Window */ Any
    ): Dimension = js.native
    /**
      * Get dimensions of an element or window.
      *
      * @param el Element to measure
      * @return Dimensions object with `borders`, `scroll`, `scrollbar` and `rect` properties
      */
    def getDimensions(el: HTMLElement): Dimension = js.native
    
    def getDir(
      obj: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Window */ Any
    ): Direction = js.native
    /**
      * Get the direction of an element or document.
      *
      * @param obj Context to get the direction for
      * @return Text direction, either 'ltr' or 'rtl'
      */
    def getDir(obj: JQuery[HTMLElement]): Direction = js.native
    def getDir(obj: Document): Direction = js.native
    def getDir(obj: HTMLElement): Direction = js.native
    
    def getDocument(
      obj: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Window */ Any
    ): Document | Null = js.native
    /**
      * Get the document of an element.
      *
      * @param obj Object to get the document for
      * @return Document object
      */
    def getDocument(obj: JQuery[HTMLElement]): Document | Null = js.native
    def getDocument(obj: Document): Document | Null = js.native
    def getDocument(obj: HTMLElement): Document | Null = js.native
    
    /**
      * Get the offset between two frames.
      *
      * @param from Window of the child frame
      * @param to Window of the parent frame
      * @param offset Offset to start with, used internally
      * @return Offset object, containing left and top properties
      */
    def getFrameOffset(
      from: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Window */ Any
    ): Coordinate = js.native
    def getFrameOffset(
      from: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Window */ Any,
      to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Window */ Any
    ): Coordinate = js.native
    def getFrameOffset(
      from: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Window */ Any,
      to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Window */ Any,
      offset: Coordinate
    ): Coordinate = js.native
    def getFrameOffset(
      from: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Window */ Any,
      to: Unit,
      offset: Coordinate
    ): Coordinate = js.native
    
    /**
      * Get the offset between two elements.
      *
      * The two elements may be in a different frame, but in that case the frame $element is
      * in must be contained in the frame $anchor is in.
      *
      * @param $element Element whose position to get
      * @param $anchor Element to get $element's position relative to
      * @return Translated position coordinates, containing top and left properties
      */
    def getRelativePosition($element: JQuery[HTMLElement], $anchor: JQuery[HTMLElement]): Coordinate = js.native
    
    /**
      * Get the root scrollable element of given element's document.
      *
      * Support: Chrome <= 60
      *
      * On older versions of Blink, `document.documentElement` can't be used to get or set
      * the scrollTop property; instead we have to use `document.body`. Changing and testing
      * the value lets us use 'body' or 'documentElement' based on what is working.
      *
      * https://code.google.com/p/chromium/issues/detail?id=303131
      *
      * @param el Element to find root scrollable parent for
      * @return Scrollable parent, `<body>` or `<html>`
      */
    def getRootScrollableElement(el: HTMLElement): HTMLBodyElement | HTMLHtmlElement = js.native
    
    def getScrollLeft(
      el: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Window */ Any
    ): Double = js.native
    /**
      * Get the number of pixels that an element's content is scrolled to the left.
      *
      * This function smooths out browser inconsistencies (nicely described in the README at
      * <https://github.com/othree/jquery.rtl-scroll-type>) and produces a result consistent
      * with Firefox's 'scrollLeft', which seems the most sensible.
      *
      * (Firefox's scrollLeft handling is nice because it increases from left to right,
      * consistently with `getBoundingClientRect().left` and related APIs; because initial
      * value is zero, so resetting it is easy; because adapting a hardcoded scroll position
      * to a symmetrical RTL interface requires just negating it, rather than involving
      * `clientWidth` and `scrollWidth`; and because if you mess up and don't adapt your code
      * to RTL, it will scroll to the beginning rather than somewhere randomly in the middle
      * but not where you wanted.)
      *
      * @param el Element to measure
      * @return Scroll position from the left.
      *  If the element's direction is LTR, this is a positive number between `0` (initial
      *  scroll position) and `el.scrollWidth - el.clientWidth` (furthest possible scroll
      *  position).
      *  If the element's direction is RTL, this is a negative number between `0` (initial
      *  scroll position) and `-el.scrollWidth + el.clientWidth` (furthest possible scroll
      *  position).
      */
    def getScrollLeft(el: HTMLElement): Double = js.native
    
    def getWindow(
      obj: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Window */ Any
    ): Any = js.native
    /**
      * Get the window of an element or document.
      *
      * @param obj Context to get the window for
      * @return Window object
      */
    def getWindow(obj: JQuery[HTMLElement]): Any = js.native
    def getWindow(obj: Document): Any = js.native
    def getWindow(obj: HTMLElement): Any = js.native
    
    def infuse(node: JQuery[HTMLElement]): Element = js.native
    def infuse(node: JQuery[HTMLElement], config: js.Object): Element = js.native
    /* Static Methods */
    /**
      * Reconstitute a JavaScript object corresponding to a widget created
      * by the PHP implementation.
      *
      * @param node A single node for the widget to infuse.
      * @param config Configuration options
      * @return
      *   The `OO.ui.Element` corresponding to this (infusible) document node.
      *   For `Tag` objects emitted on the HTML side (used occasionally for content)
      *   the value returned is a newly-created Element wrapping around the existing
      *   DOM node.
      */
    def infuse(node: HTMLElement): Element = js.native
    def infuse(node: HTMLElement, config: js.Object): Element = js.native
    
    /**
      * Force the browser to reconsider whether it really needs to render scrollbars inside
      * the element and reserve space for them, because it probably doesn't.
      *
      * Workaround primarily for <https://code.google.com/p/chromium/issues/detail?id=387290>,
      * but also similar bugs in other browsers. "Just" forcing a reflow is not sufficient in
      * all cases, we need to first actually detach (or hide, but detaching is simpler) all
      * children, *then* force a reflow, and then reattach (or show) them back.
      *
      * @param el Element to reconsider the scrollbars on
      */
    def reconsiderScrollbars(el: HTMLElement): Unit = js.native
    
    def scrollIntoView(elOrPosition: Rectangle): Promise[Unit, Any, Any] = js.native
    def scrollIntoView(elOrPosition: Rectangle, config: ScrollIntoViewConfig): Promise[Unit, Any, Any] = js.native
    /**
      * Scroll element into view.
      *
      * @param elOrPosition Element to scroll into view
      * @param config Configuration options
      * @return Promise which resolves when the scroll is complete
      */
    def scrollIntoView(elOrPosition: HTMLElement): Promise[Unit, Any, Any] = js.native
    def scrollIntoView(elOrPosition: HTMLElement, config: ScrollIntoViewConfig): Promise[Unit, Any, Any] = js.native
    
    def setScrollLeft(
      el: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Window */ Any,
      scrollLeft: Double
    ): Unit = js.native
    /**
      * Set the number of pixels that an element's content is scrolled to the left.
      *
      * See {@link getScrollLeft}.
      *
      * @param el Element to scroll (and to use in calculations)
      * @param scrollLeft Scroll position from the left.
      *  If the element's direction is LTR, this must be a positive number between
      *  `0` (initial scroll position) and `el.scrollWidth - el.clientWidth`
      *  (furthest possible scroll position).
      *  If the element's direction is RTL, this must be a negative number between
      *  `0` (initial scroll position) and `-el.scrollWidth + el.clientWidth`
      *  (furthest possible scroll position).
      */
    def setScrollLeft(el: HTMLElement, scrollLeft: Double): Unit = js.native
    
    /**
      * The name of the HTML tag used by the element.
      *
      * The static value may be ignored if the {@link Prototype.getTagName getTagName} method
      * is overridden.
      */
    var tagName: String = js.native
  }
}
