package typings.officeUiFabricReact.extendedSelectedItemMod

import typings.officeUiFabricReact.selectedPeopleListMod.ISelectedPeopleItemProps
import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/SelectedPeopleList/Items/ExtendedSelectedItem", "ExtendedSelectedItem")
@js.native
class ExtendedSelectedItem protected ()
  extends Component[ISelectedPeopleItemProps, IPeoplePickerItemState, js.Any] {
  def this(props: ISelectedPeopleItemProps) = this()
  var _onClickIconButton: js.Any = js.native
  var persona: RefObject[HTMLDivElement] = js.native
}

