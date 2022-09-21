package typings.postcssCalc

import typings.postcssCalc.postcssCalcBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Precision extends StObject {
    
    var precision: Double | `false`
    
    var warnWhenCannotResolve: Boolean
  }
  object Precision {
    
    inline def apply(precision: Double | `false`, warnWhenCannotResolve: Boolean): Precision = {
      val __obj = js.Dynamic.literal(precision = precision.asInstanceOf[js.Any], warnWhenCannotResolve = warnWhenCannotResolve.asInstanceOf[js.Any])
      __obj.asInstanceOf[Precision]
    }
    
    extension [Self <: Precision](x: Self) {
      
      inline def setPrecision(value: Double | `false`): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setWarnWhenCannotResolve(value: Boolean): Self = StObject.set(x, "warnWhenCannotResolve", value.asInstanceOf[js.Any])
    }
  }
  
  trait Preserve extends StObject {
    
    var precision: Double
    
    var preserve: Boolean
    
    var warnWhenCannotResolve: Boolean
  }
  object Preserve {
    
    inline def apply(precision: Double, preserve: Boolean, warnWhenCannotResolve: Boolean): Preserve = {
      val __obj = js.Dynamic.literal(precision = precision.asInstanceOf[js.Any], preserve = preserve.asInstanceOf[js.Any], warnWhenCannotResolve = warnWhenCannotResolve.asInstanceOf[js.Any])
      __obj.asInstanceOf[Preserve]
    }
    
    extension [Self <: Preserve](x: Self) {
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setWarnWhenCannotResolve(value: Boolean): Self = StObject.set(x, "warnWhenCannotResolve", value.asInstanceOf[js.Any])
    }
  }
}
