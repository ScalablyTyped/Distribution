package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialIColorSliderProps
import typings.officeUiFabricReact.anon.ReadonlyIColorSliderProps
import typings.officeUiFabricReact.anon.ReadonlyIColorSliderState
import typings.officeUiFabricReact.libComponentsColorPickerColorSliderColorSliderDottypesMod.IColorSlider
import typings.officeUiFabricReact.libComponentsColorPickerColorSliderColorSliderDottypesMod.IColorSliderProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsColorPickerColorSliderColorSliderDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.base", "ColorSliderBase")
  @js.native
  open class ColorSliderBase protected ()
    extends Component[IColorSliderProps, IColorSliderState, Any]
       with IColorSlider {
    def this(props: IColorSliderProps) = this()
    
    /* private */ var _disposables: Any = js.native
    
    /* private */ var _disposeListeners: Any = js.native
    
    /* private */ val _maxValue: Any = js.native
    
    /* private */ var _onKeyDown: Any = js.native
    
    /* private */ var _onMouseDown: Any = js.native
    
    /* private */ var _onMouseMove: Any = js.native
    
    /* private */ var _root: Any = js.native
    
    /* private */ val _type: Any = js.native
    
    /* private */ var _updateValue: Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MColorSliderBase(prevProps: ReadonlyIColorSliderProps, prevState: ReadonlyIColorSliderState): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MColorSliderBase(): Unit = js.native
    
    /** Current value of the slider. */
    /* CompleteClass */
    var value: Double = js.native
  }
  /* static members */
  object ColorSliderBase {
    
    @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.base", "ColorSliderBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.base", "ColorSliderBase.defaultProps")
    @js.native
    def defaultProps: PartialIColorSliderProps = js.native
    inline def defaultProps_=(x: PartialIColorSliderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IColorSliderState extends StObject {
    
    var currentValue: Double
  }
  object IColorSliderState {
    
    inline def apply(currentValue: Double): IColorSliderState = {
      val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColorSliderState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IColorSliderState] (val x: Self) extends AnyVal {
      
      inline def setCurrentValue(value: Double): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
    }
  }
}
