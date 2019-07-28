package typings.plugapi.plugapiMod.EventNs

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
    val __obj = js.Dynamic.literal(c = c, f = f, m = m, ml = ml)
  
    __obj.asInstanceOf[BoothLocked]
  }
}

