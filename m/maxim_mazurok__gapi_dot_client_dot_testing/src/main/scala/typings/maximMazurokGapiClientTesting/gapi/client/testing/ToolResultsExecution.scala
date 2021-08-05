package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolResultsExecution extends StObject {
  
  /** Output only. A tool results execution ID. */
  var executionId: js.UndefOr[String] = js.undefined
  
  /** Output only. A tool results history ID. */
  var historyId: js.UndefOr[String] = js.undefined
  
  /** Output only. The cloud project that owns the tool results execution. */
  var projectId: js.UndefOr[String] = js.undefined
}
object ToolResultsExecution {
  
  inline def apply(): ToolResultsExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolResultsExecution]
  }
  
  extension [Self <: ToolResultsExecution](x: Self) {
    
    inline def setExecutionId(value: String): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    inline def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    inline def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
