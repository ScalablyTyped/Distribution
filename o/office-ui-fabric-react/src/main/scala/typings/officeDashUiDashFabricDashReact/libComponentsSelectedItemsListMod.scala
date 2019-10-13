package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsSelectedItemsListBaseSelectedItemsListDotTypesMod.IBaseSelectedItemsListProps
import typings.officeDashUiDashFabricDashReact.libComponentsSelectedItemsListSelectedPeopleListSelectedPeopleListMod.IExtendedPersonaProps
import typings.officeDashUiDashFabricDashReact.libComponentsSelectedItemsListSelectedPeopleListSelectedPeopleListMod.ISelectedPeopleItemProps
import typings.officeDashUiDashFabricDashReact.libComponentsSelectedItemsListSelectedPeopleListSelectedPeopleListMod.ISelectedPeopleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/SelectedItemsList", JSImport.Namespace)
@js.native
object libComponentsSelectedItemsListMod extends js.Object {
  @js.native
  class BasePeopleSelectedItemsList ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsSelectedItemsListBaseSelectedItemsListMod.BaseSelectedItemsList[IExtendedPersonaProps, ISelectedPeopleProps]
  
  @js.native
  class BaseSelectedItemsList[T, P /* <: IBaseSelectedItemsListProps[T] */] protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsSelectedItemsListBaseSelectedItemsListMod.BaseSelectedItemsList[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @js.native
  class ExtendedSelectedItem protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsSelectedItemsListSelectedPeopleListItemsExtendedSelectedItemMod.ExtendedSelectedItem {
    def this(props: ISelectedPeopleItemProps) = this()
  }
  
  @js.native
  class SelectedPeopleList ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsSelectedItemsListSelectedPeopleListSelectedPeopleListMod.SelectedPeopleList
  
  /* static members */
  @js.native
  object SelectedPeopleList extends js.Object {
    var defaultProps: js.Any = js.native
  }
  
}

