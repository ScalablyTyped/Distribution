package typings.meteor.mod

import typings.meteor.Meteor.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailFields extends js.Object {
  var from: js.UndefOr[js.Function0[String]] = js.native
  var html: js.UndefOr[js.Function2[/* user */ User, /* url */ String, String]] = js.native
  var subject: js.UndefOr[js.Function1[/* user */ User, String]] = js.native
  var text: js.UndefOr[js.Function2[/* user */ User, /* url */ String, String]] = js.native
}

object EmailFields {
  @scala.inline
  def apply(): EmailFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailFields]
  }
  @scala.inline
  implicit class EmailFieldsOps[Self <: EmailFields] (val x: Self) extends AnyVal {
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
    def setFrom(value: () => String): Self = this.set("from", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setHtml(value: (/* user */ User, /* url */ String) => String): Self = this.set("html", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setSubject(value: /* user */ User => String): Self = this.set("subject", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setText(value: (/* user */ User, /* url */ String) => String): Self = this.set("text", js.Any.fromFunction2(value))
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

