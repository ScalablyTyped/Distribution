package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3CompatibleMetadata extends StObject {
  
  /** Specifies the authentication and authorization method used by the storage service. When not specified, Transfer Service will attempt to determine right auth method to use. */
  var authMethod: js.UndefOr[String] = js.undefined
  
  /** The Listing API to use for discovering objects. When not specified, Transfer Service will attempt to determine the right API to use. */
  var listApi: js.UndefOr[String] = js.undefined
  
  /** Specifies the network protocol of the agent. When not specified, the default value of NetworkProtocol NETWORK_PROTOCOL_HTTPS is used. */
  var protocol: js.UndefOr[String] = js.undefined
  
  /** Specifies the API request model used to call the storage service. When not specified, the default value of RequestModel REQUEST_MODEL_VIRTUAL_HOSTED_STYLE is used. */
  var requestModel: js.UndefOr[String] = js.undefined
}
object S3CompatibleMetadata {
  
  inline def apply(): S3CompatibleMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3CompatibleMetadata]
  }
  
  extension [Self <: S3CompatibleMetadata](x: Self) {
    
    inline def setAuthMethod(value: String): Self = StObject.set(x, "authMethod", value.asInstanceOf[js.Any])
    
    inline def setAuthMethodUndefined: Self = StObject.set(x, "authMethod", js.undefined)
    
    inline def setListApi(value: String): Self = StObject.set(x, "listApi", value.asInstanceOf[js.Any])
    
    inline def setListApiUndefined: Self = StObject.set(x, "listApi", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setRequestModel(value: String): Self = StObject.set(x, "requestModel", value.asInstanceOf[js.Any])
    
    inline def setRequestModelUndefined: Self = StObject.set(x, "requestModel", js.undefined)
  }
}
