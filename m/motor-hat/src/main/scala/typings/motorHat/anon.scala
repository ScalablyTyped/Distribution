package typings.motorHat

import typings.motorHat.mod.Motor
import typings.motorHat.mod.MotorPins
import typings.motorHat.mod.PinDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait M1 extends StObject {
    
    var M1: MotorPins
    
    var M2: MotorPins
    
    var M3: MotorPins
    
    var M4: MotorPins
  }
  object M1 {
    
    inline def apply(M1: MotorPins, M2: MotorPins, M3: MotorPins, M4: MotorPins): M1 = {
      val __obj = js.Dynamic.literal(M1 = M1.asInstanceOf[js.Any], M2 = M2.asInstanceOf[js.Any], M3 = M3.asInstanceOf[js.Any], M4 = M4.asInstanceOf[js.Any])
      __obj.asInstanceOf[M1]
    }
    
    extension [Self <: M1](x: Self) {
      
      inline def setM1(value: MotorPins): Self = StObject.set(x, "M1", value.asInstanceOf[js.Any])
      
      inline def setM2(value: MotorPins): Self = StObject.set(x, "M2", value.asInstanceOf[js.Any])
      
      inline def setM3(value: MotorPins): Self = StObject.set(x, "M3", value.asInstanceOf[js.Any])
      
      inline def setM4(value: MotorPins): Self = StObject.set(x, "M4", value.asInstanceOf[js.Any])
    }
  }
  
  trait W1 extends StObject {
    
    /**
      * Pin definition for winding 1 of the stepper
      */
    var W1: PinDefinition
    
    /**
      * Pin definition for winding 2 of the stepper
      */
    var W2: PinDefinition
  }
  object W1 {
    
    inline def apply(W1: PinDefinition, W2: PinDefinition): W1 = {
      val __obj = js.Dynamic.literal(W1 = W1.asInstanceOf[js.Any], W2 = W2.asInstanceOf[js.Any])
      __obj.asInstanceOf[W1]
    }
    
    extension [Self <: W1](x: Self) {
      
      inline def setW1(value: PinDefinition): Self = StObject.set(x, "W1", value.asInstanceOf[js.Any])
      
      inline def setW1Varargs(value: Double*): Self = StObject.set(x, "W1", js.Array(value*))
      
      inline def setW2(value: PinDefinition): Self = StObject.set(x, "W2", value.asInstanceOf[js.Any])
      
      inline def setW2Varargs(value: Double*): Self = StObject.set(x, "W2", js.Array(value*))
    }
  }
  
  trait W2 extends StObject {
    
    var W1: Motor
    
    var W2: Motor
  }
  object W2 {
    
    inline def apply(W1: Motor, W2: Motor): W2 = {
      val __obj = js.Dynamic.literal(W1 = W1.asInstanceOf[js.Any], W2 = W2.asInstanceOf[js.Any])
      __obj.asInstanceOf[W2]
    }
    
    extension [Self <: W2](x: Self) {
      
      inline def setW1(value: Motor): Self = StObject.set(x, "W1", value.asInstanceOf[js.Any])
      
      inline def setW2(value: Motor): Self = StObject.set(x, "W2", value.asInstanceOf[js.Any])
    }
  }
}
