package typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipHostDotBaseMod

import typings.officeDashUiDashFabricDashReact.Anon_Delay
import typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipHostDotTypesMod.ITooltipHost
import typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipHostDotTypesMod.ITooltipHostProps
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Tooltip/TooltipHost.base", "TooltipHostBase")
@js.native
class TooltipHostBase protected ()
  extends Component[ITooltipHostProps, ITooltipHostState, js.Any]
     with ITooltipHost {
  def this(props: ITooltipHostProps) = this()
  var _async: js.Any = js.native
  var _classNames: js.Any = js.native
  var _clearDismissTimer: js.Any = js.native
  var _clearOpenTimer: js.Any = js.native
  var _dismissTimerId: js.Any = js.native
  var _getDelayTime: js.Any = js.native
  var _getTargetElement: js.Any = js.native
  var _hideTooltip: js.Any = js.native
  var _onTooltipKeyDown: js.Any = js.native
  var _onTooltipMouseEnter: js.Any = js.native
  var _onTooltipMouseLeave: js.Any = js.native
  var _openTimerId: js.Any = js.native
  var _toggleTooltip: js.Any = js.native
  var _tooltipHost: js.Any = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTooltipHostBase(): Unit = js.native
  /**
    * Dismisses the tooltip.
    */
  /* CompleteClass */
  override def dismiss(): Unit = js.native
  /**
    * Shows the tooltip.
    */
  /* CompleteClass */
  override def show(): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Tooltip/TooltipHost.base", "TooltipHostBase")
@js.native
object TooltipHostBase extends js.Object {
  var _currentVisibleTooltip: js.Any = js.native
  var defaultProps: Anon_Delay = js.native
}

