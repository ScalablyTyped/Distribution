package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOk extends js.Object {
  var n: Double
  var ok: Double
}

object AnonOk {
  @scala.inline
  def apply(n: Double, ok: Double): AnonOk = {
    val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOk]
  }
}

