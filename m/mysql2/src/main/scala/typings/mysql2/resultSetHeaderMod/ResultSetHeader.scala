package typings.mysql2.resultSetHeaderMod

import typings.mysql2.anon.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultSetHeader extends js.Object {
  
  var affectedRows: Double = js.native
  
  var constructor: `2` = js.native
  
  var fieldCount: Double = js.native
  
  var info: String = js.native
  
  var insertId: Double = js.native
  
  var serverStatus: Double = js.native
  
  var warningStatus: Double = js.native
}
object ResultSetHeader {
  
  @scala.inline
  def apply(
    affectedRows: Double,
    constructor: `2`,
    fieldCount: Double,
    info: String,
    insertId: Double,
    serverStatus: Double,
    warningStatus: Double
  ): ResultSetHeader = {
    val __obj = js.Dynamic.literal(affectedRows = affectedRows.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], fieldCount = fieldCount.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], insertId = insertId.asInstanceOf[js.Any], serverStatus = serverStatus.asInstanceOf[js.Any], warningStatus = warningStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSetHeader]
  }
  
  @scala.inline
  implicit class ResultSetHeaderOps[Self <: ResultSetHeader] (val x: Self) extends AnyVal {
    
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
    def setConstructor(value: `2`): Self = this.set("constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldCount(value: Double): Self = this.set("fieldCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertId(value: Double): Self = this.set("insertId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerStatus(value: Double): Self = this.set("serverStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningStatus(value: Double): Self = this.set("warningStatus", value.asInstanceOf[js.Any])
  }
}
