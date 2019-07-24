package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseStatus extends js.Object {
  // The response type. The possible values are: None, Organizer, TentativelyAccepted, Accepted, Declined, NotResponded.
  var response: js.UndefOr[ResponseType] = js.undefined
  /**
    * The date and time that the response was returned. It uses ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var time: js.UndefOr[java.lang.String] = js.undefined
}

object ResponseStatus {
  @scala.inline
  def apply(response: ResponseType = null, time: java.lang.String = null): ResponseStatus = {
    val __obj = js.Dynamic.literal()
    if (response != null) __obj.updateDynamic("response")(response)
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[ResponseStatus]
  }
}

