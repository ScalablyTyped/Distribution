package typings.microsoftDashLiveDashConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Business extends js.Object {
  /**
    * The contact's business email address.
    */
  var business: js.UndefOr[String] = js.undefined
  /**
    * The contact's "alternate" email address.
    */
  var other: js.UndefOr[String] = js.undefined
  /**
    * The contact's personal email address.
    */
  var personal: js.UndefOr[String] = js.undefined
  /**
    * The contact's preferred email address.
    */
  var preferred: js.UndefOr[String] = js.undefined
}

object Anon_Business {
  @scala.inline
  def apply(business: String = null, other: String = null, personal: String = null, preferred: String = null): Anon_Business = {
    val __obj = js.Dynamic.literal()
    if (business != null) __obj.updateDynamic("business")(business)
    if (other != null) __obj.updateDynamic("other")(other)
    if (personal != null) __obj.updateDynamic("personal")(personal)
    if (preferred != null) __obj.updateDynamic("preferred")(preferred)
    __obj.asInstanceOf[Anon_Business]
  }
}

