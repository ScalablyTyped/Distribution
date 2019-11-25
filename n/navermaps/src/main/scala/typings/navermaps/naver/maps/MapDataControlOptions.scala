package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapDataControlOptions extends js.Object {
  var position: Position
}

object MapDataControlOptions {
  @scala.inline
  def apply(position: Position): MapDataControlOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MapDataControlOptions]
  }
}

