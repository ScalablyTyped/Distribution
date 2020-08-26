package typings.node.inspectorMod.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopSamplingReturnType extends js.Object {
  /**
    * Recorded sampling heap profile.
    */
  var profile: SamplingHeapProfile = js.native
}

object StopSamplingReturnType {
  @scala.inline
  def apply(profile: SamplingHeapProfile): StopSamplingReturnType = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopSamplingReturnType]
  }
  @scala.inline
  implicit class StopSamplingReturnTypeOps[Self <: StopSamplingReturnType] (val x: Self) extends AnyVal {
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

