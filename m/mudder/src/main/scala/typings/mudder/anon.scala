package typings.mudder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Carry extends StObject {
    
    var carry: Boolean
    
    var den: Double
    
    var rem: Double
    
    var res: js.Array[Double]
  }
  object Carry {
    
    inline def apply(carry: Boolean, den: Double, rem: Double, res: js.Array[Double]): Carry = {
      val __obj = js.Dynamic.literal(carry = carry.asInstanceOf[js.Any], den = den.asInstanceOf[js.Any], rem = rem.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
      __obj.asInstanceOf[Carry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Carry] (val x: Self) extends AnyVal {
      
      inline def setCarry(value: Boolean): Self = StObject.set(x, "carry", value.asInstanceOf[js.Any])
      
      inline def setDen(value: Double): Self = StObject.set(x, "den", value.asInstanceOf[js.Any])
      
      inline def setRem(value: Double): Self = StObject.set(x, "rem", value.asInstanceOf[js.Any])
      
      inline def setRes(value: js.Array[Double]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      inline def setResVarargs(value: Double*): Self = StObject.set(x, "res", js.Array(value*))
    }
  }
}
