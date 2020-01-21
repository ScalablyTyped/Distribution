package typings.officeUiFabricReact.navBaseMod

import typings.officeUiFabricReact.navTypesMod.INav
import typings.officeUiFabricReact.navTypesMod.INavProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Nav/Nav.base", "NavBase")
@js.native
class NavBase protected ()
  extends Component[INavProps, INavState, js.Any]
     with INav {
  def this(props: INavProps) = this()
  var _focusZone: js.Any = js.native
  var _isGroupExpanded: js.Any = js.native
  var _isLinkSelected: js.Any = js.native
  var _onGroupHeaderClicked: js.Any = js.native
  var _onLinkExpandClicked: js.Any = js.native
  var _onNavAnchorLinkClicked: js.Any = js.native
  var _onNavButtonLinkClicked: js.Any = js.native
  var _onRenderLink: js.Any = js.native
  var _preventBounce: js.Any = js.native
  var _renderCompositeLink: js.Any = js.native
  var _renderGroup: js.Any = js.native
  var _renderGroupHeader: js.Any = js.native
  var _renderLink: js.Any = js.native
  var _renderLinks: js.Any = js.native
  var _renderNavLink: js.Any = js.native
  var _toggleCollapsed: js.Any = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Nav/Nav.base", "NavBase")
@js.native
object NavBase extends js.Object {
  var defaultProps: INavProps = js.native
}

