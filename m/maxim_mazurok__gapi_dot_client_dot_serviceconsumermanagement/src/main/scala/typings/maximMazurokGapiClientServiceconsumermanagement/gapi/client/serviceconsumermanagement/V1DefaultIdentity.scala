package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V1DefaultIdentity extends StObject {
  
  /** The email address of the default identity. */
  var email: js.UndefOr[String] = js.native
  
  /** Default identity resource name. An example name would be: `services/serviceconsumermanagement.googleapis.com/projects/123/defaultIdentity` */
  var name: js.UndefOr[String] = js.native
  
  /** The unique and stable id of the default identity. */
  var uniqueId: js.UndefOr[String] = js.native
}
object V1DefaultIdentity {
  
  @scala.inline
  def apply(): V1DefaultIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V1DefaultIdentity]
  }
  
  @scala.inline
  implicit class V1DefaultIdentityMutableBuilder[Self <: V1DefaultIdentity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUniqueId(value: String): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueIdUndefined: Self = StObject.set(x, "uniqueId", js.undefined)
  }
}
