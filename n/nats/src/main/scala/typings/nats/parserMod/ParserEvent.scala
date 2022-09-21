package typings.nats.parserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParserEvent extends StObject {
  
  var data: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  var kind: Kind
  
  var msg: js.UndefOr[MsgArg] = js.undefined
}
object ParserEvent {
  
  inline def apply(kind: Kind): ParserEvent = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserEvent]
  }
  
  extension [Self <: ParserEvent](x: Self) {
    
    inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setKind(value: Kind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMsg(value: MsgArg): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    inline def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
  }
}
