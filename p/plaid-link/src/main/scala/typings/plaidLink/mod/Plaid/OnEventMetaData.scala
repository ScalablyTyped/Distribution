package typings.plaidLink.mod.Plaid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnEventMetaData extends StObject {
  
  var account_number_mask: String | Null
  
  var error_code: String | Null
  
  var error_message: String | Null
  
  var error_type: String | Null
  
  var exit_status: ExitStatus | Null
  
  var institution_id: String | Null
  
  var institution_name: String | Null
  
  var institution_search_query: String | Null
  
  var link_session_id: String
  
  var match_reason: String | Null
  
  var mfa_type: String | Null
  
  var request_id: String
  
  var routing_number: String | Null
  
  var selection: AuthTypeSelectFlow | VerificationMethod | Null
  
  var timestamp: String
  
  var view_name: ViewName
}
object OnEventMetaData {
  
  inline def apply(link_session_id: String, request_id: String, timestamp: String, view_name: ViewName): OnEventMetaData = {
    val __obj = js.Dynamic.literal(link_session_id = link_session_id.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], view_name = view_name.asInstanceOf[js.Any], account_number_mask = null, error_code = null, error_message = null, error_type = null, exit_status = null, institution_id = null, institution_name = null, institution_search_query = null, match_reason = null, mfa_type = null, routing_number = null, selection = null)
    __obj.asInstanceOf[OnEventMetaData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnEventMetaData] (val x: Self) extends AnyVal {
    
    inline def setAccount_number_mask(value: String): Self = StObject.set(x, "account_number_mask", value.asInstanceOf[js.Any])
    
    inline def setAccount_number_maskNull: Self = StObject.set(x, "account_number_mask", null)
    
    inline def setError_code(value: String): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
    
    inline def setError_codeNull: Self = StObject.set(x, "error_code", null)
    
    inline def setError_message(value: String): Self = StObject.set(x, "error_message", value.asInstanceOf[js.Any])
    
    inline def setError_messageNull: Self = StObject.set(x, "error_message", null)
    
    inline def setError_type(value: String): Self = StObject.set(x, "error_type", value.asInstanceOf[js.Any])
    
    inline def setError_typeNull: Self = StObject.set(x, "error_type", null)
    
    inline def setExit_status(value: ExitStatus): Self = StObject.set(x, "exit_status", value.asInstanceOf[js.Any])
    
    inline def setExit_statusNull: Self = StObject.set(x, "exit_status", null)
    
    inline def setInstitution_id(value: String): Self = StObject.set(x, "institution_id", value.asInstanceOf[js.Any])
    
    inline def setInstitution_idNull: Self = StObject.set(x, "institution_id", null)
    
    inline def setInstitution_name(value: String): Self = StObject.set(x, "institution_name", value.asInstanceOf[js.Any])
    
    inline def setInstitution_nameNull: Self = StObject.set(x, "institution_name", null)
    
    inline def setInstitution_search_query(value: String): Self = StObject.set(x, "institution_search_query", value.asInstanceOf[js.Any])
    
    inline def setInstitution_search_queryNull: Self = StObject.set(x, "institution_search_query", null)
    
    inline def setLink_session_id(value: String): Self = StObject.set(x, "link_session_id", value.asInstanceOf[js.Any])
    
    inline def setMatch_reason(value: String): Self = StObject.set(x, "match_reason", value.asInstanceOf[js.Any])
    
    inline def setMatch_reasonNull: Self = StObject.set(x, "match_reason", null)
    
    inline def setMfa_type(value: String): Self = StObject.set(x, "mfa_type", value.asInstanceOf[js.Any])
    
    inline def setMfa_typeNull: Self = StObject.set(x, "mfa_type", null)
    
    inline def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
    
    inline def setRouting_number(value: String): Self = StObject.set(x, "routing_number", value.asInstanceOf[js.Any])
    
    inline def setRouting_numberNull: Self = StObject.set(x, "routing_number", null)
    
    inline def setSelection(value: AuthTypeSelectFlow | VerificationMethod): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionNull: Self = StObject.set(x, "selection", null)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setView_name(value: ViewName): Self = StObject.set(x, "view_name", value.asInstanceOf[js.Any])
  }
}
