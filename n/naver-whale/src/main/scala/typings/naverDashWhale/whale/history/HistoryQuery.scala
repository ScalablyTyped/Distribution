package typings.naverDashWhale.whale.history

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryQuery extends js.Object {
  /** Optional. Limit results to those visited before this date, represented in milliseconds since the epoch. */
  var endTime: js.UndefOr[Double] = js.undefined
  /** Optional. The maximum number of results to retrieve. Defaults to 100. */
  var maxResults: js.UndefOr[Double] = js.undefined
  /** Optional. Limit results to those visited after this date, represented in milliseconds since the epoch. */
  var startTime: js.UndefOr[Double] = js.undefined
  /** A free-text query to the history service. Leave empty to retrieve all pages. */
  var text: String
}

object HistoryQuery {
  @scala.inline
  def apply(
    text: String,
    endTime: Int | Double = null,
    maxResults: Int | Double = null,
    startTime: Int | Double = null
  ): HistoryQuery = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryQuery]
  }
}

