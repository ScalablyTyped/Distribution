package typings.officeUiFabricReact

import typings.officeUiFabricReact.sliderTypesMod.ISlider
import typings.officeUiFabricReact.sliderTypesMod.ISliderProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Slider/Slider.base", "ONKEYDOWN_TIMEOUT_DURATION")
  @js.native
  val ONKEYDOWN_TIMEOUT_DURATION: /* 1000 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Slider/Slider.base", "SliderBase")
  @js.native
  class SliderBase protected ()
    extends Component[ISliderProps, ISliderState, js.Any]
       with ISlider {
    def this(props: ISliderProps) = this()
    
    var _async: js.Any = js.native
    
    var _clearOnKeyDownTimer: js.Any = js.native
    
    var _disposables: js.Any = js.native
    
    var _disposeListeners: js.Any = js.native
    
    var _getAriaValueText: js.Any = js.native
    
    var _getPosition: js.Any = js.native
    
    var _getStyleUsingOffsetPercent: js.Any = js.native
    
    var _id: js.Any = js.native
    
    var _onKeyDown: js.Any = js.native
    
    var _onKeyDownTimer: js.Any = js.native
    
    var _onMouseDownOrTouchStart: js.Any = js.native
    
    var _onMouseMoveOrTouchMove: js.Any = js.native
    
    var _onMouseUpOrTouchEnd: js.Any = js.native
    
    var _setOnKeyDownTimer: js.Any = js.native
    
    var _sliderLine: js.Any = js.native
    
    var _thumb: js.Any = js.native
    
    var _updateValue: js.Any = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSliderBase(): Unit = js.native
    
    val renderedValue: js.Any = js.native
  }
  /* static members */
  object SliderBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Slider/Slider.base", "SliderBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Slider/Slider.base", "SliderBase.defaultProps")
    @js.native
    def defaultProps: ISliderProps = js.native
    @scala.inline
    def defaultProps_=(x: ISliderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ISliderState extends StObject {
    
    var renderedValue: js.UndefOr[Double] = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object ISliderState {
    
    @scala.inline
    def apply(): ISliderState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISliderState]
    }
    
    @scala.inline
    implicit class ISliderStateMutableBuilder[Self <: ISliderState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRenderedValue(value: Double): Self = StObject.set(x, "renderedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderedValueUndefined: Self = StObject.set(x, "renderedValue", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
