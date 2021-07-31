package typings.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleReq extends StObject {
  
  var module: String
  
  var req: js.UndefOr[js.Object] = js.undefined
}
object ModuleReq {
  
  @scala.inline
  def apply(module: String): ModuleReq = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleReq]
  }
  
  @scala.inline
  implicit class ModuleReqMutableBuilder[Self <: ModuleReq] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: js.Object): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
  }
}
