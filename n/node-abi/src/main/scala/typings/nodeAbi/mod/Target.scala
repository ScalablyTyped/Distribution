package typings.nodeAbi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Target extends js.Object {
  var abi: String = js.native
  var lts: Boolean = js.native
  var runtime: Runtime = js.native
  var target: String = js.native
}

object Target {
  @scala.inline
  def apply(abi: String, lts: Boolean, runtime: Runtime, target: String): Target = {
    val __obj = js.Dynamic.literal(abi = abi.asInstanceOf[js.Any], lts = lts.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  @scala.inline
  implicit class TargetOps[Self <: Target] (val x: Self) extends AnyVal {
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
    def setAbi(value: String): Self = this.set("abi", value.asInstanceOf[js.Any])
    @scala.inline
    def setLts(value: Boolean): Self = this.set("lts", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuntime(value: Runtime): Self = this.set("runtime", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

