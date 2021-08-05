package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.CollapseAllVisibility
import typings.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeader
import typings.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderBaseProps
import typings.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderState
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detailsHeaderBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsHeader.base", "DetailsHeaderBase")
  @js.native
  class DetailsHeaderBase protected ()
    extends Component[IDetailsHeaderBaseProps, IDetailsHeaderState, js.Any]
       with IDetailsHeader {
    def this(props: IDetailsHeaderBaseProps) = this()
    
    /* private */ var _classNames: js.Any = js.native
    
    /**
      * Based on the given cursor position, finds the nearest drop hint and updates the state to make it visible
      */
    /* private */ var _computeDropHintToBeShown: js.Any = js.native
    
    /* private */ var _currentDropHintIndex: js.Any = js.native
    
    /* private */ var _dragDropHelper: js.Any = js.native
    
    /* private */ var _draggedColumnIndex: js.Any = js.native
    
    /* private */ var _dropHintDetails: js.Any = js.native
    
    /* private */ var _events: js.Any = js.native
    
    /**
      * Gets column reorder props from this.props. If the calling code is part of setting up or
      * handling drag/drop events, it's safe to assume that this method's return value is defined
      * (because drag/drop handling will only be set up if reorder props are given).
      */
    /* private */ var _getColumnReorderProps: js.Any = js.native
    
    /* private */ var _getDropHintPositions: js.Any = js.native
    
    /* private */ var _getHeaderDragDropOptions: js.Any = js.native
    
    /* private */ var _id: js.Any = js.native
    
    /**
      * @returns whether or not the "Select All" checkbox column is hidden.
      */
    /* private */ var _isCheckboxColumnHidden: js.Any = js.native
    
    /* private */ var _isEventOnHeader: js.Any = js.native
    
    /* private */ var _isValidCurrentDropHintIndex: js.Any = js.native
    
    /* private */ var _onDragOver: js.Any = js.native
    
    /* private */ var _onDrop: js.Any = js.native
    
    /* private */ var _onDropIndexInfo: js.Any = js.native
    
    /* private */ var _onRenderColumnHeaderTooltip: js.Any = js.native
    
    /* private */ var _onRootKeyDown: js.Any = js.native
    
    /* private */ var _onRootMouseDown: js.Any = js.native
    
    /* private */ var _onRootMouseMove: js.Any = js.native
    
    /**
      * Called when the select all toggle is clicked.
      */
    /* private */ var _onSelectAllClicked: js.Any = js.native
    
    /* private */ var _onSelectionChanged: js.Any = js.native
    
    /* private */ var _onSizerBlur: js.Any = js.native
    
    /**
      * double click on the column sizer will auto ajust column width
      * to fit the longest content among current rendered rows.
      *
      * @param columnIndex - index of the column user double clicked
      * @param ev - mouse double click event
      */
    /* private */ var _onSizerDoubleClick: js.Any = js.native
    
    /**
      * mouse move event handler in the header
      * it will set isSizing state to true when user clicked on the sizer and move the mouse.
      *
      * @param ev - mouse move event
      */
    /* private */ var _onSizerMouseMove: js.Any = js.native
    
    /**
      * mouse up event handler in the header
      * clear the resize related state.
      * This is to ensure we can catch double click event
      *
      * @param ev - mouse up event
      */
    /* private */ var _onSizerMouseUp: js.Any = js.native
    
    /* private */ var _onToggleCollapseAll: js.Any = js.native
    
    /* private */ var _renderColumnDivider: js.Any = js.native
    
    /* private */ var _renderColumnSizer: js.Any = js.native
    
    /* private */ var _renderDropHint: js.Any = js.native
    
    /* private */ var _resetDropHints: js.Any = js.native
    
    /* private */ var _rootComponent: js.Any = js.native
    
    /* private */ var _rootElement: js.Any = js.native
    
    /* private */ var _subscriptionObject: js.Any = js.native
    
    /* private */ var _updateDragInfo: js.Any = js.native
    
    /* private */ var _updateDropHintElement: js.Any = js.native
    
    /* private */ var _updateDroppingState: js.Any = js.native
    
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
