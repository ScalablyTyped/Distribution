package typings.officeJsPreview.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A structure for the ID and reply IDs of this comment.
  *
  * @remarks
  * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
  * @beta
  */
trait CommentDetail extends StObject {
  
  /**
    * Represents the ID of this comment.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  var id: String
  
  /**
    * Represents the IDs of the replies to this comment.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  var replyIds: js.Array[String]
}
object CommentDetail {
  
  inline def apply(id: String, replyIds: js.Array[String]): CommentDetail = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], replyIds = replyIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentDetail]
  }
  
  extension [Self <: CommentDetail](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setReplyIds(value: js.Array[String]): Self = StObject.set(x, "replyIds", value.asInstanceOf[js.Any])
    
    inline def setReplyIdsVarargs(value: String*): Self = StObject.set(x, "replyIds", js.Array(value*))
  }
}
