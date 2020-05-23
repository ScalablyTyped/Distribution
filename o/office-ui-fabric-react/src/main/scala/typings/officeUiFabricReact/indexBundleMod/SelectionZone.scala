package typings.officeUiFabricReact.indexBundleMod

import typings.officeUiFabricReact.anon.IsSelectedOnFocus
import typings.officeUiFabricReact.selectionZoneMod.ISelectionZoneProps
import typings.officeUiFabricReact.selectionZoneMod.ISelectionZoneState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/index.bundle", "SelectionZone")
@js.native
class SelectionZone protected ()
  extends typings.officeUiFabricReact.mod.SelectionZone {
  def this(props: ISelectionZoneProps) = this()
}

/* static members */
@JSImport("office-ui-fabric-react/lib/index.bundle", "SelectionZone")
@js.native
object SelectionZone extends js.Object {
  var defaultProps: IsSelectedOnFocus = js.native
  def getDerivedStateFromProps(nextProps: ISelectionZoneProps, prevState: ISelectionZoneState): ISelectionZoneState = js.native
}

