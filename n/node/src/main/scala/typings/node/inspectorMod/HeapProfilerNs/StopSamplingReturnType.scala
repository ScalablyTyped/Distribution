package typings.node.inspectorMod.HeapProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopSamplingReturnType extends js.Object {
  /**
    * Recorded sampling heap profile.
    */
  var profile: SamplingHeapProfile
}

object StopSamplingReturnType {
  @scala.inline
  def apply(profile: SamplingHeapProfile): StopSamplingReturnType = {
    val __obj = js.Dynamic.literal(profile = profile)
  
    __obj.asInstanceOf[StopSamplingReturnType]
  }
}

