package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageProperties extends StObject {
  
  /** If present, dominant colors completed successfully. */
  var dominantColors: js.UndefOr[DominantColorsAnnotation] = js.undefined
}
object ImageProperties {
  
  inline def apply(): ImageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageProperties]
  }
  
  extension [Self <: ImageProperties](x: Self) {
    
    inline def setDominantColors(value: DominantColorsAnnotation): Self = StObject.set(x, "dominantColors", value.asInstanceOf[js.Any])
    
    inline def setDominantColorsUndefined: Self = StObject.set(x, "dominantColors", js.undefined)
  }
}
