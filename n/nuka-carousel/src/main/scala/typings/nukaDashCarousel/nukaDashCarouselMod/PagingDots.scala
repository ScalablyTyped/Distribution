package typings.nukaDashCarousel.nukaDashCarouselMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nuka-carousel", "PagingDots")
@js.native
class PagingDots ()
  extends Component[PagingDotsProps, js.Object, js.Any] {
  def getButtonStyles(active: Boolean): typings.react.reactMod.CSSProperties = js.native
  def getDotIndexes(slideCount: Double, slidesToScroll: Double, slidesToShow: Double, cellAlign: CarouselCellAlignProp): js.Array[Double] = js.native
  def getListStyles(): typings.react.reactMod.CSSProperties = js.native
}

