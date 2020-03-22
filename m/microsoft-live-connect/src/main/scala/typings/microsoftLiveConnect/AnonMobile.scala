package typings.microsoftLiveConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMobile extends js.Object {
  /**
    * The user's business phone number, or null if one is not
    * specified.
    */
  var business: String
  /**
    * The user's mobile phone number, or null if one is not specified.
    */
  var mobile: String
  /**
    * The user's personal phone number, or null if one is not
    * specified.
    */
  var personal: String
}

object AnonMobile {
  @scala.inline
  def apply(business: String, mobile: String, personal: String): AnonMobile = {
    val __obj = js.Dynamic.literal(business = business.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], personal = personal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMobile]
  }
}

