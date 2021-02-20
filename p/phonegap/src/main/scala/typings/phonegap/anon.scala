package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Dst extends StObject {
    
    var dst: Boolean = js.native
  }
  object Dst {
    
    @scala.inline
    def apply(dst: Boolean): Dst = {
      val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dst]
    }
    
    @scala.inline
    implicit class DstMutableBuilder[Self <: Dst] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDst(value: Boolean): Self = StObject.set(x, "dst", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Value extends StObject {
    
    var value: String = js.native
  }
  object Value {
    
    @scala.inline
    def apply(value: String): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ValueArray extends StObject {
    
    var value: js.Array[String] = js.native
  }
  object ValueArray {
    
    @scala.inline
    def apply(value: js.Array[String]): ValueArray = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueArray]
    }
    
    @scala.inline
    implicit class ValueArrayMutableBuilder[Self <: ValueArray] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ValueNumber extends StObject {
    
    var value: Double = js.native
  }
  object ValueNumber {
    
    @scala.inline
    def apply(value: Double): ValueNumber = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueNumber]
    }
    
    @scala.inline
    implicit class ValueNumberMutableBuilder[Self <: ValueNumber] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
