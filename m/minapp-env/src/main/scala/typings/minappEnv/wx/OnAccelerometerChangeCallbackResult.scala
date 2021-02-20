package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnAccelerometerChangeCallbackResult extends StObject {
  
  /** X 轴 */
  var x: Double = js.native
  
  /** Y 轴 */
  var y: Double = js.native
  
  /** Z 轴 */
  var z: Double = js.native
}
object OnAccelerometerChangeCallbackResult {
  
  @scala.inline
  def apply(x: Double, y: Double, z: Double): OnAccelerometerChangeCallbackResult = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAccelerometerChangeCallbackResult]
  }
  
  @scala.inline
  implicit class OnAccelerometerChangeCallbackResultMutableBuilder[Self <: OnAccelerometerChangeCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
