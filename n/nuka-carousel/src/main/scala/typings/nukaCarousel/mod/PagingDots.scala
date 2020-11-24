package typings.nukaCarousel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.FunctionalComponent<PagingDotsProps> * / any */ @JSImport("nuka-carousel", "PagingDots")
@js.native
class PagingDots () extends js.Object {
  
  def getButtonStyles(active: Boolean): typings.react.mod.CSSProperties = js.native
  
  def getDotIndexes(
    slideCount: Double,
    slidesToScroll: CarouselSlidesToScrollProp,
    slidesToShow: Double,
    cellAlign: CarouselCellAlignProp
  ): js.Array[Double] = js.native
  
  def getListStyles(): typings.react.mod.CSSProperties = js.native
}
