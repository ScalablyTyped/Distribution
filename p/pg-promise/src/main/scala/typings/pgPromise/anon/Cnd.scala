package typings.pgPromise.anon

import typings.pgPromise.mod.ITask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cnd[Ext] extends js.Object {
  var cnd: js.UndefOr[Boolean | (js.Function1[/* t */ ITask[Ext] with Ext, Boolean])] = js.native
  var tag: js.UndefOr[js.Any] = js.native
}

object Cnd {
  @scala.inline
  def apply[Ext](): Cnd[Ext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cnd[Ext]]
  }
  @scala.inline
  implicit class CndOps[Self <: Cnd[_], Ext] (val x: Self with Cnd[Ext]) extends AnyVal {
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
    def setTag(value: js.Any): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

