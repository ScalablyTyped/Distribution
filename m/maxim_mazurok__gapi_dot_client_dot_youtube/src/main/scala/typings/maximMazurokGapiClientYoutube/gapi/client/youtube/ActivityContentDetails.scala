package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityContentDetails extends StObject {
  
  /** The bulletin object contains details about a channel bulletin post. This object is only present if the snippet.type is bulletin. */
  var bulletin: js.UndefOr[ActivityContentDetailsBulletin] = js.undefined
  
  /** The channelItem object contains details about a resource which was added to a channel. This property is only present if the snippet.type is channelItem. */
  var channelItem: js.UndefOr[ActivityContentDetailsChannelItem] = js.undefined
  
  /** The comment object contains information about a resource that received a comment. This property is only present if the snippet.type is comment. */
  var comment: js.UndefOr[ActivityContentDetailsComment] = js.undefined
  
  /** The favorite object contains information about a video that was marked as a favorite video. This property is only present if the snippet.type is favorite. */
  var favorite: js.UndefOr[ActivityContentDetailsFavorite] = js.undefined
  
  /** The like object contains information about a resource that received a positive (like) rating. This property is only present if the snippet.type is like. */
  var like: js.UndefOr[ActivityContentDetailsLike] = js.undefined
  
  /** The playlistItem object contains information about a new playlist item. This property is only present if the snippet.type is playlistItem. */
  var playlistItem: js.UndefOr[ActivityContentDetailsPlaylistItem] = js.undefined
  
  /** The promotedItem object contains details about a resource which is being promoted. This property is only present if the snippet.type is promotedItem. */
  var promotedItem: js.UndefOr[ActivityContentDetailsPromotedItem] = js.undefined
  
  /** The recommendation object contains information about a recommended resource. This property is only present if the snippet.type is recommendation. */
  var recommendation: js.UndefOr[ActivityContentDetailsRecommendation] = js.undefined
  
  /** The social object contains details about a social network post. This property is only present if the snippet.type is social. */
  var social: js.UndefOr[ActivityContentDetailsSocial] = js.undefined
  
  /** The subscription object contains information about a channel that a user subscribed to. This property is only present if the snippet.type is subscription. */
  var subscription: js.UndefOr[ActivityContentDetailsSubscription] = js.undefined
  
  /** The upload object contains information about the uploaded video. This property is only present if the snippet.type is upload. */
  var upload: js.UndefOr[ActivityContentDetailsUpload] = js.undefined
}
object ActivityContentDetails {
  
  inline def apply(): ActivityContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityContentDetails]
  }
  
  extension [Self <: ActivityContentDetails](x: Self) {
    
    inline def setBulletin(value: ActivityContentDetailsBulletin): Self = StObject.set(x, "bulletin", value.asInstanceOf[js.Any])
    
    inline def setBulletinUndefined: Self = StObject.set(x, "bulletin", js.undefined)
    
    inline def setChannelItem(value: ActivityContentDetailsChannelItem): Self = StObject.set(x, "channelItem", value.asInstanceOf[js.Any])
    
    inline def setChannelItemUndefined: Self = StObject.set(x, "channelItem", js.undefined)
    
    inline def setComment(value: ActivityContentDetailsComment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setFavorite(value: ActivityContentDetailsFavorite): Self = StObject.set(x, "favorite", value.asInstanceOf[js.Any])
    
    inline def setFavoriteUndefined: Self = StObject.set(x, "favorite", js.undefined)
    
    inline def setLike(value: ActivityContentDetailsLike): Self = StObject.set(x, "like", value.asInstanceOf[js.Any])
    
    inline def setLikeUndefined: Self = StObject.set(x, "like", js.undefined)
    
    inline def setPlaylistItem(value: ActivityContentDetailsPlaylistItem): Self = StObject.set(x, "playlistItem", value.asInstanceOf[js.Any])
    
    inline def setPlaylistItemUndefined: Self = StObject.set(x, "playlistItem", js.undefined)
    
    inline def setPromotedItem(value: ActivityContentDetailsPromotedItem): Self = StObject.set(x, "promotedItem", value.asInstanceOf[js.Any])
    
    inline def setPromotedItemUndefined: Self = StObject.set(x, "promotedItem", js.undefined)
    
    inline def setRecommendation(value: ActivityContentDetailsRecommendation): Self = StObject.set(x, "recommendation", value.asInstanceOf[js.Any])
    
    inline def setRecommendationUndefined: Self = StObject.set(x, "recommendation", js.undefined)
    
    inline def setSocial(value: ActivityContentDetailsSocial): Self = StObject.set(x, "social", value.asInstanceOf[js.Any])
    
    inline def setSocialUndefined: Self = StObject.set(x, "social", js.undefined)
    
    inline def setSubscription(value: ActivityContentDetailsSubscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    inline def setUpload(value: ActivityContentDetailsUpload): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
  }
}
