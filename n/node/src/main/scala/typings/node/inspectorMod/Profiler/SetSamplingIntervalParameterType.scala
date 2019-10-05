package typings.node.inspectorMod.Profiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetSamplingIntervalParameterType extends js.Object {
  /**
    * New sampling interval in microseconds.
    */
  var interval: Double
}

object SetSamplingIntervalParameterType {
  @scala.inline
  def apply(interval: Double): SetSamplingIntervalParameterType = {
    val __obj = js.Dynamic.literal(interval = interval)
  
    __obj.asInstanceOf[SetSamplingIntervalParameterType]
  }
}

