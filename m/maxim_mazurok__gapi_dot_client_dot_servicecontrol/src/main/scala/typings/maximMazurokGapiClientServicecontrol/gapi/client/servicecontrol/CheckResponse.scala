package typings.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckResponse extends StObject {
  
  /** Returns a set of request contexts generated from the `CheckRequest`. */
  var headers: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Operation is allowed when this field is not set. Any non-'OK' status indicates a denial; google.rpc.Status.details would contain additional details about the denial. */
  var status: js.UndefOr[Status] = js.undefined
}
object CheckResponse {
  
  inline def apply(): CheckResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckResponse]
  }
  
  extension [Self <: CheckResponse](x: Self) {
    
    inline def setHeaders(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
