package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertComment extends StObject {
  
  // The comment text.
  var comment: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The person or app name that submitted the comment.
  var createdByDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The time when the comment was submitted.
  var createdDateTime: js.UndefOr[String] = js.undefined
}
object AlertComment {
  
  inline def apply(): AlertComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertComment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlertComment] (val x: Self) extends AnyVal {
    
    inline def setComment(value: NullableOption[String]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentNull: Self = StObject.set(x, "comment", null)
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCreatedByDisplayName(value: NullableOption[String]): Self = StObject.set(x, "createdByDisplayName", value.asInstanceOf[js.Any])
    
    inline def setCreatedByDisplayNameNull: Self = StObject.set(x, "createdByDisplayName", null)
    
    inline def setCreatedByDisplayNameUndefined: Self = StObject.set(x, "createdByDisplayName", js.undefined)
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
  }
}
