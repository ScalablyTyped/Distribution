package typings.pgProtocol.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoticeOrError extends js.Object {
  
  var code: js.UndefOr[String] = js.native
  
  var column: js.UndefOr[String] = js.native
  
  var constraint: js.UndefOr[String] = js.native
  
  var dataType: js.UndefOr[String] = js.native
  
  var detail: js.UndefOr[String] = js.native
  
  var file: js.UndefOr[String] = js.native
  
  var hint: js.UndefOr[String] = js.native
  
  var internalPosition: js.UndefOr[String] = js.native
  
  var internalQuery: js.UndefOr[String] = js.native
  
  var line: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var routine: js.UndefOr[String] = js.native
  
  var schema: js.UndefOr[String] = js.native
  
  var severity: js.UndefOr[String] = js.native
  
  var table: js.UndefOr[String] = js.native
  
  var where: js.UndefOr[String] = js.native
}
object NoticeOrError {
  
  @scala.inline
  def apply(): NoticeOrError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoticeOrError]
  }
  
  @scala.inline
  implicit class NoticeOrErrorOps[Self <: NoticeOrError] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setColumn(value: String): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    
    @scala.inline
    def setConstraint(value: String): Self = this.set("constraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstraint: Self = this.set("constraint", js.undefined)
    
    @scala.inline
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    
    @scala.inline
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setHint(value: String): Self = this.set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    
    @scala.inline
    def setInternalPosition(value: String): Self = this.set("internalPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalPosition: Self = this.set("internalPosition", js.undefined)
    
    @scala.inline
    def setInternalQuery(value: String): Self = this.set("internalQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalQuery: Self = this.set("internalQuery", js.undefined)
    
    @scala.inline
    def setLine(value: String): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRoutine(value: String): Self = this.set("routine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutine: Self = this.set("routine", js.undefined)
    
    @scala.inline
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    
    @scala.inline
    def setTable(value: String): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    
    @scala.inline
    def setWhere(value: String): Self = this.set("where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
}
