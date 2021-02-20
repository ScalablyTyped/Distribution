package typings.minecraftScriptingTypesShared

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorXYZ extends StObject {
  
  var x: Double = js.native
  
  var y: Double = js.native
  
  var z: Double = js.native
}
object VectorXYZ {
  
  @scala.inline
  def apply(x: Double, y: Double, z: Double): VectorXYZ = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorXYZ]
  }
  
  @scala.inline
  implicit class VectorXYZMutableBuilder[Self <: VectorXYZ] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
