package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.interfacesMod.IColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.base.IColorPickerState> */
@js.native
trait ReadonlyIColorPickerState extends StObject {
  
  val color: IColor = js.native
  
  val editingColor: js.UndefOr[Component] = js.native
}
object ReadonlyIColorPickerState {
  
  @scala.inline
  def apply(color: IColor): ReadonlyIColorPickerState = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIColorPickerState]
  }
  
  @scala.inline
  implicit class ReadonlyIColorPickerStateMutableBuilder[Self <: ReadonlyIColorPickerState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: IColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditingColor(value: Component): Self = StObject.set(x, "editingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditingColorUndefined: Self = StObject.set(x, "editingColor", js.undefined)
  }
}
