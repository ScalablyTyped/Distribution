package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pad extends StObject {
  
  /** The number of pixels to add to the bottom. The default is 0. */
  var bottomPixels: js.UndefOr[Double] = js.undefined
  
  /** The number of pixels to add to the left. The default is 0. */
  var leftPixels: js.UndefOr[Double] = js.undefined
  
  /** The number of pixels to add to the right. The default is 0. */
  var rightPixels: js.UndefOr[Double] = js.undefined
  
  /** The number of pixels to add to the top. The default is 0. */
  var topPixels: js.UndefOr[Double] = js.undefined
}
object Pad {
  
  inline def apply(): Pad = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pad]
  }
  
  extension [Self <: Pad](x: Self) {
    
    inline def setBottomPixels(value: Double): Self = StObject.set(x, "bottomPixels", value.asInstanceOf[js.Any])
    
    inline def setBottomPixelsUndefined: Self = StObject.set(x, "bottomPixels", js.undefined)
    
    inline def setLeftPixels(value: Double): Self = StObject.set(x, "leftPixels", value.asInstanceOf[js.Any])
    
    inline def setLeftPixelsUndefined: Self = StObject.set(x, "leftPixels", js.undefined)
    
    inline def setRightPixels(value: Double): Self = StObject.set(x, "rightPixels", value.asInstanceOf[js.Any])
    
    inline def setRightPixelsUndefined: Self = StObject.set(x, "rightPixels", js.undefined)
    
    inline def setTopPixels(value: Double): Self = StObject.set(x, "topPixels", value.asInstanceOf[js.Any])
    
    inline def setTopPixelsUndefined: Self = StObject.set(x, "topPixels", js.undefined)
  }
}
