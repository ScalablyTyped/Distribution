package typings.plaidDashLink.plaidDashLinkMod.Plaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnExitMetaData extends js.Object {
  var institution: Institution
  var link_session_id: String
  var request_id: String
  var status: ExitStatus
}

object OnExitMetaData {
  @scala.inline
  def apply(institution: Institution, link_session_id: String, request_id: String, status: ExitStatus): OnExitMetaData = {
    val __obj = js.Dynamic.literal(institution = institution.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnExitMetaData]
  }
}

