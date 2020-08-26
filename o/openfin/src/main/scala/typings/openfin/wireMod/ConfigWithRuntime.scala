package typings.openfin.wireMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigWithRuntime extends BaseConfig {
  @JSName("runtime")
  var runtime_ConfigWithRuntime: RuntimeConfig = js.native
}

object ConfigWithRuntime {
  @scala.inline
  def apply(runtime: RuntimeConfig): ConfigWithRuntime = {
    val __obj = js.Dynamic.literal(runtime = runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigWithRuntime]
  }
  @scala.inline
  implicit class ConfigWithRuntimeOps[Self <: ConfigWithRuntime] (val x: Self) extends AnyVal {
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
    def setRuntime(value: RuntimeConfig): Self = this.set("runtime", value.asInstanceOf[js.Any])
  }
  
}

