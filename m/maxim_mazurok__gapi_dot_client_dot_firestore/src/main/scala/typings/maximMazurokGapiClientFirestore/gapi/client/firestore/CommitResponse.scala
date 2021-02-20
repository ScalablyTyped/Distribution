package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommitResponse extends StObject {
  
  /** The time at which the commit occurred. Any read with an equal or greater `read_time` is guaranteed to see the effects of the commit. */
  var commitTime: js.UndefOr[String] = js.native
  
  /** The result of applying the writes. This i-th write result corresponds to the i-th write in the request. */
  var writeResults: js.UndefOr[js.Array[WriteResult]] = js.native
}
object CommitResponse {
  
  @scala.inline
  def apply(): CommitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitResponse]
  }
  
  @scala.inline
  implicit class CommitResponseMutableBuilder[Self <: CommitResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitTime(value: String): Self = StObject.set(x, "commitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitTimeUndefined: Self = StObject.set(x, "commitTime", js.undefined)
    
    @scala.inline
    def setWriteResults(value: js.Array[WriteResult]): Self = StObject.set(x, "writeResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteResultsUndefined: Self = StObject.set(x, "writeResults", js.undefined)
    
    @scala.inline
    def setWriteResultsVarargs(value: WriteResult*): Self = StObject.set(x, "writeResults", js.Array(value :_*))
  }
}
