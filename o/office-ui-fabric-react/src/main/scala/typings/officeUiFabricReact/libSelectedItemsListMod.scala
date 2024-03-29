package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsSelectedItemsListBaseSelectedItemsListDottypesMod.IBaseSelectedItemsListProps
import typings.officeUiFabricReact.libComponentsSelectedItemsListSelectedPeopleListSelectedPeopleListMod.ISelectedPeopleItemProps
import typings.officeUiFabricReact.libComponentsSelectedItemsListSelectedPeopleListSelectedPeopleListMod.ISelectedPeopleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSelectedItemsListMod {
  
  @JSImport("office-ui-fabric-react/lib/SelectedItemsList", "BasePeopleSelectedItemsList")
  @js.native
  open class BasePeopleSelectedItemsList protected ()
    extends typings.officeUiFabricReact.libComponentsSelectedItemsListMod.BasePeopleSelectedItemsList {
    def this(basePickerProps: ISelectedPeopleProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/SelectedItemsList", "BaseSelectedItemsList")
  @js.native
  open class BaseSelectedItemsList[T, P /* <: IBaseSelectedItemsListProps[T] */] protected ()
    extends typings.officeUiFabricReact.libComponentsSelectedItemsListMod.BaseSelectedItemsList[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/SelectedItemsList", "ExtendedSelectedItem")
  @js.native
  open class ExtendedSelectedItem protected ()
    extends typings.officeUiFabricReact.libComponentsSelectedItemsListMod.ExtendedSelectedItem {
    def this(props: ISelectedPeopleItemProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/SelectedItemsList", "SelectedPeopleList")
  @js.native
  open class SelectedPeopleList protected ()
    extends typings.officeUiFabricReact.libComponentsSelectedItemsListMod.SelectedPeopleList {
    def this(basePickerProps: ISelectedPeopleProps) = this()
  }
  /* static members */
  object SelectedPeopleList {
    
    @JSImport("office-ui-fabric-react/lib/SelectedItemsList", "SelectedPeopleList")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/SelectedItemsList", "SelectedPeopleList.defaultProps")
    @js.native
    def defaultProps: Any = js.native
    inline def defaultProps_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
