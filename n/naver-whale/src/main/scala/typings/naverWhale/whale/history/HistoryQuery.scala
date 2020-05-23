package typings.naverWhale.whale.history

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
    endTime: js.UndefOr[Double] = js.undefined,
    maxResults: js.UndefOr[Double] = js.undefined,
    startTime: js.UndefOr[Double] = js.undefined
  ): HistoryQuery = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (!js.isUndefined(endTime)) __obj.updateDynamic("endTime")(endTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startTime)) __obj.updateDynamic("startTime")(startTime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryQuery]
  }
}

