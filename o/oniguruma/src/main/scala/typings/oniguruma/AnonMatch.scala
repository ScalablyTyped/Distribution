package typings.oniguruma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMatch extends js.Object {
  var `match`: String
}

object AnonMatch {
  @scala.inline
  def apply(`match`: String): AnonMatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMatch]
  }
}

