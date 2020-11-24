package typings.maximMazurokGapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSessionsResponse extends js.Object {
  
  /** If includeDeleted is set to true in the request, and startTime and endTime are omitted, this will include sessions which were deleted since the last sync. */
  var deletedSession: js.UndefOr[js.Array[Session]] = js.native
  
  /** Flag to indicate server has more data to transfer. DO NOT USE THIS FIELD. It is never populated in responses from the server. */
  var hasMoreData: js.UndefOr[Boolean] = js.native
  
  /** The sync token which is used to sync further changes. This will only be provided if both startTime and endTime are omitted from the request. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Sessions with an end time that is between startTime and endTime of the request. */
  var session: js.UndefOr[js.Array[Session]] = js.native
}
object ListSessionsResponse {
  
  @scala.inline
  def apply(): ListSessionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSessionsResponse]
  }
  
  @scala.inline
  implicit class ListSessionsResponseOps[Self <: ListSessionsResponse] (val x: Self) extends AnyVal {
    
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
    def setDeletedSessionVarargs(value: Session*): Self = this.set("deletedSession", js.Array(value :_*))
    
    @scala.inline
    def setDeletedSession(value: js.Array[Session]): Self = this.set("deletedSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletedSession: Self = this.set("deletedSession", js.undefined)
    
    @scala.inline
    def setHasMoreData(value: Boolean): Self = this.set("hasMoreData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasMoreData: Self = this.set("hasMoreData", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setSessionVarargs(value: Session*): Self = this.set("session", js.Array(value :_*))
    
    @scala.inline
    def setSession(value: js.Array[Session]): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
  }
}
