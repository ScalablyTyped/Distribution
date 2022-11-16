package typings.nukaCarousel.libTypesMod

import typings.nukaCarousel.nukaCarouselStrings.fade
import typings.nukaCarousel.nukaCarouselStrings.zoom
import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.MutableRefObject
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.TouchEvent
import typings.std.Element
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalCarouselProps extends StObject {
  
  /**
    * If it's set to true, the carousel will adapt its height to the visible slides.
    */
  var adaptiveHeight: Boolean = js.native
  
  /**
    * Whether to smoothly transition the height of the frame when using
    * `adaptiveHeight`.
    * @default true
    */
  var adaptiveHeightAnimation: Boolean = js.native
  
  /**
    * Hook to be called after a slide is changed
    * @param index Index of the current slide
    */
  def afterSlide(index: Double): Unit = js.native
  
  /**
    * Adds a zoom or fade effect on the currently visible slide.
    */
  var animation: js.UndefOr[zoom | fade] = js.native
  
  /**
    * Autoplay mode active
    * @default false
    */
  var autoplay: Boolean = js.native
  
  /**
    * Interval for autoplay iteration (ms)
    * @default 3000
    */
  var autoplayInterval: Double = js.native
  
  /**
    * Autoplay cycles through slide indexes in reverse
    * @default false
    */
  var autoplayReverse: Boolean = js.native
  
  /**
    * Hook to be called before a slide is changed
    * @param currentSlide Index of the current slide
    * @param endSlide Index of the last slide
    */
  def beforeSlide(currentSlideIndex: Double, endSlideIndex: Double): Unit = js.native
  
  /**
    * When displaying more than one slide,
    * sets which position to anchor the current slide to
    */
  var cellAlign: CellAlign = js.native
  
  /**
    * Space between slides, as an integer, but reflected as px
    */
  var cellSpacing: Double = js.native
  
  /**
    * Explicit children prop to resolve issue with @types/react v18
    */
  var children: ReactNode | js.Array[ReactNode] = js.native
  
  /**
    * Additional className
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * This prop lets you apply custom classes and styles to the default Next, Previous, and Paging Dots controls
    */
  var defaultControlsConfig: DefaultControlsConfig = js.native
  
  /**
    * Disable slides animation
    * @default false
    */
  var disableAnimation: Boolean = js.native
  
  /**
    * Disable swipe before first slide and after last slide
    * @default false
    */
  var disableEdgeSwiping: Boolean = js.native
  
  /**
    * The percentage (from 0 to 1) of a slide that the user needs to drag before
    * @default `0.5`
    */
  var dragThreshold: Double = js.native
  
  /**
    * Enable mouse swipe/dragging
    */
  var dragging: Boolean = js.native
  
  /**
    * Animation easing function
    */
  var easing: EasingFunction = js.native
  
  /**
    * Animation easing function when swipe exceeds edge
    */
  var edgeEasing: EasingFunction = js.native
  
  /**
    * When set to true, disable keyboard controls
    * @default false
    */
  var enableKeyboardControls: Boolean = js.native
  
  /**
    * Customize the aria-label of the frame container of the carousel. This is useful when you have more than one carousel on the page.
    */
  var frameAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * Ref to pass to carousel element
    */
  var innerRef: js.UndefOr[MutableRefObject[HTMLDivElement]] = js.native
  
  /**
    * When enableKeyboardControls is enabled, Configure keyCodes for corresponding slide actions as array of keyCodes
    */
  var keyCodeConfig: KeyCodeConfig = js.native
  
  def onDrag(e: MouseEvent[HTMLDivElement, NativeMouseEvent]): Unit = js.native
  /**
    * optional callback function
    */
  def onDrag(e: TouchEvent[HTMLDivElement]): Unit = js.native
  
  def onDragEnd(e: MouseEvent[HTMLDivElement, NativeMouseEvent]): Unit = js.native
  /**
    * optional callback function
    */
  def onDragEnd(e: TouchEvent[HTMLDivElement]): Unit = js.native
  
  def onDragStart(e: MouseEvent[HTMLDivElement, NativeMouseEvent]): Unit = js.native
  /**
    * optional callback function
    */
  def onDragStart(e: TouchEvent[HTMLDivElement]): Unit = js.native
  
  def onUserNavigation(e: KeyboardEvent[Element]): Unit = js.native
  def onUserNavigation(e: MouseEvent[Element, NativeMouseEvent]): Unit = js.native
  /**
    * Callback called when user-triggered navigation occurs: dragging/swiping,
    * clicking one of the controls (custom controls not included), or using a
    * keyboard shortcut
    */
  def onUserNavigation(e: TouchEvent[Element]): Unit = js.native
  
  /**
    * Pause autoPlay when mouse is over carousel
    * @default true
    */
  var pauseOnHover: Boolean = js.native
  
  /**
    * Function for rendering aria-live announcement messages
    */
  var renderAnnounceSlideMessage: RenderAnnounceSlideMessage = js.native
  
  /**
    * Function for rendering bottom center control
    */
  var renderBottomCenterControls: RenderControls = js.native
  
  /**
    * Function for rendering bottom left control
    */
  var renderBottomLeftControls: js.UndefOr[RenderControls] = js.native
  
  /**
    * Function for rendering bottom right control
    */
  var renderBottomRightControls: js.UndefOr[RenderControls] = js.native
  
  /**
    * Function for rendering center center control
    */
  var renderCenterCenterControls: js.UndefOr[RenderControls] = js.native
  
  /**
    * Function for rendering center left control
    */
  var renderCenterLeftControls: RenderControls = js.native
  
  /**
    * Function for rendering center right control
    */
  var renderCenterRightControls: RenderControls = js.native
  
  /**
    * Function for rendering top center control
    */
  var renderTopCenterControls: js.UndefOr[RenderControls] = js.native
  
  /**
    * Function for rendering top left control
    */
  var renderTopLeftControls: js.UndefOr[RenderControls] = js.native
  
  /**
    * Function for rendering top right control
    */
  var renderTopRightControls: js.UndefOr[RenderControls] = js.native
  
  /**
    * Supports 'page' and 'remainder' scroll modes.
    */
  var scrollMode: ScrollMode = js.native
  
  /**
    * Manually set the index of the initial slide to be shown
    */
  var slideIndex: js.UndefOr[Double] = js.native
  
  /**
    * Slides to scroll at once.
    */
  var slidesToScroll: Double = js.native
  
  /**
    * Slides to show at once
    */
  var slidesToShow: Double = js.native
  
  /**
    * Animation duration
    */
  var speed: Double = js.native
  
  /**
    * style object
    */
  var style: CSSProperties = js.native
  
  /**
    * Enable touch swipe/dragging
    */
  var swiping: Boolean = js.native
  
  /**
    * Not migrated yet
    *
    * Enable the slides to transition vertically
    */
  var vertical: Boolean = js.native
  
  /**
    * Used to remove all controls at once. Overwrites the render[Top, Right, Bottom, Left]CenterControls()
    * @default false
    */
  var withoutControls: Boolean = js.native
  
  /**
    * Sets infinite wrapAround mode
    * @default false
    */
  var wrapAround: Boolean = js.native
  
  /**
    * Adds a number value to set the scale of zoom when animation === "zoom".
    * The number value should be set in a range of (0,1).
    * @default 0.85
    */
  var zoomScale: js.UndefOr[Double] = js.native
}
