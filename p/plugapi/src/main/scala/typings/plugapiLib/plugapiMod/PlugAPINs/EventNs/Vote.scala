package typings
package plugapiLib.plugapiMod.PlugAPINs.EventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vote extends js.Object {
  var i: scala.Double
  var v: scala.Double
}

object Vote {
  @scala.inline
  def apply(i: scala.Double, v: scala.Double): Vote = {
    val __obj = js.Dynamic.literal(i = i, v = v)
  
    __obj.asInstanceOf[Vote]
  }
}

