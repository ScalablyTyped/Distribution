package typings.msgpackr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AllowHalfOpen extends StObject {
    
    var allowHalfOpen: Boolean
    
    var emitClose: Boolean
    
    var highWaterMark: Double
  }
  object AllowHalfOpen {
    
    inline def apply(allowHalfOpen: Boolean, emitClose: Boolean, highWaterMark: Double): AllowHalfOpen = {
      val __obj = js.Dynamic.literal(allowHalfOpen = allowHalfOpen.asInstanceOf[js.Any], emitClose = emitClose.asInstanceOf[js.Any], highWaterMark = highWaterMark.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllowHalfOpen]
    }
    
    extension [Self <: AllowHalfOpen](x: Self) {
      
      inline def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
      
      inline def setEmitClose(value: Boolean): Self = StObject.set(x, "emitClose", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    }
  }
}
