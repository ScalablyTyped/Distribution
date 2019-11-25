package typings.microsoftDashLiveDashConnect

import typings.microsoftDashLiveDashConnect.Microsoft.Live.IPostalAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BusinessPersonal extends js.Object {
  /**
    * The user's business postal address.
    */
  var business: IPostalAddress
  /**
    * The user's personal postal address.
    */
  var personal: IPostalAddress
}

object Anon_BusinessPersonal {
  @scala.inline
  def apply(business: IPostalAddress, personal: IPostalAddress): Anon_BusinessPersonal = {
    val __obj = js.Dynamic.literal(business = business.asInstanceOf[js.Any], personal = personal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BusinessPersonal]
  }
}

