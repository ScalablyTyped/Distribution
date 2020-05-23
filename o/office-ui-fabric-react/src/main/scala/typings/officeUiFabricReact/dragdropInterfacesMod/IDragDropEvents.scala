package typings.officeUiFabricReact.dragdropInterfacesMod

import typings.std.DragEvent
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragDropEvents extends js.Object {
  /**
    * Whether or not drag action is allowed.
    */
  var canDrag: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /**
    * Whether the whole group is draggable. This applies after canDrag returns true for the group.
    */
  var canDragGroups: js.UndefOr[Boolean] = js.undefined
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
    * On drag end event callback.
    */
  var onDragEnd: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], Unit]
  ] = js.undefined
  /**
    * On drag enter region event callback.
    * Returned string is the css classes that will be added to the entering element.
    */
  var onDragEnter: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], String]
  ] = js.undefined
  /**
    * On drag leave region event callback.
    */
  var onDragLeave: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent], Unit]
  ] = js.undefined
  /**
    * On drag over event callback.
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
}

object IDragDropEvents {
  @scala.inline
  def apply(
    canDrag: /* item */ js.UndefOr[js.Any] => Boolean = null,
    canDragGroups: js.UndefOr[Boolean] = js.undefined,
    canDrop: (/* dropContext */ js.UndefOr[IDragDropContext], /* dragContext */ js.UndefOr[IDragDropContext]) => Boolean = null,
    onDragEnd: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Unit = null,
    onDragEnter: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => String = null,
    onDragLeave: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Unit = null,
    onDragOver: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Unit = null,
    onDragStart: (/* item */ js.UndefOr[js.Any], /* itemIndex */ js.UndefOr[Double], /* selectedItems */ js.UndefOr[js.Array[_]], /* event */ js.UndefOr[MouseEvent]) => Unit = null,
    onDrop: (/* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[DragEvent]) => Unit = null
  ): IDragDropEvents = {
    val __obj = js.Dynamic.literal()
    if (canDrag != null) __obj.updateDynamic("canDrag")(js.Any.fromFunction1(canDrag))
    if (!js.isUndefined(canDragGroups)) __obj.updateDynamic("canDragGroups")(canDragGroups.get.asInstanceOf[js.Any])
    if (canDrop != null) __obj.updateDynamic("canDrop")(js.Any.fromFunction2(canDrop))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction2(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction2(onDragEnter))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction2(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction2(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction4(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction2(onDrop))
    __obj.asInstanceOf[IDragDropEvents]
  }
}

