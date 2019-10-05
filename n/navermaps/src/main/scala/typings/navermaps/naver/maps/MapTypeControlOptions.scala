package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapTypeControlOptions extends js.Object {
  var mapTypeIds: js.Array[MapTypeId] | Null
  var position: Position
  var style: MapTypeControlStyle
}

object MapTypeControlOptions {
  @scala.inline
  def apply(position: Position, style: MapTypeControlStyle, mapTypeIds: js.Array[MapTypeId] = null): MapTypeControlOptions = {
    val __obj = js.Dynamic.literal(position = position, style = style)
    if (mapTypeIds != null) __obj.updateDynamic("mapTypeIds")(mapTypeIds)
    __obj.asInstanceOf[MapTypeControlOptions]
  }
}

