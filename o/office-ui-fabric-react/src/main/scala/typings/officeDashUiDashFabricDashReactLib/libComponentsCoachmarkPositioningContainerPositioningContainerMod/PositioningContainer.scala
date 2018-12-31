package typings
package officeDashUiDashFabricDashReactLib.libComponentsCoachmarkPositioningContainerPositioningContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Coachmark/PositioningContainer/PositioningContainer", "PositioningContainer")
@js.native
class PositioningContainer protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsCoachmarkPositioningContainerPositioningContainerDotTypesMod.IPositioningContainerProps, 
      IPositioningContainerState
    ] {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsCoachmarkPositioningContainerPositioningContainerDotTypesMod.IPositioningContainerProps) = this()
  var _contentHost: js.Any = js.native
  var _didSetInitialFocus: js.Any = js.native
  /**
    * The maximum height the PositioningContainer can grow to
    * without going being the window or target bounds
    */
  var _maxHeight: js.Any = js.native
  var _positionAttempts: js.Any = js.native
  /**
    * The primary positioned div.
    */
  var _positionedHost: js.Any = js.native
  /**
    * The bounds used when determing if and where the
    * PositioningContainer should be placed.
    */
  var _positioningBounds: js.Any = js.native
  var _setHeightOffsetTimer: js.Any = js.native
  var _target: js.Any = js.native
  /**
    * Stores an instance of Window, used to check
    * for server side rendering and if focus was lost.
    */
  var _targetWindow: js.Any = js.native
  /* private */ def _arePositionsEqual(positions: js.Any, newPosition: js.Any): js.Any = js.native
  /* private */ def _comparePositions(oldPositions: js.Any, newPositions: js.Any): js.Any = js.native
  /* protected */ def _dismissOnLostFocus(ev: reactLib.Event): scala.Unit = js.native
  /* protected */ def _dismissOnScroll(ev: reactLib.Event): scala.Unit = js.native
  /* private */ def _getBounds(): js.Any = js.native
  /**
    * Return the maximum height the container can grow to
    * without going out of the specified bounds
    */
  /* private */ def _getMaxHeight(): js.Any = js.native
  /* private */ def _getTarget(): js.Any = js.native
  /* private */ def _getTarget(props: js.Any): js.Any = js.native
  /* protected */ def _onComponentDidMount(): scala.Unit = js.native
  /**
    * Animates the height if finalHeight was given.
    */
  /* private */ def _setHeightOffsetEveryFrame(): js.Any = js.native
  /* protected */ def _setInitialFocus(): scala.Unit = js.native
  /* private */ def _setTargetWindowAndElement(target: js.Any): js.Any = js.native
  /* private */ def _updateAsyncPosition(): js.Any = js.native
  /* private */ def _updatePosition(): js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MPositioningContainer(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MPositioningContainer(): scala.Unit = js.native
  @JSName("componentWillMount")
  def componentWillMount_MPositioningContainer(): scala.Unit = js.native
  @JSName("componentWillUpdate")
  def componentWillUpdate_MPositioningContainer(
    newProps: officeDashUiDashFabricDashReactLib.libComponentsCoachmarkPositioningContainerPositioningContainerDotTypesMod.IPositioningContainerProps
  ): scala.Unit = js.native
  /**
    * Deprecated, use `onResize` instead.
    * @deprecated Use `onResize` instead.
    */
  def dismiss(): scala.Unit = js.native
  def dismiss(ev: reactLib.Event): scala.Unit = js.native
  def dismiss(ev: reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement]): scala.Unit = js.native
  def dismiss(ev: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]): scala.Unit = js.native
  def onResize(): scala.Unit = js.native
  def onResize(ev: reactLib.Event): scala.Unit = js.native
  def onResize(ev: reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement]): scala.Unit = js.native
  def onResize(ev: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]): scala.Unit = js.native
}

@JSImport("office-ui-fabric-react/lib/components/Coachmark/PositioningContainer/PositioningContainer", "PositioningContainer")
@js.native
object PositioningContainer extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.libComponentsCoachmarkPositioningContainerPositioningContainerDotTypesMod.IPositioningContainerProps = js.native
}

