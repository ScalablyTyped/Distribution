package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsSelectedItemsListBaseSelectedItemsListDotTypesMod.IBaseSelectedItemsListProps
import typings.officeDashUiDashFabricDashReact.libComponentsSelectedItemsListSelectedPeopleListSelectedPeopleListMod.ISelectedPeopleItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/SelectedItemsList", JSImport.Namespace)
@js.native
object libSelectedItemsListMod extends js.Object {
  @js.native
  class BasePeopleSelectedItemsList ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsSelectedItemsListMod.BasePeopleSelectedItemsList
  
  @js.native
  class BaseSelectedItemsList[T, P /* <: IBaseSelectedItemsListProps[T] */] protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsSelectedItemsListMod.BaseSelectedItemsList[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @js.native
  class ExtendedSelectedItem protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsSelectedItemsListMod.ExtendedSelectedItem {
    def this(props: ISelectedPeopleItemProps) = this()
  }
  
  @js.native
  class SelectedPeopleList ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsSelectedItemsListMod.SelectedPeopleList
  
  /* static members */
  @js.native
  object SelectedPeopleList extends js.Object {
    var defaultProps: js.Any = js.native
  }
  
}

