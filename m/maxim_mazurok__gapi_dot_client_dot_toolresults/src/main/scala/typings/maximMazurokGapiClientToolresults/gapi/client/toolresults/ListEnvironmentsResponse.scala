package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEnvironmentsResponse extends js.Object {
  
  /** Environments. Always set. */
  var environments: js.UndefOr[js.Array[Environment]] = js.native
  
  /** A Execution id Always set. */
  var executionId: js.UndefOr[String] = js.native
  
  /** A History id. Always set. */
  var historyId: js.UndefOr[String] = js.native
  
  /** A continuation token to resume the query at the next item. Will only be set if there are more Environments to fetch. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** A Project id. Always set. */
  var projectId: js.UndefOr[String] = js.native
}
object ListEnvironmentsResponse {
  
  @scala.inline
  def apply(): ListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnvironmentsResponse]
  }
  
  @scala.inline
  implicit class ListEnvironmentsResponseOps[Self <: ListEnvironmentsResponse] (val x: Self) extends AnyVal {
    
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
    def setEnvironmentsVarargs(value: Environment*): Self = this.set("environments", js.Array(value :_*))
    
    @scala.inline
    def setEnvironments(value: js.Array[Environment]): Self = this.set("environments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironments: Self = this.set("environments", js.undefined)
    
    @scala.inline
    def setExecutionId(value: String): Self = this.set("executionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionId: Self = this.set("executionId", js.undefined)
    
    @scala.inline
    def setHistoryId(value: String): Self = this.set("historyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistoryId: Self = this.set("historyId", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
  }
}
