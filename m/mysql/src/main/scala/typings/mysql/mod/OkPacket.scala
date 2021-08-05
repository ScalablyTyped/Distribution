package typings.mysql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OkPacket extends StObject {
  
  /**
    * The number of affected rows from an insert, update, or delete statement.
    */
  var affectedRows: Double
  
  /**
    * The number of changed rows from an update statement. "changedRows" differs from "affectedRows" in that it does not count updated rows whose values were not changed.
    */
  var changedRows: Double
  
  var fieldCount: Double
  
  /**
    * The insert id after inserting a row into a table with an auto increment primary key.
    */
  var insertId: Double
  
  /**
    * The server result message from an insert, update, or delete statement.
    */
  var message: String
  
  var protocol41: Boolean
  
  var serverStatus: js.UndefOr[Double] = js.undefined
  
  var warningCount: js.UndefOr[Double] = js.undefined
}
object OkPacket {
  
  inline def apply(
    affectedRows: Double,
    changedRows: Double,
    fieldCount: Double,
    insertId: Double,
    message: String,
    protocol41: Boolean
  ): OkPacket = {
    val __obj = js.Dynamic.literal(affectedRows = affectedRows.asInstanceOf[js.Any], changedRows = changedRows.asInstanceOf[js.Any], fieldCount = fieldCount.asInstanceOf[js.Any], insertId = insertId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], protocol41 = protocol41.asInstanceOf[js.Any])
    __obj.asInstanceOf[OkPacket]
  }
  
  extension [Self <: OkPacket](x: Self) {
    
    inline def setAffectedRows(value: Double): Self = StObject.set(x, "affectedRows", value.asInstanceOf[js.Any])
    
    inline def setChangedRows(value: Double): Self = StObject.set(x, "changedRows", value.asInstanceOf[js.Any])
    
    inline def setFieldCount(value: Double): Self = StObject.set(x, "fieldCount", value.asInstanceOf[js.Any])
    
    inline def setInsertId(value: Double): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setProtocol41(value: Boolean): Self = StObject.set(x, "protocol41", value.asInstanceOf[js.Any])
    
    inline def setServerStatus(value: Double): Self = StObject.set(x, "serverStatus", value.asInstanceOf[js.Any])
    
    inline def setServerStatusUndefined: Self = StObject.set(x, "serverStatus", js.undefined)
    
    inline def setWarningCount(value: Double): Self = StObject.set(x, "warningCount", value.asInstanceOf[js.Any])
    
    inline def setWarningCountUndefined: Self = StObject.set(x, "warningCount", js.undefined)
  }
}
