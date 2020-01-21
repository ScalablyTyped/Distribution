package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsageDetails extends js.Object {
  var lastAccessedDateTime: js.UndefOr[String] = js.undefined
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
}

object UsageDetails {
  @scala.inline
  def apply(lastAccessedDateTime: String = null, lastModifiedDateTime: String = null): UsageDetails = {
    val __obj = js.Dynamic.literal()
    if (lastAccessedDateTime != null) __obj.updateDynamic("lastAccessedDateTime")(lastAccessedDateTime.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageDetails]
  }
}

