package typings.pinoStdSerializers

import typings.pinoStdSerializers.mod.SerializedRequest
import typings.pinoStdSerializers.mod.SerializedResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Req extends StObject {
    
    var req: SerializedRequest
  }
  object Req {
    
    inline def apply(req: SerializedRequest): Req = {
      val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
      __obj.asInstanceOf[Req]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Req] (val x: Self) extends AnyVal {
      
      inline def setReq(value: SerializedRequest): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    }
  }
  
  trait Res extends StObject {
    
    var res: SerializedResponse
  }
  object Res {
    
    inline def apply(res: SerializedResponse): Res = {
      val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any])
      __obj.asInstanceOf[Res]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Res] (val x: Self) extends AnyVal {
      
      inline def setRes(value: SerializedResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    }
  }
}
