package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIdentifiedSingleEditOperation extends js.Object {
  /**
    * This indicates that this operation has "insert" semantics.
    * i.e. forceMoveMarkers = true => if `range` is collapsed, all markers at the position will be moved.
    */
  var forceMoveMarkers: js.UndefOr[Boolean] = js.undefined
  /**
    * The range to replace. This can be empty to emulate a simple insert.
    */
  var range: Range
  /**
    * The text to replace with. This can be null to emulate a simple delete.
    */
  var text: String | Null
}

object IIdentifiedSingleEditOperation {
  @scala.inline
  def apply(range: Range, forceMoveMarkers: js.UndefOr[Boolean] = js.undefined, text: String = null): IIdentifiedSingleEditOperation = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    if (!js.isUndefined(forceMoveMarkers)) __obj.updateDynamic("forceMoveMarkers")(forceMoveMarkers.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIdentifiedSingleEditOperation]
  }
}

