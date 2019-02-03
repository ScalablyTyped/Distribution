package typings
package officeDashUiDashFabricDashReactLib.libComponentsFocusTrapZoneFocusTrapZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/FocusTrapZone/FocusTrapZone", "FocusTrapZone")
@js.native
class FocusTrapZone ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsFocusTrapZoneFocusTrapZoneDotTypesMod.IFocusTrapZoneProps, 
      js.Object
    ]
     with officeDashUiDashFabricDashReactLib.libComponentsFocusTrapZoneFocusTrapZoneDotTypesMod.IFocusTrapZone {
  var _hasClickHandler: js.Any = js.native
  var _hasFocusHandler: js.Any = js.native
  var _onFocusCapture: js.Any = js.native
  var _onKeyboardHandler: js.Any = js.native
  var _previouslyFocusedElementInTrapZone: js.UndefOr[js.Any] = js.native
  var _previouslyFocusedElementOutsideTrapZone: js.Any = js.native
  var _root: js.Any = js.native
  /* private */ def _bringFocusIntoZone(): js.Any = js.native
  /* private */ def _forceClickInTrap(ev: js.Any): js.Any = js.native
  /* private */ def _forceFocusInTrap(ev: js.Any): js.Any = js.native
  /* private */ def _returnFocusToInitiator(): js.Any = js.native
  /* private */ def _updateEventHandlers(newProps: js.Any): js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MFocusTrapZone(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MFocusTrapZone(
    prevProps: officeDashUiDashFabricDashReactLib.libComponentsFocusTrapZoneFocusTrapZoneDotTypesMod.IFocusTrapZoneProps
  ): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MFocusTrapZone(
    nextProps: officeDashUiDashFabricDashReactLib.libComponentsFocusTrapZoneFocusTrapZoneDotTypesMod.IFocusTrapZoneProps
  ): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MFocusTrapZone(): scala.Unit = js.native
  /**
    * Sets focus to a descendant in the Trap Zone.
    * See firstFocusableSelector and focusPreviouslyFocusedInnerElement for details.
    */
  /* CompleteClass */
  override def focus(): scala.Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/FocusTrapZone/FocusTrapZone", "FocusTrapZone")
@js.native
object FocusTrapZone extends js.Object {
  var _focusStack: js.Any = js.native
}

