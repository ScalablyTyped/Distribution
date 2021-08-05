package typings.mysql2

import typings.mysql2.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object okPacketMod {
  
  trait OkPacket extends StObject {
    
    var affectedRows: Double
    
    var changedRows: Double
    
    var constructor: `1`
    
    var fieldCount: Double
    
    var insertId: Double
    
    var message: String
    
    var procotol41: Boolean
    
    var serverStatus: Double
    
    var warningCount: Double
  }
  object OkPacket {
    
    inline def apply(
      affectedRows: Double,
      changedRows: Double,
      constructor: `1`,
      fieldCount: Double,
      insertId: Double,
      message: String,
      procotol41: Boolean,
      serverStatus: Double,
      warningCount: Double
    ): OkPacket = {
      val __obj = js.Dynamic.literal(affectedRows = affectedRows.asInstanceOf[js.Any], changedRows = changedRows.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], fieldCount = fieldCount.asInstanceOf[js.Any], insertId = insertId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], procotol41 = procotol41.asInstanceOf[js.Any], serverStatus = serverStatus.asInstanceOf[js.Any], warningCount = warningCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[OkPacket]
    }
    
    extension [Self <: OkPacket](x: Self) {
      
      inline def setAffectedRows(value: Double): Self = StObject.set(x, "affectedRows", value.asInstanceOf[js.Any])
      
      inline def setChangedRows(value: Double): Self = StObject.set(x, "changedRows", value.asInstanceOf[js.Any])
      
      inline def setConstructor(value: `1`): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
      
      inline def setFieldCount(value: Double): Self = StObject.set(x, "fieldCount", value.asInstanceOf[js.Any])
      
      inline def setInsertId(value: Double): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setProcotol41(value: Boolean): Self = StObject.set(x, "procotol41", value.asInstanceOf[js.Any])
      
      inline def setServerStatus(value: Double): Self = StObject.set(x, "serverStatus", value.asInstanceOf[js.Any])
      
      inline def setWarningCount(value: Double): Self = StObject.set(x, "warningCount", value.asInstanceOf[js.Any])
    }
  }
}
