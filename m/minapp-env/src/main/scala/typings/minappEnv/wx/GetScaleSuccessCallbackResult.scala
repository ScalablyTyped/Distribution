package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScaleSuccessCallbackResult extends StObject {
  
  /** 缩放值 */
  var scale: Double
}
object GetScaleSuccessCallbackResult {
  
  inline def apply(scale: Double): GetScaleSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScaleSuccessCallbackResult]
  }
  
  extension [Self <: GetScaleSuccessCallbackResult](x: Self) {
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
