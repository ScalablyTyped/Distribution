package typings.nukaCarousel

import typings.nukaCarousel.nukaCarouselStrings.fade
import typings.nukaCarousel.nukaCarouselStrings.zoom
import typings.nukaCarousel.typesMod.Alignment
import typings.nukaCarousel.typesMod.ScrollMode
import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderListMod {
  
  @JSImport("nuka-carousel/lib/slider-list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSliderListStyles(
    slideCount: Double,
    currentSlide: Double,
    isAnimating: Boolean,
    slidesToShow: Double,
    cellAlign: Alignment,
    wrapAround: Boolean,
    speed: Double,
    draggedOffset: Double,
    slidesToScroll: Double,
    scrollMode: ScrollMode,
    disableEdgeSwiping: Boolean
  ): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("getSliderListStyles")(slideCount.asInstanceOf[js.Any], currentSlide.asInstanceOf[js.Any], isAnimating.asInstanceOf[js.Any], slidesToShow.asInstanceOf[js.Any], cellAlign.asInstanceOf[js.Any], wrapAround.asInstanceOf[js.Any], speed.asInstanceOf[js.Any], draggedOffset.asInstanceOf[js.Any], slidesToScroll.asInstanceOf[js.Any], scrollMode.asInstanceOf[js.Any], disableEdgeSwiping.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def getSliderListStyles(
    slideCount: Double,
    currentSlide: Double,
    isAnimating: Boolean,
    slidesToShow: Double,
    cellAlign: Alignment,
    wrapAround: Boolean,
    speed: Double,
    draggedOffset: Double,
    slidesToScroll: Double,
    scrollMode: ScrollMode,
    disableEdgeSwiping: Boolean,
    slideAnimation: fade | zoom
  ): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("getSliderListStyles")(slideCount.asInstanceOf[js.Any], currentSlide.asInstanceOf[js.Any], isAnimating.asInstanceOf[js.Any], slidesToShow.asInstanceOf[js.Any], cellAlign.asInstanceOf[js.Any], wrapAround.asInstanceOf[js.Any], speed.asInstanceOf[js.Any], draggedOffset.asInstanceOf[js.Any], slidesToScroll.asInstanceOf[js.Any], scrollMode.asInstanceOf[js.Any], disableEdgeSwiping.asInstanceOf[js.Any], slideAnimation.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
}
