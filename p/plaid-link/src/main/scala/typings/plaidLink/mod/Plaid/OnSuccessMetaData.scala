package typings.plaidLink.mod.Plaid

import typings.plaidLink.AnonInstitutionid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSuccessMetaData extends js.Object {
  var accounts: js.Array[Account]
  var institution: AnonInstitutionid
  var link_session_id: String
}

object OnSuccessMetaData {
  @scala.inline
  def apply(accounts: js.Array[Account], institution: AnonInstitutionid, link_session_id: String): OnSuccessMetaData = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], institution = institution.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnSuccessMetaData]
  }
}

