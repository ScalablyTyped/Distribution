package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteResponse extends StObject {
  
  /** The time at which the commit occurred. Any read with an equal or greater `read_time` is guaranteed to see the effects of the write. */
  var commitTime: js.UndefOr[String] = js.native
  
  /** The ID of the stream. Only set on the first message, when a new stream was created. */
  var streamId: js.UndefOr[String] = js.native
  
  /** A token that represents the position of this response in the stream. This can be used by a client to resume the stream at this point. This field is always set. */
  var streamToken: js.UndefOr[String] = js.native
  
  /** The result of applying the writes. This i-th write result corresponds to the i-th write in the request. */
  var writeResults: js.UndefOr[js.Array[WriteResult]] = js.native
}
object WriteResponse {
  
  @scala.inline
  def apply(): WriteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteResponse]
  }
  
  @scala.inline
  implicit class WriteResponseMutableBuilder[Self <: WriteResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitTime(value: String): Self = StObject.set(x, "commitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitTimeUndefined: Self = StObject.set(x, "commitTime", js.undefined)
    
    @scala.inline
    def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamIdUndefined: Self = StObject.set(x, "streamId", js.undefined)
    
    @scala.inline
    def setStreamToken(value: String): Self = StObject.set(x, "streamToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamTokenUndefined: Self = StObject.set(x, "streamToken", js.undefined)
    
    @scala.inline
    def setWriteResults(value: js.Array[WriteResult]): Self = StObject.set(x, "writeResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteResultsUndefined: Self = StObject.set(x, "writeResults", js.undefined)
    
    @scala.inline
    def setWriteResultsVarargs(value: WriteResult*): Self = StObject.set(x, "writeResults", js.Array(value :_*))
  }
}
