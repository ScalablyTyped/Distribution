package typings.nodePdftk.mod

import typings.nodePdftk.nodePdftkBooleans.`true`
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigureOptions extends js.Object {
  var Promise: PromiseConstructor = js.native
  var bin: String = js.native
  var ignoreWarnings: `true` = js.native
  var tempDir: String = js.native
}

object ConfigureOptions {
  @scala.inline
  def apply(Promise: PromiseConstructor, bin: String, ignoreWarnings: `true`, tempDir: String): ConfigureOptions = {
    val __obj = js.Dynamic.literal(Promise = Promise.asInstanceOf[js.Any], bin = bin.asInstanceOf[js.Any], ignoreWarnings = ignoreWarnings.asInstanceOf[js.Any], tempDir = tempDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureOptions]
  }
  @scala.inline
  implicit class ConfigureOptionsOps[Self <: ConfigureOptions] (val x: Self) extends AnyVal {
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
    def setPromise(value: PromiseConstructor): Self = this.set("Promise", value.asInstanceOf[js.Any])
    @scala.inline
    def setBin(value: String): Self = this.set("bin", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreWarnings(value: `true`): Self = this.set("ignoreWarnings", value.asInstanceOf[js.Any])
    @scala.inline
    def setTempDir(value: String): Self = this.set("tempDir", value.asInstanceOf[js.Any])
  }
  
}

