package typings
package officeDashUiDashFabricDashReactLib.libComponentsNavNavDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Nav/Nav.base", "NavBase")
@js.native
class NavBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsNavNavDotTypesMod.INavProps, 
      INavState
    ]
     with officeDashUiDashFabricDashReactLib.libComponentsNavNavDotTypesMod.INav {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsNavNavDotTypesMod.INavProps) = this()
  var _onRenderLink: js.Any = js.native
  var _renderGroup: js.Any = js.native
  var _renderGroupHeader: js.Any = js.native
  /**
       * The meta 'key' property of the currently selected NavItem of the Nav. Can return
       * undefined if the currently selected nav item has no populated key property. Be aware
       * that in order for Nav to properly understand which key is selected all NavItems in
       * all groups of the Nav must have populated key properties.
       */
  /* CompleteClass */
  override var selectedKey: js.UndefOr[java.lang.String] = js.native
  /* private */ def _isLinkSelected(link: js.Any): js.Any = js.native
  /* private */ def _onGroupHeaderClicked(group: js.Any, ev: js.Any): js.Any = js.native
  /* private */ def _onLinkExpandClicked(link: js.Any, ev: js.Any): js.Any = js.native
  /* private */ def _onNavAnchorLinkClicked(link: js.Any, ev: js.Any): js.Any = js.native
  /* private */ def _onNavButtonLinkClicked(link: js.Any, ev: js.Any): js.Any = js.native
  /* private */ def _renderCompositeLink(link: js.Any, linkIndex: js.Any, nestingLevel: js.Any): js.Any = js.native
  /* private */ def _renderLink(link: js.Any, linkIndex: js.Any, nestingLevel: js.Any): js.Any = js.native
  /* private */ def _renderLinks(links: js.Any, nestingLevel: js.Any): js.Any = js.native
  /* private */ def _renderNavLink(link: js.Any, linkIndex: js.Any, nestingLevel: js.Any): js.Any = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MNavBase(newProps: officeDashUiDashFabricDashReactLib.libComponentsNavNavDotTypesMod.INavProps): scala.Unit = js.native
}

@JSImport("office-ui-fabric-react/lib/components/Nav/Nav.base", "NavBase")
@js.native
object NavBase extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.libComponentsNavNavDotTypesMod.INavProps = js.native
}

