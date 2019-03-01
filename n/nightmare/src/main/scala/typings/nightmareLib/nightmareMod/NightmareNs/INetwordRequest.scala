package typings
package nightmareLib.nightmareMod.NightmareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INetwordRequest extends js.Object {
  def abort(): scala.Unit
  def changeUrl(url: java.lang.String): scala.Unit
  def setHeader(key: java.lang.String, value: java.lang.String): scala.Unit
}

object INetwordRequest {
  @scala.inline
  def apply(
    abort: js.Function0[scala.Unit],
    changeUrl: js.Function1[java.lang.String, scala.Unit],
    setHeader: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): INetwordRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort)
    __obj.updateDynamic("changeUrl")(changeUrl)
    __obj.updateDynamic("setHeader")(setHeader)
    __obj.asInstanceOf[INetwordRequest]
  }
}

