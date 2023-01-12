package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V1DefaultIdentity extends StObject {
  
  /** The email address of the default identity. */
  var email: js.UndefOr[String] = js.undefined
  
  /** Default identity resource name. An example name would be: `services/serviceconsumermanagement.googleapis.com/projects/123/defaultIdentity` */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The Default Identity tag. If specified when creating the account, the tag must be present in activation_grants. If not specified when creating the account, the tag is set to the tag
    * specified in activation_grants.
    */
  var tag: js.UndefOr[String] = js.undefined
  
  /** The unique and stable id of the default identity. */
  var uniqueId: js.UndefOr[String] = js.undefined
}
object V1DefaultIdentity {
  
  inline def apply(): V1DefaultIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V1DefaultIdentity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: V1DefaultIdentity] (val x: Self) extends AnyVal {
    
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
