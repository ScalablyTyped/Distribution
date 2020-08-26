package typings.officeUiFabricReact.dragDropHelperMod

import typings.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/dragdrop/DragDropHelper", "DragDropHelper")
@js.native
class DragDropHelper protected () extends IDragDropHelper {
  def this(params: IDragDropHelperParams) = this()
  var _activeTargets: js.Any = js.native
  var _dragData: js.Any = js.native
  var _dragEnterCounts: js.Any = js.native
  var _events: js.Any = js.native
  var _initialized: js.Any = js.native
  /**
    * determine whether the child target is a descendant of the parent
    */
  var _isChild: js.Any = js.native
  var _isDraggable: js.Any = js.native
  var _isDragging: js.Any = js.native
  var _isDroppable: js.Any = js.native
  var _lastId: js.Any = js.native
  /**
    * clear drag data when mouse up outside of the document
    */
  var _onDocumentMouseUp: js.Any = js.native
  var _onDragEnd: js.Any = js.native
  /**
    * when mouse down on a draggable item, we start to track dragdata.
    */
  var _onMouseDown: js.Any = js.native
  /**
    * when mouse leave a target while dragging some items, fire dragleave to the target
    */
  var _onMouseLeave: js.Any = js.native
  /**
    * when mouse move over a new drop target while dragging some items,
    * fire dragleave on the old target and fire dragenter to the new target
    * The target will handle style change on dragenter and dragleave events.
    */
  var _onMouseMove: js.Any = js.native
  /**
    * clear drag data when mouse up on body
    */
  var _onMouseUp: js.Any = js.native
  var _selection: js.Any = js.native
}

