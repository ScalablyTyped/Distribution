package typings.atPhosphorDragdrop.atPhosphorDragdropMod.Drag

import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.MimeData
import typings.atPhosphorDragdrop.atPhosphorDragdropMod.DropAction
import typings.atPhosphorDragdrop.atPhosphorDragdropMod.SupportedActions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a `Drag` object.
  */
trait IOptions extends js.Object {
  /**
    * An optional drag image which follows the mouse cursor.
    *
    * #### Notes
    * The drag image can be any DOM element. It is not limited to
    * image or canvas elements as with the native drag-drop APIs.
    *
    * If provided, this will be positioned at the mouse cursor on each
    * mouse move event. A CSS transform can be used to offset the node
    * from its specified position.
    *
    * The drag image will automatically have the `p-mod-drag-image`
    * class name added.
    *
    * The default value is `null`.
    */
  var dragImage: js.UndefOr[HTMLElement] = js.undefined
  /**
    * The populated mime data for the drag operation.
    */
  var mimeData: MimeData
  /**
    * The optional proposed drop action for the drag operation.
    *
    * #### Notes
    * This can be provided as a hint to the drop targets as to which
    * drop action is preferred.
    *
    * The default value is `'copy'`.
    */
  var proposedAction: js.UndefOr[DropAction] = js.undefined
  /**
    * An optional object which indicates the source of the drag.
    *
    * #### Notes
    * For advanced applications, the drag initiator may wish to expose
    * a source object to the drop targets. That object can be specified
    * here and will be carried along with the drag events.
    *
    * The default value is `null`.
    */
  var source: js.UndefOr[js.Any] = js.undefined
  /**
    * The drop actions supported by the drag initiator.
    *
    * #### Notes
    * A drop target must indicate that it intends to perform one of the
    * supported actions in order to receive a drop event. However, it is
    * not required to *actually* perform that action when handling the
    * drop event. Therefore, the initiator must be prepared to handle
    * any drop action performed by a drop target.
    *
    * The default value is `'all'`.
    */
  var supportedActions: js.UndefOr[SupportedActions] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    mimeData: MimeData,
    dragImage: HTMLElement = null,
    proposedAction: DropAction = null,
    source: js.Any = null,
    supportedActions: SupportedActions = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(mimeData = mimeData.asInstanceOf[js.Any])
    if (dragImage != null) __obj.updateDynamic("dragImage")(dragImage.asInstanceOf[js.Any])
    if (proposedAction != null) __obj.updateDynamic("proposedAction")(proposedAction.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (supportedActions != null) __obj.updateDynamic("supportedActions")(supportedActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

