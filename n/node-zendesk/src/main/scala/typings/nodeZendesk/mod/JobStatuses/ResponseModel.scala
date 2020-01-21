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
    message: String = null,
    progress: Int | Double = null,
    results: js.Array[Result] = null,
    status: Status = null,
    total: Int | Double = null,
    url: String = null
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseModel]
  }
}

