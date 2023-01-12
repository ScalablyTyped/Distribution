package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnAccelerometerChangeCallbackResult extends StObject {
  
  /** X 轴 */
  var x: Double
  
  /** Y 轴 */
  var y: Double
  
  /** Z 轴 */
  var z: Double
}
object OnAccelerometerChangeCallbackResult {
  
  inline def apply(x: Double, y: Double, z: Double): OnAccelerometerChangeCallbackResult = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAccelerometerChangeCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnAccelerometerChangeCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
