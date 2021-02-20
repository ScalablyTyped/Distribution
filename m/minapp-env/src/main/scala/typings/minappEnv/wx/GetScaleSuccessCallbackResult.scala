package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetScaleSuccessCallbackResult extends StObject {
  
  /** 缩放值 */
  var scale: Double = js.native
}
object GetScaleSuccessCallbackResult {
  
  @scala.inline
  def apply(scale: Double): GetScaleSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScaleSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetScaleSuccessCallbackResultMutableBuilder[Self <: GetScaleSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
