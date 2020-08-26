package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin extends js.Object {
  var `for`: js.UndefOr[String] = js.native
  var name: String = js.native
  var version: String = js.native
  def install(): Unit = js.native
}

object Plugin {
  @scala.inline
  def apply(install: () => Unit, name: String, version: String): Plugin = {
    val __obj = js.Dynamic.literal(install = js.Any.fromFunction0(install), name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin]
  }
  @scala.inline
  implicit class PluginOps[Self <: Plugin] (val x: Self) extends AnyVal {
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
    def setInstall(value: () => Unit): Self = this.set("install", js.Any.fromFunction0(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setFor(value: String): Self = this.set("for", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFor: Self = this.set("for", js.undefined)
  }
  
}

