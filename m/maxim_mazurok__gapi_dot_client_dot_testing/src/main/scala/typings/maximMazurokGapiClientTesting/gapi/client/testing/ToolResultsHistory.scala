package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolResultsHistory extends StObject {
  
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
  implicit class ToolResultsHistoryMutableBuilder[Self <: ToolResultsHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
