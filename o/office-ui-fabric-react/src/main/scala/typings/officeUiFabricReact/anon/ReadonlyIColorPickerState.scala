package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.interfacesMod.IColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.base.IColorPickerState> */
trait ReadonlyIColorPickerState extends StObject {
  
  val color: IColor
  
  val editingColor: js.UndefOr[Component] = js.undefined
}
object ReadonlyIColorPickerState {
  
  inline def apply(color: IColor): ReadonlyIColorPickerState = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIColorPickerState]
  }
  
  extension [Self <: ReadonlyIColorPickerState](x: Self) {
    
    inline def setColor(value: IColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setEditingColor(value: Component): Self = StObject.set(x, "editingColor", value.asInstanceOf[js.Any])
    
    inline def setEditingColorUndefined: Self = StObject.set(x, "editingColor", js.undefined)
  }
}
