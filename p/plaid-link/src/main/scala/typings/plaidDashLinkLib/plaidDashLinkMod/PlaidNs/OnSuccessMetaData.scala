package typings
package plaidDashLinkLib.plaidDashLinkMod.PlaidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSuccessMetaData extends js.Object {
  var accounts: js.Array[Account]
  var institution: plaidDashLinkLib.Anon_Institutionid
  var link_session_id: java.lang.String
}

object OnSuccessMetaData {
  @scala.inline
  def apply(
    accounts: js.Array[Account],
    institution: plaidDashLinkLib.Anon_Institutionid,
    link_session_id: java.lang.String
  ): OnSuccessMetaData = {
    val __obj = js.Dynamic.literal(accounts = accounts, institution = institution, link_session_id = link_session_id)
  
    __obj.asInstanceOf[OnSuccessMetaData]
  }
}

