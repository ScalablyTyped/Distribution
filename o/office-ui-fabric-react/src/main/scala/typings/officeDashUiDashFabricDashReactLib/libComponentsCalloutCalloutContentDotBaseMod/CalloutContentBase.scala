package typings
package officeDashUiDashFabricDashReactLib.libComponentsCalloutCalloutContentDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Callout/CalloutContent.base", "CalloutContentBase")
@js.native
class CalloutContentBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsCalloutCalloutDotTypesMod.ICalloutProps, 
      ICalloutState
    ] {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsCalloutCalloutDotTypesMod.ICalloutProps) = this()
  var _blockResetHeight: js.Any = js.native
  var _bounds: js.Any = js.native
  var _calloutElement: js.Any = js.native
  var _classNames: js.Any = js.native
  var _didSetInitialFocus: js.Any = js.native
  var _hasListeners: js.Any = js.native
  var _hostElement: js.Any = js.native
  var _maxHeight: js.Any = js.native
  var _positionAttempts: js.Any = js.native
  var _setHeightOffsetTimer: js.Any = js.native
  var _target: js.Any = js.native
  var _targetWindow: js.Any = js.native
  /* private */ def _addListeners(): js.Any = js.native
  /* private */ def _arePositionsEqual(positions: js.Any, newPosition: js.Any): js.Any = js.native
  /* private */ def _comparePositions(oldPositions: js.Any, newPositions: js.Any): js.Any = js.native
  /* protected */ def _dismissOnLostFocus(ev: reactLib.Event): scala.Unit = js.native
  /* protected */ def _dismissOnResize(ev: reactLib.Event): scala.Unit = js.native
  /* protected */ def _dismissOnScroll(ev: reactLib.Event): scala.Unit = js.native
  /* private */ def _getBeakPosition(): js.Any = js.native
  /* private */ def _getBounds(): js.Any = js.native
  /* private */ def _getMaxHeight(): js.Any = js.native
  /* private */ def _getTarget(): js.Any = js.native
  /* private */ def _getTarget(props: js.Any): js.Any = js.native
  /* protected */ def _onComponentDidMount(): scala.Unit = js.native
  /* private */ def _removeListeners(): js.Any = js.native
  /* private */ def _setHeightOffsetEveryFrame(): js.Any = js.native
  /* protected */ def _setInitialFocus(): scala.Unit = js.native
  /* private */ def _setTargetWindowAndElement(target: js.Any): js.Any = js.native
  /* private */ def _updateAsyncPosition(): js.Any = js.native
  /* private */ def _updatePosition(): js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCalloutContentBase(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCalloutContentBase(): scala.Unit = js.native
  @JSName("componentWillMount")
  def componentWillMount_MCalloutContentBase(): scala.Unit = js.native
  @JSName("componentWillUpdate")
  def componentWillUpdate_MCalloutContentBase(newProps: officeDashUiDashFabricDashReactLib.libComponentsCalloutCalloutDotTypesMod.ICalloutProps): scala.Unit = js.native
  def dismiss(): scala.Unit = js.native
  def dismiss(ev: reactLib.Event): scala.Unit = js.native
  def dismiss(ev: reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement]): scala.Unit = js.native
  def dismiss(ev: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]): scala.Unit = js.native
}

@JSImport("office-ui-fabric-react/lib/components/Callout/CalloutContent.base", "CalloutContentBase")
@js.native
object CalloutContentBase extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.Anon_7 = js.native
}

