package typings.microsoftDashLiveDashConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BusinessMobile extends js.Object {
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

object Anon_BusinessMobile {
  @scala.inline
  def apply(business: String, mobile: String, personal: String): Anon_BusinessMobile = {
    val __obj = js.Dynamic.literal(business = business.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], personal = personal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BusinessMobile]
  }
}

