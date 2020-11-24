package typings.officeUiFabricReact.libDetailsListMod

import typings.officeUiFabricReact.anon.IsSelectedOnFocus
import typings.officeUiFabricReact.selectionZoneMod.ISelectionZoneProps
import typings.officeUiFabricReact.selectionZoneMod.ISelectionZoneState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/DetailsList", "SelectionZone")
@js.native
class SelectionZone protected ()
  extends typings.officeUiFabricReact.detailsListMod.SelectionZone {
  def this(props: ISelectionZoneProps) = this()
}
/* static members */
@JSImport("office-ui-fabric-react/lib/DetailsList", "SelectionZone")
@js.native
object SelectionZone extends js.Object {
  
  var defaultProps: IsSelectedOnFocus = js.native
  
  def getDerivedStateFromProps(nextProps: ISelectionZoneProps, prevState: ISelectionZoneState): ISelectionZoneState = js.native
}
