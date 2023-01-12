package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Note extends StObject {
  
  /**
    * @description The project card's note
    * @example Update all gems
    */
  var note: String | Null
}
object Note {
  
  inline def apply(): Note = {
    val __obj = js.Dynamic.literal(note = null)
    __obj.asInstanceOf[Note]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Note] (val x: Self) extends AnyVal {
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteNull: Self = StObject.set(x, "note", null)
  }
}
