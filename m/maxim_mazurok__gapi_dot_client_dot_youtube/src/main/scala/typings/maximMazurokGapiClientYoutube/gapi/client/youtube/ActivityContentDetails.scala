package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityContentDetails extends js.Object {
  
  /** The bulletin object contains details about a channel bulletin post. This object is only present if the snippet.type is bulletin. */
  var bulletin: js.UndefOr[ActivityContentDetailsBulletin] = js.native
  
  /** The channelItem object contains details about a resource which was added to a channel. This property is only present if the snippet.type is channelItem. */
  var channelItem: js.UndefOr[ActivityContentDetailsChannelItem] = js.native
  
  /** The comment object contains information about a resource that received a comment. This property is only present if the snippet.type is comment. */
  var comment: js.UndefOr[ActivityContentDetailsComment] = js.native
  
  /** The favorite object contains information about a video that was marked as a favorite video. This property is only present if the snippet.type is favorite. */
  var favorite: js.UndefOr[ActivityContentDetailsFavorite] = js.native
  
  /** The like object contains information about a resource that received a positive (like) rating. This property is only present if the snippet.type is like. */
  var like: js.UndefOr[ActivityContentDetailsLike] = js.native
  
  /** The playlistItem object contains information about a new playlist item. This property is only present if the snippet.type is playlistItem. */
  var playlistItem: js.UndefOr[ActivityContentDetailsPlaylistItem] = js.native
  
  /** The promotedItem object contains details about a resource which is being promoted. This property is only present if the snippet.type is promotedItem. */
  var promotedItem: js.UndefOr[ActivityContentDetailsPromotedItem] = js.native
  
  /** The recommendation object contains information about a recommended resource. This property is only present if the snippet.type is recommendation. */
  var recommendation: js.UndefOr[ActivityContentDetailsRecommendation] = js.native
  
  /** The social object contains details about a social network post. This property is only present if the snippet.type is social. */
  var social: js.UndefOr[ActivityContentDetailsSocial] = js.native
  
  /** The subscription object contains information about a channel that a user subscribed to. This property is only present if the snippet.type is subscription. */
  var subscription: js.UndefOr[ActivityContentDetailsSubscription] = js.native
  
  /** The upload object contains information about the uploaded video. This property is only present if the snippet.type is upload. */
  var upload: js.UndefOr[ActivityContentDetailsUpload] = js.native
}
object ActivityContentDetails {
  
  @scala.inline
  def apply(): ActivityContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityContentDetails]
  }
  
  @scala.inline
  implicit class ActivityContentDetailsOps[Self <: ActivityContentDetails] (val x: Self) extends AnyVal {
    
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
    def setBulletin(value: ActivityContentDetailsBulletin): Self = this.set("bulletin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulletin: Self = this.set("bulletin", js.undefined)
    
    @scala.inline
    def setChannelItem(value: ActivityContentDetailsChannelItem): Self = this.set("channelItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelItem: Self = this.set("channelItem", js.undefined)
    
    @scala.inline
    def setComment(value: ActivityContentDetailsComment): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setFavorite(value: ActivityContentDetailsFavorite): Self = this.set("favorite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFavorite: Self = this.set("favorite", js.undefined)
    
    @scala.inline
    def setLike(value: ActivityContentDetailsLike): Self = this.set("like", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLike: Self = this.set("like", js.undefined)
    
    @scala.inline
    def setPlaylistItem(value: ActivityContentDetailsPlaylistItem): Self = this.set("playlistItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaylistItem: Self = this.set("playlistItem", js.undefined)
    
    @scala.inline
    def setPromotedItem(value: ActivityContentDetailsPromotedItem): Self = this.set("promotedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotedItem: Self = this.set("promotedItem", js.undefined)
    
    @scala.inline
    def setRecommendation(value: ActivityContentDetailsRecommendation): Self = this.set("recommendation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommendation: Self = this.set("recommendation", js.undefined)
    
    @scala.inline
    def setSocial(value: ActivityContentDetailsSocial): Self = this.set("social", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocial: Self = this.set("social", js.undefined)
    
    @scala.inline
    def setSubscription(value: ActivityContentDetailsSubscription): Self = this.set("subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscription: Self = this.set("subscription", js.undefined)
    
    @scala.inline
    def setUpload(value: ActivityContentDetailsUpload): Self = this.set("upload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpload: Self = this.set("upload", js.undefined)
  }
}
