package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShardSummary extends js.Object {
  
  /**
    * Summaries of the steps belonging to the shard. With flaky_test_attempts enabled from TestExecutionService, more than one run (Step) can present. And the runs will be sorted by
    * multistep_number.
    */
  var runs: js.UndefOr[js.Array[_]] = js.native
  
  /** Merged result of the shard. */
  var shardResult: js.UndefOr[MergedResult] = js.native
}
object ShardSummary {
  
  @scala.inline
  def apply(): ShardSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShardSummary]
  }
  
  @scala.inline
  implicit class ShardSummaryOps[Self <: ShardSummary] (val x: Self) extends AnyVal {
    
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
    def setRunsVarargs(value: js.Any*): Self = this.set("runs", js.Array(value :_*))
    
    @scala.inline
    def setRuns(value: js.Array[_]): Self = this.set("runs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuns: Self = this.set("runs", js.undefined)
    
    @scala.inline
    def setShardResult(value: MergedResult): Self = this.set("shardResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShardResult: Self = this.set("shardResult", js.undefined)
  }
}
