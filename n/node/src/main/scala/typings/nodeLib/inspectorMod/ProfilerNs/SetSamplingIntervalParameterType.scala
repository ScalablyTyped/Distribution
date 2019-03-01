package typings
package nodeLib.inspectorMod.ProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetSamplingIntervalParameterType extends js.Object {
  /**
    * New sampling interval in microseconds.
    */
  var interval: scala.Double
}

object SetSamplingIntervalParameterType {
  @scala.inline
  def apply(interval: scala.Double): SetSamplingIntervalParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("interval")(interval)
    __obj.asInstanceOf[SetSamplingIntervalParameterType]
  }
}

