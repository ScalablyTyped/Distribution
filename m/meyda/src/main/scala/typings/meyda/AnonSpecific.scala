package typings.meyda

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSpecific extends js.Object {
  var specific: Float32Array
  var total: Double
}

object AnonSpecific {
  @scala.inline
  def apply(specific: Float32Array, total: Double): AnonSpecific = {
    val __obj = js.Dynamic.literal(specific = specific.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSpecific]
  }
}

