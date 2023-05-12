package typings.mysql2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsMysqlLibProtocolPacketsParamsErrorPacketParamsMod {
  
  trait ErrorPacketParams extends StObject {
    
    var code: js.UndefOr[Double | String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
  }
  object ErrorPacketParams {
    
    inline def apply(): ErrorPacketParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorPacketParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorPacketParams] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double | String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
