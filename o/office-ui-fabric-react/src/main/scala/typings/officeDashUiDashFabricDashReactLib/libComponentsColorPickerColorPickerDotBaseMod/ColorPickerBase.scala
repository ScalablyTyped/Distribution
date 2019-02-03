package typings
package officeDashUiDashFabricDashReactLib.libComponentsColorPickerColorPickerDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.base", "ColorPickerBase")
@js.native
class ColorPickerBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsColorPickerColorPickerDotTypesMod.IColorPickerProps, 
      IColorPickerState
    ]
     with officeDashUiDashFabricDashReactLib.libComponentsColorPickerColorPickerDotTypesMod.IColorPicker {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsColorPickerColorPickerDotTypesMod.IColorPickerProps) = this()
  var _onAChanged: js.Any = js.native
  var _onHChanged: js.Any = js.native
  var _onHexChanged: js.Any = js.native
  var _onSVChanged: js.Any = js.native
  var _rgbaChangeHandlers: js.Any = js.native
  var _rgbaLabels: js.Any = js.native
  /** The currently selected color. */
  /* CompleteClass */
  override var color: officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IColor = js.native
  /* private */ def _onRGBAChanged(component: js.Any, event: js.Any): js.Any = js.native
  /* private */ def _onRGBAChanged(component: js.Any, event: js.Any, newValue: js.Any): js.Any = js.native
  /* private */ def _updateColor(): js.Any = js.native
  /* private */ def _updateColor(newColor: js.Any): js.Any = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MColorPickerBase(
    newProps: officeDashUiDashFabricDashReactLib.libComponentsColorPickerColorPickerDotTypesMod.IColorPickerProps
  ): scala.Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.base", "ColorPickerBase")
@js.native
object ColorPickerBase extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.Anon_AlphaLabel = js.native
}

