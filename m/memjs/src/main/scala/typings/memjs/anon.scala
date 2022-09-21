package typings.memjs

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Expires extends StObject {
    
    var expires: js.UndefOr[Double] = js.undefined
  }
  object Expires {
    
    inline def apply(): Expires = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Expires]
    }
    
    extension [Self <: Expires](x: Self) {
      
      inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    }
  }
  
  trait Flags extends StObject {
    
    var flags: Buffer
    
    var value: Buffer
  }
  object Flags {
    
    inline def apply(flags: Buffer, value: Buffer): Flags = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Flags]
    }
    
    extension [Self <: Flags](x: Self) {
      
      inline def setFlags(value: Buffer): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Initial extends StObject {
    
    var expires: js.UndefOr[Double] = js.undefined
    
    var initial: js.UndefOr[Double] = js.undefined
  }
  object Initial {
    
    inline def apply(): Initial = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Initial]
    }
    
    extension [Self <: Initial](x: Self) {
      
      inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    }
  }
  
  trait Log extends StObject {
    
    def log(args: Any*): Unit
  }
  object Log {
    
    inline def apply(log: /* repeated */ Any => Unit): Log = {
      val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
      __obj.asInstanceOf[Log]
    }
    
    extension [Self <: Log](x: Self) {
      
      inline def setLog(value: /* repeated */ Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    }
  }
  
  trait Success extends StObject {
    
    var success: Boolean
    
    var value: js.UndefOr[Double | Null] = js.undefined
  }
  object Success {
    
    inline def apply(success: Boolean): Success = {
      val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[Success]
    }
    
    extension [Self <: Success](x: Self) {
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
