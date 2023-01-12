package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialIColorPickerProps
import typings.officeUiFabricReact.anon.ReadonlyIColorPickerProps
import typings.officeUiFabricReact.anon.ReadonlyIColorPickerState
import typings.officeUiFabricReact.libComponentsColorPickerColorPickerDottypesMod.IColorPicker
import typings.officeUiFabricReact.libComponentsColorPickerColorPickerDottypesMod.IColorPickerProps
import typings.officeUiFabricReact.libUtilitiesColorInterfacesMod.IColor
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsColorPickerColorPickerDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.base", "ColorPickerBase")
  @js.native
  open class ColorPickerBase protected ()
    extends Component[IColorPickerProps, IColorPickerState, Any]
       with IColorPicker {
    def this(props: IColorPickerProps) = this()
    
    /* private */ var _getDisplayValue: Any = js.native
    
    /** Callback for when the alpha/transparency slider changes */
    /* private */ var _onATChanged: Any = js.native
    
    /* private */ var _onBlur: Any = js.native
    
    /* private */ var _onHChanged: Any = js.native
    
    /* private */ var _onSVChanged: Any = js.native
    
    /* private */ var _onTextChange: Any = js.native
    
    /** Strings besides red/green/blue/alpha/hex, with defaults for all values except the deprecated `hue` */
    /* private */ var _strings: Any = js.native
    
    /* private */ var _textChangeHandlers: Any = js.native
    
    /**
      * Strings displayed in the UI as text field labels (these are in a separate object for convenient
      * indexing by short color component name).
      */
    /* private */ var _textLabels: Any = js.native
    
    /**
      * Update the displayed color and call change handlers if appropriate.
      * @param ev - Event if call was triggered by an event (undefined if triggered by props change)
      * @param newColor - Updated color
      */
    /* private */ var _updateColor: Any = js.native
    
    /** The currently selected color. */
    /* CompleteClass */
    var color: IColor = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MColorPickerBase(prevProps: ReadonlyIColorPickerProps, prevState: ReadonlyIColorPickerState): Unit = js.native
  }
  /* static members */
  object ColorPickerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.base", "ColorPickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.base", "ColorPickerBase.defaultProps")
    @js.native
    def defaultProps: PartialIColorPickerProps = js.native
    inline def defaultProps_=(x: PartialIColorPickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined keyof std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/utilities/color/interfaces.IColor, 'r' | 'g' | 'b' | 'a' | 't' | 'hex'> */
  /* Rewritten from type alias, can be one of: 
    - typings.officeUiFabricReact.officeUiFabricReactStrings.g
    - typings.officeUiFabricReact.officeUiFabricReactStrings.b
    - typings.officeUiFabricReact.officeUiFabricReactStrings.a
    - typings.officeUiFabricReact.officeUiFabricReactStrings.r
    - typings.officeUiFabricReact.officeUiFabricReactStrings.hex
    - typings.officeUiFabricReact.officeUiFabricReactStrings.t
  */
  trait ColorComponent extends StObject
  object ColorComponent {
    
    inline def a: typings.officeUiFabricReact.officeUiFabricReactStrings.a = "a".asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactStrings.a]
    
    inline def b: typings.officeUiFabricReact.officeUiFabricReactStrings.b = "b".asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactStrings.b]
    
    inline def g: typings.officeUiFabricReact.officeUiFabricReactStrings.g = "g".asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactStrings.g]
    
    inline def hex: typings.officeUiFabricReact.officeUiFabricReactStrings.hex = "hex".asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactStrings.hex]
    
    inline def r: typings.officeUiFabricReact.officeUiFabricReactStrings.r = "r".asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactStrings.r]
    
    inline def t: typings.officeUiFabricReact.officeUiFabricReactStrings.t = "t".asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactStrings.t]
  }
  
  trait IColorPickerState extends StObject {
    
    /** Most recently selected color */
    var color: IColor
    
    /** Color component currently being edited via a text field (if intermediate value is invalid) */
    var editingColor: js.UndefOr[typings.officeUiFabricReact.anon.Component] = js.undefined
  }
  object IColorPickerState {
    
    inline def apply(color: IColor): IColorPickerState = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColorPickerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IColorPickerState] (val x: Self) extends AnyVal {
      
      inline def setColor(value: IColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setEditingColor(value: typings.officeUiFabricReact.anon.Component): Self = StObject.set(x, "editingColor", value.asInstanceOf[js.Any])
      
      inline def setEditingColorUndefined: Self = StObject.set(x, "editingColor", js.undefined)
    }
  }
}
