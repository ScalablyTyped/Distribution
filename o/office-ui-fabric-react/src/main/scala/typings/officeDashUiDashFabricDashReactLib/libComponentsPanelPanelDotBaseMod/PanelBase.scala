package typings
package officeDashUiDashFabricDashReactLib.libComponentsPanelPanelDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Panel/Panel.base", "PanelBase")
@js.native
class PanelBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsPanelPanelDotTypesMod.IPanelProps, 
      IPanelState
    ]
     with officeDashUiDashFabricDashReactLib.libComponentsPanelPanelDotTypesMod.IPanel {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsPanelPanelDotTypesMod.IPanelProps) = this()
  var _allowScrollOnPanel: js.Any = js.native
  var _classNames: js.Any = js.native
  var _onPanelClick: js.Any = js.native
  var _onRenderBody: js.Any = js.native
  var _onRenderFooter: js.Any = js.native
  var _onRenderHeader: js.Any = js.native
  var _onRenderNavigation: js.Any = js.native
  var _onTransitionComplete: js.Any = js.native
  var _panel: js.Any = js.native
  var _scrollableContent: js.Any = js.native
  /* private */ def _dismissOnOuterClick(ev: js.Any): js.Any = js.native
  /* private */ def _shouldListenForOuterClick(props: js.Any): js.Any = js.native
  /* private */ def _updateFooterPosition(): js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MPanelBase(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MPanelBase(previousProps: officeDashUiDashFabricDashReactLib.libComponentsPanelPanelDotTypesMod.IPanelProps): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MPanelBase(newProps: officeDashUiDashFabricDashReactLib.libComponentsPanelPanelDotTypesMod.IPanelProps): scala.Unit = js.native
  def dismiss(ev: reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event]): scala.Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Panel/Panel.base", "PanelBase")
@js.native
object PanelBase extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.libComponentsPanelPanelDotTypesMod.IPanelProps = js.native
}

