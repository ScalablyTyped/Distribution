package typings.pgPromise.anon

import typings.pgPromise.mod.ITask
import typings.pgPromise.mod.TransactionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reusable[Ext] extends js.Object {
  var cnd: js.UndefOr[Boolean | (js.Function1[/* t */ ITask[Ext] with Ext, Boolean])] = js.native
  var mode: js.UndefOr[TransactionMode | Null] = js.native
  var reusable: js.UndefOr[Boolean | (js.Function1[/* t */ ITask[Ext] with Ext, Boolean])] = js.native
  var tag: js.UndefOr[js.Any] = js.native
}

object Reusable {
  @scala.inline
  def apply[Ext](): Reusable[Ext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reusable[Ext]]
  }
  @scala.inline
  implicit class ReusableOps[Self <: Reusable[_], Ext] (val x: Self with Reusable[Ext]) extends AnyVal {
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
    def setCndFunction1(value: /* t */ ITask[Ext] with Ext => Boolean): Self = this.set("cnd", js.Any.fromFunction1(value))
    @scala.inline
    def setCnd(value: Boolean | (js.Function1[/* t */ ITask[Ext] with Ext, Boolean])): Self = this.set("cnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCnd: Self = this.set("cnd", js.undefined)
    @scala.inline
    def setMode(value: TransactionMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setModeNull: Self = this.set("mode", null)
    @scala.inline
    def setReusableFunction1(value: /* t */ ITask[Ext] with Ext => Boolean): Self = this.set("reusable", js.Any.fromFunction1(value))
    @scala.inline
    def setReusable(value: Boolean | (js.Function1[/* t */ ITask[Ext] with Ext, Boolean])): Self = this.set("reusable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReusable: Self = this.set("reusable", js.undefined)
    @scala.inline
    def setTag(value: js.Any): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

