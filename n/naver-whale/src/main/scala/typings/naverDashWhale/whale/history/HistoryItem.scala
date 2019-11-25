package typings.naverDashWhale.whale.history

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryItem extends js.Object {
  /** The unique identifier for the item. */
  var id: String
  /** Optional. When this page was last loaded, represented in milliseconds since the epoch. */
  var lastVisitTime: js.UndefOr[Double] = js.undefined
  /** Optional. The title of the page when it was last loaded. */
  var title: js.UndefOr[String] = js.undefined
  /** Optional. The number of times the user has navigated to this page by typing in the address. */
  var typedCount: js.UndefOr[Double] = js.undefined
  /** Optional. The URL navigated to by a user. */
  var url: js.UndefOr[String] = js.undefined
  /** Optional. The number of times the user has navigated to this page. */
  var visitCount: js.UndefOr[Double] = js.undefined
}

object HistoryItem {
  @scala.inline
  def apply(
    id: String,
    lastVisitTime: Int | Double = null,
    title: String = null,
    typedCount: Int | Double = null,
    url: String = null,
    visitCount: Int | Double = null
  ): HistoryItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (lastVisitTime != null) __obj.updateDynamic("lastVisitTime")(lastVisitTime.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (typedCount != null) __obj.updateDynamic("typedCount")(typedCount.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (visitCount != null) __obj.updateDynamic("visitCount")(visitCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryItem]
  }
}

