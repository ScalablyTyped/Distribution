package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleApiServiceusageV1beta1ServiceIdentity extends StObject {
  
  /** The email address of the service account that a service producer would use to access consumer resources. */
  var email: js.UndefOr[String] = js.undefined
  
  /** The unique and stable id of the service account. https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts#ServiceAccount */
  var uniqueId: js.UndefOr[String] = js.undefined
}
object GoogleApiServiceusageV1beta1ServiceIdentity {
  
  @scala.inline
  def apply(): GoogleApiServiceusageV1beta1ServiceIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleApiServiceusageV1beta1ServiceIdentity]
  }
  
  @scala.inline
  implicit class GoogleApiServiceusageV1beta1ServiceIdentityMutableBuilder[Self <: GoogleApiServiceusageV1beta1ServiceIdentity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setUniqueId(value: String): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueIdUndefined: Self = StObject.set(x, "uniqueId", js.undefined)
  }
}
