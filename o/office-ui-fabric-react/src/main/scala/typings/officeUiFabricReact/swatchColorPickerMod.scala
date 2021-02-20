package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialIColorPickerGridCe
import typings.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellProps
import typings.officeUiFabricReact.swatchColorPickerTypesMod.ISwatchColorPickerProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swatchColorPickerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/SwatchColorPicker", "ColorPickerGridCell")
  @js.native
  val ColorPickerGridCell: FunctionComponent[IColorPickerGridCellProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/SwatchColorPicker", "ColorPickerGridCellBase")
  @js.native
  class ColorPickerGridCellBase protected ()
    extends typings.officeUiFabricReact.colorPickerGridCellBaseMod.ColorPickerGridCellBase {
    def this(props: IColorPickerGridCellProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IColorPickerGridCellProps, context: js.Any) = this()
  }
  /* static members */
  object ColorPickerGridCellBase {
    
    @JSImport("office-ui-fabric-react/lib/components/SwatchColorPicker", "ColorPickerGridCellBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/SwatchColorPicker", "ColorPickerGridCellBase.defaultProps")
    @js.native
    def defaultProps: PartialIColorPickerGridCe = js.native
    @scala.inline
    def defaultProps_=(x: PartialIColorPickerGridCe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/SwatchColorPicker", "SwatchColorPicker")
  @js.native
  val SwatchColorPicker: FunctionComponent[ISwatchColorPickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/SwatchColorPicker", "SwatchColorPickerBase")
  @js.native
  class SwatchColorPickerBase protected ()
    extends typings.officeUiFabricReact.swatchColorPickerBaseMod.SwatchColorPickerBase {
    def this(props: ISwatchColorPickerProps) = this()
  }
  /* static members */
  object SwatchColorPickerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/SwatchColorPicker", "SwatchColorPickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/SwatchColorPicker", "SwatchColorPickerBase.defaultProps")
    @js.native
    def defaultProps: ISwatchColorPickerProps = js.native
    @scala.inline
    def defaultProps_=(x: ISwatchColorPickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
