package typings.atPhosphorDragdrop.atPhosphorDragdropMod

import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.MimeData
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/dragdrop", "Drag")
@js.native
object DragNs extends js.Object {
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
  
  /**
    * Override the cursor icon for the entire document.
    *
    * @param cursor - The string representing the cursor style.
    *
    * @returns A disposable which will clear the override when disposed.
    *
    * #### Notes
    * The most recent call to `overrideCursor` takes precedence.
    * Disposing an old override has no effect on the current override.
    *
    * This utility function is used by the `Drag` class to override the
    * mouse cursor during a drag-drop operation, but it can also be used
    * by other classes to fix the cursor icon during normal mouse drags.
    *
    * #### Example
    * ```typescript
    * import { Drag } from '@phosphor/dragdrop';
    *
    * // Force the cursor to be 'wait' for the entire document.
    * let override = Drag.overrideCursor('wait');
    *
    * // Clear the override by disposing the return value.
    * override.dispose();
    * ```
    */
  def overrideCursor(cursor: String): IDisposable = js.native
}

