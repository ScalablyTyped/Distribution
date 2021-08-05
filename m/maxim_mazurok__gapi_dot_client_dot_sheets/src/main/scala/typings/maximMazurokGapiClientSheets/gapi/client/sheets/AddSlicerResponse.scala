package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddSlicerResponse extends StObject {
  
  /** The newly added slicer. */
  var slicer: js.UndefOr[Slicer] = js.undefined
}
object AddSlicerResponse {
  
  inline def apply(): AddSlicerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddSlicerResponse]
  }
  
  extension [Self <: AddSlicerResponse](x: Self) {
    
    inline def setSlicer(value: Slicer): Self = StObject.set(x, "slicer", value.asInstanceOf[js.Any])
    
    inline def setSlicerUndefined: Self = StObject.set(x, "slicer", js.undefined)
  }
}
