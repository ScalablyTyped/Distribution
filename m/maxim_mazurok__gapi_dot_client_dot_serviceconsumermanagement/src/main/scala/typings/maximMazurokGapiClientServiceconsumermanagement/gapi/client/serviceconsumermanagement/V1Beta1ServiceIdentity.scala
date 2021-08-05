package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V1Beta1ServiceIdentity extends StObject {
  
  /** The email address of the service identity. */
  var email: js.UndefOr[String] = js.undefined
  
  /** P4 service identity resource name. An example name would be: `services/serviceconsumermanagement.googleapis.com/projects/123/serviceIdentities/default` */
  var name: js.UndefOr[String] = js.undefined
  
  /** The P4 service identity configuration tag. This must be defined in activation_grants. If not specified when creating the account, the tag is set to "default". */
  var tag: js.UndefOr[String] = js.undefined
  
  /** The unique and stable id of the service identity. */
  var uniqueId: js.UndefOr[String] = js.undefined
}
object V1Beta1ServiceIdentity {
  
  inline def apply(): V1Beta1ServiceIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V1Beta1ServiceIdentity]
  }
  
  extension [Self <: V1Beta1ServiceIdentity](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setUniqueId(value: String): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
    
    inline def setUniqueIdUndefined: Self = StObject.set(x, "uniqueId", js.undefined)
  }
}
