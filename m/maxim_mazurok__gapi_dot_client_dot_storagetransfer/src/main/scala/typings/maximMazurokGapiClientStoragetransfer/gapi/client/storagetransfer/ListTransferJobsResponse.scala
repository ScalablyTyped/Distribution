package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTransferJobsResponse extends StObject {
  
  /** The list next page token. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** A list of transfer jobs. */
  var transferJobs: js.UndefOr[js.Array[TransferJob]] = js.native
}
object ListTransferJobsResponse {
  
  @scala.inline
  def apply(): ListTransferJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTransferJobsResponse]
  }
  
  @scala.inline
  implicit class ListTransferJobsResponseMutableBuilder[Self <: ListTransferJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTransferJobs(value: js.Array[TransferJob]): Self = StObject.set(x, "transferJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferJobsUndefined: Self = StObject.set(x, "transferJobs", js.undefined)
    
    @scala.inline
    def setTransferJobsVarargs(value: TransferJob*): Self = StObject.set(x, "transferJobs", js.Array(value :_*))
  }
}
