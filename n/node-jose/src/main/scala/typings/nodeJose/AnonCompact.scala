package typings.nodeJose

import typings.nodeJose.nodeJoseStrings.compact
import typings.nodeJose.nodeJoseStrings.flattened
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompact extends js.Object {
  var fields: js.UndefOr[js.Object] = js.undefined
  var format: js.UndefOr[compact | flattened] = js.undefined
  var zip: js.UndefOr[Boolean] = js.undefined
}

object AnonCompact {
  @scala.inline
  def apply(
    fields: js.Object = null,
    format: compact | flattened = null,
    zip: js.UndefOr[Boolean] = js.undefined
  ): AnonCompact = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(zip)) __obj.updateDynamic("zip")(zip.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompact]
  }
}

