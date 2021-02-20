package typings.memjs

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Expires extends StObject {
    
    var expires: js.UndefOr[Double] = js.native
  }
  object Expires {
    
    @scala.inline
    def apply(): Expires = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Expires]
    }
    
    @scala.inline
    implicit class ExpiresMutableBuilder[Self <: Expires] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    }
  }
  
  @js.native
  trait Flags extends StObject {
    
    var flags: Buffer = js.native
    
    var value: Buffer = js.native
  }
  object Flags {
    
    @scala.inline
    def apply(flags: Buffer, value: Buffer): Flags = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Flags]
    }
    
    @scala.inline
    implicit class FlagsMutableBuilder[Self <: Flags] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlags(value: Buffer): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Initial extends StObject {
    
    var expires: js.UndefOr[Double] = js.native
    
    var initial: js.UndefOr[Double] = js.native
  }
  object Initial {
    
    @scala.inline
    def apply(): Initial = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Initial]
    }
    
    @scala.inline
    implicit class InitialMutableBuilder[Self <: Initial] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      @scala.inline
      def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    }
  }
  
  @js.native
  trait Log extends StObject {
    
    def log(args: js.Any*): Unit = js.native
  }
  object Log {
    
    @scala.inline
    def apply(log: /* repeated */ js.Any => Unit): Log = {
      val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
      __obj.asInstanceOf[Log]
    }
    
    @scala.inline
    implicit class LogMutableBuilder[Self <: Log] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLog(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Success extends StObject {
    
    var success: Boolean = js.native
    
    var value: js.UndefOr[Double | Null] = js.native
  }
  object Success {
    
    @scala.inline
    def apply(success: Boolean): Success = {
      val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[Success]
    }
    
    @scala.inline
    implicit class SuccessMutableBuilder[Self <: Success] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
