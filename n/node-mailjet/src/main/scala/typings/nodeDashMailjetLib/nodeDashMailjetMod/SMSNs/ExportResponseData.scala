package typings
package nodeDashMailjetLib.nodeDashMailjetMod.SMSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportResponseData extends js.Object {
  val CreationTS: js.UndefOr[scala.Double] = js.undefined
  val ExpirationTS: js.UndefOr[scala.Double] = js.undefined
  val FromTs: js.UndefOr[scala.Double] = js.undefined
  val ID: scala.Double
  val Status: ResponseStatus
  val ToTs: js.UndefOr[scala.Double] = js.undefined
  val URL: js.UndefOr[java.lang.String] = js.undefined
}

object ExportResponseData {
  @scala.inline
  def apply(
    ID: scala.Double,
    Status: ResponseStatus,
    CreationTS: scala.Int | scala.Double = null,
    ExpirationTS: scala.Int | scala.Double = null,
    FromTs: scala.Int | scala.Double = null,
    ToTs: scala.Int | scala.Double = null,
    URL: java.lang.String = null
  ): ExportResponseData = {
    val __obj = js.Dynamic.literal(ID = ID, Status = Status)
    if (CreationTS != null) __obj.updateDynamic("CreationTS")(CreationTS.asInstanceOf[js.Any])
    if (ExpirationTS != null) __obj.updateDynamic("ExpirationTS")(ExpirationTS.asInstanceOf[js.Any])
    if (FromTs != null) __obj.updateDynamic("FromTs")(FromTs.asInstanceOf[js.Any])
    if (ToTs != null) __obj.updateDynamic("ToTs")(ToTs.asInstanceOf[js.Any])
    if (URL != null) __obj.updateDynamic("URL")(URL)
    __obj.asInstanceOf[ExportResponseData]
  }
}

