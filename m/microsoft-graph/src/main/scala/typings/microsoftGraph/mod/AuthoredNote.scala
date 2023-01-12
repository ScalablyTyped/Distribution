package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthoredNote
  extends StObject
     with Entity {
  
  // Identity information about the note's author.
  var author: js.UndefOr[NullableOption[Identity]] = js.undefined
  
  // The content of the note.
  var content: js.UndefOr[NullableOption[ItemBody]] = js.undefined
  
  /**
    * The date and time when the entity was created. The Timestamp type represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object AuthoredNote {
  
  inline def apply(): AuthoredNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthoredNote]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthoredNote] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: NullableOption[Identity]): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorNull: Self = StObject.set(x, "author", null)
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setContent(value: NullableOption[ItemBody]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
  }
}
