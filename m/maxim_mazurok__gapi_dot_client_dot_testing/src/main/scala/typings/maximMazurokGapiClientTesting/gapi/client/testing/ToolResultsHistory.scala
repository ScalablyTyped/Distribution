package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolResultsHistory extends js.Object {
  
  /** Required. A tool results history ID. */
  var historyId: js.UndefOr[String] = js.native
  
  /** Required. The cloud project that owns the tool results history. */
  var projectId: js.UndefOr[String] = js.native
}
object ToolResultsHistory {
  
  @scala.inline
  def apply(): ToolResultsHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolResultsHistory]
  }
  
  @scala.inline
  implicit class ToolResultsHistoryOps[Self <: ToolResultsHistory] (val x: Self) extends AnyVal {
    
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
    def setHistoryId(value: String): Self = this.set("historyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistoryId: Self = this.set("historyId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
  }
}
