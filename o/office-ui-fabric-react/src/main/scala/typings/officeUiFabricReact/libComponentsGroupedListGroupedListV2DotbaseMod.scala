package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.IGroup
import typings.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.IGroupedList
import typings.officeUiFabricReact.libComponentsGroupedListGroupedListV2DottypesMod.IGroupedListV2Props
import typings.officeUiFabricReact.libComponentsListListDottypesMod.IListProps
import typings.react.mod.Component
import typings.react.mod.FC
import typings.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsGroupedListGroupedListV2DotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupedListV2.base", "GroupedListV2FC")
  @js.native
  val GroupedListV2FC: FC[IGroupedListV2Props] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupedListV2.base", "GroupedListV2Wrapper")
  @js.native
  open class GroupedListV2Wrapper protected ()
    extends Component[IGroupedListV2Props, IGroupedListV2State, Any]
       with IGroupedList {
    def this(props: IGroupedListV2Props) = this()
    
    /* private */ var _forceListUpdate: Any = js.native
    
    /* private */ var _list: Any = js.native
    
    /* InferMemberOverrides */
    override def forceUpdate(): Unit = js.native
  }
  /* static members */
  object GroupedListV2Wrapper {
    
    @JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupedListV2.base", "GroupedListV2Wrapper")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupedListV2.base", "GroupedListV2Wrapper.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: IGroupedListV2Props, previousState: IGroupedListV2State): IGroupedListV2State = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], previousState.asInstanceOf[js.Any])).asInstanceOf[IGroupedListV2State]
  }
  
  trait IGroupedListV2State extends StObject {
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var groups: js.UndefOr[js.Array[IGroup]] = js.undefined
    
    var items: js.UndefOr[js.Array[Any]] = js.undefined
    
    var listProps: js.UndefOr[IListProps[Any]] = js.undefined
    
    var selectionMode: js.UndefOr[SelectionMode] = js.undefined
  }
  object IGroupedListV2State {
    
    inline def apply(): IGroupedListV2State = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroupedListV2State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGroupedListV2State] (val x: Self) extends AnyVal {
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setGroups(value: js.Array[IGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      inline def setGroupsVarargs(value: IGroup*): Self = StObject.set(x, "groups", js.Array(value*))
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setListProps(value: IListProps[Any]): Self = StObject.set(x, "listProps", value.asInstanceOf[js.Any])
      
      inline def setListPropsUndefined: Self = StObject.set(x, "listProps", js.undefined)
      
      inline def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    }
  }
}
