package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LabelCut extends js.Object {
  var labelCut: js.UndefOr[java.lang.String] = js.undefined
  var labelPasteAfter: js.UndefOr[java.lang.String] = js.undefined
  var labelPasteBefore: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_LabelCut {
  @scala.inline
  def apply(
    labelCut: java.lang.String = null,
    labelPasteAfter: java.lang.String = null,
    labelPasteBefore: java.lang.String = null
  ): Anon_LabelCut = {
    val __obj = js.Dynamic.literal()
    if (labelCut != null) __obj.updateDynamic("labelCut")(labelCut)
    if (labelPasteAfter != null) __obj.updateDynamic("labelPasteAfter")(labelPasteAfter)
    if (labelPasteBefore != null) __obj.updateDynamic("labelPasteBefore")(labelPasteBefore)
    __obj.asInstanceOf[Anon_LabelCut]
  }
}

