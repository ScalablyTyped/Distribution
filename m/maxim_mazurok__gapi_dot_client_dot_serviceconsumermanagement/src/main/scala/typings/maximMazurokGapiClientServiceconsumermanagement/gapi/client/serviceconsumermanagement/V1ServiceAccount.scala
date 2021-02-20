package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V1ServiceAccount extends StObject {
  
  /** The email address of the service account. */
  var email: js.UndefOr[String] = js.native
  
  /** Deprecated. See b/136209818. */
  var iamAccountName: js.UndefOr[String] = js.native
  
  /** P4 SA resource name. An example name would be: `services/serviceconsumermanagement.googleapis.com/projects/123/serviceAccounts/default` */
  var name: js.UndefOr[String] = js.native
  
  /** The P4 SA configuration tag. This must be defined in activation_grants. If not specified when creating the account, the tag is set to "default". */
  var tag: js.UndefOr[String] = js.native
  
  /** The unique and stable id of the service account. */
  var uniqueId: js.UndefOr[String] = js.native
}
object V1ServiceAccount {
  
  @scala.inline
  def apply(): V1ServiceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V1ServiceAccount]
  }
  
  @scala.inline
  implicit class V1ServiceAccountMutableBuilder[Self <: V1ServiceAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setIamAccountName(value: String): Self = StObject.set(x, "iamAccountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamAccountNameUndefined: Self = StObject.set(x, "iamAccountName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    @scala.inline
    def setUniqueId(value: String): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueIdUndefined: Self = StObject.set(x, "uniqueId", js.undefined)
  }
}
