package typings
package nodeLib.inspectorMod.HeapProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSamplingProfileReturnType extends js.Object {
  /**
    * Return the sampling profile being collected.
    */
  var profile: SamplingHeapProfile
}

object GetSamplingProfileReturnType {
  @scala.inline
  def apply(profile: SamplingHeapProfile): GetSamplingProfileReturnType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("profile")(profile)
    __obj.asInstanceOf[GetSamplingProfileReturnType]
  }
}

