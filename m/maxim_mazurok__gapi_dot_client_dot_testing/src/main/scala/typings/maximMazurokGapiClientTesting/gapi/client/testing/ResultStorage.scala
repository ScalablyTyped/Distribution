package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultStorage extends StObject {
  
  /** Required. */
  var googleCloudStorage: js.UndefOr[GoogleCloudStorage] = js.native
  
  /** Output only. URL to the results in the Firebase Web Console. */
  var resultsUrl: js.UndefOr[String] = js.native
  
  /** Output only. The tool results execution that results are written to. */
  var toolResultsExecution: js.UndefOr[ToolResultsExecution] = js.native
  
  /** The tool results history that contains the tool results execution that results are written to. If not provided, the service will choose an appropriate value. */
  var toolResultsHistory: js.UndefOr[ToolResultsHistory] = js.native
}
object ResultStorage {
  
  @scala.inline
  def apply(): ResultStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultStorage]
  }
  
  @scala.inline
  implicit class ResultStorageMutableBuilder[Self <: ResultStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGoogleCloudStorage(value: GoogleCloudStorage): Self = StObject.set(x, "googleCloudStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleCloudStorageUndefined: Self = StObject.set(x, "googleCloudStorage", js.undefined)
    
    @scala.inline
    def setResultsUrl(value: String): Self = StObject.set(x, "resultsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUrlUndefined: Self = StObject.set(x, "resultsUrl", js.undefined)
    
    @scala.inline
    def setToolResultsExecution(value: ToolResultsExecution): Self = StObject.set(x, "toolResultsExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolResultsExecutionUndefined: Self = StObject.set(x, "toolResultsExecution", js.undefined)
    
    @scala.inline
    def setToolResultsHistory(value: ToolResultsHistory): Self = StObject.set(x, "toolResultsHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolResultsHistoryUndefined: Self = StObject.set(x, "toolResultsHistory", js.undefined)
  }
}
