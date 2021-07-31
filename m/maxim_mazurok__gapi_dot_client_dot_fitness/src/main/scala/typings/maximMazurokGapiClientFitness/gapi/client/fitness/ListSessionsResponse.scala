package typings.maximMazurokGapiClientFitness.gapi.client.fitness

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSessionsResponse extends StObject {
  
  /** If includeDeleted is set to true in the request, and startTime and endTime are omitted, this will include sessions which were deleted since the last sync. */
  var deletedSession: js.UndefOr[js.Array[Session]] = js.undefined
  
  /** Flag to indicate server has more data to transfer. DO NOT USE THIS FIELD. It is never populated in responses from the server. */
  var hasMoreData: js.UndefOr[Boolean] = js.undefined
  
  /** The sync token which is used to sync further changes. This will only be provided if both startTime and endTime are omitted from the request. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Sessions with an end time that is between startTime and endTime of the request. */
  var session: js.UndefOr[js.Array[Session]] = js.undefined
}
object ListSessionsResponse {
  
  @scala.inline
  def apply(): ListSessionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSessionsResponse]
  }
  
  @scala.inline
  implicit class ListSessionsResponseMutableBuilder[Self <: ListSessionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletedSession(value: js.Array[Session]): Self = StObject.set(x, "deletedSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedSessionUndefined: Self = StObject.set(x, "deletedSession", js.undefined)
    
    @scala.inline
    def setDeletedSessionVarargs(value: Session*): Self = StObject.set(x, "deletedSession", js.Array(value :_*))
    
    @scala.inline
    def setHasMoreData(value: Boolean): Self = StObject.set(x, "hasMoreData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasMoreDataUndefined: Self = StObject.set(x, "hasMoreData", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSession(value: js.Array[Session]): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    @scala.inline
    def setSessionVarargs(value: Session*): Self = StObject.set(x, "session", js.Array(value :_*))
  }
}
