package typings.monacoDashEditor.monacoDashEditorMod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldingRange extends js.Object {
  /**
    * The one-based end line of the range to fold. The folded area ends with the line's last character.
    */
  var end: Double
  /**
    * Describes the [Kind](#FoldingRangeKind) of the folding range such as [Comment](#FoldingRangeKind.Comment) or
    * [Region](#FoldingRangeKind.Region). The kind is used to categorize folding ranges and used by commands
    * like 'Fold all comments'. See
    * [FoldingRangeKind](#FoldingRangeKind) for an enumeration of standardized kinds.
    */
  var kind: js.UndefOr[FoldingRangeKind] = js.undefined
  /**
    * The one-based start line of the range to fold. The folded area starts after the line's last character.
    */
  var start: Double
}

object FoldingRange {
  @scala.inline
  def apply(end: Double, start: Double, kind: FoldingRangeKind = null): FoldingRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldingRange]
  }
}

