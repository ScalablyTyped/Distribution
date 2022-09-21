package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveIosAppRequest extends StObject {
  
  /** If set to true, and the App is not found, the request will succeed but no action will be taken on the server. */
  var allowMissing: js.UndefOr[Boolean] = js.undefined
  
  /** Checksum provided in the IosApp entity, which if provided ensures the client has an up-to-date value before proceeding. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** If set to true, only validate the request and do not delete the app. */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object RemoveIosAppRequest {
  
  inline def apply(): RemoveIosAppRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveIosAppRequest]
  }
  
  extension [Self <: RemoveIosAppRequest](x: Self) {
    
    inline def setAllowMissing(value: Boolean): Self = StObject.set(x, "allowMissing", value.asInstanceOf[js.Any])
    
    inline def setAllowMissingUndefined: Self = StObject.set(x, "allowMissing", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
