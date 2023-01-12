package typings.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Req extends StObject {
  
  var req: js.UndefOr[js.Object] = js.undefined
}
object Req {
  
  inline def apply(): Req = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Req]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Req] (val x: Self) extends AnyVal {
    
    inline def setReq(value: js.Object): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    inline def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
  }
}
