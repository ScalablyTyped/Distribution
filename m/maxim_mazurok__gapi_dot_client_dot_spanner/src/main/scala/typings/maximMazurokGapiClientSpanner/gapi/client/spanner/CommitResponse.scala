package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitResponse extends StObject {
  
  /** The statistics about this Commit. Not returned by default. For more information, see CommitRequest.return_commit_stats. */
  var commitStats: js.UndefOr[CommitStats] = js.undefined
  
  /** The Cloud Spanner timestamp at which the transaction committed. */
  var commitTimestamp: js.UndefOr[String] = js.undefined
}
object CommitResponse {
  
  inline def apply(): CommitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommitResponse] (val x: Self) extends AnyVal {
    
    inline def setCommitStats(value: CommitStats): Self = StObject.set(x, "commitStats", value.asInstanceOf[js.Any])
    
    inline def setCommitStatsUndefined: Self = StObject.set(x, "commitStats", js.undefined)
    
    inline def setCommitTimestamp(value: String): Self = StObject.set(x, "commitTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCommitTimestampUndefined: Self = StObject.set(x, "commitTimestamp", js.undefined)
  }
}
