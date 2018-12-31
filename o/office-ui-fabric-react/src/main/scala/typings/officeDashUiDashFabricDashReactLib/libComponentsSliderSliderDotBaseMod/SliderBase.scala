package typings
package officeDashUiDashFabricDashReactLib.libComponentsSliderSliderDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Slider/Slider.base", "SliderBase")
@js.native
class SliderBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsSliderSliderDotTypesMod.ISliderProps, 
      ISliderState
    ]
     with officeDashUiDashFabricDashReactLib.libComponentsSliderSliderDotTypesMod.ISlider {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsSliderSliderDotTypesMod.ISliderProps) = this()
  var _getAriaValueText: js.Any = js.native
  var _id: js.Any = js.native
  var _onKeyDown: js.Any = js.native
  var _onMouseDownOrTouchStart: js.Any = js.native
  var _onMouseMoveOrTouchMove: js.Any = js.native
  var _onMouseUpOrTouchEnd: js.Any = js.native
  var _sliderLine: js.Any = js.native
  var _thumb: js.Any = js.native
  /* CompleteClass */
  override var value: js.UndefOr[scala.Double] = js.native
  /* private */ def _getPosition(event: js.Any, vertical: js.Any): js.Any = js.native
  /* private */ def _getThumbStyle(vertical: js.Any, thumbOffsetPercent: js.Any): js.Any = js.native
  /* private */ def _updateValue(value: js.Any, renderedValue: js.Any): js.Any = js.native
  /**
    * Invoked when a component is receiving new props. This method is not called for the initial render.
    */
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MSliderBase(newProps: officeDashUiDashFabricDashReactLib.libComponentsSliderSliderDotTypesMod.ISliderProps): scala.Unit = js.native
  /* CompleteClass */
  override def focus(): scala.Unit = js.native
}

@JSImport("office-ui-fabric-react/lib/components/Slider/Slider.base", "SliderBase")
@js.native
object SliderBase extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.libComponentsSliderSliderDotTypesMod.ISliderProps = js.native
}

