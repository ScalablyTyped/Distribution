package typings
package nightmareLib.nightmareMod.NightmareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequest extends js.Object {
  var headers: js.Object
  var id: scala.Double
  var method: java.lang.String
  var time: stdLib.Date
  var url: java.lang.String
}

object IRequest {
  @scala.inline
  def apply(
    headers: js.Object,
    id: scala.Double,
    method: java.lang.String,
    time: stdLib.Date,
    url: java.lang.String
  ): IRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("time")(time)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[IRequest]
  }
}

