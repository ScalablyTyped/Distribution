package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CarouselArrowsPlacement extends StObject
@JSImport("sap/m/library", "CarouselArrowsPlacement")
@js.native
object CarouselArrowsPlacement extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CarouselArrowsPlacement & String] = js.native
  
  /**
    * Carousel arrows are placed on the sides of the current Carousel page.
    */
  @js.native
  sealed trait Content
    extends StObject
       with CarouselArrowsPlacement
  /* "Content" */ val Content: typings.openui5.sapMLibraryMod.CarouselArrowsPlacement.Content & String = js.native
  
  /**
    * Carousel arrows are placed on the sides of the page indicator of the Carousel.
    */
  @js.native
  sealed trait PageIndicator
    extends StObject
       with CarouselArrowsPlacement
  /* "PageIndicator" */ val PageIndicator: typings.openui5.sapMLibraryMod.CarouselArrowsPlacement.PageIndicator & String = js.native
}
