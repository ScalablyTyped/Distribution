package typings.nukaCarousel

import typings.nukaCarousel.typesMod.InternalCarouselProps
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlsMod {
  
  @JSImport("nuka-carousel/lib/controls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    props: InternalCarouselProps,
    slideCount: Double,
    currentSlide: Double,
    goToSlide: js.Function1[/* targetSlideIndex */ Double, Unit],
    nextSlide: js.Function0[Unit],
    prevSlide: js.Function0[Unit],
    slidesToScroll: Double
  ): js.Array[ReactElement] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any], slideCount.asInstanceOf[js.Any], currentSlide.asInstanceOf[js.Any], goToSlide.asInstanceOf[js.Any], nextSlide.asInstanceOf[js.Any], prevSlide.asInstanceOf[js.Any], slidesToScroll.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactElement] | Null]
}
