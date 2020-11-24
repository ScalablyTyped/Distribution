package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteRequest extends js.Object {
  
  /** Labels associated with this write request. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientFirestore.maximMazurokGapiClientFirestoreStrings.WriteRequest with TopLevel[js.Any]
  ] = js.native
  
  /** The ID of the write stream to resume. This may only be set in the first message. When left empty, a new write stream will be created. */
  var streamId: js.UndefOr[String] = js.native
  
  /**
    * A stream token that was previously sent by the server. The client should set this field to the token from the most recent WriteResponse it has received. This acknowledges that the
    * client has received responses up to this token. After sending this token, earlier tokens may not be used anymore. The server may close the stream if there are too many
    * unacknowledged responses. Leave this field unset when creating a new stream. To resume a stream at a specific point, set this field and the `stream_id` field. Leave this field unset
    * when creating a new stream.
    */
  var streamToken: js.UndefOr[String] = js.native
  
  /**
    * The writes to apply. Always executed atomically and in order. This must be empty on the first request. This may be empty on the last request. This must not be empty on all other
    * requests.
    */
  var writes: js.UndefOr[js.Array[Write]] = js.native
}
object WriteRequest {
  
  @scala.inline
  def apply(): WriteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteRequest]
  }
  
  @scala.inline
  implicit class WriteRequestOps[Self <: WriteRequest] (val x: Self) extends AnyVal {
    
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
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientFirestore.maximMazurokGapiClientFirestoreStrings.WriteRequest with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setStreamId(value: String): Self = this.set("streamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamId: Self = this.set("streamId", js.undefined)
    
    @scala.inline
    def setStreamToken(value: String): Self = this.set("streamToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamToken: Self = this.set("streamToken", js.undefined)
    
    @scala.inline
    def setWritesVarargs(value: Write*): Self = this.set("writes", js.Array(value :_*))
    
    @scala.inline
    def setWrites(value: js.Array[Write]): Self = this.set("writes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrites: Self = this.set("writes", js.undefined)
  }
}
