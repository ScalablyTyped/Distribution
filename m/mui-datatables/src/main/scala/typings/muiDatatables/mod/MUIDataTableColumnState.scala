package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableColumnState
  extends StObject
     with MUIDataTableColumnOptions {
  
  var label: js.UndefOr[String] = js.undefined
  
  var name: String
}
object MUIDataTableColumnState {
  
  @scala.inline
  def apply(name: String): MUIDataTableColumnState = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableColumnState]
  }
  
  @scala.inline
  implicit class MUIDataTableColumnStateMutableBuilder[Self <: MUIDataTableColumnState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
