package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LabelCut extends js.Object {
  var labelCut: js.UndefOr[String] = js.undefined
  var labelPasteAfter: js.UndefOr[String] = js.undefined
  var labelPasteBefore: js.UndefOr[String] = js.undefined
}

object Anon_LabelCut {
  @scala.inline
  def apply(labelCut: String = null, labelPasteAfter: String = null, labelPasteBefore: String = null): Anon_LabelCut = {
    val __obj = js.Dynamic.literal()
    if (labelCut != null) __obj.updateDynamic("labelCut")(labelCut.asInstanceOf[js.Any])
    if (labelPasteAfter != null) __obj.updateDynamic("labelPasteAfter")(labelPasteAfter.asInstanceOf[js.Any])
    if (labelPasteBefore != null) __obj.updateDynamic("labelPasteBefore")(labelPasteBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LabelCut]
  }
}

