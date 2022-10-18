package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MovedSectionId extends StObject {
  
  /**
    * ID of the moved section
    */
  var movedSectionId: js.UndefOr[String] = js.undefined
  
  /**
    * New index of the moved section
    */
  var newIndex: js.UndefOr[int] = js.undefined
}
object MovedSectionId {
  
  inline def apply(): MovedSectionId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MovedSectionId]
  }
  
  extension [Self <: MovedSectionId](x: Self) {
    
    inline def setMovedSectionId(value: String): Self = StObject.set(x, "movedSectionId", value.asInstanceOf[js.Any])
    
    inline def setMovedSectionIdUndefined: Self = StObject.set(x, "movedSectionId", js.undefined)
    
    inline def setNewIndex(value: int): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
    
    inline def setNewIndexUndefined: Self = StObject.set(x, "newIndex", js.undefined)
  }
}
