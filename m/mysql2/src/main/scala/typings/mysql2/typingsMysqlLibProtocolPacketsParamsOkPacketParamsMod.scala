package typings.mysql2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsMysqlLibProtocolPacketsParamsOkPacketParamsMod {
  
  trait OkPacketParams extends StObject {
    
    var affectedRows: js.UndefOr[Double] = js.undefined
    
    var insertId: js.UndefOr[Double] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var serverStatus: js.UndefOr[Double] = js.undefined
    
    var warningCount: js.UndefOr[Double] = js.undefined
  }
  object OkPacketParams {
    
    inline def apply(): OkPacketParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OkPacketParams]
    }
    
    extension [Self <: OkPacketParams](x: Self) {
      
      inline def setAffectedRows(value: Double): Self = StObject.set(x, "affectedRows", value.asInstanceOf[js.Any])
      
      inline def setAffectedRowsUndefined: Self = StObject.set(x, "affectedRows", js.undefined)
      
      inline def setInsertId(value: Double): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
      
      inline def setInsertIdUndefined: Self = StObject.set(x, "insertId", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setServerStatus(value: Double): Self = StObject.set(x, "serverStatus", value.asInstanceOf[js.Any])
      
      inline def setServerStatusUndefined: Self = StObject.set(x, "serverStatus", js.undefined)
      
      inline def setWarningCount(value: Double): Self = StObject.set(x, "warningCount", value.asInstanceOf[js.Any])
      
      inline def setWarningCountUndefined: Self = StObject.set(x, "warningCount", js.undefined)
    }
  }
}
