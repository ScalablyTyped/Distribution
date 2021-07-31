package typings.officeUiFabricReact

import typings.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellStyleProps
import typings.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorPickerGridCellStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/SwatchColorPicker/ColorPickerGridCell.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: IColorPickerGridCellStyleProps): IColorPickerGridCellStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IColorPickerGridCellStyles]
}
