package typings.pixiDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Adaptive extends js.Object {
  var adaptive: Boolean
  var maxLength: Double
  var maxSegments: Double
  var minSegments: Double
}

object Anon_Adaptive {
  @scala.inline
  def apply(adaptive: Boolean, maxLength: Double, maxSegments: Double, minSegments: Double): Anon_Adaptive = {
    val __obj = js.Dynamic.literal(adaptive = adaptive, maxLength = maxLength, maxSegments = maxSegments, minSegments = minSegments)
  
    __obj.asInstanceOf[Anon_Adaptive]
  }
}

