package typings.officeUiFabricReact.panelBaseMod

import typings.officeUiFabricReact.panelTypesMod.IPanel
import typings.officeUiFabricReact.panelTypesMod.IPanelProps
import typings.officeUiFabricReact.utilitiesMod.BaseComponent
import typings.react.mod.SyntheticEvent
import typings.std.Event_
import typings.std.HTMLElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Panel/Panel.base", "PanelBase")
@js.native
class PanelBase protected ()
  extends BaseComponent[IPanelProps, IPanelState]
     with IPanel {
  def this(props: IPanelProps) = this()
  var _allowScrollOnPanel: js.Any = js.native
  var _allowTouchBodyScroll: js.Any = js.native
  var _animateTo: js.Any = js.native
  var _animationCallback: js.Any = js.native
  var _classNames: js.Any = js.native
  var _clearExistingAnimationTimer: js.Any = js.native
  var _dismissOnOuterClick: js.Any = js.native
  var _hasCustomNavigation: js.Any = js.native
  var _headerTextId: js.Any = js.native
  var _onPanelClick: js.Any = js.native
  var _onRenderBody: js.Any = js.native
  var _onRenderFooter: js.Any = js.native
  var _onRenderHeader: js.Any = js.native
  var _onRenderNavigation: js.Any = js.native
  var _onRenderNavigationContent: js.Any = js.native
  var _onTransitionComplete: js.Any = js.native
  var _panel: js.Any = js.native
  var _scrollableContent: js.Any = js.native
  var _shouldListenForOuterClick: js.Any = js.native
  var _updateFooterPosition: js.Any = js.native
  /** isActive is true when panel is open or opening. */
  val isActive: Boolean = js.native
  def close(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MPanelBase(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MPanelBase(previousProps: IPanelProps, previousState: IPanelState): Unit = js.native
  def dismiss(ev: SyntheticEvent[HTMLElement, Event_]): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Panel/Panel.base", "PanelBase")
@js.native
object PanelBase extends js.Object {
  var defaultProps: IPanelProps = js.native
  def getDerivedStateFromProps(nextProps: IPanelProps, prevState: IPanelState): Partial[IPanelState] | Null = js.native
}

