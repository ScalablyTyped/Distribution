package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoldingRange extends js.Object {
  /**
    * The one-based end line of the range to fold. The folded area ends with the line's last character.
    */
  var end: Double = js.native
  /**
    * Describes the [Kind](#FoldingRangeKind) of the folding range such as [Comment](#FoldingRangeKind.Comment) or
    * [Region](#FoldingRangeKind.Region). The kind is used to categorize folding ranges and used by commands
    * like 'Fold all comments'. See
    * [FoldingRangeKind](#FoldingRangeKind) for an enumeration of standardized kinds.
    */
  var kind: js.UndefOr[FoldingRangeKind] = js.native
  /**
    * The one-based start line of the range to fold. The folded area starts after the line's last character.
    */
  var start: Double = js.native
}

object FoldingRange {
  @scala.inline
  def apply(end: Double, start: Double): FoldingRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldingRange]
  }
  @scala.inline
  implicit class FoldingRangeOps[Self <: FoldingRange] (val x: Self) extends AnyVal {
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
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: FoldingRangeKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

