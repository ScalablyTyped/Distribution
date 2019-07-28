package typings.plugapi.plugapiMod.EventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vote extends js.Object {
  var i: Double
  var v: Double
}

object Vote {
  @scala.inline
  def apply(i: Double, v: Double): Vote = {
    val __obj = js.Dynamic.literal(i = i, v = v)
  
    __obj.asInstanceOf[Vote]
  }
}

