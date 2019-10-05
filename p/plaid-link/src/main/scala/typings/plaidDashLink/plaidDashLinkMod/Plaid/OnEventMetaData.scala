package typings.plaidDashLink.plaidDashLinkMod.Plaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnEventMetaData extends js.Object {
  var error_code: String
  var error_message: String
  var error_type: String
  var exit_status: ExitStatus
  var institution_id: String
  var institution_name: String
  var institution_search_query: String
  var link_session_id: String
  var mfa_type: String
  var request_id: String
  var timestamp: String
  var view_name: String
}

object OnEventMetaData {
  @scala.inline
  def apply(
    error_code: String,
    error_message: String,
    error_type: String,
    exit_status: ExitStatus,
    institution_id: String,
    institution_name: String,
    institution_search_query: String,
    link_session_id: String,
    mfa_type: String,
    request_id: String,
    timestamp: String,
    view_name: String
  ): OnEventMetaData = {
    val __obj = js.Dynamic.literal(error_code = error_code, error_message = error_message, error_type = error_type, exit_status = exit_status, institution_id = institution_id, institution_name = institution_name, institution_search_query = institution_search_query, link_session_id = link_session_id, mfa_type = mfa_type, request_id = request_id, timestamp = timestamp, view_name = view_name)
  
    __obj.asInstanceOf[OnEventMetaData]
  }
}

