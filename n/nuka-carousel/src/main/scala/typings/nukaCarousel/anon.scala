package typings.nukaCarousel

import typings.csstype.mod.Property.Width
import typings.nukaCarousel.mod.CellAlign
import typings.nukaCarousel.mod.ControlProps
import typings.nukaCarousel.mod.DefaultControlsConfig
import typings.nukaCarousel.mod.EasingFunction
import typings.nukaCarousel.mod.KeyCodeConfig
import typings.nukaCarousel.mod.RenderAnnounceSlideMessage
import typings.nukaCarousel.mod.RenderControls
import typings.nukaCarousel.mod.ScrollMode
import typings.nukaCarousel.nukaCarouselStrings.auto
import typings.nukaCarousel.nukaCarouselStrings.fade
import typings.nukaCarousel.nukaCarouselStrings.zoom
import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.TouchEvent
import typings.std.Element
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Count extends StObject {
    
    var count: Double
    
    var currentSlide: Double
  }
  object Count {
    
    inline def apply(count: Double, currentSlide: Double): Count = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], currentSlide = currentSlide.asInstanceOf[js.Any])
      __obj.asInstanceOf[Count]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCurrentSlide(value: Double): Self = StObject.set(x, "currentSlide", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<nuka-carousel.nuka-carousel.InternalCarouselProps> & react.react.RefAttributes<std.HTMLDivElement> */
  trait PartialInternalCarouselPr extends StObject {
    
    var adaptiveHeight: js.UndefOr[Boolean] = js.undefined
    
    var adaptiveHeightAnimation: js.UndefOr[Boolean] = js.undefined
    
    var afterSlide: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    var animation: js.UndefOr[zoom | fade] = js.undefined
    
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    var autoplayInterval: js.UndefOr[Double] = js.undefined
    
    var autoplayReverse: js.UndefOr[Boolean] = js.undefined
    
    var beforeSlide: js.UndefOr[js.Function2[/* currentSlideIndex */ Double, /* endSlideIndex */ Double, Unit]] = js.undefined
    
    var cellAlign: js.UndefOr[CellAlign] = js.undefined
    
    var cellSpacing: js.UndefOr[Double] = js.undefined
    
    var children: js.UndefOr[ReactNode | js.Array[ReactNode]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var defaultControlsConfig: js.UndefOr[DefaultControlsConfig] = js.undefined
    
    var disableAnimation: js.UndefOr[Boolean] = js.undefined
    
    var disableEdgeSwiping: js.UndefOr[Boolean] = js.undefined
    
    var dragThreshold: js.UndefOr[Double] = js.undefined
    
    var dragging: js.UndefOr[Boolean] = js.undefined
    
    var easing: js.UndefOr[EasingFunction] = js.undefined
    
    var edgeEasing: js.UndefOr[EasingFunction] = js.undefined
    
    var enableKeyboardControls: js.UndefOr[Boolean] = js.undefined
    
    var frameAriaLabel: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[Key | Null] = js.undefined
    
    var keyCodeConfig: js.UndefOr[KeyCodeConfig] = js.undefined
    
    var onDrag: js.UndefOr[
        js.Function1[
          /* e */ TouchEvent[HTMLDivElement] | (MouseEvent[HTMLDivElement, NativeMouseEvent]), 
          Unit
        ]
      ] = js.undefined
    
    var onDragEnd: js.UndefOr[
        js.Function1[
          /* e */ TouchEvent[HTMLDivElement] | (MouseEvent[HTMLDivElement, NativeMouseEvent]), 
          Unit
        ]
      ] = js.undefined
    
    var onDragStart: js.UndefOr[
        js.Function1[
          /* e */ TouchEvent[HTMLDivElement] | (MouseEvent[HTMLDivElement, NativeMouseEvent]), 
          Unit
        ]
      ] = js.undefined
    
    var onUserNavigation: js.UndefOr[
        js.Function1[
          /* e */ TouchEvent[Element] | (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], 
          Unit
        ]
      ] = js.undefined
    
    var pauseOnHover: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allows getting a ref to the component instance.
      * Once the component unmounts, React will set `ref.current` to `null` (or call the ref with `null` if you passed a callback ref).
      * @see https://react.dev/learn/referencing-values-with-refs#refs-and-the-dom
      */
    var ref: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
    
    var renderAnnounceSlideMessage: js.UndefOr[RenderAnnounceSlideMessage] = js.undefined
    
    var renderBottomCenterControls: js.UndefOr[RenderControls] = js.undefined
    
    var renderBottomLeftControls: js.UndefOr[RenderControls] = js.undefined
    
    var renderBottomRightControls: js.UndefOr[RenderControls] = js.undefined
    
    var renderCenterCenterControls: js.UndefOr[RenderControls] = js.undefined
    
    var renderCenterLeftControls: js.UndefOr[RenderControls] = js.undefined
    
    var renderCenterRightControls: js.UndefOr[RenderControls] = js.undefined
    
    var renderTopCenterControls: js.UndefOr[RenderControls] = js.undefined
    
    var renderTopLeftControls: js.UndefOr[RenderControls] = js.undefined
    
    var renderTopRightControls: js.UndefOr[RenderControls] = js.undefined
    
    var scrollMode: js.UndefOr[ScrollMode] = js.undefined
    
    var slideIndex: js.UndefOr[Double] = js.undefined
    
    var slideWidth: js.UndefOr[Width[String | Double]] = js.undefined
    
    var slidesToScroll: js.UndefOr[Double | auto] = js.undefined
    
    var slidesToShow: js.UndefOr[Double] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var swiping: js.UndefOr[Boolean] = js.undefined
    
    var vertical: js.UndefOr[Boolean] = js.undefined
    
    var withoutControls: js.UndefOr[Boolean] = js.undefined
    
    var wrapAround: js.UndefOr[Boolean] = js.undefined
    
    var zoomScale: js.UndefOr[Double] = js.undefined
  }
  object PartialInternalCarouselPr {
    
    inline def apply(): PartialInternalCarouselPr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialInternalCarouselPr]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialInternalCarouselPr] (val x: Self) extends AnyVal {
      
      inline def setAdaptiveHeight(value: Boolean): Self = StObject.set(x, "adaptiveHeight", value.asInstanceOf[js.Any])
      
      inline def setAdaptiveHeightAnimation(value: Boolean): Self = StObject.set(x, "adaptiveHeightAnimation", value.asInstanceOf[js.Any])
      
      inline def setAdaptiveHeightAnimationUndefined: Self = StObject.set(x, "adaptiveHeightAnimation", js.undefined)
      
      inline def setAdaptiveHeightUndefined: Self = StObject.set(x, "adaptiveHeight", js.undefined)
      
      inline def setAfterSlide(value: /* index */ Double => Unit): Self = StObject.set(x, "afterSlide", js.Any.fromFunction1(value))
      
      inline def setAfterSlideUndefined: Self = StObject.set(x, "afterSlide", js.undefined)
      
      inline def setAnimation(value: zoom | fade): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayInterval(value: Double): Self = StObject.set(x, "autoplayInterval", value.asInstanceOf[js.Any])
      
      inline def setAutoplayIntervalUndefined: Self = StObject.set(x, "autoplayInterval", js.undefined)
      
      inline def setAutoplayReverse(value: Boolean): Self = StObject.set(x, "autoplayReverse", value.asInstanceOf[js.Any])
      
      inline def setAutoplayReverseUndefined: Self = StObject.set(x, "autoplayReverse", js.undefined)
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setBeforeSlide(value: (/* currentSlideIndex */ Double, /* endSlideIndex */ Double) => Unit): Self = StObject.set(x, "beforeSlide", js.Any.fromFunction2(value))
      
      inline def setBeforeSlideUndefined: Self = StObject.set(x, "beforeSlide", js.undefined)
      
      inline def setCellAlign(value: CellAlign): Self = StObject.set(x, "cellAlign", value.asInstanceOf[js.Any])
      
      inline def setCellAlignUndefined: Self = StObject.set(x, "cellAlign", js.undefined)
      
      inline def setCellSpacing(value: Double): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
      
      inline def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
      
      inline def setChildren(value: ReactNode | js.Array[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultControlsConfig(value: DefaultControlsConfig): Self = StObject.set(x, "defaultControlsConfig", value.asInstanceOf[js.Any])
      
      inline def setDefaultControlsConfigUndefined: Self = StObject.set(x, "defaultControlsConfig", js.undefined)
      
      inline def setDisableAnimation(value: Boolean): Self = StObject.set(x, "disableAnimation", value.asInstanceOf[js.Any])
      
      inline def setDisableAnimationUndefined: Self = StObject.set(x, "disableAnimation", js.undefined)
      
      inline def setDisableEdgeSwiping(value: Boolean): Self = StObject.set(x, "disableEdgeSwiping", value.asInstanceOf[js.Any])
      
      inline def setDisableEdgeSwipingUndefined: Self = StObject.set(x, "disableEdgeSwiping", js.undefined)
      
      inline def setDragThreshold(value: Double): Self = StObject.set(x, "dragThreshold", value.asInstanceOf[js.Any])
      
      inline def setDragThresholdUndefined: Self = StObject.set(x, "dragThreshold", js.undefined)
      
      inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
      
      inline def setEasing(value: /* normalizedTime */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setEdgeEasing(value: /* normalizedTime */ Double => Double): Self = StObject.set(x, "edgeEasing", js.Any.fromFunction1(value))
      
      inline def setEdgeEasingUndefined: Self = StObject.set(x, "edgeEasing", js.undefined)
      
      inline def setEnableKeyboardControls(value: Boolean): Self = StObject.set(x, "enableKeyboardControls", value.asInstanceOf[js.Any])
      
      inline def setEnableKeyboardControlsUndefined: Self = StObject.set(x, "enableKeyboardControls", js.undefined)
      
      inline def setFrameAriaLabel(value: String): Self = StObject.set(x, "frameAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setFrameAriaLabelUndefined: Self = StObject.set(x, "frameAriaLabel", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyCodeConfig(value: KeyCodeConfig): Self = StObject.set(x, "keyCodeConfig", value.asInstanceOf[js.Any])
      
      inline def setKeyCodeConfigUndefined: Self = StObject.set(x, "keyCodeConfig", js.undefined)
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOnDrag(value: /* e */ TouchEvent[HTMLDivElement] | (MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      inline def setOnDragEnd(value: /* e */ TouchEvent[HTMLDivElement] | (MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragStart(value: /* e */ TouchEvent[HTMLDivElement] | (MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnUserNavigation(
        value: /* e */ TouchEvent[Element] | (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element] => Unit
      ): Self = StObject.set(x, "onUserNavigation", js.Any.fromFunction1(value))
      
      inline def setOnUserNavigationUndefined: Self = StObject.set(x, "onUserNavigation", js.undefined)
      
      inline def setPauseOnHover(value: Boolean): Self = StObject.set(x, "pauseOnHover", value.asInstanceOf[js.Any])
      
      inline def setPauseOnHoverUndefined: Self = StObject.set(x, "pauseOnHover", js.undefined)
      
      inline def setRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRenderAnnounceSlideMessage(value: /* props */ Count => String): Self = StObject.set(x, "renderAnnounceSlideMessage", js.Any.fromFunction1(value))
      
      inline def setRenderAnnounceSlideMessageUndefined: Self = StObject.set(x, "renderAnnounceSlideMessage", js.undefined)
      
      inline def setRenderBottomCenterControls(value: /* props */ ControlProps => ReactNode): Self = StObject.set(x, "renderBottomCenterControls", js.Any.fromFunction1(value))
      
      inline def setRenderBottomCenterControlsNull: Self = StObject.set(x, "renderBottomCenterControls", null)
      
      inline def setRenderBottomCenterControlsUndefined: Self = StObject.set(x, "renderBottomCenterControls", js.undefined)
      
      inline def setRenderBottomLeftControls(value: /* props */ ControlProps => ReactNode): Self = StObject.set(x, "renderBottomLeftControls", js.Any.fromFunction1(value))
      
      inline def setRenderBottomLeftControlsNull: Self = StObject.set(x, "renderBottomLeftControls", null)
      
      inline def setRenderBottomLeftControlsUndefined: Self = StObject.set(x, "renderBottomLeftControls", js.undefined)
      
      inline def setRenderBottomRightControls(value: /* props */ ControlProps => ReactNode): Self = StObject.set(x, "renderBottomRightControls", js.Any.fromFunction1(value))
      
      inline def setRenderBottomRightControlsNull: Self = StObject.set(x, "renderBottomRightControls", null)
      
      inline def setRenderBottomRightControlsUndefined: Self = StObject.set(x, "renderBottomRightControls", js.undefined)
      
      inline def setRenderCenterCenterControls(value: /* props */ ControlProps => ReactNode): Self = StObject.set(x, "renderCenterCenterControls", js.Any.fromFunction1(value))
      
      inline def setRenderCenterCenterControlsNull: Self = StObject.set(x, "renderCenterCenterControls", null)
      
      inline def setRenderCenterCenterControlsUndefined: Self = StObject.set(x, "renderCenterCenterControls", js.undefined)
      
      inline def setRenderCenterLeftControls(value: /* props */ ControlProps => ReactNode): Self = StObject.set(x, "renderCenterLeftControls", js.Any.fromFunction1(value))
      
      inline def setRenderCenterLeftControlsNull: Self = StObject.set(x, "renderCenterLeftControls", null)
      
      inline def setRenderCenterLeftControlsUndefined: Self = StObject.set(x, "renderCenterLeftControls", js.undefined)
      
      inline def setRenderCenterRightControls(value: /* props */ ControlProps => ReactNode): Self = StObject.set(x, "renderCenterRightControls", js.Any.fromFunction1(value))
      
      inline def setRenderCenterRightControlsNull: Self = StObject.set(x, "renderCenterRightControls", null)
      
      inline def setRenderCenterRightControlsUndefined: Self = StObject.set(x, "renderCenterRightControls", js.undefined)
      
      inline def setRenderTopCenterControls(value: /* props */ ControlProps => ReactNode): Self = StObject.set(x, "renderTopCenterControls", js.Any.fromFunction1(value))
      
      inline def setRenderTopCenterControlsNull: Self = StObject.set(x, "renderTopCenterControls", null)
      
      inline def setRenderTopCenterControlsUndefined: Self = StObject.set(x, "renderTopCenterControls", js.undefined)
      
      inline def setRenderTopLeftControls(value: /* props */ ControlProps => ReactNode): Self = StObject.set(x, "renderTopLeftControls", js.Any.fromFunction1(value))
      
      inline def setRenderTopLeftControlsNull: Self = StObject.set(x, "renderTopLeftControls", null)
      
      inline def setRenderTopLeftControlsUndefined: Self = StObject.set(x, "renderTopLeftControls", js.undefined)
      
      inline def setRenderTopRightControls(value: /* props */ ControlProps => ReactNode): Self = StObject.set(x, "renderTopRightControls", js.Any.fromFunction1(value))
      
      inline def setRenderTopRightControlsNull: Self = StObject.set(x, "renderTopRightControls", null)
      
      inline def setRenderTopRightControlsUndefined: Self = StObject.set(x, "renderTopRightControls", js.undefined)
      
      inline def setScrollMode(value: ScrollMode): Self = StObject.set(x, "scrollMode", value.asInstanceOf[js.Any])
      
      inline def setScrollModeUndefined: Self = StObject.set(x, "scrollMode", js.undefined)
      
      inline def setSlideIndex(value: Double): Self = StObject.set(x, "slideIndex", value.asInstanceOf[js.Any])
      
      inline def setSlideIndexUndefined: Self = StObject.set(x, "slideIndex", js.undefined)
      
      inline def setSlideWidth(value: Width[String | Double]): Self = StObject.set(x, "slideWidth", value.asInstanceOf[js.Any])
      
      inline def setSlideWidthUndefined: Self = StObject.set(x, "slideWidth", js.undefined)
      
      inline def setSlidesToScroll(value: Double | auto): Self = StObject.set(x, "slidesToScroll", value.asInstanceOf[js.Any])
      
      inline def setSlidesToScrollUndefined: Self = StObject.set(x, "slidesToScroll", js.undefined)
      
      inline def setSlidesToShow(value: Double): Self = StObject.set(x, "slidesToShow", value.asInstanceOf[js.Any])
      
      inline def setSlidesToShowUndefined: Self = StObject.set(x, "slidesToShow", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSwiping(value: Boolean): Self = StObject.set(x, "swiping", value.asInstanceOf[js.Any])
      
      inline def setSwipingUndefined: Self = StObject.set(x, "swiping", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      inline def setWithoutControls(value: Boolean): Self = StObject.set(x, "withoutControls", value.asInstanceOf[js.Any])
      
      inline def setWithoutControlsUndefined: Self = StObject.set(x, "withoutControls", js.undefined)
      
      inline def setWrapAround(value: Boolean): Self = StObject.set(x, "wrapAround", value.asInstanceOf[js.Any])
      
      inline def setWrapAroundUndefined: Self = StObject.set(x, "wrapAround", js.undefined)
      
      inline def setZoomScale(value: Double): Self = StObject.set(x, "zoomScale", value.asInstanceOf[js.Any])
      
      inline def setZoomScaleUndefined: Self = StObject.set(x, "zoomScale", js.undefined)
    }
  }
}
