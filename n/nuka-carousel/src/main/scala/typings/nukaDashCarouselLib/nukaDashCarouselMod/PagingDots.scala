package typings
package nukaDashCarouselLib.nukaDashCarouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nuka-carousel", "PagingDots")
@js.native
class PagingDots ()
  extends reactLib.reactMod.Component[PagingDotsProps, js.Object, js.Any] {
  def getButtonStyles(active: scala.Boolean): reactLib.reactMod.CSSProperties = js.native
  def getDotIndexes(
    slideCount: scala.Double,
    slidesToScroll: scala.Double,
    slidesToShow: scala.Double,
    cellAlign: CarouselCellAlignProp
  ): js.Array[scala.Double] = js.native
  def getListItemStyles(): reactLib.reactMod.CSSProperties = js.native
  def getListStyles(): reactLib.reactMod.CSSProperties = js.native
}

