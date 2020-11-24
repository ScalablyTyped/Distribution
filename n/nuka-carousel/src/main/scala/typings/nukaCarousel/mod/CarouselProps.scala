package typings.nukaCarousel.mod

import typings.nukaCarousel.anon.ContainerClassName
import typings.nukaCarousel.anon.slideActioninCarouselSlid
import typings.nukaCarousel.nukaCarouselStrings.zoom
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.std.Event
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CarouselProps extends js.Object {
  
  /**
    * Hook to be called after a slide is changed
    * @param index Index of the current slide
    */
  var afterSlide: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  
  /**
    * Adds a zoom effect on the currently visible slide.
    */
  var animation: js.UndefOr[zoom] = js.native
  
  /**
    * Will generate a style tag to help ensure images are displayed properly
    * @default true
    */
  var autoGenerateStyleTag: js.UndefOr[Boolean] = js.native
  
  /**
    * Autoplay mode active
    * @default false
    */
  var autoplay: js.UndefOr[Boolean] = js.native
  
  /**
    * Interval for autoplay iteration (ms)
    * @default 3000
    */
  var autoplayInterval: js.UndefOr[Double] = js.native
  
  /**
    * Autoplay cycles through slide indexes in reverse
    * @default false
    */
  var autoplayReverse: js.UndefOr[Boolean] = js.native
  
  /**
    * Hook to be called before a slide is changed
    * @param currentSlide Index of the current slide
    * @param endSlide Index of the last slide
    */
  var beforeSlide: js.UndefOr[js.Function2[/* currentSlide */ Double, /* endSlide */ Double, Unit]] = js.native
  
  /**
    * When displaying more than one slide,
    * sets which position to anchor the current slide to
    */
  var cellAlign: js.UndefOr[CarouselCellAlignProp] = js.native
  
  /**
    * Space between slides, as an integer, but reflected as px
    */
  var cellSpacing: js.UndefOr[Double] = js.native
  
  /**
    * Additional className
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * This prop lets you apply custom classes and styles to the default Next, Previous, and Paging Dots controls
    */
  var defaultControlsConfig: js.UndefOr[ContainerClassName] = js.native
  
  /**
    * Disable slides animation
    * @default false
    */
  var disableAnimation: js.UndefOr[Boolean] = js.native
  
  /**
    * Disable swipe before first slide and after last slide
    * @default false
    */
  var disableEdgeSwiping: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable mouse swipe/dragging
    */
  var dragging: js.UndefOr[Boolean] = js.native
  
  /**
    * Animation easing function
    * @see https://github.com/d3/d3-ease
    */
  var easing: js.UndefOr[String] = js.native
  
  /**
    * Animation easing function when swipe exceeds edge
    * @see https://github.com/d3/d3-ease
    */
  var edgeEasing: js.UndefOr[String] = js.native
  
  /**
    * When set to true, disable keyboard controls
    * @default false
    */
  var enableKeyboardControls: js.UndefOr[Boolean] = js.native
  
  /**
    * Used to set overflow style property on slider frame
    * @default 'hidden'
    */
  var frameOverflow: js.UndefOr[String] = js.native
  
  /**
    * Used to set the margin of the slider frame.
    * Accepts any string dimension value such as "0px 20px" or "500px"
    * @example '0px 20px'
    * @example '500px'
    */
  var framePadding: js.UndefOr[String] = js.native
  
  /**
    * Optional callback to apply styles to the container of a control.
    */
  var getControlsContainerStyles: js.UndefOr[js.Function1[/* key */ CarouselControlContainerProp, CSSProperties]] = js.native
  
  /**
    * Used to hardcode the slider height
    * @example '80%'
    * @example '500px'
    */
  var height: js.UndefOr[String] = js.native
  
  /**
    * Change the height of the slides based either on the first slide,
    * the current slide, or the maximum height of all slides.
    */
  var heightMode: js.UndefOr[CarouselHeightModeProp] = js.native
  
  /**
    * Initial height of the slides (px)
    */
  var initialSlideHeight: js.UndefOr[Double] = js.native
  
  /**
    * Initial width of the slides (px)
    */
  var initialSlideWidth: js.UndefOr[Double] = js.native
  
  /**
    * Ref to pass to carousel element
    */
  var innerRef: js.UndefOr[RefObject[HTMLInputElement]] = js.native
  
  /**
    * When enableKeyboardControls is enabled, Configure keyCodes for corresponding slide actions as array of keyCodes
    */
  var keyCodeConfig: js.UndefOr[slideActioninCarouselSlid] = js.native
  
  /**
    * optional callback function
    */
  var onDragStart: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.native
  
  /**
    * Window onResize callback
    */
  var onResize: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Adds a number value to set the scale of the opacity for the 'scroll3d' transition mode.
    * @default 0.65
    */
  var opacityScale: js.UndefOr[Double] = js.native
  
  /**
    * Pause autoPlay when mouse is over carousel
    * @default true
    */
  var pauseOnHover: js.UndefOr[Boolean] = js.native
  
  /**
    * Function for rendering aria-live announcement messages
    */
  var renderAnnounceSlideMessage: js.UndefOr[
    js.Function1[/* hasCurrentSlideSlideCount */ CarouselSlideRenderControlProps, String]
  ] = js.native
  
  /**
    * Function for rendering bottom center control
    */
  var renderBottomCenterControls: js.UndefOr[CarouselRenderControl | Null] = js.native
  
  /**
    * Function for rendering bottom left control
    */
  var renderBottomLeftControls: js.UndefOr[CarouselRenderControl | Null] = js.native
  
  /**
    * Function for rendering bottom right control
    */
  var renderBottomRightControls: js.UndefOr[CarouselRenderControl | Null] = js.native
  
  /**
    * Function for rendering center center control
    */
  var renderCenterCenterControls: js.UndefOr[CarouselRenderControl | Null] = js.native
  
  /**
    * Function for rendering center left control
    */
  var renderCenterLeftControls: js.UndefOr[CarouselRenderControl | Null] = js.native
  
  /**
    * Function for rendering center right control
    */
  var renderCenterRightControls: js.UndefOr[CarouselRenderControl | Null] = js.native
  
  /**
    * Function for rendering top center control
    */
  var renderTopCenterControls: js.UndefOr[CarouselRenderControl | Null] = js.native
  
  /**
    * Function for rendering top left control
    */
  var renderTopLeftControls: js.UndefOr[CarouselRenderControl | Null] = js.native
  
  /**
    * Function for rendering top right control
    */
  var renderTopRightControls: js.UndefOr[CarouselRenderControl | Null] = js.native
  
  /**
    * Supports 'page' and 'remainder' scroll modes.
    * Defaults to 'remainder'.
    */
  var scrollMode: js.UndefOr[CarouselScrollModeProp] = js.native
  
  /**
    * Manually set the index of the slide to be shown
    */
  var slideIndex: js.UndefOr[Double] = js.native
  
  /**
    * While using prop animation = "zoom", you can
    * configure space around current slide with slideOffset.
    */
  var slideOffset: js.UndefOr[Double] = js.native
  
  /**
    * Manually set slideWidth
    * @example '20px'
    * @example 0.8
    */
  var slideWidth: js.UndefOr[CarouselSlideWidthProp] = js.native
  
  /**
    * Slides to scroll at once. Set to "auto"
    * to always scroll the current number of visible slides
    */
  var slidesToScroll: js.UndefOr[CarouselSlidesToScrollProp] = js.native
  
  /**
    * Slides to show at once
    */
  var slidesToShow: js.UndefOr[Double] = js.native
  
  /**
    * Animation duration
    */
  var speed: js.UndefOr[Double] = js.native
  
  /**
    * style object
    */
  var style: js.UndefOr[CSSProperties] = js.native
  
  /**
    * Enable touch swipe/dragging
    */
  var swiping: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the way slides transition from one to the next
    */
  var transitionMode: js.UndefOr[CarouselTransitionModeProp] = js.native
  
  /**
    * Enable the slides to transition vertically
    */
  var vertical: js.UndefOr[Boolean] = js.native
  
  /**
    * Used to hardcode the slider width
    * @example '80%'
    * @example '500px'
    */
  var width: js.UndefOr[String] = js.native
  
  /**
    * Used to remove all controls at once. Overwrites the render[Top, Right, Bottom, Left]CenterControls()
    * @default false
    */
  var withoutControls: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets infinite wrapAround mode
    * @default false
    */
  var wrapAround: js.UndefOr[Boolean] = js.native
  
  /**
    * Adds a number value to set the scale of zoom when animation === "zoom".
    * The number value should be set in a range of (0,1).
    * @default 0.85
    */
  var zoomScale: js.UndefOr[Double] = js.native
}
object CarouselProps {
  
