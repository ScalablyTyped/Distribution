package typings.mysql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OkPacket extends StObject {
  
  /**
    * The number of affected rows from an insert, update, or delete statement.
    */
  var affectedRows: Double = js.native
  
  /**
    * The number of changed rows from an update statement. "changedRows" differs from "affectedRows" in that it does not count updated rows whose values were not changed.
    */
  var changedRows: Double = js.native
  
  var fieldCount: Double = js.native
  
  /**
    * The insert id after inserting a row into a table with an auto increment primary key.
    */
  var insertId: Double = js.native
  
  /**
    * The server result message from an insert, update, or delete statement.
    */
  var message: String = js.native
  
  var protocol41: Boolean = js.native
  
  var serverStatus: js.UndefOr[Double] = js.native
  
  var warningCount: js.UndefOr[Double] = js.native
}
object OkPacket {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class OkPacketMutableBuilder[Self <: OkPacket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAffectedRows(value: Double): Self = StObject.set(x, "affectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedRows(value: Double): Self = StObject.set(x, "changedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldCount(value: Double): Self = StObject.set(x, "fieldCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertId(value: Double): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol41(value: Boolean): Self = StObject.set(x, "protocol41", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerStatus(value: Double): Self = StObject.set(x, "serverStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerStatusUndefined: Self = StObject.set(x, "serverStatus", js.undefined)
    
    @scala.inline
    def setWarningCount(value: Double): Self = StObject.set(x, "warningCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningCountUndefined: Self = StObject.set(x, "warningCount", js.undefined)
  }
}
