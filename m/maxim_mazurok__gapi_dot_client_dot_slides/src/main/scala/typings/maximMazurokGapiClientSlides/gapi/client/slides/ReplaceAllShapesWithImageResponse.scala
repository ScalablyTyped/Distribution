package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceAllShapesWithImageResponse extends StObject {
  
  /** The number of shapes replaced with images. */
  var occurrencesChanged: js.UndefOr[Double] = js.undefined
}
object ReplaceAllShapesWithImageResponse {
  
  inline def apply(): ReplaceAllShapesWithImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceAllShapesWithImageResponse]
  }
  
  extension [Self <: ReplaceAllShapesWithImageResponse](x: Self) {
    
    inline def setOccurrencesChanged(value: Double): Self = StObject.set(x, "occurrencesChanged", value.asInstanceOf[js.Any])
    
    inline def setOccurrencesChangedUndefined: Self = StObject.set(x, "occurrencesChanged", js.undefined)
  }
}
