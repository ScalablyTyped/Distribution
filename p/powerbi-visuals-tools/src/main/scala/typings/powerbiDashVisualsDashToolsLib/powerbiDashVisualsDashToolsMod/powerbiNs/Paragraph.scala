package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paragraph extends js.Object {
  var horizontalTextAlignment: js.UndefOr[java.lang.String] = js.undefined
  var textRuns: js.Array[TextRun]
}

object Paragraph {
  @scala.inline
  def apply(textRuns: js.Array[TextRun], horizontalTextAlignment: java.lang.String = null): Paragraph = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("textRuns")(textRuns)
    if (horizontalTextAlignment != null) __obj.updateDynamic("horizontalTextAlignment")(horizontalTextAlignment)
    __obj.asInstanceOf[Paragraph]
  }
}

