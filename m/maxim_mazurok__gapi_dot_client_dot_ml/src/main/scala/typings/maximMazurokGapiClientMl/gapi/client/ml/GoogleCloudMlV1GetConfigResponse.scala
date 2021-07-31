package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1GetConfigResponse extends StObject {
  
  var config: js.UndefOr[GoogleCloudMlV1Config] = js.undefined
  
  /** The service account Cloud ML uses to access resources in the project. */
  var serviceAccount: js.UndefOr[String] = js.undefined
  
  /** The project number for `service_account`. */
  var serviceAccountProject: js.UndefOr[String] = js.undefined
}
object GoogleCloudMlV1GetConfigResponse {
  
  @scala.inline
  def apply(): GoogleCloudMlV1GetConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1GetConfigResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1GetConfigResponseMutableBuilder[Self <: GoogleCloudMlV1GetConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: GoogleCloudMlV1Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountProject(value: String): Self = StObject.set(x, "serviceAccountProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountProjectUndefined: Self = StObject.set(x, "serviceAccountProject", js.undefined)
    
    @scala.inline
    def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
  }
}
