package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DominantColorsAnnotation extends StObject {
  
  /** RGB color values with their score and pixel fraction. */
  var colors: js.UndefOr[js.Array[ColorInfo]] = js.undefined
}
object DominantColorsAnnotation {
  
  inline def apply(): DominantColorsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DominantColorsAnnotation]
  }
  
  extension [Self <: DominantColorsAnnotation](x: Self) {
    
    inline def setColors(value: js.Array[ColorInfo]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: ColorInfo*): Self = StObject.set(x, "colors", js.Array(value*))
  }
}
