package typings.plaidLink.mod.Plaid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnExitMetaData extends StObject {
  
  var institution: Institution
  
  var link_session_id: String
  
  var request_id: String
  
  var status: ExitStatus
}
object OnExitMetaData {
  
  inline def apply(institution: Institution, link_session_id: String, request_id: String, status: ExitStatus): OnExitMetaData = {
    val __obj = js.Dynamic.literal(institution = institution.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnExitMetaData]
  }
  
  extension [Self <: OnExitMetaData](x: Self) {
    
    inline def setInstitution(value: Institution): Self = StObject.set(x, "institution", value.asInstanceOf[js.Any])
    
    inline def setLink_session_id(value: String): Self = StObject.set(x, "link_session_id", value.asInstanceOf[js.Any])
    
    inline def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ExitStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
