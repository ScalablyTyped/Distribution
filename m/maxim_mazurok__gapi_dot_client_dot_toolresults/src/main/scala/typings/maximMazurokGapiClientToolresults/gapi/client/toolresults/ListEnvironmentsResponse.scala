package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEnvironmentsResponse extends StObject {
  
  /** Environments. Always set. */
  var environments: js.UndefOr[js.Array[Environment]] = js.undefined
  
  /** A Execution id Always set. */
  var executionId: js.UndefOr[String] = js.undefined
  
  /** A History id. Always set. */
  var historyId: js.UndefOr[String] = js.undefined
  
  /** A continuation token to resume the query at the next item. Will only be set if there are more Environments to fetch. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** A Project id. Always set. */
  var projectId: js.UndefOr[String] = js.undefined
}
object ListEnvironmentsResponse {
  
  @scala.inline
  def apply(): ListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnvironmentsResponse]
  }
  
  @scala.inline
  implicit class ListEnvironmentsResponseMutableBuilder[Self <: ListEnvironmentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironments(value: js.Array[Environment]): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentsUndefined: Self = StObject.set(x, "environments", js.undefined)
    
    @scala.inline
    def setEnvironmentsVarargs(value: Environment*): Self = StObject.set(x, "environments", js.Array(value :_*))
    
    @scala.inline
    def setExecutionId(value: String): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    @scala.inline
    def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
