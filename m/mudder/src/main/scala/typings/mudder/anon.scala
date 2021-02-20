package typings.mudder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Carry extends StObject {
    
    var carry: Boolean = js.native
    
    var den: Double = js.native
    
    var rem: Double = js.native
    
    var res: js.Array[Double] = js.native
  }
  object Carry {
    
    @scala.inline
    def apply(carry: Boolean, den: Double, rem: Double, res: js.Array[Double]): Carry = {
      val __obj = js.Dynamic.literal(carry = carry.asInstanceOf[js.Any], den = den.asInstanceOf[js.Any], rem = rem.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
      __obj.asInstanceOf[Carry]
    }
    
    @scala.inline
    implicit class CarryMutableBuilder[Self <: Carry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCarry(value: Boolean): Self = StObject.set(x, "carry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDen(value: Double): Self = StObject.set(x, "den", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRem(value: Double): Self = StObject.set(x, "rem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRes(value: js.Array[Double]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResVarargs(value: Double*): Self = StObject.set(x, "res", js.Array(value :_*))
    }
  }
}
