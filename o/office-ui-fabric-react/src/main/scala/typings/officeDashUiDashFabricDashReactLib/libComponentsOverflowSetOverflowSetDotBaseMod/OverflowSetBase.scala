package typings
package officeDashUiDashFabricDashReactLib.libComponentsOverflowSetOverflowSetDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/OverflowSet/OverflowSet.base", "OverflowSetBase")
@js.native
class OverflowSetBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsOverflowSetOverflowSetDotTypesMod.IOverflowSetProps, 
      js.Object
    ]
     with officeDashUiDashFabricDashReactLib.libComponentsOverflowSetOverflowSetDotTypesMod.IOverflowSet {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsOverflowSetOverflowSetDotTypesMod.IOverflowSetProps) = this()
  var _classNames: js.Any = js.native
  var _divContainer: js.Any = js.native
  var _focusZone: js.Any = js.native
  var _keytipManager: js.Any = js.native
  var _onRenderItems: js.Any = js.native
  var _onRenderOverflowButtonWrapper: js.Any = js.native
  var _persistedKeytips: js.Any = js.native
  /**
    * Gets the subMenu for an overflow item
    * Checks if itemSubMenuProvider has been defined, if not defaults to subMenuProps
    */
  /* private */ def _getSubMenuForItem(item: js.Any): js.Any = js.native
  /* private */ def _registerPersistedKeytips(): js.Any = js.native
  /* private */ def _unregisterPersistedKeytips(): js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MOverflowSetBase(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MOverflowSetBase(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MOverflowSetBase(): scala.Unit = js.native
  @JSName("componentWillUpdate")
  def componentWillUpdate_MOverflowSetBase(): scala.Unit = js.native
}

@JSImport("office-ui-fabric-react/lib/components/OverflowSet/OverflowSet.base", "OverflowSetBase")
@js.native
object OverflowSetBase extends js.Object {
  var defaultProps: stdLib.Pick[
    officeDashUiDashFabricDashReactLib.libComponentsOverflowSetOverflowSetDotTypesMod.IOverflowSetProps, 
    officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.vertical | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.role
  ] = js.native
}

