package typings.node.inspectorMod.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSamplingProfileReturnType extends js.Object {
  /**
    * Return the sampling profile being collected.
    */
  var profile: SamplingHeapProfile = js.native
}

object GetSamplingProfileReturnType {
  @scala.inline
  def apply(profile: SamplingHeapProfile): GetSamplingProfileReturnType = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSamplingProfileReturnType]
  }
  @scala.inline
  implicit class GetSamplingProfileReturnTypeOps[Self <: GetSamplingProfileReturnType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProfile(value: SamplingHeapProfile): Self = this.set("profile", value.asInstanceOf[js.Any])
  }
  
}

