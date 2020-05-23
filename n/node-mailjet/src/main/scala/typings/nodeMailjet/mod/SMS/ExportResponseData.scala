package typings.nodeMailjet.mod.SMS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportResponseData extends js.Object {
  val CreationTS: js.UndefOr[Double] = js.undefined
  val ExpirationTS: js.UndefOr[Double] = js.undefined
  val FromTs: js.UndefOr[Double] = js.undefined
  val ID: Double
  val Status: ResponseStatus
  val ToTs: js.UndefOr[Double] = js.undefined
  val URL: js.UndefOr[String] = js.undefined
}

object ExportResponseData {
  @scala.inline
  def apply(
    ID: Double,
    Status: ResponseStatus,
    CreationTS: js.UndefOr[Double] = js.undefined,
    ExpirationTS: js.UndefOr[Double] = js.undefined,
    FromTs: js.UndefOr[Double] = js.undefined,
    ToTs: js.UndefOr[Double] = js.undefined,
    URL: String = null
  ): ExportResponseData = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    if (!js.isUndefined(CreationTS)) __obj.updateDynamic("CreationTS")(CreationTS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ExpirationTS)) __obj.updateDynamic("ExpirationTS")(ExpirationTS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(FromTs)) __obj.updateDynamic("FromTs")(FromTs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ToTs)) __obj.updateDynamic("ToTs")(ToTs.get.asInstanceOf[js.Any])
    if (URL != null) __obj.updateDynamic("URL")(URL.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportResponseData]
  }
}

