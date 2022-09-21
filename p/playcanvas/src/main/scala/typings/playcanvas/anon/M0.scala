package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait M0 extends StObject {
  
  var m0: Double
  
  var m1: Double
  
  var p0: Double
  
  var p1: Double
  
  var valid: Boolean
}
object M0 {
  
  inline def apply(m0: Double, m1: Double, p0: Double, p1: Double, valid: Boolean): M0 = {
    val __obj = js.Dynamic.literal(m0 = m0.asInstanceOf[js.Any], m1 = m1.asInstanceOf[js.Any], p0 = p0.asInstanceOf[js.Any], p1 = p1.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[M0]
  }
  
  extension [Self <: M0](x: Self) {
    
    inline def setM0(value: Double): Self = StObject.set(x, "m0", value.asInstanceOf[js.Any])
    
    inline def setM1(value: Double): Self = StObject.set(x, "m1", value.asInstanceOf[js.Any])
    
    inline def setP0(value: Double): Self = StObject.set(x, "p0", value.asInstanceOf[js.Any])
    
    inline def setP1(value: Double): Self = StObject.set(x, "p1", value.asInstanceOf[js.Any])
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
