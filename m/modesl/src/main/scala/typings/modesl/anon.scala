package typings.modesl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait HIGH extends StObject {
    
    var HIGH: String
    
    var LOW: String
    
    var NORMAL: String
  }
  object HIGH {
    
    inline def apply(HIGH: String, LOW: String, NORMAL: String): HIGH = {
      val __obj = js.Dynamic.literal(HIGH = HIGH.asInstanceOf[js.Any], LOW = LOW.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any])
      __obj.asInstanceOf[HIGH]
    }
    
    extension [Self <: HIGH](x: Self) {
      
      inline def setHIGH(value: String): Self = StObject.set(x, "HIGH", value.asInstanceOf[js.Any])
      
      inline def setLOW(value: String): Self = StObject.set(x, "LOW", value.asInstanceOf[js.Any])
      
      inline def setNORMAL(value: String): Self = StObject.set(x, "NORMAL", value.asInstanceOf[js.Any])
    }
  }
}
