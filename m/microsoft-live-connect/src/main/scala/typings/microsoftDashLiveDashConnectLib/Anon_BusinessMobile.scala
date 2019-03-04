package typings
package microsoftDashLiveDashConnectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BusinessMobile extends js.Object {
  /**
    * The user's business phone number, or null if one is not
    * specified.
    */
  var business: java.lang.String
  /**
    * The user's mobile phone number, or null if one is not specified.
    */
  var mobile: java.lang.String
  /**
    * The user's personal phone number, or null if one is not
    * specified.
    */
  var personal: java.lang.String
}

object Anon_BusinessMobile {
  @scala.inline
  def apply(business: java.lang.String, mobile: java.lang.String, personal: java.lang.String): Anon_BusinessMobile = {
    val __obj = js.Dynamic.literal(business = business, mobile = mobile, personal = personal)
  
    __obj.asInstanceOf[Anon_BusinessMobile]
  }
}

