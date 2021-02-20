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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupedListBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupedList.base", "GroupedListBase")
  @js.native
  class GroupedListBase protected ()
    extends Component[IGroupedListProps, IGroupedListState, js.Any]
       with IGroupedList {
    def this(props: IGroupedListProps) = this()
    
    var _classNames: js.Any = js.native
    
    var _computeIsSomeGroupExpanded: js.Any = js.native
    
    var _forceListUpdates: js.Any = js.native
    
    var _getDefaultGroupItemLimit: js.Any = js.native
    
    var _getGroupHeight: js.Any = js.native
    
    var _getGroupItemLimit: js.Any = js.native
    
    var _getGroupKey: js.Any = js.native
    
    var _getGroupNestingDepth: js.Any = js.native
    
    var _getPageHeight: js.Any = js.native
    
    var _getPageSpecification: js.Any = js.native
    
    var _isInnerZoneKeystroke: js.Any = js.native
    
    var _isSomeGroupExpanded: js.Any = js.native
    
    var _list: js.Any = js.native
    
    var _onToggleCollapse: js.Any = js.native
    
    var _onToggleSelectGroup: js.Any = js.native
    
    var _onToggleSummarize: js.Any = js.native
    
    var _renderGroup: js.Any = js.native
    
    var _returnOne: js.Any = js.native
    
    var _setGroupsCollapsedState: js.Any = js.native
    
    var _updateIsSomeGroupExpanded: js.Any = js.native
    
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
    @scala.inline
    def defaultProps_=(x: Compact): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupedList.base", "GroupedListBase.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: IGroupedListProps, previousState: IGroupedListState): IGroupedListState = js.native
  }
  
  @js.native
  trait IGroupedListState extends StObject {
    
    var compact: js.UndefOr[Boolean] = js.native
    
    var groups: js.UndefOr[js.Array[IGroup]] = js.native
    
    var items: js.UndefOr[js.Array[_]] = js.native
    
    var listProps: js.UndefOr[IListProps[_]] = js.native
    
    var selectionMode: js.UndefOr[SelectionMode] = js.native
  }
  object IGroupedListState {
    
    @scala.inline
    def apply(): IGroupedListState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroupedListState]
    }
    
    @scala.inline
    implicit class IGroupedListStateMutableBuilder[Self <: IGroupedListState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setGroups(value: js.Array[IGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      @scala.inline
      def setGroupsVarargs(value: IGroup*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setItems(value: js.Array[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setListProps(value: IListProps[_]): Self = StObject.set(x, "listProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListPropsUndefined: Self = StObject.set(x, "listProps", js.undefined)
      
      @scala.inline
      def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    }
  }
}
