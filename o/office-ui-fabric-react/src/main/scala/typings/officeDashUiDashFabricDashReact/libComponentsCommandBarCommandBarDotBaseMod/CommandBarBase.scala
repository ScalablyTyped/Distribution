package typings.officeDashUiDashFabricDashReact.libComponentsCommandBarCommandBarDotBaseMod

import typings.officeDashUiDashFabricDashReact.libComponentsCommandBarCommandBarDotTypesMod.ICommandBar
import typings.officeDashUiDashFabricDashReact.libComponentsCommandBarCommandBarDotTypesMod.ICommandBarProps
import typings.officeDashUiDashFabricDashReact.libUtilitiesMod.BaseComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/CommandBar/CommandBar.base", "CommandBarBase")
@js.native
class CommandBarBase ()
  extends BaseComponent[ICommandBarProps, js.Object]
     with ICommandBar {
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
  /**
    * Sets focus to the active command in the list.
    */
  /* CompleteClass */
  override def focus(): Unit = js.native
  /**
    * Remeasures the available space.
    */
  /* CompleteClass */
  override def remeasure(): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/CommandBar/CommandBar.base", "CommandBarBase")
@js.native
object CommandBarBase extends js.Object {
  var defaultProps: ICommandBarProps = js.native
}

