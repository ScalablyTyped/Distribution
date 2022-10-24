package typings.nukaCarousel

import typings.nukaCarousel.anon.PickControlPropscellAlign
import typings.nukaCarousel.anon.PickControlPropscellAlignCellAlign
import typings.nukaCarousel.libTypesMod.Alignment
import typings.nukaCarousel.libTypesMod.ControlProps
import typings.nukaCarousel.libTypesMod.ScrollMode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDefaultControlsMod {
  
  @JSImport("nuka-carousel/lib/default-controls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def NextButton(param0: ControlProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NextButton")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def PagingDots(param0: ControlProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PagingDots")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def PreviousButton(param0: ControlProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PreviousButton")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getDotIndexes(
    slideCount: Double,
    slidesToScroll: Double,
    scrollMode: ScrollMode,
    slidesToShow: Double,
    wrapAround: Boolean,
    cellAlign: Alignment
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDotIndexes")(slideCount.asInstanceOf[js.Any], slidesToScroll.asInstanceOf[js.Any], scrollMode.asInstanceOf[js.Any], slidesToShow.asInstanceOf[js.Any], wrapAround.asInstanceOf[js.Any], cellAlign.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def nextButtonDisabled(param0: PickControlPropscellAlign): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("nextButtonDisabled")(param0.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def prevButtonDisabled(param0: PickControlPropscellAlignCellAlign): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("prevButtonDisabled")(param0.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
