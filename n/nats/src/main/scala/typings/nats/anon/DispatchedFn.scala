package typings.nats.anon

import typings.nats.queuedIteratorMod.IngestionFilterFn
import typings.nats.queuedIteratorMod.IngestionFilterFnResult
import typings.nats.queuedIteratorMod.ProtocolFilterFn
import typings.nats.typesMod.Msg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DispatchedFn extends StObject {
  
  var dispatchedFn: js.UndefOr[typings.nats.queuedIteratorMod.DispatchedFn[Msg]] = js.undefined
  
  var ingestionFilterFn: js.UndefOr[IngestionFilterFn[Msg]] = js.undefined
  
  var protocolFilterFn: js.UndefOr[ProtocolFilterFn[Msg]] = js.undefined
}
object DispatchedFn {
  
  inline def apply(): DispatchedFn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DispatchedFn]
  }
  
  extension [Self <: DispatchedFn](x: Self) {
    
    inline def setDispatchedFn(value: /* data */ Msg | Null => Unit): Self = StObject.set(x, "dispatchedFn", js.Any.fromFunction1(value))
    
    inline def setDispatchedFnUndefined: Self = StObject.set(x, "dispatchedFn", js.undefined)
    
    inline def setIngestionFilterFn(value: (/* data */ Msg | Null, /* src */ js.UndefOr[Any]) => IngestionFilterFnResult): Self = StObject.set(x, "ingestionFilterFn", js.Any.fromFunction2(value))
    
    inline def setIngestionFilterFnUndefined: Self = StObject.set(x, "ingestionFilterFn", js.undefined)
    
    inline def setProtocolFilterFn(value: /* data */ Msg | Null => Boolean): Self = StObject.set(x, "protocolFilterFn", js.Any.fromFunction1(value))
    
    inline def setProtocolFilterFnUndefined: Self = StObject.set(x, "protocolFilterFn", js.undefined)
  }
}
