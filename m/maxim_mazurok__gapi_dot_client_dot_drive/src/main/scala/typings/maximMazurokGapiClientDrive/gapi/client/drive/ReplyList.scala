package typings.maximMazurokGapiClientDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplyList extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "drive#replyList". */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The page token for the next page of replies. This will be absent if the end of the replies list has been reached. If the token is rejected for any reason, it should be discarded,
    * and pagination should be restarted from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of replies. If nextPageToken is populated, then this list may be incomplete and an additional page of results should be fetched. */
  var replies: js.UndefOr[js.Array[Reply]] = js.native
}
object ReplyList {
  
  @scala.inline
  def apply(): ReplyList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplyList]
  }
  
  @scala.inline
  implicit class ReplyListMutableBuilder[Self <: ReplyList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setReplies(value: js.Array[Reply]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    @scala.inline
    def setRepliesVarargs(value: Reply*): Self = StObject.set(x, "replies", js.Array(value :_*))
  }
}
