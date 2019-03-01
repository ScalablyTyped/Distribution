package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewRepetitionObjectDescriptor extends js.Object {
  /** Properties used for formatting (e.g., Conditional Formatting). */
  var formattingProperties: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object DataViewRepetitionObjectDescriptor {
  @scala.inline
  def apply(formattingProperties: js.Array[java.lang.String] = null): DataViewRepetitionObjectDescriptor = {
    val __obj = js.Dynamic.literal()
    if (formattingProperties != null) __obj.updateDynamic("formattingProperties")(formattingProperties)
    __obj.asInstanceOf[DataViewRepetitionObjectDescriptor]
  }
}

