package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageDetails extends js.Object {
  /**
    * The date and time the resource was last accessed by the user. The timestamp represents date and time information using
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * 2014-01-01T00:00:00Z. Read-only.
    */
  var lastAccessedDateTime: js.UndefOr[String] = js.native
  /**
    * The date and time the resource was last modified by the user. The timestamp represents date and time information using
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * 2014-01-01T00:00:00Z. Read-only.
    */
  var lastModifiedDateTime: js.UndefOr[String] = js.native
}

object UsageDetails {
  @scala.inline
  def apply(): UsageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageDetails]
  }
  @scala.inline
  implicit class UsageDetailsOps[Self <: UsageDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLastAccessedDateTime(value: String): Self = this.set("lastAccessedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastAccessedDateTime: Self = this.set("lastAccessedDateTime", js.undefined)
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
  }
  
}

