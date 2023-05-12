package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoteFromString extends StObject {
  
  var note: FromString
}
object NoteFromString {
  
  inline def apply(note: FromString): NoteFromString = {
    val __obj = js.Dynamic.literal(note = note.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoteFromString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NoteFromString] (val x: Self) extends AnyVal {
    
    inline def setNote(value: FromString): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
  }
}
