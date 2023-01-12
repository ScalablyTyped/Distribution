package typings.nivoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  animate :boolean,   motionDamping :number,   motionStiffness :number}> */
trait MotionProps extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var motionDamping: js.UndefOr[Double] = js.undefined
  
  var motionStiffness: js.UndefOr[Double] = js.undefined
}
object MotionProps {
  
  inline def apply(): MotionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MotionProps] (val x: Self) extends AnyVal {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setMotionDamping(value: Double): Self = StObject.set(x, "motionDamping", value.asInstanceOf[js.Any])
    
    inline def setMotionDampingUndefined: Self = StObject.set(x, "motionDamping", js.undefined)
    
    inline def setMotionStiffness(value: Double): Self = StObject.set(x, "motionStiffness", value.asInstanceOf[js.Any])
    
    inline def setMotionStiffnessUndefined: Self = StObject.set(x, "motionStiffness", js.undefined)
  }
}
