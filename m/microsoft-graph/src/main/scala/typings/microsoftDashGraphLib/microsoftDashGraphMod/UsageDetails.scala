package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsageDetails extends js.Object {
  var lastAccessedDateTime: js.UndefOr[java.lang.String] = js.undefined
  var lastModifiedDateTime: js.UndefOr[java.lang.String] = js.undefined
}

object UsageDetails {
  @scala.inline
  def apply(lastAccessedDateTime: java.lang.String = null, lastModifiedDateTime: java.lang.String = null): UsageDetails = {
    val __obj = js.Dynamic.literal()
    if (lastAccessedDateTime != null) __obj.updateDynamic("lastAccessedDateTime")(lastAccessedDateTime)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    __obj.asInstanceOf[UsageDetails]
  }
}

