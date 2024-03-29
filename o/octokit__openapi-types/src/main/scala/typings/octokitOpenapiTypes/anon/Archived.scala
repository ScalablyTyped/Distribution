package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Archived extends StObject {
  
  /**
    * @description Whether or not the card is archived
    * @example false
    */
  var archived: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description The project card's note
    * @example Update all gems
    */
  var note: js.UndefOr[String | Null] = js.undefined
}
object Archived {
  
  inline def apply(): Archived = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Archived]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Archived] (val x: Self) extends AnyVal {
    
    inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    inline def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteNull: Self = StObject.set(x, "note", null)
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
  }
}
