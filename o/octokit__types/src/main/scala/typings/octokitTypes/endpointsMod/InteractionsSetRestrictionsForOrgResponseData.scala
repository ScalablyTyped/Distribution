package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionsSetRestrictionsForOrgResponseData extends StObject {
  
  var expires_at: String
  
  var limit: String
  
  var origin: String
}
object InteractionsSetRestrictionsForOrgResponseData {
  
  @scala.inline
  def apply(expires_at: String, limit: String, origin: String): InteractionsSetRestrictionsForOrgResponseData = {
    val __obj = js.Dynamic.literal(expires_at = expires_at.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionsSetRestrictionsForOrgResponseData]
  }
  
  @scala.inline
  implicit class InteractionsSetRestrictionsForOrgResponseDataMutableBuilder[Self <: InteractionsSetRestrictionsForOrgResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpires_at(value: String): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
