package typings
package microsoftDashLiveDashConnectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Business extends js.Object {
  /**
    * The contact's business email address.
    */
  var business: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The contact's "alternate" email address.
    */
  var other: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The contact's personal email address.
    */
  var personal: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The contact's preferred email address.
    */
  var preferred: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Business {
  @scala.inline
  def apply(
    business: java.lang.String = null,
    other: java.lang.String = null,
    personal: java.lang.String = null,
    preferred: java.lang.String = null
  ): Anon_Business = {
    val __obj = js.Dynamic.literal()
    if (business != null) __obj.updateDynamic("business")(business)
    if (other != null) __obj.updateDynamic("other")(other)
    if (personal != null) __obj.updateDynamic("personal")(personal)
    if (preferred != null) __obj.updateDynamic("preferred")(preferred)
    __obj.asInstanceOf[Anon_Business]
  }
}

