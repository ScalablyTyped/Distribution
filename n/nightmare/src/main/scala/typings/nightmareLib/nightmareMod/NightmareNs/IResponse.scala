package typings
package nightmareLib.nightmareMod.NightmareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResponse extends js.Object {
  var bodySize: scala.Double
  var contentType: java.lang.String
  var headers: js.Object
  var id: scala.Double
  var redirectURL: java.lang.String
  var stage: java.lang.String
  var status: scala.Double
  var statusText: java.lang.String
  var time: stdLib.Date
  var url: java.lang.String
}

object IResponse {
  @scala.inline
  def apply(
    bodySize: scala.Double,
    contentType: java.lang.String,
    headers: js.Object,
    id: scala.Double,
    redirectURL: java.lang.String,
    stage: java.lang.String,
    status: scala.Double,
    statusText: java.lang.String,
    time: stdLib.Date,
    url: java.lang.String
  ): IResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bodySize")(bodySize)
    __obj.updateDynamic("contentType")(contentType)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("redirectURL")(redirectURL)
    __obj.updateDynamic("stage")(stage)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("statusText")(statusText)
    __obj.updateDynamic("time")(time)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[IResponse]
  }
}

