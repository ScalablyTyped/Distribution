package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentSnippet extends StObject {
  
  var authorChannelId: js.UndefOr[CommentSnippetAuthorChannelId] = js.undefined
  
  /** Link to the author's YouTube channel, if any. */
  var authorChannelUrl: js.UndefOr[String] = js.undefined
  
  /** The name of the user who posted the comment. */
  var authorDisplayName: js.UndefOr[String] = js.undefined
  
  /** The URL for the avatar of the user who posted the comment. */
  var authorProfileImageUrl: js.UndefOr[String] = js.undefined
  
  /** Whether the current viewer can rate this comment. */
  var canRate: js.UndefOr[Boolean] = js.undefined
  
  /** The id of the corresponding YouTube channel. In case of a channel comment this is the channel the comment refers to. In case of a video comment it's the video's channel. */
  var channelId: js.UndefOr[String] = js.undefined
  
  /** The total number of likes this comment has received. */
  var likeCount: js.UndefOr[Double] = js.undefined
  
  /** The comment's moderation status. Will not be set if the comments were requested through the id filter. */
  var moderationStatus: js.UndefOr[String] = js.undefined
  
  /** The unique id of the parent comment, only set for replies. */
  var parentId: js.UndefOr[String] = js.undefined
  
  /** The date and time when the comment was orignally published. The value is specified in ISO 8601 format. */
  var publishedAt: js.UndefOr[String] = js.undefined
  
  /**
    * The comment's text. The format is either plain text or HTML dependent on what has been requested. Even the plain text representation may differ from the text originally posted in
    * that it may replace video links with video titles etc.
    */
  var textDisplay: js.UndefOr[String] = js.undefined
  
  /**
    * The comment's original raw text as initially posted or last updated. The original text will only be returned if it is accessible to the viewer, which is only guaranteed if the
    * viewer is the comment's author.
    */
  var textOriginal: js.UndefOr[String] = js.undefined
  
  /** The date and time when was last updated . The value is specified in ISO 8601 format. */
  var updatedAt: js.UndefOr[String] = js.undefined
  
  /** The ID of the video the comment refers to, if any. */
  var videoId: js.UndefOr[String] = js.undefined
  
  /** The rating the viewer has given to this comment. For the time being this will never return RATE_TYPE_DISLIKE and instead return RATE_TYPE_NONE. This may change in the future. */
  var viewerRating: js.UndefOr[String] = js.undefined
}
object CommentSnippet {
  
  @scala.inline
  def apply(): CommentSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentSnippet]
  }
  
  @scala.inline
  implicit class CommentSnippetMutableBuilder[Self <: CommentSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorChannelId(value: CommentSnippetAuthorChannelId): Self = StObject.set(x, "authorChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorChannelIdUndefined: Self = StObject.set(x, "authorChannelId", js.undefined)
    
    @scala.inline
    def setAuthorChannelUrl(value: String): Self = StObject.set(x, "authorChannelUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorChannelUrlUndefined: Self = StObject.set(x, "authorChannelUrl", js.undefined)
    
    @scala.inline
    def setAuthorDisplayName(value: String): Self = StObject.set(x, "authorDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorDisplayNameUndefined: Self = StObject.set(x, "authorDisplayName", js.undefined)
    
    @scala.inline
    def setAuthorProfileImageUrl(value: String): Self = StObject.set(x, "authorProfileImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorProfileImageUrlUndefined: Self = StObject.set(x, "authorProfileImageUrl", js.undefined)
    
    @scala.inline
    def setCanRate(value: Boolean): Self = StObject.set(x, "canRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanRateUndefined: Self = StObject.set(x, "canRate", js.undefined)
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    @scala.inline
    def setLikeCount(value: Double): Self = StObject.set(x, "likeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLikeCountUndefined: Self = StObject.set(x, "likeCount", js.undefined)
    
    @scala.inline
    def setModerationStatus(value: String): Self = StObject.set(x, "moderationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModerationStatusUndefined: Self = StObject.set(x, "moderationStatus", js.undefined)
    
    @scala.inline
    def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    @scala.inline
    def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
    @scala.inline
    def setTextDisplay(value: String): Self = StObject.set(x, "textDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDisplayUndefined: Self = StObject.set(x, "textDisplay", js.undefined)
    
    @scala.inline
    def setTextOriginal(value: String): Self = StObject.set(x, "textOriginal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextOriginalUndefined: Self = StObject.set(x, "textOriginal", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
    
    @scala.inline
    def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
    
    @scala.inline
    def setViewerRating(value: String): Self = StObject.set(x, "viewerRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewerRatingUndefined: Self = StObject.set(x, "viewerRating", js.undefined)
  }
}
