package typings
package officeDashUiDashFabricDashReactLib.libComponentsCoachmarkCoachmarkDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Coachmark/Coachmark.base", "CoachmarkBase")
@js.native
class CoachmarkBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsCoachmarkCoachmarkDotTypesMod.ICoachmarkProps, 
      ICoachmarkState
    ]
     with officeDashUiDashFabricDashReactLib.libComponentsCoachmarkCoachmarkDotTypesMod.ICoachmark {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsCoachmarkCoachmarkDotTypesMod.ICoachmarkProps) = this()
  var _ariaAlertContainer: js.Any = js.native
  val _beakDirection: js.Any = js.native
  var _childrenContainer: js.Any = js.native
  /**
       * The cached HTMLElement reference to the Entity Inner Host
       * element.
       */
  var _entityHost: js.Any = js.native
  var _entityInnerHostElement: js.Any = js.native
  var _onFocusHandler: js.Any = js.native
  var _onKeyDown: js.Any = js.native
  var _onPositioned: js.Any = js.native
  var _openCoachmark: js.Any = js.native
  var _positioningContainer: js.Any = js.native
  var _setBeakPosition: js.Any = js.native
  /**
       * The target element the mouse would be in
       * proximity to
       */
  var _targetElementRect: js.Any = js.native
  var _translateAnimationContainer: js.Any = js.native
  /* private */ def _addListeners(): js.Any = js.native
  /* private */ def _addProximityHandler(): js.Any = js.native
  /* private */ def _addProximityHandler(mouseProximityOffset: js.Any): js.Any = js.native
  /* private */ def _dismissOnLostFocus(ev: js.Any): js.Any = js.native
  /* private */ def _getBounds(): js.Any = js.native
  /* private */ def _isInsideElement(mouseX: js.Any, mouseY: js.Any): js.Any = js.native
  /* private */ def _isInsideElement(mouseX: js.Any, mouseY: js.Any, mouseProximityOffset: js.Any): js.Any = js.native
  /* private */ def _setTargetElementRect(): js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCoachmarkBase(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCoachmarkBase(
    prevProps: officeDashUiDashFabricDashReactLib.libComponentsCoachmarkCoachmarkDotTypesMod.ICoachmarkProps,
    prevState: ICoachmarkState
  ): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MCoachmarkBase(
    newProps: officeDashUiDashFabricDashReactLib.libComponentsCoachmarkCoachmarkDotTypesMod.ICoachmarkProps
  ): scala.Unit = js.native
  @JSName("dismiss")
  def dismiss_MCoachmarkBase(): scala.Unit = js.native
  @JSName("dismiss")
  def dismiss_MCoachmarkBase(ev: reactLib.Event): scala.Unit = js.native
  @JSName("dismiss")
  def dismiss_MCoachmarkBase(ev: reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement]): scala.Unit = js.native
  @JSName("dismiss")
  def dismiss_MCoachmarkBase(ev: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement]): scala.Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MCoachmarkBase(
    newProps: officeDashUiDashFabricDashReactLib.libComponentsCoachmarkCoachmarkDotTypesMod.ICoachmarkProps,
    newState: ICoachmarkState
  ): scala.Boolean = js.native
}

@JSImport("office-ui-fabric-react/lib/components/Coachmark/Coachmark.base", "CoachmarkBase")
@js.native
object CoachmarkBase extends js.Object {
  var defaultProps: stdLib.Partial[
    officeDashUiDashFabricDashReactLib.libComponentsCoachmarkCoachmarkDotTypesMod.ICoachmarkProps
  ] = js.native
}

