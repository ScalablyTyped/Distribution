package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialIColorSliderProps
import typings.officeUiFabricReact.anon.ReadonlyIColorSliderProps
import typings.officeUiFabricReact.anon.ReadonlyIColorSliderState
import typings.officeUiFabricReact.colorSliderTypesMod.IColorSlider
import typings.officeUiFabricReact.colorSliderTypesMod.IColorSliderProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorSliderBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.base", "ColorSliderBase")
  @js.native
  class ColorSliderBase protected ()
    extends Component[IColorSliderProps, IColorSliderState, js.Any]
       with IColorSlider {
    def this(props: IColorSliderProps) = this()
    
    /* private */ var _disposables: js.Any = js.native
    
    /* private */ var _disposeListeners: js.Any = js.native
    
    /* private */ val _maxValue: js.Any = js.native
    
    /* private */ var _onKeyDown: js.Any = js.native
    
    /* private */ var _onMouseDown: js.Any = js.native
    
    /* private */ var _onMouseMove: js.Any = js.native
    
    /* private */ var _root: js.Any = js.native
    
    /* private */ val _type: js.Any = js.native
    
    /* private */ var _updateValue: js.Any = js.native
    
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
    
    extension [Self <: IColorSliderState](x: Self) {
      
      inline def setCurrentValue(value: Double): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
    }
  }
}
