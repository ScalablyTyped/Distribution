package typings.officeDashUiDashFabricDashReact.libComponentsColorPickerColorPickerDotBaseMod

import typings.officeDashUiDashFabricDashReact.Anon_AlphaLabel
import typings.officeDashUiDashFabricDashReact.libComponentsColorPickerColorPickerDotTypesMod.IColorPicker
import typings.officeDashUiDashFabricDashReact.libComponentsColorPickerColorPickerDotTypesMod.IColorPickerProps
import typings.officeDashUiDashFabricDashReact.libUtilitiesColorInterfacesMod.IColor
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.base", "ColorPickerBase")
@js.native
class ColorPickerBase protected ()
  extends Component[IColorPickerProps, IColorPickerState, js.Any]
     with IColorPicker {
  def this(props: IColorPickerProps) = this()
  var _getDisplayValue: js.Any = js.native
  var _onAChanged: js.Any = js.native
  var _onBlur: js.Any = js.native
  var _onHChanged: js.Any = js.native
  var _onSVChanged: js.Any = js.native
  var _onTextChange: js.Any = js.native
  var _textChangeHandlers: js.Any = js.native
  var _textLabels: js.Any = js.native
  /**
    * Update the displayed color and call change handlers if appropriate.
    * @param ev - Event if call was triggered by an event (undefined if triggered by props change)
    * @param newColor - Updated color
    */
  var _updateColor: js.Any = js.native
  /** The currently selected color. */
  /* CompleteClass */
  override var color: IColor = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MColorPickerBase(newProps: IColorPickerProps): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.base", "ColorPickerBase")
@js.native
object ColorPickerBase extends js.Object {
  var defaultProps: Anon_AlphaLabel = js.native
}

