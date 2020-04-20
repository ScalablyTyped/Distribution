package typings.plotlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonX extends js.Object {
  var x: js.Array[Double]
  var y: js.Array[Double]
}

object AnonX {
  @scala.inline
  def apply(x: js.Array[Double], y: js.Array[Double]): AnonX = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonX]
  }
}

