package typings.pinoStdSerializers

import typings.pinoStdSerializers.mod.SerializedRequest
import typings.pinoStdSerializers.mod.SerializedResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Req extends StObject {
    
    var req: SerializedRequest = js.native
  }
  object Req {
    
    @scala.inline
    def apply(req: SerializedRequest): Req = {
      val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
      __obj.asInstanceOf[Req]
    }
    
    @scala.inline
    implicit class ReqMutableBuilder[Self <: Req] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReq(value: SerializedRequest): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Res extends StObject {
    
    var res: SerializedResponse = js.native
  }
  object Res {
    
    @scala.inline
    def apply(res: SerializedResponse): Res = {
      val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any])
      __obj.asInstanceOf[Res]
    }
    
    @scala.inline
    implicit class ResMutableBuilder[Self <: Res] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRes(value: SerializedResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    }
  }
}
