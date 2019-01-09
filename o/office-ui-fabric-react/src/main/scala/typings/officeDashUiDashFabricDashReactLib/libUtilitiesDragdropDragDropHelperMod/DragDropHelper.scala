package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesDragdropDragDropHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/dragdrop/DragDropHelper", "DragDropHelper")
@js.native
class DragDropHelper protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesDragdropInterfacesMod.IDragDropHelper {
  def this(params: IDragDropHelperParams) = this()
  var _activeTargets: js.Any = js.native
  var _dragData: js.Any = js.native
  var _dragEnterCounts: js.Any = js.native
  var _events: js.Any = js.native
  var _isDragging: js.Any = js.native
  var _lastId: js.Any = js.native
  var _selection: js.Any = js.native
  /**
    * determine whether the child target is a descendant of the parent
    */
  /* private */ def _isChild(parent: js.Any, child: js.Any): js.Any = js.native
  /* private */ def _isDraggable(target: js.Any): js.Any = js.native
  /* private */ def _isDroppable(target: js.Any): js.Any = js.native
  /**
    * clear drag data when mouse up outside of the document
    */
  /* private */ def _onDocumentMouseUp(event: js.Any): js.Any = js.native
  /* private */ def _onDragEnd(target: js.Any, event: js.Any): js.Any = js.native
  /**
    * when mouse down on a draggable item, we start to track dragdata.
    */
  /* private */ def _onMouseDown(target: js.Any, event: js.Any): js.Any = js.native
  /**
    * when mouse leave a target while dragging some items, fire dragleave to the target
    */
  /* private */ def _onMouseLeave(target: js.Any, event: js.Any): js.Any = js.native
  /**
    * when mouse move over a new drop target while dragging some items,
    * fire dragleave on the old target and fire dragenter to the new target
    * The target will handle style change on dragenter and dragleave events.
    */
  /* private */ def _onMouseMove(target: js.Any, event: js.Any): js.Any = js.native
  /**
    * clear drag data when mouse up on body
    */
  /* private */ def _onMouseUp(event: js.Any): js.Any = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /* CompleteClass */
  override def subscribe(
    root: reactLib.HTMLElement,
    events: officeDashUiDashFabricDashReactLib.libUtilitiesMod.EventGroup,
    options: officeDashUiDashFabricDashReactLib.libUtilitiesDragdropInterfacesMod.IDragDropOptions
  ): officeDashUiDashFabricDashReactLib.Anon_Dispose = js.native
  /* CompleteClass */
  override def unsubscribe(root: reactLib.HTMLElement, key: java.lang.String): scala.Unit = js.native
}

