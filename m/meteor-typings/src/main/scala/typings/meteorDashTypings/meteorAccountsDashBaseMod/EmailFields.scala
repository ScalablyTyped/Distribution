package typings.meteorDashTypings.meteorAccountsDashBaseMod

import typings.meteorDashTypings.Meteor.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailFields extends js.Object {
  var from: js.UndefOr[js.Function0[String]] = js.undefined
  var html: js.UndefOr[js.Function2[/* user */ User, /* url */ String, String]] = js.undefined
  var subject: js.UndefOr[js.Function1[/* user */ User, String]] = js.undefined
  var text: js.UndefOr[js.Function2[/* user */ User, /* url */ String, String]] = js.undefined
}

object EmailFields {
  @scala.inline
  def apply(
    from: () => String = null,
    html: (/* user */ User, /* url */ String) => String = null,
    subject: /* user */ User => String = null,
    text: (/* user */ User, /* url */ String) => String = null
  ): EmailFields = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(js.Any.fromFunction0(from))
    if (html != null) __obj.updateDynamic("html")(js.Any.fromFunction2(html))
    if (subject != null) __obj.updateDynamic("subject")(js.Any.fromFunction1(subject))
    if (text != null) __obj.updateDynamic("text")(js.Any.fromFunction2(text))
    __obj.asInstanceOf[EmailFields]
  }
}

