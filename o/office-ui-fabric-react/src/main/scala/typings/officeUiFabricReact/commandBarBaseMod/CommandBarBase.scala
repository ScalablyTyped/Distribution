package typings.officeUiFabricReact.commandBarBaseMod

import typings.officeUiFabricReact.commandBarTypesMod.ICommandBar
import typings.officeUiFabricReact.commandBarTypesMod.ICommandBarProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/CommandBar/CommandBar.base", "CommandBarBase")
@js.native
class CommandBarBase protected ()
  extends Component[ICommandBarProps, js.Object, js.Any]
     with ICommandBar {
  def this(props: ICommandBarProps) = this()
  var _classNames: js.Any = js.native
  var _commandButton: js.Any = js.native
  var _computeCacheKey: js.Any = js.native
  var _onButtonClick: js.Any = js.native
  var _onGrowData: js.Any = js.native
  var _onReduceData: js.Any = js.native
  var _onRenderData: js.Any = js.native
  var _onRenderItem: js.Any = js.native
  var _onRenderOverflowButton: js.Any = js.native
  var _overflowSet: js.Any = js.native
  var _resizeGroup: js.Any = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/CommandBar/CommandBar.base", "CommandBarBase")
@js.native
object CommandBarBase extends js.Object {
  var defaultProps: ICommandBarProps = js.native
}

