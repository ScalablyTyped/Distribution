package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgPatrequestid extends StObject {
  
  @JSName("org")
  var org_ : String
  
  /** @description Unique identifier of the request for access via fine-grained personal access token. */
  var pat_request_id: Double
}
object OrgPatrequestid {
  
  inline def apply(org_ : String, pat_request_id: Double): OrgPatrequestid = {
    val __obj = js.Dynamic.literal(pat_request_id = pat_request_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgPatrequestid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrgPatrequestid] (val x: Self) extends AnyVal {
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setPat_request_id(value: Double): Self = StObject.set(x, "pat_request_id", value.asInstanceOf[js.Any])
  }
}
