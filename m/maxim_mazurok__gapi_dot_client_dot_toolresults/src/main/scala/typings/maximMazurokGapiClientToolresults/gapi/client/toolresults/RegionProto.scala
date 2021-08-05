package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionProto extends StObject {
  
  /** The height, in pixels. Always set. */
  var heightPx: js.UndefOr[Double] = js.undefined
  
  /** The left side of the rectangle, in pixels. Always set. */
  var leftPx: js.UndefOr[Double] = js.undefined
  
  /** The top of the rectangle, in pixels. Always set. */
  var topPx: js.UndefOr[Double] = js.undefined
  
  /** The width, in pixels. Always set. */
  var widthPx: js.UndefOr[Double] = js.undefined
}
object RegionProto {
  
  inline def apply(): RegionProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionProto]
  }
  
  extension [Self <: RegionProto](x: Self) {
    
    inline def setHeightPx(value: Double): Self = StObject.set(x, "heightPx", value.asInstanceOf[js.Any])
    
    inline def setHeightPxUndefined: Self = StObject.set(x, "heightPx", js.undefined)
    
    inline def setLeftPx(value: Double): Self = StObject.set(x, "leftPx", value.asInstanceOf[js.Any])
    
    inline def setLeftPxUndefined: Self = StObject.set(x, "leftPx", js.undefined)
    
    inline def setTopPx(value: Double): Self = StObject.set(x, "topPx", value.asInstanceOf[js.Any])
    
    inline def setTopPxUndefined: Self = StObject.set(x, "topPx", js.undefined)
    
    inline def setWidthPx(value: Double): Self = StObject.set(x, "widthPx", value.asInstanceOf[js.Any])
    
    inline def setWidthPxUndefined: Self = StObject.set(x, "widthPx", js.undefined)
  }
}
