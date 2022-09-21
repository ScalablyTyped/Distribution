package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShardSummary extends StObject {
  
  /**
    * Summaries of the steps belonging to the shard. With flaky_test_attempts enabled from TestExecutionService, more than one run (Step) can present. And the runs will be sorted by
    * multistep_number.
    */
  var runs: js.UndefOr[js.Array[scala.Any]] = js.undefined
  
  /** Merged result of the shard. */
  var shardResult: js.UndefOr[MergedResult] = js.undefined
}
object ShardSummary {
  
  inline def apply(): ShardSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShardSummary]
  }
  
  extension [Self <: ShardSummary](x: Self) {
    
    inline def setRuns(value: js.Array[scala.Any]): Self = StObject.set(x, "runs", value.asInstanceOf[js.Any])
    
    inline def setRunsUndefined: Self = StObject.set(x, "runs", js.undefined)
    
    inline def setRunsVarargs(value: scala.Any*): Self = StObject.set(x, "runs", js.Array(value*))
    
    inline def setShardResult(value: MergedResult): Self = StObject.set(x, "shardResult", value.asInstanceOf[js.Any])
    
    inline def setShardResultUndefined: Self = StObject.set(x, "shardResult", js.undefined)
  }
}
