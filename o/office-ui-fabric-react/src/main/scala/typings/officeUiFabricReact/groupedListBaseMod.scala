package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.Compact
import typings.officeUiFabricReact.groupedListTypesMod.IGroup
import typings.officeUiFabricReact.groupedListTypesMod.IGroupedList
import typings.officeUiFabricReact.groupedListTypesMod.IGroupedListProps
import typings.officeUiFabricReact.listTypesMod.IListProps
import typings.react.mod.Component
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupedListBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupedList.base", "GroupedListBase")
  @js.native
  open class GroupedListBase protected ()
    extends Component[IGroupedListProps, IGroupedListState, Any]
       with IGroupedList {
    def this(props: IGroupedListProps) = this()
    
    /* private */ var _classNames: Any = js.native
    
    /* private */ var _computeIsSomeGroupExpanded: Any = js.native
    
    /* private */ var _forceListUpdates: Any = js.native
    
    /* private */ var _getDefaultGroupItemLimit: Any = js.native
    
    /* private */ var _getGroupHeight: Any = js.native
    
    /* private */ var _getGroupItemLimit: Any = js.native
    
    /* private */ var _getGroupKey: Any = js.native
    
    /* private */ var _getGroupNestingDepth: Any = js.native
    
    /* private */ var _getPageHeight: Any = js.native
    
    /* private */ var _getPageSpecification: Any = js.native
    
    /* private */ var _isInnerZoneKeystroke: Any = js.native
    
    /* private */ var _isSomeGroupExpanded: Any = js.native
    
    /* private */ var _list: Any = js.native
    
    /* private */ var _onToggleCollapse: Any = js.native
    
    /* private */ var _onToggleSelectGroup: Any = js.native
    
    /* private */ var _onToggleSummarize: Any = js.native
    
    /* private */ var _renderGroup: Any = js.native
    
    /* private */ var _returnOne: Any = js.native
    
    /* private */ var _setGroupsCollapsedState: Any = js.native
    
    /* private */ var _updateIsSomeGroupExpanded: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MGroupedListBase(): Unit = js.native
    
    /**
      * Force the component to update.
      */
    /* InferMemberOverrides */
    override def forceUpdate(): Unit = js.native
  }
  /* static members */
  object GroupedListBase {
    
    @JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupedList.base", "GroupedListBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupedList.base", "GroupedListBase.defaultProps")
    @js.native
    def defaultProps: Compact = js.native
    inline def defaultProps_=(x: Compact): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: IGroupedListProps, previousState: IGroupedListState): IGroupedListState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], previousState.asInstanceOf[js.Any])).asInstanceOf[IGroupedListState]
  }
  
  trait IGroupedListState extends StObject {
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var groups: js.UndefOr[js.Array[IGroup]] = js.undefined
    
    var items: js.UndefOr[js.Array[Any]] = js.undefined
    
    var listProps: js.UndefOr[IListProps[Any]] = js.undefined
    
    var selectionMode: js.UndefOr[SelectionMode] = js.undefined
  }
  object IGroupedListState {
    
    inline def apply(): IGroupedListState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroupedListState]
    }
    
    extension [Self <: IGroupedListState](x: Self) {
      
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
