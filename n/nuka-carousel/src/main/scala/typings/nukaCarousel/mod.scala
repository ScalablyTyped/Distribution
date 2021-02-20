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
import scala.scalajs.js.`|`
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
    
    @scala.inline
    def center: typings.nukaCarousel.nukaCarouselStrings.center = "center".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.center]
    
    @scala.inline
    def left: typings.nukaCarousel.nukaCarouselStrings.left = "left".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.left]
    
    @scala.inline
    def right: typings.nukaCarousel.nukaCarouselStrings.right = "right".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.right]
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
    
    @scala.inline
    def BottomCenter: typings.nukaCarousel.nukaCarouselStrings.BottomCenter = "BottomCenter".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.BottomCenter]
    
    @scala.inline
    def BottomLeft: typings.nukaCarousel.nukaCarouselStrings.BottomLeft = "BottomLeft".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.BottomLeft]
    
    @scala.inline
    def BottomRight: typings.nukaCarousel.nukaCarouselStrings.BottomRight = "BottomRight".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.BottomRight]
    
    @scala.inline
    def CenterCenter: typings.nukaCarousel.nukaCarouselStrings.CenterCenter = "CenterCenter".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.CenterCenter]
    
    @scala.inline
    def CenterLeft: typings.nukaCarousel.nukaCarouselStrings.CenterLeft = "CenterLeft".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.CenterLeft]
    
    @scala.inline
    def CenterRight: typings.nukaCarousel.nukaCarouselStrings.CenterRight = "CenterRight".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.CenterRight]
    
    @scala.inline
    def TopCenter: typings.nukaCarousel.nukaCarouselStrings.TopCenter = "TopCenter".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.TopCenter]
    
    @scala.inline
    def TopLeft: typings.nukaCarousel.nukaCarouselStrings.TopLeft = "TopLeft".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.TopLeft]
    
    @scala.inline
    def TopRight: typings.nukaCarousel.nukaCarouselStrings.TopRight = "TopRight".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.TopRight]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nukaCarousel.nukaCarouselStrings.first
    - typings.nukaCarousel.nukaCarouselStrings.current
    - typings.nukaCarousel.nukaCarouselStrings.max
  */
  trait CarouselHeightModeProp extends StObject
  object CarouselHeightModeProp {
    
    @scala.inline
    def current: typings.nukaCarousel.nukaCarouselStrings.current = "current".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.current]
    
    @scala.inline
    def first: typings.nukaCarousel.nukaCarouselStrings.first = "first".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.first]
    
    @scala.inline
    def max: typings.nukaCarousel.nukaCarouselStrings.max = "max".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.max]
  }
  
  @js.native
  trait CarouselProps extends StObject {
    
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
    implicit class CarouselPropsMutableBuilder[Self <: CarouselProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterSlide(value: /* index */ Double => Unit): Self = StObject.set(x, "afterSlide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterSlideUndefined: Self = StObject.set(x, "afterSlide", js.undefined)
      
      @scala.inline
      def setAnimation(value: zoom): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setAutoGenerateStyleTag(value: Boolean): Self = StObject.set(x, "autoGenerateStyleTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoGenerateStyleTagUndefined: Self = StObject.set(x, "autoGenerateStyleTag", js.undefined)
      
      @scala.inline
      def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayInterval(value: Double): Self = StObject.set(x, "autoplayInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayIntervalUndefined: Self = StObject.set(x, "autoplayInterval", js.undefined)
      
      @scala.inline
      def setAutoplayReverse(value: Boolean): Self = StObject.set(x, "autoplayReverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayReverseUndefined: Self = StObject.set(x, "autoplayReverse", js.undefined)
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setBeforeSlide(value: (/* currentSlide */ Double, /* endSlide */ Double) => Unit): Self = StObject.set(x, "beforeSlide", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeSlideUndefined: Self = StObject.set(x, "beforeSlide", js.undefined)
      
      @scala.inline
      def setCellAlign(value: CarouselCellAlignProp): Self = StObject.set(x, "cellAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellAlignUndefined: Self = StObject.set(x, "cellAlign", js.undefined)
      
      @scala.inline
      def setCellSpacing(value: Double): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDefaultControlsConfig(value: ContainerClassName): Self = StObject.set(x, "defaultControlsConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultControlsConfigUndefined: Self = StObject.set(x, "defaultControlsConfig", js.undefined)
      
      @scala.inline
      def setDisableAnimation(value: Boolean): Self = StObject.set(x, "disableAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableAnimationUndefined: Self = StObject.set(x, "disableAnimation", js.undefined)
      
      @scala.inline
      def setDisableEdgeSwiping(value: Boolean): Self = StObject.set(x, "disableEdgeSwiping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableEdgeSwipingUndefined: Self = StObject.set(x, "disableEdgeSwiping", js.undefined)
      
      @scala.inline
      def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
      
      @scala.inline
      def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setEdgeEasing(value: String): Self = StObject.set(x, "edgeEasing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeEasingUndefined: Self = StObject.set(x, "edgeEasing", js.undefined)
      
      @scala.inline
      def setEnableKeyboardControls(value: Boolean): Self = StObject.set(x, "enableKeyboardControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableKeyboardControlsUndefined: Self = StObject.set(x, "enableKeyboardControls", js.undefined)
      
      @scala.inline
      def setFrameOverflow(value: String): Self = StObject.set(x, "frameOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameOverflowUndefined: Self = StObject.set(x, "frameOverflow", js.undefined)
      
      @scala.inline
      def setFramePadding(value: String): Self = StObject.set(x, "framePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFramePaddingUndefined: Self = StObject.set(x, "framePadding", js.undefined)
      
      @scala.inline
      def setGetControlsContainerStyles(value: /* key */ CarouselControlContainerProp => CSSProperties): Self = StObject.set(x, "getControlsContainerStyles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetControlsContainerStylesUndefined: Self = StObject.set(x, "getControlsContainerStyles", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightMode(value: CarouselHeightModeProp): Self = StObject.set(x, "heightMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightModeUndefined: Self = StObject.set(x, "heightMode", js.undefined)
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setInitialSlideHeight(value: Double): Self = StObject.set(x, "initialSlideHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSlideHeightUndefined: Self = StObject.set(x, "initialSlideHeight", js.undefined)
      
      @scala.inline
      def setInitialSlideWidth(value: Double): Self = StObject.set(x, "initialSlideWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSlideWidthUndefined: Self = StObject.set(x, "initialSlideWidth", js.undefined)
      
      @scala.inline
      def setInnerRef(value: RefObject[HTMLInputElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setKeyCodeConfig(value: slideActioninCarouselSlid): Self = StObject.set(x, "keyCodeConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyCodeConfigUndefined: Self = StObject.set(x, "keyCodeConfig", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: /* e */ js.UndefOr[Event] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnResize(value: () => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      @scala.inline
      def setOpacityScale(value: Double): Self = StObject.set(x, "opacityScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityScaleUndefined: Self = StObject.set(x, "opacityScale", js.undefined)
      
      @scala.inline
      def setPauseOnHover(value: Boolean): Self = StObject.set(x, "pauseOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseOnHoverUndefined: Self = StObject.set(x, "pauseOnHover", js.undefined)
      
      @scala.inline
      def setRenderAnnounceSlideMessage(value: /* hasCurrentSlideSlideCount */ CarouselSlideRenderControlProps => String): Self = StObject.set(x, "renderAnnounceSlideMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderAnnounceSlideMessageUndefined: Self = StObject.set(x, "renderAnnounceSlideMessage", js.undefined)
      
      @scala.inline
      def setRenderBottomCenterControls(value: /* props */ CarouselSlideRenderControlProps => ReactNode): Self = StObject.set(x, "renderBottomCenterControls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderBottomCenterControlsNull: Self = StObject.set(x, "renderBottomCenterControls", null)
      
      @scala.inline
      def setRenderBottomCenterControlsUndefined: Self = StObject.set(x, "renderBottomCenterControls", js.undefined)
      
      @scala.inline
      def setRenderBottomLeftControls(value: /* props */ CarouselSlideRenderControlProps => ReactNode): Self = StObject.set(x, "renderBottomLeftControls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderBottomLeftControlsNull: Self = StObject.set(x, "renderBottomLeftControls", null)
      
      @scala.inline
      def setRenderBottomLeftControlsUndefined: Self = StObject.set(x, "renderBottomLeftControls", js.undefined)
      
      @scala.inline
      def setRenderBottomRightControls(value: /* props */ CarouselSlideRenderControlProps => ReactNode): Self = StObject.set(x, "renderBottomRightControls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderBottomRightControlsNull: Self = StObject.set(x, "renderBottomRightControls", null)
      
      @scala.inline
      def setRenderBottomRightControlsUndefined: Self = StObject.set(x, "renderBottomRightControls", js.undefined)
      
      @scala.inline
      def setRenderCenterCenterControls(value: /* props */ CarouselSlideRenderControlProps => ReactNode): Self = StObject.set(x, "renderCenterCenterControls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderCenterCenterControlsNull: Self = StObject.set(x, "renderCenterCenterControls", null)
      
      @scala.inline
      def setRenderCenterCenterControlsUndefined: Self = StObject.set(x, "renderCenterCenterControls", js.undefined)
      
      @scala.inline
      def setRenderCenterLeftControls(value: /* props */ CarouselSlideRenderControlProps => ReactNode): Self = StObject.set(x, "renderCenterLeftControls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderCenterLeftControlsNull: Self = StObject.set(x, "renderCenterLeftControls", null)
      
      @scala.inline
      def setRenderCenterLeftControlsUndefined: Self = StObject.set(x, "renderCenterLeftControls", js.undefined)
      
      @scala.inline
      def setRenderCenterRightControls(value: /* props */ CarouselSlideRenderControlProps => ReactNode): Self = StObject.set(x, "renderCenterRightControls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderCenterRightControlsNull: Self = StObject.set(x, "renderCenterRightControls", null)
      
      @scala.inline
      def setRenderCenterRightControlsUndefined: Self = StObject.set(x, "renderCenterRightControls", js.undefined)
      
      @scala.inline
      def setRenderTopCenterControls(value: /* props */ CarouselSlideRenderControlProps => ReactNode): Self = StObject.set(x, "renderTopCenterControls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderTopCenterControlsNull: Self = StObject.set(x, "renderTopCenterControls", null)
      
      @scala.inline
      def setRenderTopCenterControlsUndefined: Self = StObject.set(x, "renderTopCenterControls", js.undefined)
      
      @scala.inline
      def setRenderTopLeftControls(value: /* props */ CarouselSlideRenderControlProps => ReactNode): Self = StObject.set(x, "renderTopLeftControls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderTopLeftControlsNull: Self = StObject.set(x, "renderTopLeftControls", null)
      
      @scala.inline
      def setRenderTopLeftControlsUndefined: Self = StObject.set(x, "renderTopLeftControls", js.undefined)
      
      @scala.inline
      def setRenderTopRightControls(value: /* props */ CarouselSlideRenderControlProps => ReactNode): Self = StObject.set(x, "renderTopRightControls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderTopRightControlsNull: Self = StObject.set(x, "renderTopRightControls", null)
      
      @scala.inline
      def setRenderTopRightControlsUndefined: Self = StObject.set(x, "renderTopRightControls", js.undefined)
      
      @scala.inline
      def setScrollMode(value: CarouselScrollModeProp): Self = StObject.set(x, "scrollMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollModeUndefined: Self = StObject.set(x, "scrollMode", js.undefined)
      
      @scala.inline
      def setSlideIndex(value: Double): Self = StObject.set(x, "slideIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideIndexUndefined: Self = StObject.set(x, "slideIndex", js.undefined)
      
      @scala.inline
      def setSlideOffset(value: Double): Self = StObject.set(x, "slideOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideOffsetUndefined: Self = StObject.set(x, "slideOffset", js.undefined)
      
      @scala.inline
      def setSlideWidth(value: CarouselSlideWidthProp): Self = StObject.set(x, "slideWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideWidthUndefined: Self = StObject.set(x, "slideWidth", js.undefined)
      
      @scala.inline
      def setSlidesToScroll(value: CarouselSlidesToScrollProp): Self = StObject.set(x, "slidesToScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidesToScrollUndefined: Self = StObject.set(x, "slidesToScroll", js.undefined)
      
      @scala.inline
      def setSlidesToShow(value: Double): Self = StObject.set(x, "slidesToShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidesToShowUndefined: Self = StObject.set(x, "slidesToShow", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSwiping(value: Boolean): Self = StObject.set(x, "swiping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipingUndefined: Self = StObject.set(x, "swiping", js.undefined)
      
      @scala.inline
      def setTransitionMode(value: CarouselTransitionModeProp): Self = StObject.set(x, "transitionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionModeUndefined: Self = StObject.set(x, "transitionMode", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWithoutControls(value: Boolean): Self = StObject.set(x, "withoutControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithoutControlsUndefined: Self = StObject.set(x, "withoutControls", js.undefined)
      
      @scala.inline
      def setWrapAround(value: Boolean): Self = StObject.set(x, "wrapAround", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapAroundUndefined: Self = StObject.set(x, "wrapAround", js.undefined)
      
      @scala.inline
      def setZoomScale(value: Double): Self = StObject.set(x, "zoomScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomScaleUndefined: Self = StObject.set(x, "zoomScale", js.undefined)
    }
  }
  
  type CarouselRenderControl = js.Function1[/* props */ CarouselSlideRenderControlProps, ReactNode]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nukaCarousel.nukaCarouselStrings.page
    - typings.nukaCarousel.nukaCarouselStrings.remainder
  */
  trait CarouselScrollModeProp extends StObject
  object CarouselScrollModeProp {
    
    @scala.inline
    def page: typings.nukaCarousel.nukaCarouselStrings.page = "page".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.page]
    
    @scala.inline
    def remainder: typings.nukaCarousel.nukaCarouselStrings.remainder = "remainder".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.remainder]
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
    
    @scala.inline
    def firstSlide: typings.nukaCarousel.nukaCarouselStrings.firstSlide = "firstSlide".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.firstSlide]
    
    @scala.inline
    def lastSlide: typings.nukaCarousel.nukaCarouselStrings.lastSlide = "lastSlide".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.lastSlide]
    
    @scala.inline
    def nextSlide: typings.nukaCarousel.nukaCarouselStrings.nextSlide = "nextSlide".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.nextSlide]
    
    @scala.inline
    def pause: typings.nukaCarousel.nukaCarouselStrings.pause = "pause".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.pause]
    
    @scala.inline
    def previousSlide: typings.nukaCarousel.nukaCarouselStrings.previousSlide = "previousSlide".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.previousSlide]
  }
  
  @js.native
  trait CarouselSlideRenderControlProps extends StObject {
    
    /**
      * When displaying more than one slide, sets which position to anchor the current slide to.
      */
    var cellAlign: CarouselCellAlignProp = js.native
    
    /**
      * Space between slides, as an integer, but reflected as px
      */
    var cellSpacing: Double = js.native
    
    /**
      * Current slide index
      */
    var currentSlide: Double = js.native
    
    /**
      * Current frame width (px)
      */
    var frameWidth: Double = js.native
    
    /**
      * Go to X slide method
      * @param index Slide's index to go
      */
    def goToSlide(index: Double): Unit = js.native
    
    /**
      * Go to the next slide method
      */
    def nextSlide(): Unit = js.native
    
    /**
      * Go to the previous slide method
      */
    def previousSlide(): Unit = js.native
    
    /**
      * Total amount of slides
      */
    var slideCount: Double = js.native
    
    /**
      * Current slide width (px)
      */
    var slideWidth: Double = js.native
    
    /**
      * Slides to scroll at once
      */
    var slidesToScroll: CarouselSlidesToScrollProp = js.native
    
    /**
      * Slides to show at once
      */
    var slidesToShow: Double = js.native
    
    /**
      * Infinite mode enabled
      */
    var wrapAround: Boolean = js.native
  }
  object CarouselSlideRenderControlProps {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class CarouselSlideRenderControlPropsMutableBuilder[Self <: CarouselSlideRenderControlProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellAlign(value: CarouselCellAlignProp): Self = StObject.set(x, "cellAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellSpacing(value: Double): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentSlide(value: Double): Self = StObject.set(x, "currentSlide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameWidth(value: Double): Self = StObject.set(x, "frameWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoToSlide(value: Double => Unit): Self = StObject.set(x, "goToSlide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNextSlide(value: () => Unit): Self = StObject.set(x, "nextSlide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreviousSlide(value: () => Unit): Self = StObject.set(x, "previousSlide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSlideCount(value: Double): Self = StObject.set(x, "slideCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideWidth(value: Double): Self = StObject.set(x, "slideWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidesToScroll(value: CarouselSlidesToScrollProp): Self = StObject.set(x, "slidesToScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidesToShow(value: Double): Self = StObject.set(x, "slidesToShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapAround(value: Boolean): Self = StObject.set(x, "wrapAround", value.asInstanceOf[js.Any])
    }
  }
  
  type CarouselSlideWidthProp = String | Double
  
  type CarouselSlidesToScrollProp = Double | auto
  
  @js.native
  trait CarouselState extends StObject {
    
    /**
      * Current slide index
      */
    var currentSlide: Double = js.native
    
    /**
      * Is dragging enabled
      */
    var dragging: Boolean = js.native
    
    /**
      * Easing function name
      */
    var easing: String = js.native
    
    /**
      * Current frame width
      */
    var frameWidth: Double = js.native
    
    var isWrappingAround: Boolean = js.native
    
    /**
      * Current left value
      */
    var left: Double = js.native
    
    var pauseOnHover: Boolean = js.native
    
    var resetWrapAroundPosition: Boolean = js.native
    
    /**
      * Total amount of slides
      */
    var slideCount: Double = js.native
    
    /**
      * Current slide width
      */
    var slideWidth: CarouselSlideWidthProp = js.native
    
    /**
      * Slides to scroll at once
      */
    var slidesToScroll: CarouselSlidesToScrollProp = js.native
    
    /**
      * Current top value
      */
    var top: Double = js.native
    
    /**
      * Is infinite mode enabled
      */
    var wrapToIndex: Boolean = js.native
  }
  object CarouselState {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class CarouselStateMutableBuilder[Self <: CarouselState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentSlide(value: Double): Self = StObject.set(x, "currentSlide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameWidth(value: Double): Self = StObject.set(x, "frameWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsWrappingAround(value: Boolean): Self = StObject.set(x, "isWrappingAround", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseOnHover(value: Boolean): Self = StObject.set(x, "pauseOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetWrapAroundPosition(value: Boolean): Self = StObject.set(x, "resetWrapAroundPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideCount(value: Double): Self = StObject.set(x, "slideCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideWidth(value: CarouselSlideWidthProp): Self = StObject.set(x, "slideWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidesToScroll(value: CarouselSlidesToScrollProp): Self = StObject.set(x, "slidesToScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapToIndex(value: Boolean): Self = StObject.set(x, "wrapToIndex", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nukaCarousel.nukaCarouselStrings.fade
    - typings.nukaCarousel.nukaCarouselStrings.scroll
    - typings.nukaCarousel.nukaCarouselStrings.scroll3d
  */
  trait CarouselTransitionModeProp extends StObject
  object CarouselTransitionModeProp {
    
    @scala.inline
    def fade: typings.nukaCarousel.nukaCarouselStrings.fade = "fade".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.fade]
    
    @scala.inline
    def scroll: typings.nukaCarousel.nukaCarouselStrings.scroll = "scroll".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.scroll]
    
    @scala.inline
    def scroll3d: typings.nukaCarousel.nukaCarouselStrings.scroll3d = "scroll3d".asInstanceOf[typings.nukaCarousel.nukaCarouselStrings.scroll3d]
  }
  
  type NextButtonProps = CarouselSlideRenderControlProps
  
  type PagingDotsProps = CarouselSlideRenderControlProps
  
  type PreviousButtonProps = CarouselSlideRenderControlProps
}
