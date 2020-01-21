package typings.phosphorDragdrop.mod.Drag

import typings.phosphorDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/dragdrop", "Drag.overrideCursor")
@js.native
object overrideCursor extends js.Object {
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
  def apply(cursor: String): IDisposable = js.native
}

