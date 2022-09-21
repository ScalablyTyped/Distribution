package typings.nukaCarousel

import typings.nukaCarousel.typesMod.Alignment
import typings.nukaCarousel.typesMod.ControlProps
import typings.nukaCarousel.typesMod.ScrollMode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultControlsMod {
  
  @JSImport("nuka-carousel/lib/default-controls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def NextButton(props: ControlProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NextButton")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def PagingDots(props: ControlProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PagingDots")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def PreviousButton(props: ControlProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PreviousButton")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getDotIndexes(
    slideCount: Double,
    slidesToScroll: Double,
    scrollMode: ScrollMode,
    slidesToShow: Double,
    wrapAround: Boolean,
    cellAlign: Alignment
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDotIndexes")(slideCount.asInstanceOf[js.Any], slidesToScroll.asInstanceOf[js.Any], scrollMode.asInstanceOf[js.Any], slidesToShow.asInstanceOf[js.Any], wrapAround.asInstanceOf[js.Any], cellAlign.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def nextButtonDisabled(hasCurrentSlideSlideCountSlidesToShowWrapAroundCellAlign: ControlProps): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("nextButtonDisabled")(hasCurrentSlideSlideCountSlidesToShowWrapAroundCellAlign.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def prevButtonDisabled(hasCurrentSlideWrapAroundCellAlignSlidesToShow: ControlProps): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("prevButtonDisabled")(hasCurrentSlideWrapAroundCellAlignSlidesToShow.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
