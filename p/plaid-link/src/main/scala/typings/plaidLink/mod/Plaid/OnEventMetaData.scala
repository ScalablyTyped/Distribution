package typings.plaidLink.mod.Plaid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnEventMetaData extends StObject {
  
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
  
  var view_name: ViewName
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
    view_name: ViewName
  ): OnEventMetaData = {
    val __obj = js.Dynamic.literal(error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any], error_type = error_type.asInstanceOf[js.Any], exit_status = exit_status.asInstanceOf[js.Any], institution_id = institution_id.asInstanceOf[js.Any], institution_name = institution_name.asInstanceOf[js.Any], institution_search_query = institution_search_query.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any], mfa_type = mfa_type.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], view_name = view_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEventMetaData]
  }
  
  @scala.inline
  implicit class OnEventMetaDataMutableBuilder[Self <: OnEventMetaData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError_code(value: String): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_message(value: String): Self = StObject.set(x, "error_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_type(value: String): Self = StObject.set(x, "error_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExit_status(value: ExitStatus): Self = StObject.set(x, "exit_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstitution_id(value: String): Self = StObject.set(x, "institution_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstitution_name(value: String): Self = StObject.set(x, "institution_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstitution_search_query(value: String): Self = StObject.set(x, "institution_search_query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink_session_id(value: String): Self = StObject.set(x, "link_session_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMfa_type(value: String): Self = StObject.set(x, "mfa_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView_name(value: ViewName): Self = StObject.set(x, "view_name", value.asInstanceOf[js.Any])
  }
}
