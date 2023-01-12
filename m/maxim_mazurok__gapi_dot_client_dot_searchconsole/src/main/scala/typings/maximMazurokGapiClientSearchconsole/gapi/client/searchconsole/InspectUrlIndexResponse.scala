package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectUrlIndexResponse extends StObject {
  
  /** URL inspection results. */
  var inspectionResult: js.UndefOr[UrlInspectionResult] = js.undefined
}
object InspectUrlIndexResponse {
  
  inline def apply(): InspectUrlIndexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InspectUrlIndexResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InspectUrlIndexResponse] (val x: Self) extends AnyVal {
    
    inline def setInspectionResult(value: UrlInspectionResult): Self = StObject.set(x, "inspectionResult", value.asInstanceOf[js.Any])
    
    inline def setInspectionResultUndefined: Self = StObject.set(x, "inspectionResult", js.undefined)
  }
}
