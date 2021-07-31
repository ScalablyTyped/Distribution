package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the entity that is mentioned in comments.
  *
  * [Api set: ExcelApi 1.11]
  */
trait CommentMention extends StObject {
  
  /**
    *
    * The email address of the entity that is mentioned in comment.
    *
    * [Api set: ExcelApi 1.11]
    */
  var email: String
  
  /**
    *
    * The id of the entity. The id matches one of the ids in `CommentRichContent.richContent`.
    *
    * [Api set: ExcelApi 1.11]
    */
  var id: Double
  
  /**
    *
    * The name of the entity that is mentioned in comment.
    *
    * [Api set: ExcelApi 1.11]
    */
  var name: String
}
object CommentMention {
  
  @scala.inline
  def apply(email: String, id: Double, name: String): CommentMention = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentMention]
  }
  
  @scala.inline
  implicit class CommentMentionMutableBuilder[Self <: CommentMention] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
