package typings.pTimeout

import typings.pTimeout.pTimeoutBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClearTimeout extends StObject {
    
    var clearTimeout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.clearTimeout */ Any
    
    var setTimeout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.setTimeout */ Any
  }
  object ClearTimeout {
    
    inline def apply(
      clearTimeout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.clearTimeout */ Any,
      setTimeout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.setTimeout */ Any
    ): ClearTimeout = {
      val __obj = js.Dynamic.literal(clearTimeout = clearTimeout.asInstanceOf[js.Any], setTimeout = setTimeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClearTimeout]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClearTimeout] (val x: Self) extends AnyVal {
      
      inline def setClearTimeout(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.clearTimeout */ Any
      ): Self = StObject.set(x, "clearTimeout", value.asInstanceOf[js.Any])
      
      inline def setSetTimeout(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.setTimeout */ Any
      ): Self = StObject.set(x, "setTimeout", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message extends StObject {
    
    var message: `false`
  }
  object Message {
    
    inline def apply(): Message = {
      val __obj = js.Dynamic.literal(message = false)
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: `false`): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
