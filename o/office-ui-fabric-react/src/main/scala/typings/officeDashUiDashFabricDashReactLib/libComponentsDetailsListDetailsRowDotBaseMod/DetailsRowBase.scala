package typings
package officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsRow.base", "DetailsRowBase")
@js.native
class DetailsRowBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowDotTypesMod.IDetailsRowBaseProps, 
      IDetailsRowState
    ] {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowDotTypesMod.IDetailsRowBaseProps) = this()
  var _cellMeasurer: js.Any = js.native
  var _dragDropSubscription: js.Any = js.native
  var _droppingClassNames: js.Any = js.native
  var _focusZone: js.Any = js.native
  var _hasMounted: js.Any = js.native
  var _onRootRef: js.Any = js.native
  var _root: js.Any = js.native
  /* private */ def _getRowDragDropOptions(): js.Any = js.native
  /* private */ def _getSelectionState(props: js.Any): js.Any = js.native
  /* protected */ def _onRenderCheck(
    props: officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowCheckDotTypesMod.IDetailsRowCheckProps
  ): reactLib.reactMod.Global.JSXNs.Element = js.native
  /* private */ def _onSelectionChanged(): js.Any = js.native
  /* private */ def _onToggleSelection(): js.Any = js.native
  /**
       * update isDropping state based on the input value, which is used to change style during drag and drop
       *
       * when change to true, that means drag enter. we will add default dropping class name
       * or the custom dropping class name (return result from onDragEnter) to the root elemet.
       *
       * when change to false, that means drag leave. we will remove the dropping class name from root element.
       *
       * @private
       * @param {boolean} newValue (new isDropping state value)
       * @param {DragEvent} event (the event trigger dropping state change which can be dragenter, dragleave etc)
       */
  /* private */ def _updateDroppingState(newValue: js.Any, event: js.Any): js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MDetailsRowBase(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDetailsRowBase(
    previousProps: officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowDotTypesMod.IDetailsRowBaseProps
  ): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MDetailsRowBase(
    newProps: officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowDotTypesMod.IDetailsRowBaseProps
  ): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MDetailsRowBase(): scala.Unit = js.native
  def focus(): scala.Boolean = js.native
  def focus(forceIntoFirstElement: scala.Boolean): scala.Boolean = js.native
  /**
       * measure cell at index. and call the call back with the measured cell width when finish measure
       *
       * @param {number} index (the cell index)
       * @param {(width: number) => void} onMeasureDone (the call back function when finish measure)
       */
  def measureCell(index: scala.Double, onMeasureDone: js.Function1[/* width */ scala.Double, scala.Unit]): scala.Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MDetailsRowBase(
    nextProps: officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowDotTypesMod.IDetailsRowBaseProps,
    nextState: IDetailsRowState
  ): scala.Boolean = js.native
}

