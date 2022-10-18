package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsSliderSliderDottypesMod.ISlider
import typings.officeUiFabricReact.libComponentsSliderSliderDottypesMod.ISliderProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSliderSliderDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Slider/Slider.base", "ONKEYDOWN_TIMEOUT_DURATION")
  @js.native
  val ONKEYDOWN_TIMEOUT_DURATION: /* 1000 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Slider/Slider.base", "SliderBase")
  @js.native
  open class SliderBase protected ()
    extends Component[ISliderProps, ISliderState, Any]
       with ISlider {
    def this(props: ISliderProps) = this()
    
    /* private */ var _async: Any = js.native
    
    /* private */ var _calculateCurrentSteps: Any = js.native
    
    /* private */ var _clearOnKeyDownTimer: Any = js.native
    
    /* private */ var _disposables: Any = js.native
    
    /* private */ var _disposeListeners: Any = js.native
    
    /* private */ var _getAriaValueText: Any = js.native
    
    /* private */ var _getPercent: Any = js.native
    
    /* private */ var _getPosition: Any = js.native
    
    /* private */ var _getStyleUsingOffsetPercent: Any = js.native
    
    /* private */ var _getValueLabel: Any = js.native
    
    /* private */ var _id: Any = js.native
    
    /* private */ var _isAdjustingLowerValue: Any = js.native
    
    /* private */ var _lowerValueThumb: Any = js.native
    
    /* private */ var _onKeyDown: Any = js.native
    
    /* private */ var _onKeyDownTimer: Any = js.native
    
    /* private */ var _onMouseDownOrTouchStart: Any = js.native
    
    /* private */ var _onMouseMoveOrTouchMove: Any = js.native
    
    /* private */ var _onMouseUpOrTouchEnd: Any = js.native
    
    /* private */ var _onThumbFocus: Any = js.native
    
    /* private */ var _setOnKeyDownTimer: Any = js.native
    
    /* private */ var _setValueState: Any = js.native
    
    /* private */ var _sliderLine: Any = js.native
    
    /* private */ var _thumb: Any = js.native
    
    /* private */ var _updateValue: Any = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSliderBase(): Unit = js.native
    
    /* CompleteClass */
    override def focus(): Unit = js.native
    
    val lowerValue: js.UndefOr[Double] = js.native
    
    /* private */ val renderedLowerValue: Any = js.native
    
    /* private */ val renderedValue: Any = js.native
  }
  /* static members */
  object SliderBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Slider/Slider.base", "SliderBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Slider/Slider.base", "SliderBase.defaultProps")
    @js.native
    def defaultProps: ISliderProps = js.native
    inline def defaultProps_=(x: ISliderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait ISliderState extends StObject {
    
    var lowerValue: js.UndefOr[Double] = js.undefined
    
    var renderedLowerValue: js.UndefOr[Double] = js.undefined
    
    var renderedValue: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object ISliderState {
    
    inline def apply(): ISliderState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISliderState]
    }
    
    extension [Self <: ISliderState](x: Self) {
      
      inline def setLowerValue(value: Double): Self = StObject.set(x, "lowerValue", value.asInstanceOf[js.Any])
      
      inline def setLowerValueUndefined: Self = StObject.set(x, "lowerValue", js.undefined)
      
      inline def setRenderedLowerValue(value: Double): Self = StObject.set(x, "renderedLowerValue", value.asInstanceOf[js.Any])
      
      inline def setRenderedLowerValueUndefined: Self = StObject.set(x, "renderedLowerValue", js.undefined)
      
      inline def setRenderedValue(value: Double): Self = StObject.set(x, "renderedValue", value.asInstanceOf[js.Any])
      
      inline def setRenderedValueUndefined: Self = StObject.set(x, "renderedValue", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
