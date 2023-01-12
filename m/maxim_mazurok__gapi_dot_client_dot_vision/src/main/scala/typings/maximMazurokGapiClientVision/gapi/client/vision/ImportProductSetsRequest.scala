package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportProductSetsRequest extends StObject {
  
  /** Required. The input content for the list of requests. */
  var inputConfig: js.UndefOr[ImportProductSetsInputConfig] = js.undefined
}
object ImportProductSetsRequest {
  
  inline def apply(): ImportProductSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportProductSetsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportProductSetsRequest] (val x: Self) extends AnyVal {
    
    inline def setInputConfig(value: ImportProductSetsInputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
  }
}
