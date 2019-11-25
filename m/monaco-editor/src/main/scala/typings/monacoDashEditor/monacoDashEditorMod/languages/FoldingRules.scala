package typings.monacoDashEditor.monacoDashEditorMod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldingRules extends js.Object {
  /**
    * Region markers used by the language.
    */
  var markers: js.UndefOr[FoldingMarkers] = js.undefined
  /**
    * Used by the indentation based strategy to decide whether empty lines belong to the previous or the next block.
    * A language adheres to the off-side rule if blocks in that language are expressed by their indentation.
    * See [wikipedia](https://en.wikipedia.org/wiki/Off-side_rule) for more information.
    * If not set, `false` is used and empty lines belong to the previous block.
    */
  var offSide: js.UndefOr[Boolean] = js.undefined
}

object FoldingRules {
  @scala.inline
  def apply(markers: FoldingMarkers = null, offSide: js.UndefOr[Boolean] = js.undefined): FoldingRules = {
    val __obj = js.Dynamic.literal()
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (!js.isUndefined(offSide)) __obj.updateDynamic("offSide")(offSide.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldingRules]
  }
}

