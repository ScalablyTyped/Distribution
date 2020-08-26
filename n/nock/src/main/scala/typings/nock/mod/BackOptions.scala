package typings.nock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackOptions extends js.Object {
  var after: js.UndefOr[js.Function1[/* scope */ Scope, Unit]] = js.native
  var afterRecord: js.UndefOr[js.Function1[/* defs */ js.Array[Definition], js.Array[Definition]]] = js.native
  var before: js.UndefOr[js.Function1[/* def */ Definition, Unit]] = js.native
  var recorder: js.UndefOr[RecorderOptions] = js.native
}

object BackOptions {
  @scala.inline
  def apply(): BackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackOptions]
  }
  @scala.inline
  implicit class BackOptionsOps[Self <: BackOptions] (val x: Self) extends AnyVal {
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
    def setAfter(value: /* scope */ Scope => Unit): Self = this.set("after", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    @scala.inline
    def setAfterRecord(value: /* defs */ js.Array[Definition] => js.Array[Definition]): Self = this.set("afterRecord", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterRecord: Self = this.set("afterRecord", js.undefined)
    @scala.inline
    def setBefore(value: /* def */ Definition => Unit): Self = this.set("before", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setRecorder(value: RecorderOptions): Self = this.set("recorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecorder: Self = this.set("recorder", js.undefined)
  }
  
}