  @scala.inline
  def apply(): CarouselProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarouselProps]
  }
  
  @scala.inline
  implicit class CarouselPropsOps[Self <: CarouselProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAfterSlide(value: /* index */ Double => Unit): Self = this.set("afterSlide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterSlide: Self = this.set("afterSlide", js.undefined)
    
    @scala.inline
    def setAnimation(value: zoom): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAutoGenerateStyleTag(value: Boolean): Self = this.set("autoGenerateStyleTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoGenerateStyleTag: Self = this.set("autoGenerateStyleTag", js.undefined)
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    
    @scala.inline
    def setAutoplayInterval(value: Double): Self = this.set("autoplayInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplayInterval: Self = this.set("autoplayInterval", js.undefined)
    
    @scala.inline
    def setAutoplayReverse(value: Boolean): Self = this.set("autoplayReverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplayReverse: Self = this.set("autoplayReverse", js.undefined)
    
    @scala.inline
    def setBeforeSlide(value: (/* currentSlide */ Double, /* endSlide */ Double) => Unit): Self = this.set("beforeSlide", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeSlide: Self = this.set("beforeSlide", js.undefined)
    
    @scala.inline
    def setCellAlign(value: CarouselCellAlignProp): Self = this.set("cellAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellAlign: Self = this.set("cellAlign", js.undefined)
    
    @scala.inline
    def setCellSpacing(value: Double): Self = this.set("cellSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellSpacing: Self = this.set("cellSpacing", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDefaultControlsConfig(value: ContainerClassName): Self = this.set("defaultControlsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultControlsConfig: Self = this.set("defaultControlsConfig", js.undefined)
    
    @scala.inline
    def setDisableAnimation(value: Boolean): Self = this.set("disableAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAnimation: Self = this.set("disableAnimation", js.undefined)
    
    @scala.inline
    def setDisableEdgeSwiping(value: Boolean): Self = this.set("disableEdgeSwiping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableEdgeSwiping: Self = this.set("disableEdgeSwiping", js.undefined)
    
    @scala.inline
    def setDragging(value: Boolean): Self = this.set("dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragging: Self = this.set("dragging", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setEdgeEasing(value: String): Self = this.set("edgeEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeEasing: Self = this.set("edgeEasing", js.undefined)
    
    @scala.inline
    def setEnableKeyboardControls(value: Boolean): Self = this.set("enableKeyboardControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableKeyboardControls: Self = this.set("enableKeyboardControls", js.undefined)
    
    @scala.inline
    def setFrameOverflow(value: String): Self = this.set("frameOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameOverflow: Self = this.set("frameOverflow", js.undefined)
    
    @scala.inline
    def setFramePadding(value: String): Self = this.set("framePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFramePadding: Self = this.set("framePadding", js.undefined)
    
    @scala.inline
    def setGetControlsContainerStyles(value: /* key */ CarouselControlContainerProp => CSSProperties): Self = this.set("getControlsContainerStyles", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetControlsContainerStyles: Self = this.set("getControlsContainerStyles", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHeightMode(value: CarouselHeightModeProp): Self = this.set("heightMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightMode: Self = this.set("heightMode", js.undefined)
    
    @scala.inline
    def setInitialSlideHeight(value: Double): Self = this.set("initialSlideHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialSlideHeight: Self = this.set("initialSlideHeight", js.undefined)
    
    @scala.inline
    def setInitialSlideWidth(value: Double): Self = this.set("initialSlideWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialSlideWidth: Self = this.set("initialSlideWidth", js.undefined)
    
    @scala.inline
    def setInnerRef(value: RefObject[HTMLInputElement]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    
    @scala.inline
    def setKeyCodeConfig(value: slideActioninCarouselSlid): Self = this.set("keyCodeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyCodeConfig: Self = this.set("keyCodeConfig", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: /* e */ js.UndefOr[Event] => Unit): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    
    @scala.inline
    def setOnResize(value: () => Unit): Self = this.set("onResize", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    
    @scala.inline
    def setOpacityScale(value: Double): Self = this.set("opacityScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacityScale: Self = this.set("opacityScale", js.undefined)
    
    @scala.inline
    def setPauseOnHover(value: Boolean): Self = this.set("pauseOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePauseOnHover: Self = this.set("pauseOnHover", js.undefined)
    
    @scala.inline
    def setRenderAnnounceSlideMessage(value: /* hasCurrentSlideSlideCount */ CarouselSlideRenderControlProps => String): Self = this.set("renderAnnounceSlideMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderAnnounceSlideMessage: Self = this.set("renderAnnounceSlideMessage", js.undefined)
    
    @scala.inline
    def setRenderBottomCenterControls(value: /* props */ CarouselSlideRenderControlProps => ReactNode): Self = this.set("renderBottomCenterControls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderBottomCenterControls: Self = this.set("renderBottomCenterControls", js.undefined)
    
    @scala.inline
    def setRenderBottomCenterControlsNull: Self = this.set("renderBottomCenterControls", null)
    
    @scala.inline
    def setRenderBottomLeftControls(value: /* props */ CarouselSlideRenderControlProps => ReactNode): Self = this.set("renderBottomLeftControls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderBottomLeftControls: Self = this.set("renderBottomLeftControls", js.undefined)
    
    @scala.inline
    def setRenderBottomLeftControlsNull: Self = this.set("renderBottomLeftControls", null)
    
    @scala.inline
    def setRenderBottomRightControls(value: /* props */ CarouselSlideRenderControlProps => ReactNode): Self = this.set("renderBottomRightControls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderBottomRightControls: Self = this.set("renderBottomRightControls", js.undefined)
    
    @scala.inline
    def setRenderBottomRightControlsNull: Self = this.set("renderBottomRightControls", null)
    
    @scala.inline
    def setRenderCenterCenterControls(value: /* props */ CarouselSlideRenderControlProps => ReactNode): Self = this.set("renderCenterCenterControls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderCenterCenterControls: Self = this.set("renderCenterCenterControls", js.undefined)
    
    @scala.inline
    def setRenderCenterCenterControlsNull: Self = this.set("renderCenterCenterControls", null)
    
    @scala.inline
    def setRenderCenterLeftControls(value: /* props */ CarouselSlideRenderControlProps => ReactNode): Self = this.set("renderCenterLeftControls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderCenterLeftControls: Self = this.set("renderCenterLeftControls", js.undefined)
    
    @scala.inline
    def setRenderCenterLeftControlsNull: Self = this.set("renderCenterLeftControls", null)
    
    @scala.inline
    def setRenderCenterRightControls(value: /* props */ CarouselSlideRenderControlProps => ReactNode): Self = this.set("renderCenterRightControls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderCenterRightControls: Self = this.set("renderCenterRightControls", js.undefined)
    
    @scala.inline
    def setRenderCenterRightControlsNull: Self = this.set("renderCenterRightControls", null)
    
    @scala.inline
    def setRenderTopCenterControls(value: /* props */ CarouselSlideRenderControlProps => ReactNode): Self = this.set("renderTopCenterControls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderTopCenterControls: Self = this.set("renderTopCenterControls", js.undefined)
    
    @scala.inline
    def setRenderTopCenterControlsNull: Self = this.set("renderTopCenterControls", null)
    
    @scala.inline
    def setRenderTopLeftControls(value: /* props */ CarouselSlideRenderControlProps => ReactNode): Self = this.set("renderTopLeftControls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderTopLeftControls: Self = this.set("renderTopLeftControls", js.undefined)
    
    @scala.inline
    def setRenderTopLeftControlsNull: Self = this.set("renderTopLeftControls", null)
    
    @scala.inline
    def setRenderTopRightControls(value: /* props */ CarouselSlideRenderControlProps => ReactNode): Self = this.set("renderTopRightControls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderTopRightControls: Self = this.set("renderTopRightControls", js.undefined)
    
    @scala.inline
    def setRenderTopRightControlsNull: Self = this.set("renderTopRightControls", null)
    
    @scala.inline
    def setScrollMode(value: CarouselScrollModeProp): Self = this.set("scrollMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollMode: Self = this.set("scrollMode", js.undefined)
    
    @scala.inline
    def setSlideIndex(value: Double): Self = this.set("slideIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideIndex: Self = this.set("slideIndex", js.undefined)
    
    @scala.inline
    def setSlideOffset(value: Double): Self = this.set("slideOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideOffset: Self = this.set("slideOffset", js.undefined)
    
    @scala.inline
    def setSlideWidth(value: CarouselSlideWidthProp): Self = this.set("slideWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideWidth: Self = this.set("slideWidth", js.undefined)
    
    @scala.inline
    def setSlidesToScroll(value: CarouselSlidesToScrollProp): Self = this.set("slidesToScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlidesToScroll: Self = this.set("slidesToScroll", js.undefined)
    
    @scala.inline
    def setSlidesToShow(value: Double): Self = this.set("slidesToShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlidesToShow: Self = this.set("slidesToShow", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSwiping(value: Boolean): Self = this.set("swiping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwiping: Self = this.set("swiping", js.undefined)
    
    @scala.inline
    def setTransitionMode(value: CarouselTransitionModeProp): Self = this.set("transitionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionMode: Self = this.set("transitionMode", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWithoutControls(value: Boolean): Self = this.set("withoutControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithoutControls: Self = this.set("withoutControls", js.undefined)
    
    @scala.inline
    def setWrapAround(value: Boolean): Self = this.set("wrapAround", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapAround: Self = this.set("wrapAround", js.undefined)
    
    @scala.inline
    def setZoomScale(value: Double): Self = this.set("zoomScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomScale: Self = this.set("zoomScale", js.undefined)
  }
}
