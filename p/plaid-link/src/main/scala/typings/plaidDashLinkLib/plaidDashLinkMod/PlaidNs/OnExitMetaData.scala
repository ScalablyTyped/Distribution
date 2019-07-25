package typings
package plaidDashLinkLib.plaidDashLinkMod.PlaidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnExitMetaData extends js.Object {
  var institution: Institution
  var link_session_id: java.lang.String
  var request_id: java.lang.String
  var status: ExitStatus
}

object OnExitMetaData {
  @scala.inline
  def apply(
    institution: Institution,
    link_session_id: java.lang.String,
    request_id: java.lang.String,
    status: ExitStatus
  ): OnExitMetaData = {
    val __obj = js.Dynamic.literal(institution = institution, link_session_id = link_session_id, request_id = request_id, status = status)
  
    __obj.asInstanceOf[OnExitMetaData]
  }
}

