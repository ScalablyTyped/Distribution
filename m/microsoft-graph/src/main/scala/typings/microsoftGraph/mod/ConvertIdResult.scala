package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConvertIdResult extends js.Object {
  /**
    * An error object indicating the reason for the conversion failure. This value is not present if the conversion
    * succeeded.
    */
  var errorDetails: js.UndefOr[GenericError] = js.undefined
  // The identifier that was converted. This value is the original, un-converted identifier.
  var sourceId: js.UndefOr[String] = js.undefined
  // The converted identifier. This value is not present if the conversion failed.
  var targetId: js.UndefOr[String] = js.undefined
}

object ConvertIdResult {
  @scala.inline
  def apply(errorDetails: GenericError = null, sourceId: String = null, targetId: String = null): ConvertIdResult = {
    val __obj = js.Dynamic.literal()
    if (errorDetails != null) __obj.updateDynamic("errorDetails")(errorDetails.asInstanceOf[js.Any])
    if (sourceId != null) __obj.updateDynamic("sourceId")(sourceId.asInstanceOf[js.Any])
    if (targetId != null) __obj.updateDynamic("targetId")(targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertIdResult]
  }
}

