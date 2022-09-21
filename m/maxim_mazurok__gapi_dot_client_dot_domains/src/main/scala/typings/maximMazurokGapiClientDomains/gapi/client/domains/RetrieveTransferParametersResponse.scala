package typings.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetrieveTransferParametersResponse extends StObject {
  
  /** Parameters to use when calling the `TransferDomain` method. */
  var transferParameters: js.UndefOr[TransferParameters] = js.undefined
}
object RetrieveTransferParametersResponse {
  
  inline def apply(): RetrieveTransferParametersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetrieveTransferParametersResponse]
  }
  
  extension [Self <: RetrieveTransferParametersResponse](x: Self) {
    
    inline def setTransferParameters(value: TransferParameters): Self = StObject.set(x, "transferParameters", value.asInstanceOf[js.Any])
    
    inline def setTransferParametersUndefined: Self = StObject.set(x, "transferParameters", js.undefined)
  }
}
