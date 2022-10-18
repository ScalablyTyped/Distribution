package typings.openui5.anon

import typings.openui5.int
import typings.openui5.sapUiTableColumnMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewPos extends StObject {
  
  /**
    * moved column.
    */
  var column: js.UndefOr[default] = js.undefined
  
  /**
    * new position of the column.
    */
  var newPos: js.UndefOr[int] = js.undefined
}
object NewPos {
  
  inline def apply(): NewPos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewPos]
  }
  
  extension [Self <: NewPos](x: Self) {
    
    inline def setColumn(value: default): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setNewPos(value: int): Self = StObject.set(x, "newPos", value.asInstanceOf[js.Any])
    
    inline def setNewPosUndefined: Self = StObject.set(x, "newPos", js.undefined)
  }
}
