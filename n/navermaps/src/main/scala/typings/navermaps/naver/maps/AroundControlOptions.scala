package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AroundControlOptions extends js.Object {
  var position: Position
}

object AroundControlOptions {
  @scala.inline
  def apply(position: Position): AroundControlOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[AroundControlOptions]
  }
}

