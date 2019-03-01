package typings
package meteorDashAccountsDashPhoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ACCOUNTSID extends js.Object {
  var ACCOUNT_SID: js.UndefOr[java.lang.String] = js.undefined
  var AUTH_TOKEN: js.UndefOr[java.lang.String] = js.undefined
  var FROM: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ACCOUNTSID {
  @scala.inline
  def apply(
    ACCOUNT_SID: java.lang.String = null,
    AUTH_TOKEN: java.lang.String = null,
    FROM: java.lang.String = null
  ): Anon_ACCOUNTSID = {
    val __obj = js.Dynamic.literal()
    if (ACCOUNT_SID != null) __obj.updateDynamic("ACCOUNT_SID")(ACCOUNT_SID)
    if (AUTH_TOKEN != null) __obj.updateDynamic("AUTH_TOKEN")(AUTH_TOKEN)
    if (FROM != null) __obj.updateDynamic("FROM")(FROM)
    __obj.asInstanceOf[Anon_ACCOUNTSID]
  }
}

