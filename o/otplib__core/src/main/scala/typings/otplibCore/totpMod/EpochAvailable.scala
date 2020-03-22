package typings.otplibCore.totpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EpochAvailable extends js.Object {
  var current: Double
  var future: js.Array[Double]
  var past: js.Array[Double]
}

object EpochAvailable {
  @scala.inline
  def apply(current: Double, future: js.Array[Double], past: js.Array[Double]): EpochAvailable = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], future = future.asInstanceOf[js.Any], past = past.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EpochAvailable]
  }
}

