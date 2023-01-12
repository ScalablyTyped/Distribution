package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddSlicerRequest extends StObject {
  
  /**
    * The slicer that should be added to the spreadsheet, including the position where it should be placed. The slicerId field is optional; if one is not set, an id will be randomly
    * generated. (It is an error to specify the ID of a slicer that already exists.)
    */
  var slicer: js.UndefOr[Slicer] = js.undefined
}
object AddSlicerRequest {
  
  inline def apply(): AddSlicerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddSlicerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddSlicerRequest] (val x: Self) extends AnyVal {
    
    inline def setSlicer(value: Slicer): Self = StObject.set(x, "slicer", value.asInstanceOf[js.Any])
    
    inline def setSlicerUndefined: Self = StObject.set(x, "slicer", js.undefined)
  }
}
