package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VulnerableHeaders extends StObject {
  
  /** List of vulnerable headers. */
  var headers: js.UndefOr[js.Array[Header]] = js.undefined
  
  /** List of missing headers. */
  var missingHeaders: js.UndefOr[js.Array[Header]] = js.undefined
}
object VulnerableHeaders {
  
  inline def apply(): VulnerableHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VulnerableHeaders]
  }
  
  extension [Self <: VulnerableHeaders](x: Self) {
    
    inline def setHeaders(value: js.Array[Header]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: Header*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setMissingHeaders(value: js.Array[Header]): Self = StObject.set(x, "missingHeaders", value.asInstanceOf[js.Any])
    
    inline def setMissingHeadersUndefined: Self = StObject.set(x, "missingHeaders", js.undefined)
    
    inline def setMissingHeadersVarargs(value: Header*): Self = StObject.set(x, "missingHeaders", js.Array(value*))
  }
}
