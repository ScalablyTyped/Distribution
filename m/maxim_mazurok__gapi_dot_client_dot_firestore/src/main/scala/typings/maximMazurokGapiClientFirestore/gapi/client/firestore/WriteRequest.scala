package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteRequest extends StObject {
  
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
  implicit class WriteRequestMutableBuilder[Self <: WriteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientFirestore.maximMazurokGapiClientFirestoreStrings.WriteRequest with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamIdUndefined: Self = StObject.set(x, "streamId", js.undefined)
    
    @scala.inline
    def setStreamToken(value: String): Self = StObject.set(x, "streamToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamTokenUndefined: Self = StObject.set(x, "streamToken", js.undefined)
    
    @scala.inline
    def setWrites(value: js.Array[Write]): Self = StObject.set(x, "writes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritesUndefined: Self = StObject.set(x, "writes", js.undefined)
    
    @scala.inline
    def setWritesVarargs(value: Write*): Self = StObject.set(x, "writes", js.Array(value :_*))
  }
}
