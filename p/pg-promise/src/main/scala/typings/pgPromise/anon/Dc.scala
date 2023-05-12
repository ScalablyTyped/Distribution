package typings.pgPromise.anon

import typings.pgPromise.typescriptPgSubsetMod.IClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dc[C /* <: IClient */] extends StObject {
  
  var client: C
  
  var dc: Any
}
object Dc {
  
  inline def apply[C /* <: IClient */](client: C, dc: Any): Dc[C] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], dc = dc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dc[C]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dc[?], C /* <: IClient */] (val x: Self & Dc[C]) extends AnyVal {
    
    inline def setClient(value: C): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setDc(value: Any): Self = StObject.set(x, "dc", value.asInstanceOf[js.Any])
  }
}
