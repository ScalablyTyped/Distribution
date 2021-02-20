package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTopicsResponse extends StObject {
  
  /** A token that can be sent as `page_token` to retrieve the next page of results. If this field is omitted, there are no more results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of topic in the requested parent. The order of the topics is unspecified. */
  var topics: js.UndefOr[js.Array[Topic]] = js.native
}
object ListTopicsResponse {
  
  @scala.inline
  def apply(): ListTopicsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTopicsResponse]
  }
  
  @scala.inline
  implicit class ListTopicsResponseMutableBuilder[Self <: ListTopicsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTopics(value: js.Array[Topic]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
    
    @scala.inline
    def setTopicsVarargs(value: Topic*): Self = StObject.set(x, "topics", js.Array(value :_*))
  }
}
