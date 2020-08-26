package typings.pgPromise.anon

import typings.pgPromise.mod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait From[S] extends js.Object {
  var from: js.UndefOr[String] = js.native
  var skip: js.UndefOr[String | js.Array[String] | (js.Function1[/* c */ Column[S], Boolean])] = js.native
  var to: js.UndefOr[String] = js.native
}

object From {
  @scala.inline
  def apply[S](): From[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[From[S]]
  }
  @scala.inline
  implicit class FromOps[Self <: From[_], S] (val x: Self with From[S]) extends AnyVal {
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
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setSkipVarargs(value: String*): Self = this.set("skip", js.Array(value :_*))
    @scala.inline
    def setSkipFunction1(value: /* c */ Column[S] => Boolean): Self = this.set("skip", js.Any.fromFunction1(value))
    @scala.inline
    def setSkip(value: String | js.Array[String] | (js.Function1[/* c */ Column[S], Boolean])): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

