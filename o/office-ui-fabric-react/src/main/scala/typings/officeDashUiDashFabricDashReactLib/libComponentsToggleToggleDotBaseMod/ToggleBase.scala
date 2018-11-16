package typings
package officeDashUiDashFabricDashReactLib.libComponentsToggleToggleDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Toggle/Toggle.base", "ToggleBase")
@js.native
class ToggleBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsToggleToggleDotTypesMod.IToggleProps, 
      IToggleState
    ]
     with officeDashUiDashFabricDashReactLib.libComponentsToggleToggleDotTypesMod.IToggle {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsToggleToggleDotTypesMod.IToggleProps) = this()
  var _id: js.Any = js.native
  var _onClick: js.Any = js.native
  var _toggleButton: js.Any = js.native
  /**
       * Gets the current checked state of the toggle.
       */
  val checked: scala.Boolean = js.native
  /* private */ def _noop(): js.Any = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MToggleBase(newProps: officeDashUiDashFabricDashReactLib.libComponentsToggleToggleDotTypesMod.IToggleProps): scala.Unit = js.native
  /* CompleteClass */
  override def focus(): scala.Unit = js.native
}

