package typings.microsoftLiveConnect

import typings.microsoftLiveConnect.Microsoft.Live.IPostalAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPersonal extends js.Object {
  /**
    * The user's business postal address.
    */
  var business: IPostalAddress
  /**
    * The user's personal postal address.
    */
  var personal: IPostalAddress
}

object AnonPersonal {
  @scala.inline
  def apply(business: IPostalAddress, personal: IPostalAddress): AnonPersonal = {
    val __obj = js.Dynamic.literal(business = business.asInstanceOf[js.Any], personal = personal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPersonal]
  }
}

