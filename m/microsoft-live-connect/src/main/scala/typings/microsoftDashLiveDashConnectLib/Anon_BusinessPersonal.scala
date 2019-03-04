package typings
package microsoftDashLiveDashConnectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BusinessPersonal extends js.Object {
  /**
    * The user's business postal address.
    */
  var business: microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs.IPostalAddress
  /**
    * The user's personal postal address.
    */
  var personal: microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs.IPostalAddress
}

object Anon_BusinessPersonal {
  @scala.inline
  def apply(
    business: microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs.IPostalAddress,
    personal: microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs.IPostalAddress
  ): Anon_BusinessPersonal = {
    val __obj = js.Dynamic.literal(business = business, personal = personal)
  
    __obj.asInstanceOf[Anon_BusinessPersonal]
  }
}

