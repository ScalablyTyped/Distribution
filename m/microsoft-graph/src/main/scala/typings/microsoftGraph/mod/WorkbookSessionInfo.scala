package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookSessionInfo extends js.Object {
  
  // Id of the workbook session.
  var id: js.UndefOr[NullableOption[String]] = js.native
  
  // true for persistent session. false for non-persistent session (view mode)
  var persistChanges: js.UndefOr[NullableOption[Boolean]] = js.native
}
object WorkbookSessionInfo {
  
  @scala.inline
  def apply(): WorkbookSessionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookSessionInfo]
  }
  
  @scala.inline
  implicit class WorkbookSessionInfoOps[Self <: WorkbookSessionInfo] (val x: Self) extends AnyVal {
    
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
    def setId(value: NullableOption[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    
    @scala.inline
    def setPersistChanges(value: NullableOption[Boolean]): Self = this.set("persistChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistChanges: Self = this.set("persistChanges", js.undefined)
    
    @scala.inline
    def setPersistChangesNull: Self = this.set("persistChanges", null)
  }
}
