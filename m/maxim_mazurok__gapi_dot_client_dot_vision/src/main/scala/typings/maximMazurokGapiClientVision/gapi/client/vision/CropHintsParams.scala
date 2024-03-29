package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CropHintsParams extends StObject {
  
  /**
    * Aspect ratios in floats, representing the ratio of the width to the height of the image. For example, if the desired aspect ratio is 4/3, the corresponding float value should be
    * 1.33333. If not specified, the best possible crop is returned. The number of provided aspect ratios is limited to a maximum of 16; any aspect ratios provided after the 16th are
    * ignored.
    */
  var aspectRatios: js.UndefOr[js.Array[Double]] = js.undefined
}
object CropHintsParams {
  
  inline def apply(): CropHintsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropHintsParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CropHintsParams] (val x: Self) extends AnyVal {
    
    inline def setAspectRatios(value: js.Array[Double]): Self = StObject.set(x, "aspectRatios", value.asInstanceOf[js.Any])
    
    inline def setAspectRatiosUndefined: Self = StObject.set(x, "aspectRatios", js.undefined)
    
    inline def setAspectRatiosVarargs(value: Double*): Self = StObject.set(x, "aspectRatios", js.Array(value*))
  }
}
