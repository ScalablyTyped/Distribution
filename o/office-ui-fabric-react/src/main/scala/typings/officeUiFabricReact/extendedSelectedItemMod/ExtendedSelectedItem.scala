package typings.officeUiFabricReact.extendedSelectedItemMod

import typings.officeUiFabricReact.selectedPeopleListMod.ISelectedPeopleItemProps
import typings.officeUiFabricReact.utilitiesMod.BaseComponent
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/SelectedPeopleList/Items/ExtendedSelectedItem", "ExtendedSelectedItem")
@js.native
class ExtendedSelectedItem protected () extends BaseComponent[ISelectedPeopleItemProps, IPeoplePickerItemState] {
  def this(props: ISelectedPeopleItemProps) = this()
  var _onClickIconButton: js.Any = js.native
  var persona: RefObject[HTMLDivElement] = js.native
}

