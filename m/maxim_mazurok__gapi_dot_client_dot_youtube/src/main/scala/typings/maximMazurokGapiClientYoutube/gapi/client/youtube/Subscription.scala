package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscription extends StObject {
  
  /** The contentDetails object contains basic statistics about the subscription. */
  var contentDetails: js.UndefOr[SubscriptionContentDetails] = js.undefined
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** The ID that YouTube uses to uniquely identify the subscription. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#subscription". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The snippet object contains basic details about the subscription, including its title and the channel that the user subscribed to. */
  var snippet: js.UndefOr[SubscriptionSnippet] = js.undefined
  
  /** The subscriberSnippet object contains basic details about the subscriber. */
  var subscriberSnippet: js.UndefOr[SubscriptionSubscriberSnippet] = js.undefined
}
object Subscription {
  
  inline def apply(): Subscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subscription]
  }
  
  extension [Self <: Subscription](x: Self) {
    
    inline def setContentDetails(value: SubscriptionContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    inline def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSnippet(value: SubscriptionSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    inline def setSubscriberSnippet(value: SubscriptionSubscriberSnippet): Self = StObject.set(x, "subscriberSnippet", value.asInstanceOf[js.Any])
    
    inline def setSubscriberSnippetUndefined: Self = StObject.set(x, "subscriberSnippet", js.undefined)
  }
}
