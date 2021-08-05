package typings.nukaCarousel

import typings.nukaCarousel.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ContainerClassName extends StObject {
    
    var containerClassName: js.UndefOr[String] = js.undefined
    
    var nextButtonClassName: js.UndefOr[String] = js.undefined
    
    var nextButtonStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var nextButtonText: js.UndefOr[String] = js.undefined
    
    var pagingDotsClassName: js.UndefOr[String] = js.undefined
    
    var pagingDotsContainerClassName: js.UndefOr[String] = js.undefined
    
    var pagingDotsStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var prevButtonClassName: js.UndefOr[String] = js.undefined
    
    var prevButtonStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var prevButtonText: js.UndefOr[String] = js.undefined
  }
  object ContainerClassName {
    
    inline def apply(): ContainerClassName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerClassName]
    }
    
    extension [Self <: ContainerClassName](x: Self) {
      
      inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      inline def setNextButtonClassName(value: String): Self = StObject.set(x, "nextButtonClassName", value.asInstanceOf[js.Any])
      
      inline def setNextButtonClassNameUndefined: Self = StObject.set(x, "nextButtonClassName", js.undefined)
      
      inline def setNextButtonStyle(value: CSSProperties): Self = StObject.set(x, "nextButtonStyle", value.asInstanceOf[js.Any])
      
      inline def setNextButtonStyleUndefined: Self = StObject.set(x, "nextButtonStyle", js.undefined)
      
      inline def setNextButtonText(value: String): Self = StObject.set(x, "nextButtonText", value.asInstanceOf[js.Any])
      
      inline def setNextButtonTextUndefined: Self = StObject.set(x, "nextButtonText", js.undefined)
      
      inline def setPagingDotsClassName(value: String): Self = StObject.set(x, "pagingDotsClassName", value.asInstanceOf[js.Any])
      
      inline def setPagingDotsClassNameUndefined: Self = StObject.set(x, "pagingDotsClassName", js.undefined)
      
      inline def setPagingDotsContainerClassName(value: String): Self = StObject.set(x, "pagingDotsContainerClassName", value.asInstanceOf[js.Any])
      
      inline def setPagingDotsContainerClassNameUndefined: Self = StObject.set(x, "pagingDotsContainerClassName", js.undefined)
      
      inline def setPagingDotsStyle(value: CSSProperties): Self = StObject.set(x, "pagingDotsStyle", value.asInstanceOf[js.Any])
      
      inline def setPagingDotsStyleUndefined: Self = StObject.set(x, "pagingDotsStyle", js.undefined)
      
      inline def setPrevButtonClassName(value: String): Self = StObject.set(x, "prevButtonClassName", value.asInstanceOf[js.Any])
      
      inline def setPrevButtonClassNameUndefined: Self = StObject.set(x, "prevButtonClassName", js.undefined)
      
      inline def setPrevButtonStyle(value: CSSProperties): Self = StObject.set(x, "prevButtonStyle", value.asInstanceOf[js.Any])
      
      inline def setPrevButtonStyleUndefined: Self = StObject.set(x, "prevButtonStyle", js.undefined)
      
      inline def setPrevButtonText(value: String): Self = StObject.set(x, "prevButtonText", value.asInstanceOf[js.Any])
      
      inline def setPrevButtonTextUndefined: Self = StObject.set(x, "prevButtonText", js.undefined)
    }
  }
  
  /* Inlined {[ slideAction in nuka-carousel.nuka-carousel.CarouselSlideActions ]:? std.Array<number>} */
  trait slideActioninCarouselSlid extends StObject {
    
    var firstSlide: js.UndefOr[js.Array[Double]] = js.undefined
    
    var lastSlide: js.UndefOr[js.Array[Double]] = js.undefined
    
    var nextSlide: js.UndefOr[js.Array[Double]] = js.undefined
    
    var pause: js.UndefOr[js.Array[Double]] = js.undefined
    
    var previousSlide: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object slideActioninCarouselSlid {
    
    inline def apply(): slideActioninCarouselSlid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[slideActioninCarouselSlid]
    }
    
    extension [Self <: slideActioninCarouselSlid](x: Self) {
      
      inline def setFirstSlide(value: js.Array[Double]): Self = StObject.set(x, "firstSlide", value.asInstanceOf[js.Any])
      
      inline def setFirstSlideUndefined: Self = StObject.set(x, "firstSlide", js.undefined)
      
      inline def setFirstSlideVarargs(value: Double*): Self = StObject.set(x, "firstSlide", js.Array(value :_*))
      
      inline def setLastSlide(value: js.Array[Double]): Self = StObject.set(x, "lastSlide", value.asInstanceOf[js.Any])
      
      inline def setLastSlideUndefined: Self = StObject.set(x, "lastSlide", js.undefined)
      
      inline def setLastSlideVarargs(value: Double*): Self = StObject.set(x, "lastSlide", js.Array(value :_*))
      
      inline def setNextSlide(value: js.Array[Double]): Self = StObject.set(x, "nextSlide", value.asInstanceOf[js.Any])
      
      inline def setNextSlideUndefined: Self = StObject.set(x, "nextSlide", js.undefined)
      
      inline def setNextSlideVarargs(value: Double*): Self = StObject.set(x, "nextSlide", js.Array(value :_*))
      
      inline def setPause(value: js.Array[Double]): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      inline def setPauseVarargs(value: Double*): Self = StObject.set(x, "pause", js.Array(value :_*))
      
      inline def setPreviousSlide(value: js.Array[Double]): Self = StObject.set(x, "previousSlide", value.asInstanceOf[js.Any])
      
      inline def setPreviousSlideUndefined: Self = StObject.set(x, "previousSlide", js.undefined)
      
      inline def setPreviousSlideVarargs(value: Double*): Self = StObject.set(x, "previousSlide", js.Array(value :_*))
    }
  }
}
