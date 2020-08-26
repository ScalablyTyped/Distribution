package typings.postcssLoadConfig.mod

import typings.postcss.mod.ProcessOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  var file: String = js.native
  var options: ProcessOptions = js.native
  var plugins: js.Array[ResultPlugin] = js.native
}

object Result {
  @scala.inline
  def apply(file: String, options: ProcessOptions, plugins: js.Array[ResultPlugin]): Result = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: ProcessOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setPluginsVarargs(value: ResultPlugin*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[ResultPlugin]): Self = this.set("plugins", value.asInstanceOf[js.Any])
  }
  
}

