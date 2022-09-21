package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverlappingUIElements extends StObject {
  
  /** Resource names of the overlapping screen elements */
  var resourceName: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The screen id of the elements */
  var screenId: js.UndefOr[String] = js.undefined
}
object OverlappingUIElements {
  
  inline def apply(): OverlappingUIElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlappingUIElements]
  }
  
  extension [Self <: OverlappingUIElements](x: Self) {
    
    inline def setResourceName(value: js.Array[String]): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setResourceNameVarargs(value: String*): Self = StObject.set(x, "resourceName", js.Array(value*))
    
    inline def setScreenId(value: String): Self = StObject.set(x, "screenId", value.asInstanceOf[js.Any])
    
    inline def setScreenIdUndefined: Self = StObject.set(x, "screenId", js.undefined)
  }
}
