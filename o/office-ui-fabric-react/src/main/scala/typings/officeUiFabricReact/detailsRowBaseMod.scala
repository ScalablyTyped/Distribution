package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.Column
import typings.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsRowCheckProps
import typings.officeUiFabricReact.detailsRowTypesMod.IDetailsRowBaseProps
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detailsRowBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsRow.base", "DetailsRowBase")
  @js.native
  open class DetailsRowBase protected () extends Component[IDetailsRowBaseProps, IDetailsRowState, Any] {
    def this(props: IDetailsRowBaseProps) = this()
    
    /* private */ var _ariaRowDescriptionId: Any = js.native
    
    /* private */ var _cellMeasurer: Any = js.native
    
    /* private */ var _classNames: Any = js.native
    
    /* private */ var _dragDropSubscription: Any = js.native
    
    /* private */ var _droppingClassNames: Any = js.native
    
    /* private */ var _events: Any = js.native
    
    /* private */ var _focusZone: Any = js.native
    
    /* private */ var _getRowDragDropOptions: Any = js.native
    
    /** Whether this.props.onDidMount has been called */
    /* private */ var _onDidMountCalled: Any = js.native
    
    /* protected */ def _onRenderCheck(props: IDetailsRowCheckProps): Element = js.native
    
    /* private */ var _onSelectionChanged: Any = js.native
    
    /* private */ var _root: Any = js.native
    
    /* private */ var _rowClassNames: Any = js.native
    
    /**
      * update isDropping state based on the input value, which is used to change style during drag and drop
      *
      * when change to true, that means drag enter. we will add default dropping class name
      * or the custom dropping class name (return result from onDragEnter) to the root elemet.
      *
      * when change to false, that means drag leave. we will remove the dropping class name from root element.
      *
      * @param newValue - New isDropping state value
      * @param event - The event trigger dropping state change which can be dragenter, dragleave etc
      */
    /* private */ var _updateDroppingState: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MDetailsRowBase(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDetailsRowBase(previousProps: IDetailsRowBaseProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDetailsRowBase(): Unit = js.native
    
    def focus(): Boolean = js.native
    def focus(forceIntoFirstElement: Boolean): Boolean = js.native
    
    /**
      * measure cell at index. and call the call back with the measured cell width when finish measure
      *
      * @param index - The cell index
      * @param onMeasureDone - The call back function when finish measure
      */
    def measureCell(index: Double, onMeasureDone: js.Function1[/* width */ Double, Unit]): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MDetailsRowBase(nextProps: IDetailsRowBaseProps, nextState: IDetailsRowState): Boolean = js.native
  }
  /* static members */
  object DetailsRowBase {
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsRow.base", "DetailsRowBase")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromProps(nextProps: IDetailsRowBaseProps, previousState: IDetailsRowState): IDetailsRowState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], previousState.asInstanceOf[js.Any])).asInstanceOf[IDetailsRowState]
  }
  
  trait IDetailsRowSelectionState extends StObject {
    
    var isSelected: Boolean
    
    var isSelectionModal: Boolean
  }
  object IDetailsRowSelectionState {
    
    inline def apply(isSelected: Boolean, isSelectionModal: Boolean): IDetailsRowSelectionState = {
      val __obj = js.Dynamic.literal(isSelected = isSelected.asInstanceOf[js.Any], isSelectionModal = isSelectionModal.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsRowSelectionState]
    }
    
    extension [Self <: IDetailsRowSelectionState](x: Self) {
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectionModal(value: Boolean): Self = StObject.set(x, "isSelectionModal", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDetailsRowState extends StObject {
    
    var columnMeasureInfo: js.UndefOr[Column] = js.undefined
    
    var isDropping: js.UndefOr[Boolean] = js.undefined
    
    var selectionState: IDetailsRowSelectionState
  }
  object IDetailsRowState {
    
    inline def apply(selectionState: IDetailsRowSelectionState): IDetailsRowState = {
      val __obj = js.Dynamic.literal(selectionState = selectionState.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsRowState]
    }
    
    extension [Self <: IDetailsRowState](x: Self) {
      
      inline def setColumnMeasureInfo(value: Column): Self = StObject.set(x, "columnMeasureInfo", value.asInstanceOf[js.Any])
      
      inline def setColumnMeasureInfoUndefined: Self = StObject.set(x, "columnMeasureInfo", js.undefined)
      
      inline def setIsDropping(value: Boolean): Self = StObject.set(x, "isDropping", value.asInstanceOf[js.Any])
      
      inline def setIsDroppingUndefined: Self = StObject.set(x, "isDropping", js.undefined)
      
      inline def setSelectionState(value: IDetailsRowSelectionState): Self = StObject.set(x, "selectionState", value.asInstanceOf[js.Any])
    }
  }
}
