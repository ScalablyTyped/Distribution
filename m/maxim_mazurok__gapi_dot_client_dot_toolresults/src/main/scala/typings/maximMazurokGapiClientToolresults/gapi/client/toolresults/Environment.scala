package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Environment extends js.Object {
  
  /** Output only. The time when the Environment status was set to complete. This value will be set automatically when state transitions to COMPLETE. */
  var completionTime: js.UndefOr[Timestamp] = js.native
  
  /** Output only. The time when the Environment was created. */
  var creationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * Dimension values describing the environment. Dimension values always consist of "Model", "Version", "Locale", and "Orientation". - In response: always set - In create request:
    * always set - In update request: never set
    */
  var dimensionValue: js.UndefOr[js.Array[EnvironmentDimensionValueEntry]] = js.native
  
  /** A short human-readable name to display in the UI. Maximum of 100 characters. For example: Nexus 5, API 27. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. An Environment id. */
  var environmentId: js.UndefOr[String] = js.native
  
  /** Merged result of the environment. */
  var environmentResult: js.UndefOr[MergedResult] = js.native
  
  /** Output only. An Execution id. */
  var executionId: js.UndefOr[String] = js.native
  
  /** Output only. A History id. */
  var historyId: js.UndefOr[String] = js.native
  
  /** Output only. A Project id. */
  var projectId: js.UndefOr[String] = js.native
  
  /** The location where output files are stored in the user bucket. */
  var resultsStorage: js.UndefOr[ResultsStorage] = js.native
  
  /** Output only. Summaries of shards. Only one shard will present unless sharding feature is enabled in TestExecutionService. */
  var shardSummaries: js.UndefOr[js.Array[ShardSummary]] = js.native
}
object Environment {
  
  @scala.inline
  def apply(): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Environment]
  }
  
  @scala.inline
  implicit class EnvironmentOps[Self <: Environment] (val x: Self) extends AnyVal {
    
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
    def setCompletionTime(value: Timestamp): Self = this.set("completionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletionTime: Self = this.set("completionTime", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setDimensionValueVarargs(value: EnvironmentDimensionValueEntry*): Self = this.set("dimensionValue", js.Array(value :_*))
    
    @scala.inline
    def setDimensionValue(value: js.Array[EnvironmentDimensionValueEntry]): Self = this.set("dimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionValue: Self = this.set("dimensionValue", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEnvironmentId(value: String): Self = this.set("environmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentId: Self = this.set("environmentId", js.undefined)
    
    @scala.inline
    def setEnvironmentResult(value: MergedResult): Self = this.set("environmentResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentResult: Self = this.set("environmentResult", js.undefined)
    
    @scala.inline
    def setExecutionId(value: String): Self = this.set("executionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionId: Self = this.set("executionId", js.undefined)
    
    @scala.inline
    def setHistoryId(value: String): Self = this.set("historyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistoryId: Self = this.set("historyId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setResultsStorage(value: ResultsStorage): Self = this.set("resultsStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultsStorage: Self = this.set("resultsStorage", js.undefined)
    
    @scala.inline
    def setShardSummariesVarargs(value: ShardSummary*): Self = this.set("shardSummaries", js.Array(value :_*))
    
    @scala.inline
    def setShardSummaries(value: js.Array[ShardSummary]): Self = this.set("shardSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShardSummaries: Self = this.set("shardSummaries", js.undefined)
  }
}
