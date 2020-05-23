package typings.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ok extends js.Object {
  var n: Double
  var ok: Double
}

object Ok {
  @scala.inline
  def apply(n: Double, ok: Double): Ok = {
    val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ok]
  }
}

