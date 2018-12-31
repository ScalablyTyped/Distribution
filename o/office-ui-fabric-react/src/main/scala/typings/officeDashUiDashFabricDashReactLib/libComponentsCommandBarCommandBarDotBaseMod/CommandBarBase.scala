package typings
package officeDashUiDashFabricDashReactLib.libComponentsCommandBarCommandBarDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/CommandBar/CommandBar.base", "CommandBarBase")
@js.native
class CommandBarBase ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsCommandBarCommandBarDotTypesMod.ICommandBarProps, 
      js.Object
    ]
     with officeDashUiDashFabricDashReactLib.libComponentsCommandBarCommandBarDotTypesMod.ICommandBar {
  var _classNames: js.Any = js.native
  var _onGrowData: js.Any = js.native
  var _onReduceData: js.Any = js.native
  var _onRenderData: js.Any = js.native
  var _onRenderItem: js.Any = js.native
  var _onRenderOverflowButton: js.Any = js.native
  var _overflowSet: js.Any = js.native
  var _resizeGroup: js.Any = js.native
  /* private */ def _computeCacheKey(data: js.Any): js.Any = js.native
  /* private */ def _onButtonClick(item: js.Any): js.Any = js.native
  /**
    * Sets focus to the active command in the list.
    */
  /* CompleteClass */
  override def focus(): scala.Unit = js.native
  /**
    * Remeasures the available space.
    */
  /* CompleteClass */
  override def remeasure(): scala.Unit = js.native
}

@JSImport("office-ui-fabric-react/lib/components/CommandBar/CommandBar.base", "CommandBarBase")
@js.native
object CommandBarBase extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.libComponentsCommandBarCommandBarDotTypesMod.ICommandBarProps = js.native
}

