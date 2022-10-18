package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `73` extends StObject {
  
  /**
    * @description The project card's note
    * @example Update all gems
    */
  var note: String | Null
}
object `73` {
  
  inline def apply(): `73` = {
    val __obj = js.Dynamic.literal(note = null)
    __obj.asInstanceOf[`73`]
  }
  
  extension [Self <: `73`](x: Self) {
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteNull: Self = StObject.set(x, "note", null)
  }
}
