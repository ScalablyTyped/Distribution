package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a collection of {@link Word.CommentReply} objects. Represents all comment replies in one comment thread.
  *
  * @remarks
  * [Api set: WordApi 1.4]
  */
trait CommentReplyCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the email of the comment reply's author.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var authorEmail: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the name of the comment reply's author.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var authorName: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the comment reply's content. The string is plain text.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var content: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the commentReply's content range.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var contentRange: js.UndefOr[CommentContentRangeLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the creation date of the comment reply.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var creationDate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the ID of the comment reply.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the parent comment of this reply.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var parentComment: js.UndefOr[CommentLoadOptions] = js.undefined
}
object CommentReplyCollectionLoadOptions {
  
  inline def apply(): CommentReplyCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentReplyCollectionLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentReplyCollectionLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setAuthorEmail(value: Boolean): Self = StObject.set(x, "authorEmail", value.asInstanceOf[js.Any])
    
    inline def setAuthorEmailUndefined: Self = StObject.set(x, "authorEmail", js.undefined)
    
    inline def setAuthorName(value: Boolean): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
    
    inline def setAuthorNameUndefined: Self = StObject.set(x, "authorName", js.undefined)
    
    inline def setContent(value: Boolean): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentRange(value: CommentContentRangeLoadOptions): Self = StObject.set(x, "contentRange", value.asInstanceOf[js.Any])
    
    inline def setContentRangeUndefined: Self = StObject.set(x, "contentRange", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setCreationDate(value: Boolean): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setParentComment(value: CommentLoadOptions): Self = StObject.set(x, "parentComment", value.asInstanceOf[js.Any])
    
    inline def setParentCommentUndefined: Self = StObject.set(x, "parentComment", js.undefined)
  }
}
