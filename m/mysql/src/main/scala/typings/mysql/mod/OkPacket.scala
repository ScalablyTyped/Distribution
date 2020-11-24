package typings.mysql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OkPacket extends js.Object {
  
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
  implicit class OkPacketOps[Self <: OkPacket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAffectedRows(value: Double): Self = this.set("affectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedRows(value: Double): Self = this.set("changedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldCount(value: Double): Self = this.set("fieldCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertId(value: Double): Self = this.set("insertId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol41(value: Boolean): Self = this.set("protocol41", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerStatus(value: Double): Self = this.set("serverStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerStatus: Self = this.set("serverStatus", js.undefined)
    
    @scala.inline
    def setWarningCount(value: Double): Self = this.set("warningCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarningCount: Self = this.set("warningCount", js.undefined)
  }
}
