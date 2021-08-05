package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accuracyMod {
  
  @JSImport("pkijs/src/Accuracy", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with Accuracy {
    
    /* CompleteClass */
    var micros: Double = js.native
    
    /* CompleteClass */
    var millis: Double = js.native
    
    /* CompleteClass */
    var seconds: Double = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/Accuracy", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    inline def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  trait Accuracy extends StObject {
    
    var micros: Double
    
    var millis: Double
    
    var seconds: Double
  }
  object Accuracy {
    
    inline def apply(micros: Double, millis: Double, seconds: Double): Accuracy = {
      val __obj = js.Dynamic.literal(micros = micros.asInstanceOf[js.Any], millis = millis.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[Accuracy]
    }
    
    extension [Self <: Accuracy](x: Self) {
      
      inline def setMicros(value: Double): Self = StObject.set(x, "micros", value.asInstanceOf[js.Any])
      
      inline def setMillis(value: Double): Self = StObject.set(x, "millis", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    }
  }
}
