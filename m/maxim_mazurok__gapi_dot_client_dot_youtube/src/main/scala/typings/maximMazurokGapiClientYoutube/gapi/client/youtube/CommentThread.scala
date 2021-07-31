package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentThread extends StObject {
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** The ID that YouTube uses to uniquely identify the comment thread. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#commentThread". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The replies object contains a limited number of replies (if any) to the top level comment found in the snippet. */
  var replies: js.UndefOr[CommentThreadReplies] = js.undefined
  
  /** The snippet object contains basic details about the comment thread and also the top level comment. */
  var snippet: js.UndefOr[CommentThreadSnippet] = js.undefined
}
object CommentThread {
  
  @scala.inline
  def apply(): CommentThread = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentThread]
  }
  
  @scala.inline
  implicit class CommentThreadMutableBuilder[Self <: CommentThread] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setReplies(value: CommentThreadReplies): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    @scala.inline
    def setSnippet(value: CommentThreadSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
