package typings.mysql2

import typings.mysql2.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object okPacketMod {
  
  @js.native
  trait OkPacket extends StObject {
    
    var affectedRows: Double = js.native
    
    var changedRows: Double = js.native
    
    var constructor: `1` = js.native
    
    var fieldCount: Double = js.native
    
    var insertId: Double = js.native
    
    var message: String = js.native
    
    var procotol41: Boolean = js.native
    
    var serverStatus: Double = js.native
    
    var warningCount: Double = js.native
  }
  object OkPacket {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class OkPacketMutableBuilder[Self <: OkPacket] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAffectedRows(value: Double): Self = StObject.set(x, "affectedRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangedRows(value: Double): Self = StObject.set(x, "changedRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstructor(value: `1`): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldCount(value: Double): Self = StObject.set(x, "fieldCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertId(value: Double): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcotol41(value: Boolean): Self = StObject.set(x, "procotol41", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerStatus(value: Double): Self = StObject.set(x, "serverStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningCount(value: Double): Self = StObject.set(x, "warningCount", value.asInstanceOf[js.Any])
    }
  }
}
