package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotationalSpringOptions
  extends StObject
     with SpringOptions {
  
  var restAngle: js.UndefOr[Double] = js.undefined
}
object RotationalSpringOptions {
  
  inline def apply(): RotationalSpringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotationalSpringOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RotationalSpringOptions] (val x: Self) extends AnyVal {
    
    inline def setRestAngle(value: Double): Self = StObject.set(x, "restAngle", value.asInstanceOf[js.Any])
    
    inline def setRestAngleUndefined: Self = StObject.set(x, "restAngle", js.undefined)
  }
}
