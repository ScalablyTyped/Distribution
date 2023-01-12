package typings.nextgenEvents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ack extends StObject {
    
    var ack: Boolean
    
    var emit: Boolean
    
    var listen: Boolean
  }
  object Ack {
    
    inline def apply(ack: Boolean, emit: Boolean, listen: Boolean): Ack = {
      val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], emit = emit.asInstanceOf[js.Any], listen = listen.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ack]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ack] (val x: Self) extends AnyVal {
      
      inline def setAck(value: Boolean): Self = StObject.set(x, "ack", value.asInstanceOf[js.Any])
      
      inline def setEmit(value: Boolean): Self = StObject.set(x, "emit", value.asInstanceOf[js.Any])
      
      inline def setListen(value: Boolean): Self = StObject.set(x, "listen", value.asInstanceOf[js.Any])
    }
  }
  
  trait Async extends StObject {
    
    var async: Any
    
    var context: js.UndefOr[String] = js.undefined
    
    var eventObject: Any
    
    var fn: Any
    
    var id: js.UndefOr[Any] = js.undefined
    
    var nice: js.UndefOr[Double] = js.undefined
    
    var once: Any
  }
  object Async {
    
    inline def apply(async: Any, eventObject: Any, fn: Any, once: Any): Async = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], eventObject = eventObject.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], once = once.asInstanceOf[js.Any])
      __obj.asInstanceOf[Async]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Async] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: Any): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setEventObject(value: Any): Self = StObject.set(x, "eventObject", value.asInstanceOf[js.Any])
      
      inline def setFn(value: Any): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setNice(value: Double): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
      
      inline def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
      
      inline def setOnce(value: Any): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    }
  }
}
