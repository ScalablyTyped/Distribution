package typings.pgPromise.mod

import typings.pgPromise.pgSubsetMod.IClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILostContext[C /* <: IClient */] extends StObject {
  
  var client: C
  
  var cn: String
  
  var dc: Any
  
  var start: js.Date
}
object ILostContext {
  
  inline def apply[C /* <: IClient */](client: C, cn: String, dc: Any, start: js.Date): ILostContext[C] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], cn = cn.asInstanceOf[js.Any], dc = dc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILostContext[C]]
  }
  
  extension [Self <: ILostContext[?], C /* <: IClient */](x: Self & ILostContext[C]) {
    
    inline def setClient(value: C): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setCn(value: String): Self = StObject.set(x, "cn", value.asInstanceOf[js.Any])
    
    inline def setDc(value: Any): Self = StObject.set(x, "dc", value.asInstanceOf[js.Any])
    
    inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
