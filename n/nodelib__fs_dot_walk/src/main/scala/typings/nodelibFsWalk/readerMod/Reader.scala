package typings.nodelibFsWalk.readerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reader extends js.Object {
  val _root: String = js.native
  val _settings: typings.nodelibFsWalk.settingsMod.default = js.native
}

object Reader {
  @scala.inline
  def apply(_root: String, _settings: typings.nodelibFsWalk.settingsMod.default): Reader = {
    val __obj = js.Dynamic.literal(_root = _root.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reader]
  }
  @scala.inline
  implicit class ReaderOps[Self <: Reader] (val x: Self) extends AnyVal {
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
    def set_root(value: String): Self = this.set("_root", value.asInstanceOf[js.Any])
    @scala.inline
    def set_settings(value: typings.nodelibFsWalk.settingsMod.default): Self = this.set("_settings", value.asInstanceOf[js.Any])
  }
  
}

