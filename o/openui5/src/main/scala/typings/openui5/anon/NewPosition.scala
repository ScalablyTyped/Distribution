package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewPosition extends StObject {
  
  /**
    * The number of the new position.
    */
  var newPosition: js.UndefOr[int] = js.undefined
  
  /**
    * The number of the old position.
    */
  var oldPosition: js.UndefOr[int] = js.undefined
}
object NewPosition {
  
  inline def apply(): NewPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewPosition]
  }
  
  extension [Self <: NewPosition](x: Self) {
    
    inline def setNewPosition(value: int): Self = StObject.set(x, "newPosition", value.asInstanceOf[js.Any])
    
    inline def setNewPositionUndefined: Self = StObject.set(x, "newPosition", js.undefined)
    
    inline def setOldPosition(value: int): Self = StObject.set(x, "oldPosition", value.asInstanceOf[js.Any])
    
    inline def setOldPositionUndefined: Self = StObject.set(x, "oldPosition", js.undefined)
  }
}
