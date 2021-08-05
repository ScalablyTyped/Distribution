package typings.nukaCarousel

import typings.csstype.mod.Properties
import typings.nukaCarousel.anon.ContainerClassName
import typings.nukaCarousel.anon.slideActioninCarouselSlid
import typings.nukaCarousel.nukaCarouselStrings.auto
import typings.nukaCarousel.nukaCarouselStrings.zoom
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.std.Event
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nuka-carousel", JSImport.Default)
  @js.native
  class default ()
    extends Component[CarouselProps, CarouselState, js.Any]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.FunctionalComponent<NextButtonProps> * / any */ @JSImport("nuka-carousel", "NextButton")
  @js.native
  class NextButton () extends StObject
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.FunctionalComponent<PagingDotsProps> * / any */ @JSImport("nuka-carousel", "PagingDots")
  @js.native
  class PagingDots () extends StObject {
    
    def getButtonStyles(active: Boolean): typings.react.mod.CSSProperties = js.native
    
    def getDotIndexes(
      slideCount: Double,
      slidesToScroll: CarouselSlidesToScrollProp,
      slidesToShow: Double,
      cellAlign: CarouselCellAlignProp
    ): js.Array[Double] = js.native
    
    def getListStyles(): typings.react.mod.CSSProperties = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.FunctionalComponent<PreviousButtonProps> * / any */ @JSImport("nuka-carousel", "PreviousButton")
  @js.native
  class PreviousButton () extends StObject
  
  type CSSProperties = Properties[String | Double]
  
  type Carousel = Component[CarouselProps, CarouselState, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nukaCarousel.nukaCarouselStrings.left
    - typings.nukaCarousel.nukaCarouselStrings.center
    - typings.nukaCarousel.nukaCarouselStrings.right
  */
  trait CarouselCellAlignProp extends StObject
  object CarouselCellAlignProp {
    
    inline def center: typings.nukaCarousel.nukaCarouselStrings.center = "center".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.center]
    
    inline def left: typings.nukaCarousel.nukaCarouselStrings.left = "left".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.left]
    
    inline def right: typings.nukaCarousel.nukaCarouselStrings.right = "right".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.right]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nukaCarousel.nukaCarouselStrings.TopLeft
    - typings.nukaCarousel.nukaCarouselStrings.TopCenter
    - typings.nukaCarousel.nukaCarouselStrings.TopRight
    - typings.nukaCarousel.nukaCarouselStrings.CenterLeft
    - typings.nukaCarousel.nukaCarouselStrings.CenterCenter
    - typings.nukaCarousel.nukaCarouselStrings.CenterRight
    - typings.nukaCarousel.nukaCarouselStrings.BottomLeft
    - typings.nukaCarousel.nukaCarouselStrings.BottomCenter
    - typings.nukaCarousel.nukaCarouselStrings.BottomRight
  */
  trait CarouselControlContainerProp extends StObject
  object CarouselControlContainerProp {
    
    inline def BottomCenter: typings.nukaCarousel.nukaCarouselStrings.BottomCenter = "BottomCenter".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.BottomCenter]
    
    inline def BottomLeft: typings.nukaCarousel.nukaCarouselStrings.BottomLeft = "BottomLeft".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.BottomLeft]
    
    inline def BottomRight: typings.nukaCarousel.nukaCarouselStrings.BottomRight = "BottomRight".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.BottomRight]
    
    inline def CenterCenter: typings.nukaCarousel.nukaCarouselStrings.CenterCenter = "CenterCenter".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.CenterCenter]
    
    inline def CenterLeft: typings.nukaCarousel.nukaCarouselStrings.CenterLeft = "CenterLeft".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.CenterLeft]
    
    inline def CenterRight: typings.nukaCarousel.nukaCarouselStrings.CenterRight = "CenterRight".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.CenterRight]
    
    inline def TopCenter: typings.nukaCarousel.nukaCarouselStrings.TopCenter = "TopCenter".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.TopCenter]
    
    inline def TopLeft: typings.nukaCarousel.nukaCarouselStrings.TopLeft = "TopLeft".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.TopLeft]
    
    inline def TopRight: typings.nukaCarousel.nukaCarouselStrings.TopRight = "TopRight".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.TopRight]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nukaCarousel.nukaCarouselStrings.first
    - typings.nukaCarousel.nukaCarouselStrings.current
    - typings.nukaCarousel.nukaCarouselStrings.max
  */
  trait CarouselHeightModeProp extends StObject
  object CarouselHeightModeProp {
    
    inline def current: typings.nukaCarousel.nukaCarouselStrings.current = "current".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.current]
    
    inline def first: typings.nukaCarousel.nukaCarouselStrings.first = "first".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.first]
    
    inline def max: typings.nukaCarousel.nukaCarouselStrings.max = "max".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.max]
  }
  
  trait CarouselProps extends StObject {
    
    /**
      * Hook to be called after a slide is changed
      * @param index Index of the current slide
      */
    var afterSlide: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    /**
      * Adds a zoom effect on the currently visible slide.
      */
    var animation: js.UndefOr[zoom] = js.undefined
    
    /**
      * Will generate a style tag to help ensure images are displayed properly
      * @default true
      */
    var autoGenerateStyleTag: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Autoplay mode active
      * @default false
      */
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Interval for autoplay iteration (ms)
      * @default 3000
      */
    var autoplayInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * Autoplay cycles through slide indexes in reverse
      * @default false
      */
    var autoplayReverse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Hook to be called before a slide is changed
      * @param currentSlide Index of the current slide
      * @param endSlide Index of the last slide
      */
    var beforeSlide: js.UndefOr[js.Function2[/* currentSlide */ Double, /* endSlide */ Double, Unit]] = js.undefined
    
    /**
      * When displaying more than one slide,
      * sets which position to anchor the current slide to
      */
    var cellAlign: js.UndefOr[CarouselCellAlignProp] = js.undefined
    
    /**
      * Space between slides, as an integer, but reflected as px
      */
    var cellSpacing: js.UndefOr[Double] = js.undefined
    
    /**
      * Additional className
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * This prop lets you apply custom classes and styles to the default Next, Previous, and Paging Dots controls
      */
    var defaultControlsConfig: js.UndefOr[ContainerClassName] = js.undefined
    
    /**
      * Disable slides animation
      * @default false
      */
    var disableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable swipe before first slide and after last slide
      * @default false
      */
    var disableEdgeSwiping: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable mouse swipe/dragging
      */
    var dragging: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Animation easing function
      * @see https://github.com/d3/d3-ease
      */
    var easing: js.UndefOr[String] = js.undefined
    
    /**
      * Animation easing function when swipe exceeds edge
      * @see https://github.com/d3/d3-ease
      */
    var edgeEasing: js.UndefOr[String] = js.undefined
    
    /**
      * When set to true, disable keyboard controls
      * @default false
      */
    var enableKeyboardControls: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Used to set overflow style property on slider frame
      * @default 'hidden'
      */
    var frameOverflow: js.UndefOr[String] = js.undefined
    
    /**
      * Used to set the margin of the slider frame.
      * Accepts any string dimension value such as "0px 20px" or "500px"
      * @example '0px 20px'
      * @example '500px'
      */
    var framePadding: js.UndefOr[String] = js.undefined
    
    /**
      * Optional callback to apply styles to the container of a control.
      */
    var getControlsContainerStyles: js.UndefOr[js.Function1[/* key */ CarouselControlContainerProp, CSSProperties]] = js.undefined
    
    /**
      * Used to hardcode the slider height
      * @example '80%'
      * @example '500px'
      */
    var height: js.UndefOr[String] = js.undefined
    
    /**
      * Change the height of the slides based either on the first slide,
      * the current slide, or the maximum height of all slides.
      */
    var heightMode: js.UndefOr[CarouselHeightModeProp] = js.undefined
    
    /**
      * Initial height of the slides (px)
      */
    var initialSlideHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Initial width of the slides (px)
      */
    var initialSlideWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Ref to pass to carousel element
      */
    var innerRef: js.UndefOr[RefObject[HTMLInputElement]] = js.undefined
    
    /**
      * When enableKeyboardControls is enabled, Configure keyCodes for corresponding slide actions as array of keyCodes
      */
    var keyCodeConfig: js.UndefOr[slideActioninCarouselSlid] = js.undefined
    
    /**
      * optional callback function
      */
    var onDragStart: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.undefined
    
    /**
      * Window onResize callback
      */
    var onResize: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Adds a number value to set the scale of the opacity for the 'scroll3d' transition mode.
      * @default 0.65
      */
    var opacityScale: js.UndefOr[Double] = js.undefined
    
    /**
      * Pause autoPlay when mouse is over carousel
      * @default true
      */
    var pauseOnHover: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function for rendering aria-live announcement messages
      */
    var renderAnnounceSlideMessage: js.UndefOr[
        js.Function1[/* hasCurrentSlideSlideCount */ CarouselSlideRenderControlProps, String]
      ] = js.undefined
    
    /**
      * Function for rendering bottom center control
      */
    var renderBottomCenterControls: js.UndefOr[CarouselRenderControl | Null] = js.undefined
    
    /**
      * Function for rendering bottom left control
      */
    var renderBottomLeftControls: js.UndefOr[CarouselRenderControl | Null] = js.undefined
    
    /**
      * Function for rendering bottom right control
      */
    var renderBottomRightControls: js.UndefOr[CarouselRenderControl | Null] = js.undefined
    
    /**
      * Function for rendering center center control
      */
    var renderCenterCenterControls: js.UndefOr[CarouselRenderControl | Null] = js.undefined
    
    /**
      * Function for rendering center left control
      */
    var renderCenterLeftControls: js.UndefOr[CarouselRenderControl | Null] = js.undefined
    
    /**
      * Function for rendering center right control
      */
    var renderCenterRightControls: js.UndefOr[CarouselRenderControl | Null] = js.undefined
    
    /**
      * Function for rendering top center control
      */
    var renderTopCenterControls: js.UndefOr[CarouselRenderControl | Null] = js.undefined
    
    /**
      * Function for rendering top left control
      */
    var renderTopLeftControls: js.UndefOr[CarouselRenderControl | Null] = js.undefined
    
    /**
      * Function for rendering top right control
      */
    var renderTopRightControls: js.UndefOr[CarouselRenderControl | Null] = js.undefined
    
    /**
      * Supports 'page' and 'remainder' scroll modes.
      * Defaults to 'remainder'.
      */
    var scrollMode: js.UndefOr[CarouselScrollModeProp] = js.undefined
    
    /**
      * Manually set the index of the slide to be shown
      */
    var slideIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * While using prop animation = "zoom", you can
      * configure space around current slide with slideOffset.
      */
    var slideOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * Manually set slideWidth
      * @example '20px'
      * @example 0.8
      */
    var slideWidth: js.UndefOr[CarouselSlideWidthProp] = js.undefined
    
    /**
      * Slides to scroll at once. Set to "auto"
      * to always scroll the current number of visible slides
      */
    var slidesToScroll: js.UndefOr[CarouselSlidesToScrollProp] = js.undefined
    
    /**
      * Slides to show at once
      */
    var slidesToShow: js.UndefOr[Double] = js.undefined
    
    /**
      * Animation duration
      */
    var speed: js.UndefOr[Double] = js.undefined
    
    /**
      * style object
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Enable touch swipe/dragging
      */
    var swiping: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set the way slides transition from one to the next
      */
    var transitionMode: js.UndefOr[CarouselTransitionModeProp] = js.undefined
    
    /**
      * Enable the slides to transition vertically
      */
    var vertical: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Used to hardcode the slider width
      * @example '80%'
      * @example '500px'
      */
    var width: js.UndefOr[String] = js.undefined
    
    /**
      * Used to remove all controls at once. Overwrites the render[Top, Right, Bottom, Left]CenterControls()
      * @default false
      */
    var withoutControls: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets infinite wrapAround mode
      * @default false
      */
    var wrapAround: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Adds a number value to set the scale of zoom when animation === "zoom".
      * The number value should be set in a range of (0,1).
      * @default 0.85
      */
    var zoomScale: js.UndefOr[Double] = js.undefined
  }
  object CarouselProps {
    
    inline def apply(): CarouselProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselProps]
    }
    
    extension [Self <: CarouselProps](x: Self) {
      
      inline def setAfterSlide(value: /* index */ Double => Unit): Self = StObject.set(x, "afterSlide", js.Any.fromFunction1(value))
      
      inline def setAfterSlideUndefined: Self = StObject.set(x, "afterSlide", js.undefined)
      
      inline def setAnimation(value: zoom): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAutoGenerateStyleTag(value: Boolean): Self = StObject.set(x, "autoGenerateStyleTag", value.asInstanceOf[js.Any])
      
      inline def setAutoGenerateStyleTagUndefined: Self = StObject.set(x, "autoGenerateStyleTag", js.undefined)
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayInterval(value: Double): Self = StObject.set(x, "autoplayInterval", value.asInstanceOf[js.Any])
      
      inline def setAutoplayIntervalUndefined: Self = StObject.set(x, "autoplayInterval", js.undefined)
      
      inline def setAutoplayReverse(value: Boolean): Self = StObject.set(x, "autoplayReverse", value.asInstanceOf[js.Any])
      
      inline def setAutoplayReverseUndefined: Self = StObject.set(x, "autoplayReverse", js.undefined)
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setBeforeSlide(value: (/* currentSlide */ Double, /* endSlide */ Double) => Unit): Self = StObject.set(x, "beforeSlide", js.Any.fromFunction2(value))
      
      inline def setBeforeSlideUndefined: Self = StObject.set(x, "beforeSlide", js.undefined)
      
      inline def setCellAlign(value: CarouselCellAlignProp): Self = StObject.set(x, "cellAlign", value.asInstanceOf[js.Any])
      
      inline def setCellAlignUndefined: Self = StObject.set(x, "cellAlign", js.undefined)
      
      inline def setCellSpacing(value: Double): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
      
      inline def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultControlsConfig(value: ContainerClassName): Self = StObject.set(x, "defaultControlsConfig", value.asInstanceOf[js.Any])
      
      inline def setDefaultControlsConfigUndefined: Self = StObject.set(x, "defaultControlsConfig", js.undefined)
      
      inline def setDisableAnimation(value: Boolean): Self = StObject.set(x, "disableAnimation", value.asInstanceOf[js.Any])
      
      inline def setDisableAnimationUndefined: Self = StObject.set(x, "disableAnimation", js.undefined)
      
      inline def setDisableEdgeSwiping(value: Boolean): Self = StObject.set(x, "disableEdgeSwiping", value.asInstanceOf[js.Any])
      
      inline def setDisableEdgeSwipingUndefined: Self = StObject.set(x, "disableEdgeSwiping", js.undefined)
      
      inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
      
      inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setEdgeEasing(value: String): Self = StObject.set(x, "edgeEasing", value.asInstanceOf[js.Any])
      
      inline def setEdgeEasingUndefined: Self = StObject.set(x, "edgeEasing", js.undefined)
      
      inline def setEnableKeyboardControls(value: Boolean): Self = StObject.set(x, "enableKeyboardControls", value.asInstanceOf[js.Any])
      
      inline def setEnableKeyboardControlsUndefined: Self = StObject.set(x, "enableKeyboardControls", js.undefined)
      
      inline def setFrameOverflow(value: String): Self = StObject.set(x, "frameOverflow", value.asInstanceOf[js.Any])
      
      inline def setFrameOverflowUndefined: Self = StObject.set(x, "frameOverflow", js.undefined)
      
      inline def setFramePadding(value: String): Self = StObject.set(x, "framePadding", value.asInstanceOf[js.Any])
      
      inline def setFramePaddingUndefined: Self = StObject.set(x, "framePadding", js.undefined)
      
      inline def setGetControlsContainerStyles(value: /* key */ CarouselControlContainerProp => CSSProperties): Self = StObject.set(x, "getControlsContainerStyles", js.Any.fromFunction1(value))
      
      inline def setGetControlsContainerStylesUndefined: Self = StObject.set(x, "getControlsContainerStyles", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightMode(value: CarouselHeightModeProp): Self = StObject.set(x, "heightMode", value.asInstanceOf[js.Any])
      
      inline def setHeightModeUndefined: Self = StObject.set(x, "heightMode", js.undefined)
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInitialSlideHeight(value: Double): Self = StObject.set(x, "initialSlideHeight", value.asInstanceOf[js.Any])
      
      inline def setInitialSlideHeightUndefined: Self = StObject.set(x, "initialSlideHeight", js.undefined)
      
      inline def setInitialSlideWidth(value: Double): Self = StObject.set(x, "initialSlideWidth", value.asInstanceOf[js.Any])
      
      inline def setInitialSlideWidthUndefined: Self = StObject.set(x, "initialSlideWidth", js.undefined)
      
      inline def setInnerRef(value: RefObject[HTMLInputElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setKeyCodeConfig(value: slideActioninCarouselSlid): Self = StObject.set(x, "keyCodeConfig", value.asInstanceOf[js.Any])
      
      inline def setKeyCodeConfigUndefined: Self = StObject.set(x, "keyCodeConfig", js.undefined)
      
      inline def setOnDragStart(value: /* e */ js.UndefOr[Event] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnResize(value: () => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction0(value))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setOpacityScale(value: Double): Self = StObject.set(x, "opacityScale", value.asInstanceOf[js.Any])
      
      inline def setOpacityScaleUndefined: Self = StObject.set(x, "opacityScale", js.undefined)
      
      inline def setPauseOnHover(value: Boolean): Self = StObject.set(x, "pauseOnHover", value.asInstanceOf[js.Any])
      
      inline def setPauseOnHoverUndefined: Self = StObject.set(x, "pauseOnHover", js.undefined)
      
      inline def setRenderAnnounceSlideMessage(value: /* hasCurrentSlideSlideCount */ CarouselSlideRenderControlProps => String): Self = StObject.set(x, "renderAnnounceSlideMessage", js.Any.fromFunction1(value))
      
      inline def setRenderAnnounceSlideMessageUndefined: Self = StObject.set(x, "renderAnnounceSlideMessage", js.undefined)
      
      inline def setRenderBottomCenterControls(value: /* props */ CarouselSlideRenderControlProps => ReactNode): Self = StObject.set(x, "renderBottomCenterControls", js.Any.fromFunction1(value))
      
      inline def setRenderBottomCenterControlsNull: Self = StObject.set(x, "renderBottomCenterControls", null)
      
      inline def setRenderBottomCenterControlsUndefined: Self = StObject.set(x, "renderBottomCenterControls", js.undefined)
      
      inline def setRenderBottomLeftControls(value: /* props */ CarouselSlideRenderControlProps => ReactNode): Self = StObject.set(x, "renderBottomLeftControls", js.Any.fromFunction1(value))
      
      inline def setRenderBottomLeftControlsNull: Self = StObject.set(x, "renderBottomLeftControls", null)
      
      inline def setRenderBottomLeftControlsUndefined: Self = StObject.set(x, "renderBottomLeftControls", js.undefined)
      
      inline def setRenderBottomRightControls(value: /* props */ CarouselSlideRenderControlProps => ReactNode): Self = StObject.set(x, "renderBottomRightControls", js.Any.fromFunction1(value))
      
      inline def setRenderBottomRightControlsNull: Self = StObject.set(x, "renderBottomRightControls", null)
      
      inline def setRenderBottomRightControlsUndefined: Self = StObject.set(x, "renderBottomRightControls", js.undefined)
      
      inline def setRenderCenterCenterControls(value: /* props */ CarouselSlideRenderControlProps => ReactNode): Self = StObject.set(x, "renderCenterCenterControls", js.Any.fromFunction1(value))
      
      inline def setRenderCenterCenterControlsNull: Self = StObject.set(x, "renderCenterCenterControls", null)
      
      inline def setRenderCenterCenterControlsUndefined: Self = StObject.set(x, "renderCenterCenterControls", js.undefined)
      
      inline def setRenderCenterLeftControls(value: /* props */ CarouselSlideRenderControlProps => ReactNode): Self = StObject.set(x, "renderCenterLeftControls", js.Any.fromFunction1(value))
      
      inline def setRenderCenterLeftControlsNull: Self = StObject.set(x, "renderCenterLeftControls", null)
      
      inline def setRenderCenterLeftControlsUndefined: Self = StObject.set(x, "renderCenterLeftControls", js.undefined)
      
      inline def setRenderCenterRightControls(value: /* props */ CarouselSlideRenderControlProps => ReactNode): Self = StObject.set(x, "renderCenterRightControls", js.Any.fromFunction1(value))
      
      inline def setRenderCenterRightControlsNull: Self = StObject.set(x, "renderCenterRightControls", null)
      
      inline def setRenderCenterRightControlsUndefined: Self = StObject.set(x, "renderCenterRightControls", js.undefined)
      
      inline def setRenderTopCenterControls(value: /* props */ CarouselSlideRenderControlProps => ReactNode): Self = StObject.set(x, "renderTopCenterControls", js.Any.fromFunction1(value))
      
      inline def setRenderTopCenterControlsNull: Self = StObject.set(x, "renderTopCenterControls", null)
      
      inline def setRenderTopCenterControlsUndefined: Self = StObject.set(x, "renderTopCenterControls", js.undefined)
      
      inline def setRenderTopLeftControls(value: /* props */ CarouselSlideRenderControlProps => ReactNode): Self = StObject.set(x, "renderTopLeftControls", js.Any.fromFunction1(value))
      
      inline def setRenderTopLeftControlsNull: Self = StObject.set(x, "renderTopLeftControls", null)
      
      inline def setRenderTopLeftControlsUndefined: Self = StObject.set(x, "renderTopLeftControls", js.undefined)
      
      inline def setRenderTopRightControls(value: /* props */ CarouselSlideRenderControlProps => ReactNode): Self = StObject.set(x, "renderTopRightControls", js.Any.fromFunction1(value))
      
      inline def setRenderTopRightControlsNull: Self = StObject.set(x, "renderTopRightControls", null)
      
      inline def setRenderTopRightControlsUndefined: Self = StObject.set(x, "renderTopRightControls", js.undefined)
      
      inline def setScrollMode(value: CarouselScrollModeProp): Self = StObject.set(x, "scrollMode", value.asInstanceOf[js.Any])
      
      inline def setScrollModeUndefined: Self = StObject.set(x, "scrollMode", js.undefined)
      
      inline def setSlideIndex(value: Double): Self = StObject.set(x, "slideIndex", value.asInstanceOf[js.Any])
      
      inline def setSlideIndexUndefined: Self = StObject.set(x, "slideIndex", js.undefined)
      
      inline def setSlideOffset(value: Double): Self = StObject.set(x, "slideOffset", value.asInstanceOf[js.Any])
      
      inline def setSlideOffsetUndefined: Self = StObject.set(x, "slideOffset", js.undefined)
      
      inline def setSlideWidth(value: CarouselSlideWidthProp): Self = StObject.set(x, "slideWidth", value.asInstanceOf[js.Any])
      
      inline def setSlideWidthUndefined: Self = StObject.set(x, "slideWidth", js.undefined)
      
      inline def setSlidesToScroll(value: CarouselSlidesToScrollProp): Self = StObject.set(x, "slidesToScroll", value.asInstanceOf[js.Any])
      
      inline def setSlidesToScrollUndefined: Self = StObject.set(x, "slidesToScroll", js.undefined)
      
      inline def setSlidesToShow(value: Double): Self = StObject.set(x, "slidesToShow", value.asInstanceOf[js.Any])
      
      inline def setSlidesToShowUndefined: Self = StObject.set(x, "slidesToShow", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSwiping(value: Boolean): Self = StObject.set(x, "swiping", value.asInstanceOf[js.Any])
      
      inline def setSwipingUndefined: Self = StObject.set(x, "swiping", js.undefined)
      
      inline def setTransitionMode(value: CarouselTransitionModeProp): Self = StObject.set(x, "transitionMode", value.asInstanceOf[js.Any])
      
      inline def setTransitionModeUndefined: Self = StObject.set(x, "transitionMode", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWithoutControls(value: Boolean): Self = StObject.set(x, "withoutControls", value.asInstanceOf[js.Any])
      
      inline def setWithoutControlsUndefined: Self = StObject.set(x, "withoutControls", js.undefined)
      
      inline def setWrapAround(value: Boolean): Self = StObject.set(x, "wrapAround", value.asInstanceOf[js.Any])
      
      inline def setWrapAroundUndefined: Self = StObject.set(x, "wrapAround", js.undefined)
      
      inline def setZoomScale(value: Double): Self = StObject.set(x, "zoomScale", value.asInstanceOf[js.Any])
      
      inline def setZoomScaleUndefined: Self = StObject.set(x, "zoomScale", js.undefined)
    }
  }
  
  type CarouselRenderControl = js.Function1[/* props */ CarouselSlideRenderControlProps, ReactNode]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nukaCarousel.nukaCarouselStrings.page
    - typings.nukaCarousel.nukaCarouselStrings.remainder
  */
  trait CarouselScrollModeProp extends StObject
  object CarouselScrollModeProp {
    
    inline def page: typings.nukaCarousel.nukaCarouselStrings.page = "page".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.page]
    
    inline def remainder: typings.nukaCarousel.nukaCarouselStrings.remainder = "remainder".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.remainder]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nukaCarousel.nukaCarouselStrings.nextSlide
    - typings.nukaCarousel.nukaCarouselStrings.previousSlide
    - typings.nukaCarousel.nukaCarouselStrings.firstSlide
    - typings.nukaCarousel.nukaCarouselStrings.lastSlide
    - typings.nukaCarousel.nukaCarouselStrings.pause
  */
  trait CarouselSlideActions extends StObject
  object CarouselSlideActions {
    
    inline def firstSlide: typings.nukaCarousel.nukaCarouselStrings.firstSlide = "firstSlide".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.firstSlide]
    
    inline def lastSlide: typings.nukaCarousel.nukaCarouselStrings.lastSlide = "lastSlide".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.lastSlide]
    
    inline def nextSlide: typings.nukaCarousel.nukaCarouselStrings.nextSlide = "nextSlide".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.nextSlide]
    
    inline def pause: typings.nukaCarousel.nukaCarouselStrings.pause = "pause".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.pause]
    
    inline def previousSlide: typings.nukaCarousel.nukaCarouselStrings.previousSlide = "previousSlide".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.previousSlide]
  }
  
  trait CarouselSlideRenderControlProps extends StObject {
    
    /**
      * When displaying more than one slide, sets which position to anchor the current slide to.
      */
    var cellAlign: CarouselCellAlignProp
    
    /**
      * Space between slides, as an integer, but reflected as px
      */
    var cellSpacing: Double
    
    /**
      * Current slide index
      */
    var currentSlide: Double
    
    /**
      * Current frame width (px)
      */
    var frameWidth: Double
    
    /**
      * Go to X slide method
      * @param index Slide's index to go
      */
    def goToSlide(index: Double): Unit
    
    /**
      * Go to the next slide method
      */
    def nextSlide(): Unit
    
    /**
      * Go to the previous slide method
      */
    def previousSlide(): Unit
    
    /**
      * Total amount of slides
      */
    var slideCount: Double
    
    /**
      * Current slide width (px)
      */
    var slideWidth: Double
    
    /**
      * Slides to scroll at once
      */
    var slidesToScroll: CarouselSlidesToScrollProp
    
    /**
      * Slides to show at once
      */
    var slidesToShow: Double
    
    /**
      * Infinite mode enabled
      */
    var wrapAround: Boolean
  }
  object CarouselSlideRenderControlProps {
    
    inline def apply(
      cellAlign: CarouselCellAlignProp,
      cellSpacing: Double,
      currentSlide: Double,
      frameWidth: Double,
      goToSlide: Double => Unit,
      nextSlide: () => Unit,
      previousSlide: () => Unit,
      slideCount: Double,
      slideWidth: Double,
      slidesToScroll: CarouselSlidesToScrollProp,
      slidesToShow: Double,
      wrapAround: Boolean
    ): CarouselSlideRenderControlProps = {
      val __obj = js.Dynamic.literal(cellAlign = cellAlign.asInstanceOf[js.Any], cellSpacing = cellSpacing.asInstanceOf[js.Any], currentSlide = currentSlide.asInstanceOf[js.Any], frameWidth = frameWidth.asInstanceOf[js.Any], goToSlide = js.Any.fromFunction1(goToSlide), nextSlide = js.Any.fromFunction0(nextSlide), previousSlide = js.Any.fromFunction0(previousSlide), slideCount = slideCount.asInstanceOf[js.Any], slideWidth = slideWidth.asInstanceOf[js.Any], slidesToScroll = slidesToScroll.asInstanceOf[js.Any], slidesToShow = slidesToShow.asInstanceOf[js.Any], wrapAround = wrapAround.asInstanceOf[js.Any])
      __obj.asInstanceOf[CarouselSlideRenderControlProps]
    }
    
    extension [Self <: CarouselSlideRenderControlProps](x: Self) {
      
      inline def setCellAlign(value: CarouselCellAlignProp): Self = StObject.set(x, "cellAlign", value.asInstanceOf[js.Any])
      
      inline def setCellSpacing(value: Double): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
      
      inline def setCurrentSlide(value: Double): Self = StObject.set(x, "currentSlide", value.asInstanceOf[js.Any])
      
      inline def setFrameWidth(value: Double): Self = StObject.set(x, "frameWidth", value.asInstanceOf[js.Any])
      
      inline def setGoToSlide(value: Double => Unit): Self = StObject.set(x, "goToSlide", js.Any.fromFunction1(value))
      
      inline def setNextSlide(value: () => Unit): Self = StObject.set(x, "nextSlide", js.Any.fromFunction0(value))
      
      inline def setPreviousSlide(value: () => Unit): Self = StObject.set(x, "previousSlide", js.Any.fromFunction0(value))
      
      inline def setSlideCount(value: Double): Self = StObject.set(x, "slideCount", value.asInstanceOf[js.Any])
      
      inline def setSlideWidth(value: Double): Self = StObject.set(x, "slideWidth", value.asInstanceOf[js.Any])
      
      inline def setSlidesToScroll(value: CarouselSlidesToScrollProp): Self = StObject.set(x, "slidesToScroll", value.asInstanceOf[js.Any])
      
      inline def setSlidesToShow(value: Double): Self = StObject.set(x, "slidesToShow", value.asInstanceOf[js.Any])
      
      inline def setWrapAround(value: Boolean): Self = StObject.set(x, "wrapAround", value.asInstanceOf[js.Any])
    }
  }
  
  type CarouselSlideWidthProp = String | Double
  
  type CarouselSlidesToScrollProp = Double | auto
  
  trait CarouselState extends StObject {
    
    /**
      * Current slide index
      */
    var currentSlide: Double
    
    /**
      * Is dragging enabled
      */
    var dragging: Boolean
    
    /**
      * Easing function name
      */
    var easing: String
    
    /**
      * Current frame width
      */
    var frameWidth: Double
    
    var isWrappingAround: Boolean
    
    /**
      * Current left value
      */
    var left: Double
    
    var pauseOnHover: Boolean
    
    var resetWrapAroundPosition: Boolean
    
    /**
      * Total amount of slides
      */
    var slideCount: Double
    
    /**
      * Current slide width
      */
    var slideWidth: CarouselSlideWidthProp
    
    /**
      * Slides to scroll at once
      */
    var slidesToScroll: CarouselSlidesToScrollProp
    
    /**
      * Current top value
      */
    var top: Double
    
    /**
      * Is infinite mode enabled
      */
    var wrapToIndex: Boolean
  }
  object CarouselState {
    
    inline def apply(
      currentSlide: Double,
      dragging: Boolean,
      easing: String,
      frameWidth: Double,
      isWrappingAround: Boolean,
      left: Double,
      pauseOnHover: Boolean,
      resetWrapAroundPosition: Boolean,
      slideCount: Double,
      slideWidth: CarouselSlideWidthProp,
      slidesToScroll: CarouselSlidesToScrollProp,
      top: Double,
      wrapToIndex: Boolean
    ): CarouselState = {
      val __obj = js.Dynamic.literal(currentSlide = currentSlide.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], frameWidth = frameWidth.asInstanceOf[js.Any], isWrappingAround = isWrappingAround.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], pauseOnHover = pauseOnHover.asInstanceOf[js.Any], resetWrapAroundPosition = resetWrapAroundPosition.asInstanceOf[js.Any], slideCount = slideCount.asInstanceOf[js.Any], slideWidth = slideWidth.asInstanceOf[js.Any], slidesToScroll = slidesToScroll.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], wrapToIndex = wrapToIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[CarouselState]
    }
    
    extension [Self <: CarouselState](x: Self) {
      
      inline def setCurrentSlide(value: Double): Self = StObject.set(x, "currentSlide", value.asInstanceOf[js.Any])
      
      inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setFrameWidth(value: Double): Self = StObject.set(x, "frameWidth", value.asInstanceOf[js.Any])
      
      inline def setIsWrappingAround(value: Boolean): Self = StObject.set(x, "isWrappingAround", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setPauseOnHover(value: Boolean): Self = StObject.set(x, "pauseOnHover", value.asInstanceOf[js.Any])
      
      inline def setResetWrapAroundPosition(value: Boolean): Self = StObject.set(x, "resetWrapAroundPosition", value.asInstanceOf[js.Any])
      
      inline def setSlideCount(value: Double): Self = StObject.set(x, "slideCount", value.asInstanceOf[js.Any])
      
      inline def setSlideWidth(value: CarouselSlideWidthProp): Self = StObject.set(x, "slideWidth", value.asInstanceOf[js.Any])
      
      inline def setSlidesToScroll(value: CarouselSlidesToScrollProp): Self = StObject.set(x, "slidesToScroll", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWrapToIndex(value: Boolean): Self = StObject.set(x, "wrapToIndex", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nukaCarousel.nukaCarouselStrings.fade
    - typings.nukaCarousel.nukaCarouselStrings.scroll
    - typings.nukaCarousel.nukaCarouselStrings.scroll3d
  */
  trait CarouselTransitionModeProp extends StObject
  object CarouselTransitionModeProp {
    
    inline def fade: typings.nukaCarousel.nukaCarouselStrings.fade = "fade".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.fade]
    
    inline def scroll: typings.nukaCarousel.nukaCarouselStrings.scroll = "scroll".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.scroll]
    
    inline def scroll3d: typings.nukaCarousel.nukaCarouselStrings.scroll3d = "scroll3d".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.scroll3d]
  }
  
  type NextButtonProps = CarouselSlideRenderControlProps
  
  type PagingDotsProps = CarouselSlideRenderControlProps
  
  type PreviousButtonProps = CarouselSlideRenderControlProps
}
