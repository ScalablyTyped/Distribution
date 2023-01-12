package typings.phaser.anon

import typings.phaser.spine.PowOut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSwirlEffect extends StObject {
  
  /* static member */
  var interpolation: PowOut
}
object TypeofSwirlEffect {
  
  inline def apply(interpolation: PowOut): TypeofSwirlEffect = {
    val __obj = js.Dynamic.literal(interpolation = interpolation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSwirlEffect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSwirlEffect] (val x: Self) extends AnyVal {
    
    inline def setInterpolation(value: PowOut): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
  }
}
