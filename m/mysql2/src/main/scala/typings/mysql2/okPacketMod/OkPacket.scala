package typings.mysql2.okPacketMod

import typings.mysql2.anon.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OkPacket extends js.Object {
  
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
    def setConstructor(value: `1`): Self = this.set("constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldCount(value: Double): Self = this.set("fieldCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertId(value: Double): Self = this.set("insertId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcotol41(value: Boolean): Self = this.set("procotol41", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerStatus(value: Double): Self = this.set("serverStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningCount(value: Double): Self = this.set("warningCount", value.asInstanceOf[js.Any])
  }
}
