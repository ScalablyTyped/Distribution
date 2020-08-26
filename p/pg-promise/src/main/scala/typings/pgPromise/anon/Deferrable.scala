package typings.pgPromise.anon

import typings.pgPromise.mod.isolationLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deferrable extends js.Object {
  var deferrable: js.UndefOr[Boolean] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var tiLevel: js.UndefOr[isolationLevel] = js.native
}

object Deferrable {
  @scala.inline
  def apply(): Deferrable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deferrable]
  }
  @scala.inline
  implicit class DeferrableOps[Self <: Deferrable] (val x: Self) extends AnyVal {
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
    def setDeferrable(value: Boolean): Self = this.set("deferrable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeferrable: Self = this.set("deferrable", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setTiLevel(value: isolationLevel): Self = this.set("tiLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTiLevel: Self = this.set("tiLevel", js.undefined)
  }
  
}

