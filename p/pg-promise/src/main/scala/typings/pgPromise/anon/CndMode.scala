package typings.pgPromise.anon

import typings.pgPromise.mod.TransactionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CndMode extends js.Object {
  var cnd: js.UndefOr[js.Any] = js.native
  var mode: js.UndefOr[TransactionMode | Null] = js.native
  var tag: js.UndefOr[js.Any] = js.native
}

object CndMode {
  @scala.inline
  def apply(): CndMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CndMode]
  }
  @scala.inline
  implicit class CndModeOps[Self <: CndMode] (val x: Self) extends AnyVal {
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
    def setCnd(value: js.Any): Self = this.set("cnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCnd: Self = this.set("cnd", js.undefined)
    @scala.inline
    def setMode(value: TransactionMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setModeNull: Self = this.set("mode", null)
    @scala.inline
    def setTag(value: js.Any): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

