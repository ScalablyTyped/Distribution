package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileIndex extends js.Object {
  var xIndex: Double
  var yIndex: Double
}

object TileIndex {
  @scala.inline
  def apply(xIndex: Double, yIndex: Double): TileIndex = {
    val __obj = js.Dynamic.literal(xIndex = xIndex.asInstanceOf[js.Any], yIndex = yIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileIndex]
  }
}

