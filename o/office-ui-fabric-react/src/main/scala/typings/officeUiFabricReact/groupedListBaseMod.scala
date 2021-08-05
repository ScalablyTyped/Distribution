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
  class GroupedListBase protected ()
    extends Component[IGroupedListProps, IGroupedListState, js.Any]
       with IGroupedList {
    def this(props: IGroupedListProps) = this()
    
    /* private */ var _classNames: js.Any = js.native
    
    /* private */ var _computeIsSomeGroupExpanded: js.Any = js.native
    
    /* private */ var _forceListUpdates: js.Any = js.native
    
    /* private */ var _getDefaultGroupItemLimit: js.Any = js.native
    
    /* private */ var _getGroupHeight: js.Any = js.native
    
    /* private */ var _getGroupItemLimit: js.Any = js.native
    
    /* private */ var _getGroupKey: js.Any = js.native
    
    /* private */ var _getGroupNestingDepth: js.Any = js.native
    
    /* private */ var _getPageHeight: js.Any = js.native
    
    /* private */ var _getPageSpecification: js.Any = js.native
    
    /* private */ var _isInnerZoneKeystroke: js.Any = js.native
    
    /* private */ var _isSomeGroupExpanded: js.Any = js.native
    
    /* private */ var _list: js.Any = js.native
    
    /* private */ var _onToggleCollapse: js.Any = js.native
    
    /* private */ var _onToggleSelectGroup: js.Any = js.native
    
    /* private */ var _onToggleSummarize: js.Any = js.native
    
    /* private */ var _renderGroup: js.Any = js.native
    
    /* private */ var _returnOne: js.Any = js.native
    
    /* private */ var _setGroupsCollapsedState: js.Any = js.native
    
    /* private */ var _updateIsSomeGroupExpanded: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MGroupedListBase(): Unit = js.native
    
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
    
    var items: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var listProps: js.UndefOr[IListProps[js.Any]] = js.undefined
    
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
      
      inline def setGroupsVarargs(value: IGroup*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      inline def setItems(value: js.Array[js.Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setListProps(value: IListProps[js.Any]): Self = StObject.set(x, "listProps", value.asInstanceOf[js.Any])
      
      inline def setListPropsUndefined: Self = StObject.set(x, "listProps", js.undefined)
      
      inline def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    }
  }
}
