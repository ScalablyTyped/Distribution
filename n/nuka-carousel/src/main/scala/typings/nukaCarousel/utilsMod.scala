package typings.nukaCarousel

import typings.nukaCarousel.typesMod.Alignment
import typings.nukaCarousel.typesMod.ScrollMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("nuka-carousel/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBoundedIndex(rawIndex: Double, slideCount: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundedIndex")(rawIndex.asInstanceOf[js.Any], slideCount.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getDefaultSlideIndex(
    slideIndex: Double,
    slideCount: Double,
    slidesToShow: Double,
    slidesToScroll: Double,
    cellAlign: Alignment,
    autoplayReverse: Boolean,
    scrollMode: ScrollMode
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultSlideIndex")(slideIndex.asInstanceOf[js.Any], slideCount.asInstanceOf[js.Any], slidesToShow.asInstanceOf[js.Any], slidesToScroll.asInstanceOf[js.Any], cellAlign.asInstanceOf[js.Any], autoplayReverse.asInstanceOf[js.Any], scrollMode.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getDefaultSlideIndex(
    slideIndex: Unit,
    slideCount: Double,
    slidesToShow: Double,
    slidesToScroll: Double,
    cellAlign: Alignment,
    autoplayReverse: Boolean,
    scrollMode: ScrollMode
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultSlideIndex")(slideIndex.asInstanceOf[js.Any], slideCount.asInstanceOf[js.Any], slidesToShow.asInstanceOf[js.Any], slidesToScroll.asInstanceOf[js.Any], cellAlign.asInstanceOf[js.Any], autoplayReverse.asInstanceOf[js.Any], scrollMode.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getNextMoveIndex(
    scrollMode: ScrollMode,
    wrapAround: Boolean,
    currentSlide: Double,
    slideCount: Double,
    slidesToScroll: Double,
    slidesToShow: Double,
    cellAlign: Alignment
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextMoveIndex")(scrollMode.asInstanceOf[js.Any], wrapAround.asInstanceOf[js.Any], currentSlide.asInstanceOf[js.Any], slideCount.asInstanceOf[js.Any], slidesToScroll.asInstanceOf[js.Any], slidesToShow.asInstanceOf[js.Any], cellAlign.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getPrevMoveIndex(
    scrollMode: ScrollMode,
    wrapAround: Boolean,
    currentSlide: Double,
    slidesToScroll: Double,
    slidesToShow: Double,
    cellAlign: Alignment
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPrevMoveIndex")(scrollMode.asInstanceOf[js.Any], wrapAround.asInstanceOf[js.Any], currentSlide.asInstanceOf[js.Any], slidesToScroll.asInstanceOf[js.Any], slidesToShow.asInstanceOf[js.Any], cellAlign.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isSlideVisible(currentSlide: Double, indexToCheck: Double, slidesToShow: Double, cellAlign: Alignment): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSlideVisible")(currentSlide.asInstanceOf[js.Any], indexToCheck.asInstanceOf[js.Any], slidesToShow.asInstanceOf[js.Any], cellAlign.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
