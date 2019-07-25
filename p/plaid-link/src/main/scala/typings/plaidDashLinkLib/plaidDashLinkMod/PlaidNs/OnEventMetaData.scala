package typings
package plaidDashLinkLib.plaidDashLinkMod.PlaidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnEventMetaData extends js.Object {
  var error_code: java.lang.String
  var error_message: java.lang.String
  var error_type: java.lang.String
  var exit_status: ExitStatus
  var institution_id: java.lang.String
  var institution_name: java.lang.String
  var institution_search_query: java.lang.String
  var link_session_id: java.lang.String
  var mfa_type: java.lang.String
  var request_id: java.lang.String
  var timestamp: java.lang.String
  var view_name: java.lang.String
}

object OnEventMetaData {
  @scala.inline
  def apply(
    error_code: java.lang.String,
    error_message: java.lang.String,
    error_type: java.lang.String,
    exit_status: ExitStatus,
    institution_id: java.lang.String,
    institution_name: java.lang.String,
    institution_search_query: java.lang.String,
    link_session_id: java.lang.String,
    mfa_type: java.lang.String,
    request_id: java.lang.String,
    timestamp: java.lang.String,
    view_name: java.lang.String
  ): OnEventMetaData = {
    val __obj = js.Dynamic.literal(error_code = error_code, error_message = error_message, error_type = error_type, exit_status = exit_status, institution_id = institution_id, institution_name = institution_name, institution_search_query = institution_search_query, link_session_id = link_session_id, mfa_type = mfa_type, request_id = request_id, timestamp = timestamp, view_name = view_name)
  
    __obj.asInstanceOf[OnEventMetaData]
  }
}

