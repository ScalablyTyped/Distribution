package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2RunJobRequest extends StObject {
  
  /** A system-generated fingerprint for this version of the resource. May be used to detect modification conflict during updates. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Indicates that the request should be validated without actually deleting any resources. */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object GoogleCloudRunV2RunJobRequest {
  
  inline def apply(): GoogleCloudRunV2RunJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2RunJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudRunV2RunJobRequest] (val x: Self) extends AnyVal {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
