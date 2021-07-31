package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialIColorPickerGridCe
import typings.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellProps
import typings.officeUiFabricReact.swatchColorPickerTypesMod.ISwatchColorPickerProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSwatchColorPickerMod {
  
  @JSImport("office-ui-fabric-react/lib/SwatchColorPicker", "ColorPickerGridCell")
  @js.native
  val ColorPickerGridCell: FunctionComponent[IColorPickerGridCellProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/SwatchColorPicker", "ColorPickerGridCellBase")
  @js.native
  class ColorPickerGridCellBase protected ()
    extends typings.officeUiFabricReact.swatchColorPickerMod.ColorPickerGridCellBase {
    def this(props: IColorPickerGridCellProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IColorPickerGridCellProps, context: js.Any) = this()
  }
  /* static members */
  object ColorPickerGridCellBase {
    
    @JSImport("office-ui-fabric-react/lib/SwatchColorPicker", "ColorPickerGridCellBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/SwatchColorPicker", "ColorPickerGridCellBase.defaultProps")
    @js.native
    def defaultProps: PartialIColorPickerGridCe = js.native
    @scala.inline
    def defaultProps_=(x: PartialIColorPickerGridCe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/SwatchColorPicker", "SwatchColorPicker")
  @js.native
  val SwatchColorPicker: FunctionComponent[ISwatchColorPickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/SwatchColorPicker", "SwatchColorPickerBase")
  @js.native
  class SwatchColorPickerBase protected ()
    extends typings.officeUiFabricReact.swatchColorPickerMod.SwatchColorPickerBase {
    def this(props: ISwatchColorPickerProps) = this()
  }
  /* static members */
  object SwatchColorPickerBase {
    
    @JSImport("office-ui-fabric-react/lib/SwatchColorPicker", "SwatchColorPickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/SwatchColorPicker", "SwatchColorPickerBase.defaultProps")
    @js.native
    def defaultProps: ISwatchColorPickerProps = js.native
    @scala.inline
    def defaultProps_=(x: ISwatchColorPickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
