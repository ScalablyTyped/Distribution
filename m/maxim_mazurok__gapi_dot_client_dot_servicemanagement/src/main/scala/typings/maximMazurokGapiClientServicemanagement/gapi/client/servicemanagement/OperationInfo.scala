package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationInfo extends StObject {
  
  /**
    * Required. The message name of the metadata type for this long-running operation. If the response is in a different package from the rpc, a fully-qualified message name must be used
    * (e.g. `google.protobuf.Struct`). Note: Altering this value constitutes a breaking change.
    */
  var metadataType: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The message name of the primary return type for this long-running operation. This type will be used to deserialize the LRO's response. If the response is in a different
    * package from the rpc, a fully-qualified message name must be used (e.g. `google.protobuf.Struct`). Note: Altering this value constitutes a breaking change.
    */
  var responseType: js.UndefOr[String] = js.undefined
}
object OperationInfo {
  
  inline def apply(): OperationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationInfo]
  }
  
  extension [Self <: OperationInfo](x: Self) {
    
    inline def setMetadataType(value: String): Self = StObject.set(x, "metadataType", value.asInstanceOf[js.Any])
    
    inline def setMetadataTypeUndefined: Self = StObject.set(x, "metadataType", js.undefined)
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
  }
}
