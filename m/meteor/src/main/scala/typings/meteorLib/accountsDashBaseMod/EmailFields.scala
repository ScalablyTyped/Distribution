package typings
package meteorLib.accountsDashBaseMod

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
    from: js.Function0[java.lang.String] = null,
    html: js.Function2[/* user */ meteorLib.MeteorNs.User, /* url */ java.lang.String, java.lang.String] = null,
    subject: js.Function1[/* user */ meteorLib.MeteorNs.User, java.lang.String] = null,
    text: js.Function2[/* user */ meteorLib.MeteorNs.User, /* url */ java.lang.String, java.lang.String] = null
  ): EmailFields = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from)
    if (html != null) __obj.updateDynamic("html")(html)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[EmailFields]
  }
}

