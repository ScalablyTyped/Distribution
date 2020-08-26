package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISingleEditOperation extends js.Object {
  /**
    * This indicates that this operation has "insert" semantics.
    * i.e. forceMoveMarkers = true => if `range` is collapsed, all markers at the position will be moved.
    */
  var forceMoveMarkers: js.UndefOr[Boolean] = js.native
  /**
    * The range to replace. This can be empty to emulate a simple insert.
    */
  var range: IRange = js.native
  /**
    * The text to replace with. This can be null to emulate a simple delete.
    */
  var text: String | Null = js.native
}

object ISingleEditOperation {
  @scala.inline
  def apply(range: IRange): ISingleEditOperation = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISingleEditOperation]
  }
  @scala.inline
  implicit class ISingleEditOperationOps[Self <: ISingleEditOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRange(value: IRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setForceMoveMarkers(value: Boolean): Self = this.set("forceMoveMarkers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceMoveMarkers: Self = this.set("forceMoveMarkers", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextNull: Self = this.set("text", null)
  }
  
}

