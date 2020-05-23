package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISingleEditOperation extends js.Object {
  /**
    * This indicates that this operation has "insert" semantics.
    * i.e. forceMoveMarkers = true => if `range` is collapsed, all markers at the position will be moved.
    */
  var forceMoveMarkers: js.UndefOr[Boolean] = js.undefined
  /**
    * The range to replace. This can be empty to emulate a simple insert.
    */
  var range: IRange
  /**
    * The text to replace with. This can be null to emulate a simple delete.
    */
  var text: String | Null
}

object ISingleEditOperation {
  @scala.inline
  def apply(range: IRange, forceMoveMarkers: js.UndefOr[Boolean] = js.undefined, text: String = null): ISingleEditOperation = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (!js.isUndefined(forceMoveMarkers)) __obj.updateDynamic("forceMoveMarkers")(forceMoveMarkers.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISingleEditOperation]
  }
}

