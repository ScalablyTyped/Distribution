package typings.microsoftDashLiveDashConnect

import typings.microsoftDashLiveDashConnect.MicrosoftNs.LiveNs.IPostalAddress
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
    val __obj = js.Dynamic.literal(business = business, personal = personal)
  
    __obj.asInstanceOf[Anon_BusinessPersonal]
  }
}

