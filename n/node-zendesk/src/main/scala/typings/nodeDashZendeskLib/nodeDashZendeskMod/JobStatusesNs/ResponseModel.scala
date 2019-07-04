package typings
package nodeDashZendeskLib.nodeDashZendeskMod.JobStatusesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseModel
  extends nodeDashZendeskLib.nodeDashZendeskMod.PersistableModel {
  val message: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val progress: js.UndefOr[scala.Double] = js.undefined
  val results: js.UndefOr[js.Array[Result]] = js.undefined
  val status: js.UndefOr[Status] = js.undefined
  val total: js.UndefOr[scala.Double] = js.undefined
  val url: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object ResponseModel {
  @scala.inline
  def apply(
    id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    message: java.lang.String = null,
    progress: scala.Int | scala.Double = null,
    results: js.Array[Result] = null,
    status: Status = null,
    total: scala.Int | scala.Double = null,
    url: java.lang.String = null
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(id = id)
    if (message != null) __obj.updateDynamic("message")(message)
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results)
    if (status != null) __obj.updateDynamic("status")(status)
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ResponseModel]
  }
}

