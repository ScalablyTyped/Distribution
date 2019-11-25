package typings.plaidDashLink.plaidDashLinkMod.Plaid

import typings.plaidDashLink.Anon_Institutionid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSuccessMetaData extends js.Object {
  var accounts: js.Array[Account]
  var institution: Anon_Institutionid
  var link_session_id: String
}

object OnSuccessMetaData {
  @scala.inline
  def apply(accounts: js.Array[Account], institution: Anon_Institutionid, link_session_id: String): OnSuccessMetaData = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], institution = institution.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnSuccessMetaData]
  }
}

