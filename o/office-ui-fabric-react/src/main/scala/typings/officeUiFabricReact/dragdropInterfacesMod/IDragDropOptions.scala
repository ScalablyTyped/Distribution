package typings.officeUiFabricReact.dragdropInterfacesMod

import typings.officeUiFabricReact.AnonCallback
import typings.std.DragEvent
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragDropOptions extends js.Object {
  /**
    * Whether or not drag action is allowed.
    */
  var canDrag: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /**
    * Whether or not drop action is allowed.
    */
  var canDrop: js.UndefOr[
    js.Function2[
      /* dropContext */ js.UndefOr[IDragDropContext], 
      /* dragContext */ js.UndefOr[IDragDropContext], 
      Boolean
    ]
  ] = js.undefined
  /**
    * Context associated with drag and drop event.
    */
  var context: IDragDropContext
  /**
    * Map of event name to callback function to subscribe to.
    */
  var eventMap: js.UndefOr[js.Array[AnonCallback]] = js.undefined
  /**
    * Unique key to associate with instance.
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * On drag end event callback.
    */
  var onDragEnd: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], Unit]
  ] = js.undefined
  /**
    * On drag over element(s) event callback.
    */
  var onDragOver: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], Unit]
  ] = js.undefined
  /**
    * On drag start event callback.
    */
  var onDragStart: js.UndefOr[
    js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* itemIndex */ js.UndefOr[Double], 
      /* selectedItems */ js.UndefOr[js.Array[_]], 
      /* event */ js.UndefOr[MouseEvent], 
      Unit
    ]
  ] = js.undefined
  /**
    * On drop event callback.
    */
  var onDrop: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], Unit]
  ] = js.undefined
  /**
    * Selection index on drag and drop event.
    */
  var selectionIndex: Double
  /**
    * Callback on drop state update.
    */
  def updateDropState(isDropping: Boolean, event: DragEvent): Unit
}

object IDragDropOptions {
  @scala.inline
  def apply(
    context: IDragDropContext,
    selectionIndex: Double,
    updateDropState: (Boolean, DragEvent) => Unit,
    canDrag: /* item */ js.UndefOr[js.Any] => Boolean = null,
    canDrop: (/* dropContext */ js.UndefOr[IDragDropContext], /* dragContext */ js.UndefOr[IDragDropContext]) => Boolean = null,
    eventMap: js.Array[AnonCallback] = null,
    key: String = null,
    onDragEnd: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Unit = null,
    onDragOver: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Unit = null,
    onDragStart: (/* item */ js.UndefOr[js.Any], /* itemIndex */ js.UndefOr[Double], /* selectedItems */ js.UndefOr[js.Array[_]], /* event */ js.UndefOr[MouseEvent]) => Unit = null,
    onDrop: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Unit = null
  ): IDragDropOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], selectionIndex = selectionIndex.asInstanceOf[js.Any], updateDropState = js.Any.fromFunction2(updateDropState))
    if (canDrag != null) __obj.updateDynamic("canDrag")(js.Any.fromFunction1(canDrag))
    if (canDrop != null) __obj.updateDynamic("canDrop")(js.Any.fromFunction2(canDrop))
    if (eventMap != null) __obj.updateDynamic("eventMap")(eventMap.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction2(onDragEnd))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction2(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction4(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction2(onDrop))
    __obj.asInstanceOf[IDragDropOptions]
  }
}

