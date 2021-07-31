package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Http extends StObject {
  
  /**
    * When set to true, URL path parameters will be fully URI-decoded except in cases of single segment matches in reserved expansion, where "%2F" will be left encoded. The default
    * behavior is to not decode RFC 6570 reserved characters in multi segment matches.
    */
  var fullyDecodeReservedExpansion: js.UndefOr[Boolean] = js.undefined
  
  /** A list of HTTP configuration rules that apply to individual API methods. **NOTE:** All service configuration rules follow "last one wins" order. */
  var rules: js.UndefOr[js.Array[HttpRule]] = js.undefined
}
object Http {
  
  @scala.inline
  def apply(): Http = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Http]
  }
  
  @scala.inline
  implicit class HttpMutableBuilder[Self <: Http] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullyDecodeReservedExpansion(value: Boolean): Self = StObject.set(x, "fullyDecodeReservedExpansion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullyDecodeReservedExpansionUndefined: Self = StObject.set(x, "fullyDecodeReservedExpansion", js.undefined)
    
    @scala.inline
    def setRules(value: js.Array[HttpRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: HttpRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
