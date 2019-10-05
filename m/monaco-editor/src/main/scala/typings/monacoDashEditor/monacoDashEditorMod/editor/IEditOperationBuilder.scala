package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.monacoDashEditor.monacoDashEditorMod.Range
import typings.monacoDashEditor.monacoDashEditorMod.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditOperationBuilder extends js.Object {
  def addEditOperation(range: Range): Unit = js.native
  /**
    * Add a new edit operation (a replace operation).
    * @param range The range to replace (delete). May be empty to represent a simple insert.
    * @param text The text to replace with. May be null to represent a simple delete.
    */
  def addEditOperation(range: Range, text: String): Unit = js.native
  def addTrackedEditOperation(range: Range): Unit = js.native
  /**
    * Add a new edit operation (a replace operation).
    * The inverse edits will be accessible in `ICursorStateComputerData.getInverseEditOperations()`
    * @param range The range to replace (delete). May be empty to represent a simple insert.
    * @param text The text to replace with. May be null to represent a simple delete.
    */
  def addTrackedEditOperation(range: Range, text: String): Unit = js.native
  /**
    * Track `selection` when applying edit operations.
    * A best effort will be made to not grow/expand the selection.
    * An empty selection will clamp to a nearby character.
    * @param selection The selection to track.
    * @param trackPreviousOnEmpty If set, and the selection is empty, indicates whether the selection
    *           should clamp to the previous or the next character.
    * @return A unique identifier.
    */
  def trackSelection(selection: Selection): String = js.native
  def trackSelection(selection: Selection, trackPreviousOnEmpty: Boolean): String = js.native
}

