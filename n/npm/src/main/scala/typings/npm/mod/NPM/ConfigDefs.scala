package typings.npm.mod.NPM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigDefs extends js.Object {
  var defaults: ConfigOptions = js.native
  var types: ConfigTypes = js.native
}

object ConfigDefs {
  @scala.inline
  def apply(defaults: ConfigOptions, types: ConfigTypes): ConfigDefs = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigDefs]
  }
  @scala.inline
  implicit class ConfigDefsOps[Self <: ConfigDefs] (val x: Self) extends AnyVal {
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
    def setDefaults(value: ConfigOptions): Self = this.set("defaults", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypes(value: ConfigTypes): Self = this.set("types", value.asInstanceOf[js.Any])
  }
  
}

