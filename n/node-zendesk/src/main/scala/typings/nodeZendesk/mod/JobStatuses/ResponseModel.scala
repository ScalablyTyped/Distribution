package typings.nodeZendesk.mod.JobStatuses

import typings.nodeZendesk.mod.PersistableModel
import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseModel extends PersistableModel {
  val message: js.UndefOr[String | Null] = js.undefined
  val progress: js.UndefOr[Double] = js.undefined
  val results: js.UndefOr[js.Array[Result]] = js.undefined
  val status: js.UndefOr[Status] = js.undefined
  val total: js.UndefOr[Double] = js.undefined
  val url: js.UndefOr[String | Null] = js.undefined
}

object ResponseModel {
  @scala.inline
  def apply(
    id: ZendeskID,
    message: js.UndefOr[Null | String] = js.undefined,
    progress: js.UndefOr[Double] = js.undefined,
    results: js.Array[Result] = null,
    status: Status = null,
    total: js.UndefOr[Double] = js.undefined,
    url: js.UndefOr[Null | String] = js.undefined
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(message)) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(progress)) __obj.updateDynamic("progress")(progress.get.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    if (!js.isUndefined(url)) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseModel]
  }
}

