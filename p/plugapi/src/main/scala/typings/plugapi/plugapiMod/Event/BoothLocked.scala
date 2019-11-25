package typings.plugapi.plugapiMod.Event

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoothLocked extends js.Object {
  var c: Boolean
  var f: Boolean
  var m: String
  var ml: String
}

object BoothLocked {
  @scala.inline
  def apply(c: Boolean, f: Boolean, m: String, ml: String): BoothLocked = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], ml = ml.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BoothLocked]
  }
}

