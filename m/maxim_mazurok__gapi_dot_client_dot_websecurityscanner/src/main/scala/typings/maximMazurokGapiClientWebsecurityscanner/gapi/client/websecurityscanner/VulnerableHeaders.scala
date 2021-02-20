package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VulnerableHeaders extends StObject {
  
  /** List of vulnerable headers. */
  var headers: js.UndefOr[js.Array[Header]] = js.native
  
  /** List of missing headers. */
  var missingHeaders: js.UndefOr[js.Array[Header]] = js.native
}
object VulnerableHeaders {
  
  @scala.inline
  def apply(): VulnerableHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VulnerableHeaders]
  }
  
  @scala.inline
  implicit class VulnerableHeadersMutableBuilder[Self <: VulnerableHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Array[Header]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: Header*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setMissingHeaders(value: js.Array[Header]): Self = StObject.set(x, "missingHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingHeadersUndefined: Self = StObject.set(x, "missingHeaders", js.undefined)
    
    @scala.inline
    def setMissingHeadersVarargs(value: Header*): Self = StObject.set(x, "missingHeaders", js.Array(value :_*))
  }
}
