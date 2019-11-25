package typings.pleasejs.PleaseJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HSV extends js.Object {
  var h: Double
  var s: Double
  var v: Double
}

object HSV {
  @scala.inline
  def apply(h: Double, s: Double, v: Double): HSV = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HSV]
  }
}

