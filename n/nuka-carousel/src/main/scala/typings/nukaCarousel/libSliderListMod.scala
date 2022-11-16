package typings.nukaCarousel

import typings.nukaCarousel.libTypesMod.CellAlign
import typings.nukaCarousel.libTypesMod.EasingFunction
import typings.nukaCarousel.libTypesMod.ScrollMode
import typings.nukaCarousel.nukaCarouselStrings.fade
import typings.nukaCarousel.nukaCarouselStrings.zoom
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSliderListMod {
  
  @JSImport("nuka-carousel/lib/slider-list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nuka-carousel/lib/slider-list", "SliderList")
  @js.native
  val SliderList: ForwardRefExoticComponent[SliderListProps & RefAttributes[HTMLDivElement]] = js.native
  
  inline def getPercentOffsetForSlide(
    currentSlide: Double,
    slideCount: Double,
    slidesToShow: Double,
    cellAlign: CellAlign,
    wrapAround: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPercentOffsetForSlide")(currentSlide.asInstanceOf[js.Any], slideCount.asInstanceOf[js.Any], slidesToShow.asInstanceOf[js.Any], cellAlign.asInstanceOf[js.Any], wrapAround.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* Inlined parent std.Pick<nuka-carousel.nuka-carousel/lib/types.InternalCarouselProps, 'cellAlign' | 'disableAnimation' | 'disableEdgeSwiping' | 'easing' | 'edgeEasing' | 'scrollMode' | 'animation' | 'slidesToScroll' | 'slidesToShow' | 'speed' | 'wrapAround'> */
  trait SliderListProps extends StObject {
    
    var animation: js.UndefOr[zoom | fade] = js.undefined
    
    var animationDistance: Double
    
    var cellAlign: CellAlign
    
    var children: ReactNode
    
    var currentSlide: Double
    
    var disableAnimation: Boolean
    
    var disableEdgeSwiping: Boolean
    
    var draggedOffset: Double
    
    var easing: EasingFunction
    
    var edgeEasing: EasingFunction
    
    var isDragging: Boolean
    
    var scrollMode: ScrollMode
    
    var slideCount: Double
    
    var slidesToScroll: Double
    
    var slidesToShow: Double
    
    var speed: Double
    
    var wrapAround: Boolean
  }
  object SliderListProps {
    
    inline def apply(
      animationDistance: Double,
      cellAlign: CellAlign,
      currentSlide: Double,
      disableAnimation: Boolean,
      disableEdgeSwiping: Boolean,
      draggedOffset: Double,
      easing: /* normalizedTime */ Double => Double,
      edgeEasing: /* normalizedTime */ Double => Double,
      isDragging: Boolean,
      scrollMode: ScrollMode,
      slideCount: Double,
      slidesToScroll: Double,
      slidesToShow: Double,
      speed: Double,
      wrapAround: Boolean
    ): SliderListProps = {
      val __obj = js.Dynamic.literal(animationDistance = animationDistance.asInstanceOf[js.Any], cellAlign = cellAlign.asInstanceOf[js.Any], currentSlide = currentSlide.asInstanceOf[js.Any], disableAnimation = disableAnimation.asInstanceOf[js.Any], disableEdgeSwiping = disableEdgeSwiping.asInstanceOf[js.Any], draggedOffset = draggedOffset.asInstanceOf[js.Any], easing = js.Any.fromFunction1(easing), edgeEasing = js.Any.fromFunction1(edgeEasing), isDragging = isDragging.asInstanceOf[js.Any], scrollMode = scrollMode.asInstanceOf[js.Any], slideCount = slideCount.asInstanceOf[js.Any], slidesToScroll = slidesToScroll.asInstanceOf[js.Any], slidesToShow = slidesToShow.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], wrapAround = wrapAround.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderListProps]
    }
    
    extension [Self <: SliderListProps](x: Self) {
      
      inline def setAnimation(value: zoom | fade): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationDistance(value: Double): Self = StObject.set(x, "animationDistance", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setCellAlign(value: CellAlign): Self = StObject.set(x, "cellAlign", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCurrentSlide(value: Double): Self = StObject.set(x, "currentSlide", value.asInstanceOf[js.Any])
      
      inline def setDisableAnimation(value: Boolean): Self = StObject.set(x, "disableAnimation", value.asInstanceOf[js.Any])
      
      inline def setDisableEdgeSwiping(value: Boolean): Self = StObject.set(x, "disableEdgeSwiping", value.asInstanceOf[js.Any])
      
      inline def setDraggedOffset(value: Double): Self = StObject.set(x, "draggedOffset", value.asInstanceOf[js.Any])
      
      inline def setEasing(value: /* normalizedTime */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEdgeEasing(value: /* normalizedTime */ Double => Double): Self = StObject.set(x, "edgeEasing", js.Any.fromFunction1(value))
      
      inline def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
      
      inline def setScrollMode(value: ScrollMode): Self = StObject.set(x, "scrollMode", value.asInstanceOf[js.Any])
      
      inline def setSlideCount(value: Double): Self = StObject.set(x, "slideCount", value.asInstanceOf[js.Any])
      
      inline def setSlidesToScroll(value: Double): Self = StObject.set(x, "slidesToScroll", value.asInstanceOf[js.Any])
      
      inline def setSlidesToShow(value: Double): Self = StObject.set(x, "slidesToShow", value.asInstanceOf[js.Any])
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setWrapAround(value: Boolean): Self = StObject.set(x, "wrapAround", value.asInstanceOf[js.Any])
    }
  }
}
