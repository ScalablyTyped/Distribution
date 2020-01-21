package typings.officeUiFabricReact

import typings.officeUiFabricReact.tooltipTypesMod.ITooltipProps
import typings.react.mod.Component
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Tooltip/Tooltip.base", JSImport.Namespace)
@js.native
object tooltipBaseMod extends js.Object {
  @js.native
  class TooltipBase ()
    extends Component[ITooltipProps, js.Any, js.Any] {
    var _classNames: js.Any = js.native
    var _onRenderContent: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object TooltipBase extends js.Object {
    var defaultProps: Partial[ITooltipProps] = js.native
  }
  
}

