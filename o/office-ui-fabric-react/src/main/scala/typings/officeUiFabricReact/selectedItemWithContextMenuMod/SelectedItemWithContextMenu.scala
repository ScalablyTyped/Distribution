package typings.officeUiFabricReact.selectedItemWithContextMenuMod

import typings.officeUiFabricReact.utilitiesMod.BaseComponent
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/SelectedPeopleList/Items/SelectedItemWithContextMenu", "SelectedItemWithContextMenu")
@js.native
class SelectedItemWithContextMenu protected () extends BaseComponent[ISelectedItemWithContextMenuProps, IPeoplePickerItemState] {
  def this(props: ISelectedItemWithContextMenuProps) = this()
  var _onClick: js.Any = js.native
  var _onCloseContextualMenu: js.Any = js.native
  var itemElement: RefObject[HTMLDivElement] = js.native
}

