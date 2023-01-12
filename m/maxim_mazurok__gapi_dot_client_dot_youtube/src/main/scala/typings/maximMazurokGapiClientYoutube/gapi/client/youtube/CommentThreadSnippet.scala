package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentThreadSnippet extends StObject {
  
  /** Whether the current viewer of the thread can reply to it. This is viewer specific - other viewers may see a different value for this field. */
  var canReply: js.UndefOr[Boolean] = js.undefined
  
  /** The YouTube channel the comments in the thread refer to or the channel with the video the comments refer to. If video_id isn't set the comments refer to the channel itself. */
  var channelId: js.UndefOr[String] = js.undefined
  
  /** Whether the thread (and therefore all its comments) is visible to all YouTube users. */
  var isPublic: js.UndefOr[Boolean] = js.undefined
  
  /** The top level comment of this thread. */
  var topLevelComment: js.UndefOr[Comment] = js.undefined
  
  /** The total number of replies (not including the top level comment). */
  var totalReplyCount: js.UndefOr[Double] = js.undefined
  
  /** The ID of the video the comments refer to, if any. No video_id implies a channel discussion comment. */
  var videoId: js.UndefOr[String] = js.undefined
}
object CommentThreadSnippet {
  
  inline def apply(): CommentThreadSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentThreadSnippet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentThreadSnippet] (val x: Self) extends AnyVal {
    
    inline def setCanReply(value: Boolean): Self = StObject.set(x, "canReply", value.asInstanceOf[js.Any])
    
    inline def setCanReplyUndefined: Self = StObject.set(x, "canReply", js.undefined)
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setIsPublic(value: Boolean): Self = StObject.set(x, "isPublic", value.asInstanceOf[js.Any])
    
    inline def setIsPublicUndefined: Self = StObject.set(x, "isPublic", js.undefined)
    
    inline def setTopLevelComment(value: Comment): Self = StObject.set(x, "topLevelComment", value.asInstanceOf[js.Any])
    
    inline def setTopLevelCommentUndefined: Self = StObject.set(x, "topLevelComment", js.undefined)
    
    inline def setTotalReplyCount(value: Double): Self = StObject.set(x, "totalReplyCount", value.asInstanceOf[js.Any])
    
    inline def setTotalReplyCountUndefined: Self = StObject.set(x, "totalReplyCount", js.undefined)
    
    inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
  }
}
