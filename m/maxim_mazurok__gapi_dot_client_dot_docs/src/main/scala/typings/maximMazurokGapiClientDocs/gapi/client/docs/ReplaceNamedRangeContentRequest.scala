package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceNamedRangeContentRequest extends StObject {
  
  /** The ID of the named range whose content will be replaced. If there is no named range with the given ID a 400 bad request error is returned. */
  var namedRangeId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the NamedRanges whose content will be replaced. If there are multiple named ranges with the given name, then the content of each one will be replaced. If there are no
    * named ranges with the given name, then the request will be a no-op.
    */
  var namedRangeName: js.UndefOr[String] = js.undefined
  
  /** Replaces the content of the specified named range(s) with the given text. */
  var text: js.UndefOr[String] = js.undefined
}
object ReplaceNamedRangeContentRequest {
  
  inline def apply(): ReplaceNamedRangeContentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceNamedRangeContentRequest]
  }
  
  extension [Self <: ReplaceNamedRangeContentRequest](x: Self) {
    
    inline def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
    
    inline def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
    
    inline def setNamedRangeName(value: String): Self = StObject.set(x, "namedRangeName", value.asInstanceOf[js.Any])
    
    inline def setNamedRangeNameUndefined: Self = StObject.set(x, "namedRangeName", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
