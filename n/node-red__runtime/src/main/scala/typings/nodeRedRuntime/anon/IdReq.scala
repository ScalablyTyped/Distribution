package typings.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdReq extends StObject {
  
  var id: String
  
  var req: js.UndefOr[js.Object] = js.undefined
}
object IdReq {
  
  @scala.inline
  def apply(id: String): IdReq = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdReq]
  }
  
  @scala.inline
  implicit class IdReqMutableBuilder[Self <: IdReq] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: js.Object): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
  }
}
