package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.CollapseAllVisibility
import typings.officeUiFabricReact.libComponentsDetailsListDetailsHeaderDottypesMod.IDetailsHeader
import typings.officeUiFabricReact.libComponentsDetailsListDetailsHeaderDottypesMod.IDetailsHeaderBaseProps
import typings.officeUiFabricReact.libComponentsDetailsListDetailsHeaderDottypesMod.IDetailsHeaderState
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDetailsListDetailsHeaderDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsHeader.base", "DetailsHeaderBase")
  @js.native
  open class DetailsHeaderBase protected ()
    extends Component[IDetailsHeaderBaseProps, IDetailsHeaderState, Any]
       with IDetailsHeader {
    def this(props: IDetailsHeaderBaseProps) = this()
    
    /* private */ var _classNames: Any = js.native
    
    /**
      * Based on the given cursor position, finds the nearest drop hint and updates the state to make it visible
      */
    /* private */ var _computeDropHintToBeShown: Any = js.native
    
    /* private */ var _currentDropHintIndex: Any = js.native
    
    /* private */ var _dragDropHelper: Any = js.native
    
    /* private */ var _draggedColumnIndex: Any = js.native
    
    /* private */ var _dropHintDetails: Any = js.native
    
    /* private */ var _events: Any = js.native
    
    /**
      * Gets column reorder props from this.props. If the calling code is part of setting up or
      * handling drag/drop events, it's safe to assume that this method's return value is defined
      * (because drag/drop handling will only be set up if reorder props are given).
      */
    /* private */ var _getColumnReorderProps: Any = js.native
    
    /* private */ var _getDropHintPositions: Any = js.native
    
    /* private */ var _getHeaderDragDropOptions: Any = js.native
    
    /* private */ var _id: Any = js.native
    
    /**
      * @returns whether or not the "Select All" checkbox column is hidden.
      */
    /* private */ var _isCheckboxColumnHidden: Any = js.native
    
    /* private */ var _isEventOnHeader: Any = js.native
    
    /* private */ var _isValidCurrentDropHintIndex: Any = js.native
    
    /* private */ var _onDragOver: Any = js.native
    
    /* private */ var _onDrop: Any = js.native
    
    /* private */ var _onDropIndexInfo: Any = js.native
    
    /* private */ var _onRenderColumnHeaderTooltip: Any = js.native
    
    /* private */ var _onRootKeyDown: Any = js.native
    
    /* private */ var _onRootMouseDown: Any = js.native
    
    /* private */ var _onRootMouseMove: Any = js.native
    
    /**
      * Called when the select all toggle is clicked.
      */
    /* private */ var _onSelectAllClicked: Any = js.native
    
    /* private */ var _onSelectionChanged: Any = js.native
    
    /* private */ var _onSizerBlur: Any = js.native
    
    /**
      * double click on the column sizer will auto ajust column width
      * to fit the longest content among current rendered rows.
      *
      * @param columnIndex - index of the column user double clicked
      * @param ev - mouse double click event
      */
    /* private */ var _onSizerDoubleClick: Any = js.native
    
    /**
      * mouse move event handler in the header
      * it will set isSizing state to true when user clicked on the sizer and move the mouse.
      *
      * @param ev - mouse move event
      */
    /* private */ var _onSizerMouseMove: Any = js.native
    
    /**
      * mouse up event handler in the header
      * clear the resize related state.
      * This is to ensure we can catch double click event
      *
      * @param ev - mouse up event
      */
    /* private */ var _onSizerMouseUp: Any = js.native
    
    /* private */ var _onToggleCollapseAll: Any = js.native
    
    /* private */ var _renderColumnDivider: Any = js.native
    
    /* private */ var _renderColumnSizer: Any = js.native
    
    /* private */ var _renderDropHint: Any = js.native
    
    /* private */ var _resetDropHints: Any = js.native
    
    /* private */ var _rootComponent: Any = js.native
    
    /* private */ var _rootElement: Any = js.native
    
    /* private */ var _subscriptionObject: Any = js.native
    
    /* private */ var _updateDragInfo: Any = js.native
    
    /* private */ var _updateDropHintElement: Any = js.native
    
    /* private */ var _updateDroppingState: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MDetailsHeaderBase(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDetailsHeaderBase(prevProps: IDetailsHeaderBaseProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDetailsHeaderBase(): Unit = js.native
    
    /** sets focus into the header */
    /* CompleteClass */
    override def focus(): Boolean = js.native
  }
  /* static members */
  object DetailsHeaderBase {
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsHeader.base", "DetailsHeaderBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsHeader.base", "DetailsHeaderBase.defaultProps")
    @js.native
    def defaultProps: CollapseAllVisibility = js.native
    inline def defaultProps_=(x: CollapseAllVisibility): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
