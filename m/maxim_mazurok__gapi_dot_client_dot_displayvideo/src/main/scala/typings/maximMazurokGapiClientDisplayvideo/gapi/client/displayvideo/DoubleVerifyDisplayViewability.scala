package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoubleVerifyDisplayViewability extends StObject {
  
  /** Target web and app inventory to maximize IAB viewable rate. */
  var iab: js.UndefOr[String] = js.undefined
  
  /** Target web and app inventory to maximize 100% viewable duration. */
  var viewableDuring: js.UndefOr[String] = js.undefined
}
object DoubleVerifyDisplayViewability {
  
  inline def apply(): DoubleVerifyDisplayViewability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleVerifyDisplayViewability]
  }
  
  extension [Self <: DoubleVerifyDisplayViewability](x: Self) {
    
    inline def setIab(value: String): Self = StObject.set(x, "iab", value.asInstanceOf[js.Any])
    
    inline def setIabUndefined: Self = StObject.set(x, "iab", js.undefined)
    
    inline def setViewableDuring(value: String): Self = StObject.set(x, "viewableDuring", value.asInstanceOf[js.Any])
    
    inline def setViewableDuringUndefined: Self = StObject.set(x, "viewableDuring", js.undefined)
  }
}
