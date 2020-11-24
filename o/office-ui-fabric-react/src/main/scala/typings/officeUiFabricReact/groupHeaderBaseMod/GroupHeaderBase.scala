package typings.officeUiFabricReact.groupHeaderBaseMod

import typings.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupHeader.base", "GroupHeaderBase")
@js.native
class GroupHeaderBase protected ()
  extends Component[IGroupHeaderProps, IGroupHeaderState, js.Any] {
  def this(props: IGroupHeaderProps) = this()
  
  var _classNames: js.Any = js.native
  
  var _defaultCheckboxRender: js.Any = js.native
  
  var _fastDefaultCheckboxRender: js.Any = js.native
  
  var _onHeaderClick: js.Any = js.native
  
  var _onKeyUp: js.Any = js.native
  
  var _onRenderTitle: js.Any = js.native
  
  var _onToggleClick: js.Any = js.native
  
  var _onToggleSelectGroupClick: js.Any = js.native
  
  var _toggleCollapse: js.Any = js.native
}
/* static members */
@JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupHeader.base", "GroupHeaderBase")
@js.native
object GroupHeaderBase extends js.Object {
  
  var defaultProps: IGroupHeaderProps = js.native
  
  def getDerivedStateFromProps(nextProps: IGroupHeaderProps, previousState: IGroupHeaderState): IGroupHeaderState = js.native
}
