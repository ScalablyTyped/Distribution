package typings.muiDatatables.mod

import typings.muiDatatables.anon.Checked
import typings.muiDatatables.muiDatatablesStrings.`row-select-header`
import typings.muiDatatables.muiDatatablesStrings.`row-select`
import typings.muiDatatables.muiDatatablesStrings.`table-filter`
import typings.muiDatatables.muiDatatablesStrings.`table-view-col`
import typings.muiDatatables.muiDatatablesStrings.primary
import typings.muiDatatables.muiDatatablesStrings.secondary
import typings.react.mod.ChangeEvent
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableCheckboxProps extends StObject {
  
  var checked: Boolean
  
  var classes: Checked
  
  var color: primary | secondary
  
  var `data-description`: `row-select` | `row-select-header` | `table-filter` | `table-view-col`
  
  var `data-index`: Double | Null
  
  var disabled: Boolean
  
  var indeterminante: Boolean
  
  def onChange(event: ChangeEvent[HTMLInputElement], checked: Boolean): Unit
}
object MUIDataTableCheckboxProps {
  
  inline def apply(
    checked: Boolean,
    classes: Checked,
    color: primary | secondary,
    `data-description`: `row-select` | `row-select-header` | `table-filter` | `table-view-col`,
    disabled: Boolean,
    indeterminante: Boolean,
    onChange: (ChangeEvent[HTMLInputElement], Boolean) => Unit
  ): MUIDataTableCheckboxProps = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], indeterminante = indeterminante.asInstanceOf[js.Any], onChange = js.Any.fromFunction2(onChange))
    __obj.updateDynamic("data-description")(`data-description`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-index")(null)
    __obj.asInstanceOf[MUIDataTableCheckboxProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MUIDataTableCheckboxProps] (val x: Self) extends AnyVal {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setClasses(value: Checked): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setColor(value: primary | secondary): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def `setData-description`(value: `row-select` | `row-select-header` | `table-filter` | `table-view-col`): Self = StObject.set(x, "data-description", value.asInstanceOf[js.Any])
    
    inline def `setData-index`(value: Double): Self = StObject.set(x, "data-index", value.asInstanceOf[js.Any])
    
    inline def `setData-indexNull`: Self = StObject.set(x, "data-index", null)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setIndeterminante(value: Boolean): Self = StObject.set(x, "indeterminante", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: (ChangeEvent[HTMLInputElement], Boolean) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
  }
}
