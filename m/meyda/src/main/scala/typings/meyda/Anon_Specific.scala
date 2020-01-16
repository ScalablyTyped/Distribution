package typings.meyda

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Specific extends js.Object {
  var specific: Float32Array
  var total: Double
}

object Anon_Specific {
  @scala.inline
  def apply(specific: Float32Array, total: Double): Anon_Specific = {
    val __obj = js.Dynamic.literal(specific = specific.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Specific]
  }
}

