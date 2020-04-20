package typings.plugapi.mod.Event

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModSkip extends js.Object {
  var m: String
  var mi: Double
}

object ModSkip {
  @scala.inline
  def apply(m: String, mi: Double): ModSkip = {
    val __obj = js.Dynamic.literal(m = m.asInstanceOf[js.Any], mi = mi.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModSkip]
  }
}

