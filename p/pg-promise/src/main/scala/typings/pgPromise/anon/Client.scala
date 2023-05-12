package typings.pgPromise.anon

import typings.pgPromise.typescriptPgSubsetMod.IClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Client[C /* <: IClient */] extends StObject {
  
  var client: C
  
  var dc: Any
  
  var useCount: Double
}
object Client {
  
  inline def apply[C /* <: IClient */](client: C, dc: Any, useCount: Double): Client[C] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], dc = dc.asInstanceOf[js.Any], useCount = useCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client[C]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Client[?], C /* <: IClient */] (val x: Self & Client[C]) extends AnyVal {
    
    inline def setClient(value: C): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setDc(value: Any): Self = StObject.set(x, "dc", value.asInstanceOf[js.Any])
    
    inline def setUseCount(value: Double): Self = StObject.set(x, "useCount", value.asInstanceOf[js.Any])
  }
}
