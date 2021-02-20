package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTopicSubscriptionsResponse extends StObject {
  
  /** A token that can be sent as `page_token` to retrieve the next page of results. If this field is omitted, there are no more results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The names of subscriptions attached to the topic. The order of the subscriptions is unspecified. */
  var subscriptions: js.UndefOr[js.Array[String]] = js.native
}
object ListTopicSubscriptionsResponse {
  
  @scala.inline
  def apply(): ListTopicSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTopicSubscriptionsResponse]
  }
  
  @scala.inline
  implicit class ListTopicSubscriptionsResponseMutableBuilder[Self <: ListTopicSubscriptionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSubscriptions(value: js.Array[String]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
    
    @scala.inline
    def setSubscriptionsVarargs(value: String*): Self = StObject.set(x, "subscriptions", js.Array(value :_*))
  }
}
