package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableHeadRow extends StObject {
  
  var classes: js.UndefOr[js.Object] = js.undefined
}
object MUIDataTableHeadRow {
  
  @scala.inline
  def apply(): MUIDataTableHeadRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableHeadRow]
  }
  
  @scala.inline
  implicit class MUIDataTableHeadRowMutableBuilder[Self <: MUIDataTableHeadRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
  }
}
