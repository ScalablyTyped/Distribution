package typings.openui5.anon

import typings.openui5.sapUiTableColumnMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewVisible extends StObject {
  
  /**
    * affected column.
    */
  var column: js.UndefOr[default] = js.undefined
  
  /**
    * new value of the visible property.
    */
  var newVisible: js.UndefOr[Boolean] = js.undefined
}
object NewVisible {
  
  inline def apply(): NewVisible = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewVisible]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NewVisible] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: default): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setNewVisible(value: Boolean): Self = StObject.set(x, "newVisible", value.asInstanceOf[js.Any])
    
    inline def setNewVisibleUndefined: Self = StObject.set(x, "newVisible", js.undefined)
  }
}
