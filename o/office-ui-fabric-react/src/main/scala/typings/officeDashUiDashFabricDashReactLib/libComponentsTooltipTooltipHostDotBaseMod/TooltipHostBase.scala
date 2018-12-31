package typings
package officeDashUiDashFabricDashReactLib.libComponentsTooltipTooltipHostDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Tooltip/TooltipHost.base", "TooltipHostBase")
@js.native
class TooltipHostBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsTooltipTooltipHostDotTypesMod.ITooltipHostProps, 
      ITooltipHostState
    ]
     with officeDashUiDashFabricDashReactLib.libComponentsTooltipTooltipHostDotTypesMod.ITooltipHost {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsTooltipTooltipHostDotTypesMod.ITooltipHostProps) = this()
  var _classNames: js.Any = js.native
  var _clearDismissTimer: js.Any = js.native
  var _closingTimer: js.Any = js.native
  var _hideTooltip: js.Any = js.native
  var _onTooltipMouseEnter: js.Any = js.native
  var _onTooltipMouseLeave: js.Any = js.native
  var _tooltipHost: js.Any = js.native
  /* private */ def _getTargetElement(): js.Any = js.native
  /* private */ def _toggleTooltip(isTooltipVisible: js.Any): js.Any = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTooltipHostBase(): scala.Unit = js.native
  /**
    * Dismisses the tooltip
    */
  /* CompleteClass */
  override def dismiss(): scala.Unit = js.native
}

@JSImport("office-ui-fabric-react/lib/components/Tooltip/TooltipHost.base", "TooltipHostBase")
@js.native
object TooltipHostBase extends js.Object {
  var _currentVisibleTooltip: js.Any = js.native
  var defaultProps: officeDashUiDashFabricDashReactLib.Anon_Delay = js.native
}

