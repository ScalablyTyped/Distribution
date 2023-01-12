package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the entity that is mentioned in comments.
  *
  * @remarks
  * [Api set: ExcelApi 1.11]
  */
trait CommentMention extends StObject {
  
  /**
    * The email address of the entity that is mentioned in a comment.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  var email: String
  
  /**
    * The ID of the entity. The ID matches one of the IDs in `CommentRichContent.richContent`.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  var id: Double
  
  /**
    * The name of the entity that is mentioned in a comment.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  var name: String
}
object CommentMention {
  
  inline def apply(email: String, id: Double, name: String): CommentMention = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentMention]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentMention] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
