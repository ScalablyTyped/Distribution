package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailFields extends js.Object {
  var from: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var html: js.UndefOr[
    js.Function2[/* user */ meteorLib.MeteorNs.User, /* url */ java.lang.String, java.lang.String]
  ] = js.undefined
  var subject: js.UndefOr[js.Function1[/* user */ meteorLib.MeteorNs.User, java.lang.String]] = js.undefined
  var text: js.UndefOr[
    js.Function2[/* user */ meteorLib.MeteorNs.User, /* url */ java.lang.String, java.lang.String]
  ] = js.undefined
}

object EmailFields {
  @scala.inline
  def apply(
    from: () => java.lang.String = null,
    html: (/* user */ meteorLib.MeteorNs.User, /* url */ java.lang.String) => java.lang.String = null,
    subject: /* user */ meteorLib.MeteorNs.User => java.lang.String = null,
    text: (/* user */ meteorLib.MeteorNs.User, /* url */ java.lang.String) => java.lang.String = null
  ): EmailFields = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(js.Any.fromFunction0(from))
    if (html != null) __obj.updateDynamic("html")(js.Any.fromFunction2(html))
    if (subject != null) __obj.updateDynamic("subject")(js.Any.fromFunction1(subject))
    if (text != null) __obj.updateDynamic("text")(js.Any.fromFunction2(text))
    __obj.asInstanceOf[EmailFields]
  }
}

