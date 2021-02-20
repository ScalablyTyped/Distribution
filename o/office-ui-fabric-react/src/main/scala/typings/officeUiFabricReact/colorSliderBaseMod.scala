package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialIColorSliderProps
import typings.officeUiFabricReact.anon.ReadonlyIColorSliderProps
import typings.officeUiFabricReact.anon.ReadonlyIColorSliderState
import typings.officeUiFabricReact.colorSliderTypesMod.IColorSlider
import typings.officeUiFabricReact.colorSliderTypesMod.IColorSliderProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorSliderBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.base", "ColorSliderBase")
  @js.native
  class ColorSliderBase protected ()
    extends Component[IColorSliderProps, IColorSliderState, js.Any]
       with IColorSlider {
    def this(props: IColorSliderProps) = this()
    
    var _disposables: js.Any = js.native
    
    var _disposeListeners: js.Any = js.native
    
    val _maxValue: js.Any = js.native
    
    var _onKeyDown: js.Any = js.native
    
    var _onMouseDown: js.Any = js.native
    
    var _onMouseMove: js.Any = js.native
    
    var _root: js.Any = js.native
    
    val _type: js.Any = js.native
    
    var _updateValue: js.Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MColorSliderBase(prevProps: ReadonlyIColorSliderProps, prevState: ReadonlyIColorSliderState): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MColorSliderBase(): Unit = js.native
  }
  /* static members */
  object ColorSliderBase {
    
    @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.base", "ColorSliderBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.base", "ColorSliderBase.defaultProps")
    @js.native
    def defaultProps: PartialIColorSliderProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialIColorSliderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IColorSliderState extends StObject {
    
    var currentValue: Double = js.native
  }
  object IColorSliderState {
    
    @scala.inline
    def apply(currentValue: Double): IColorSliderState = {
      val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColorSliderState]
    }
    
    @scala.inline
    implicit class IColorSliderStateMutableBuilder[Self <: IColorSliderState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentValue(value: Double): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
    }
  }
}
