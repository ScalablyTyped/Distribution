package typings.nodeRedRuntime.anon

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Origin extends StObject {
  
  var origin: String
  
  var req: Request_[ParamsDictionary, js.Any, js.Any, Query]
  
  var secure: Boolean
}
object Origin {
  
  @scala.inline
  def apply(origin: String, req: Request_[ParamsDictionary, js.Any, js.Any, Query], secure: Boolean): Origin = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Origin]
  }
  
  @scala.inline
  implicit class OriginMutableBuilder[Self <: Origin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: Request_[ParamsDictionary, js.Any, js.Any, Query]): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
  }
}
