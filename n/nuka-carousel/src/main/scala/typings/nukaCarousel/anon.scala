package typings.nukaCarousel

import typings.nukaCarousel.libTypesMod.CellAlign
import typings.nukaCarousel.nukaCarouselStrings.`next-cloned`
import typings.nukaCarousel.nukaCarouselStrings.`prev-cloned`
import typings.nukaCarousel.nukaCarouselStrings.assertive
import typings.nukaCarousel.nukaCarouselStrings.fade
import typings.nukaCarousel.nukaCarouselStrings.off
import typings.nukaCarousel.nukaCarouselStrings.polite
import typings.nukaCarousel.nukaCarouselStrings.zoom
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AdaptiveHeight extends StObject {
    
    var adaptiveHeight: Boolean = js.native
    
    var animation: js.UndefOr[zoom | fade] = js.native
    
    var cellAlign: CellAlign = js.native
    
    var cellSpacing: Double = js.native
    
    var children: ReactNode | js.Array[ReactNode] = js.native
    
    var count: Double = js.native
    
    var currentSlide: Double = js.native
    
    var index: Double = js.native
    
    var initializedAdaptiveHeight: Boolean = js.native
    
    var isCurrentSlide: Boolean = js.native
    
    /**
      * Called with `height` when slide becomes visible and `null` when it becomes
      * hidden.
      */
    def onVisibleSlideHeightChange(index: Double): Any = js.native
    def onVisibleSlideHeightChange(index: Double, height: Double): Any = js.native
    
    var slidesToShow: Double = js.native
    
    var speed: Double = js.native
    
    var typeOfSlide: js.UndefOr[`prev-cloned` | `next-cloned`] = js.native
    
    var wrapAround: Boolean = js.native
    
    var zoomScale: js.UndefOr[Double] = js.native
  }
  
  trait AriaLive extends StObject {
    
    var ariaLive: js.UndefOr[off | assertive | polite] = js.undefined
    
    var message: String
  }
  object AriaLive {
    
    inline def apply(message: String): AriaLive = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[AriaLive]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AriaLive] (val x: Self) extends AnyVal {
      
      inline def setAriaLive(value: off | assertive | polite): Self = StObject.set(x, "ariaLive", value.asInstanceOf[js.Any])
      
      inline def setAriaLiveUndefined: Self = StObject.set(x, "ariaLive", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
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
  
  @js.native
  trait FrameHeight extends StObject {
    
    /** CSS height of the frame container */
    var frameHeight: String = js.native
    
    /**
      * Callback that can be passed to Slides to allow them to update the
      * `visibleHeights` variable.
      */
    def handleVisibleSlideHeightChange(slideIndex: Double): Any = js.native
    def handleVisibleSlideHeightChange(slideIndex: Double, height: Double): Any = js.native
    
    /**
      * Whether we'd measured the initial slide heights and are ready for the
      * frame to control the children's height, rather than the other way around.
      */
    var initializedAdaptiveHeight: Boolean = js.native
  }
  
  trait IsAnimating extends StObject {
    
    var isAnimating: Boolean
    
    var value: Double
  }
  object IsAnimating {
    
    inline def apply(isAnimating: Boolean, value: Double): IsAnimating = {
      val __obj = js.Dynamic.literal(isAnimating = isAnimating.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsAnimating]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsAnimating] (val x: Self) extends AnyVal {
      
      inline def setIsAnimating(value: Boolean): Self = StObject.set(x, "isAnimating", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<nuka-carousel.nuka-carousel/lib/types.ControlProps, 'cellAlign' | 'currentSlide' | 'slidesToShow' | 'wrapAround'> */
  trait PickControlPropscellAlign extends StObject {
    
    var cellAlign: CellAlign
    
    var currentSlide: Double
    
    var slidesToShow: Double
    
    var wrapAround: Boolean
  }
  object PickControlPropscellAlign {
    
    inline def apply(cellAlign: CellAlign, currentSlide: Double, slidesToShow: Double, wrapAround: Boolean): PickControlPropscellAlign = {
      val __obj = js.Dynamic.literal(cellAlign = cellAlign.asInstanceOf[js.Any], currentSlide = currentSlide.asInstanceOf[js.Any], slidesToShow = slidesToShow.asInstanceOf[js.Any], wrapAround = wrapAround.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickControlPropscellAlign]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickControlPropscellAlign] (val x: Self) extends AnyVal {
      
      inline def setCellAlign(value: CellAlign): Self = StObject.set(x, "cellAlign", value.asInstanceOf[js.Any])
      
      inline def setCurrentSlide(value: Double): Self = StObject.set(x, "currentSlide", value.asInstanceOf[js.Any])
      
      inline def setSlidesToShow(value: Double): Self = StObject.set(x, "slidesToShow", value.asInstanceOf[js.Any])
      
      inline def setWrapAround(value: Boolean): Self = StObject.set(x, "wrapAround", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<nuka-carousel.nuka-carousel/lib/types.ControlProps, 'cellAlign' | 'currentSlide' | 'slideCount' | 'slidesToShow' | 'wrapAround'> */
  trait PickControlPropscellAlignCellAlign extends StObject {
    
    var cellAlign: CellAlign
    
    var currentSlide: Double
    
    var slideCount: Double
    
    var slidesToShow: Double
    
    var wrapAround: Boolean
  }
  object PickControlPropscellAlignCellAlign {
    
    inline def apply(
      cellAlign: CellAlign,
      currentSlide: Double,
      slideCount: Double,
      slidesToShow: Double,
      wrapAround: Boolean
    ): PickControlPropscellAlignCellAlign = {
      val __obj = js.Dynamic.literal(cellAlign = cellAlign.asInstanceOf[js.Any], currentSlide = currentSlide.asInstanceOf[js.Any], slideCount = slideCount.asInstanceOf[js.Any], slidesToShow = slidesToShow.asInstanceOf[js.Any], wrapAround = wrapAround.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickControlPropscellAlignCellAlign]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickControlPropscellAlignCellAlign] (val x: Self) extends AnyVal {
      
      inline def setCellAlign(value: CellAlign): Self = StObject.set(x, "cellAlign", value.asInstanceOf[js.Any])
      
      inline def setCurrentSlide(value: Double): Self = StObject.set(x, "currentSlide", value.asInstanceOf[js.Any])
      
      inline def setSlideCount(value: Double): Self = StObject.set(x, "slideCount", value.asInstanceOf[js.Any])
      
      inline def setSlidesToShow(value: Double): Self = StObject.set(x, "slidesToShow", value.asInstanceOf[js.Any])
      
      inline def setWrapAround(value: Boolean): Self = StObject.set(x, "wrapAround", value.asInstanceOf[js.Any])
    }
  }
}
