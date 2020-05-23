package typings.microsoftLiveConnect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Business extends js.Object {
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

object Business {
  @scala.inline
  def apply(business: String = null, other: String = null, personal: String = null, preferred: String = null): Business = {
    val __obj = js.Dynamic.literal()
    if (business != null) __obj.updateDynamic("business")(business.asInstanceOf[js.Any])
    if (other != null) __obj.updateDynamic("other")(other.asInstanceOf[js.Any])
    if (personal != null) __obj.updateDynamic("personal")(personal.asInstanceOf[js.Any])
    if (preferred != null) __obj.updateDynamic("preferred")(preferred.asInstanceOf[js.Any])
    __obj.asInstanceOf[Business]
  }
}

