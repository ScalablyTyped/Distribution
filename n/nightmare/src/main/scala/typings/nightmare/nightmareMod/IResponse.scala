package typings.nightmare.nightmareMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResponse extends js.Object {
  var bodySize: Double
  var contentType: String
  var headers: js.Object
  var id: Double
  var redirectURL: String
  var stage: String
  var status: Double
  var statusText: String
  var time: Date
  var url: String
}

object IResponse {
  @scala.inline
  def apply(
    bodySize: Double,
    contentType: String,
    headers: js.Object,
    id: Double,
    redirectURL: String,
    stage: String,
    status: Double,
    statusText: String,
    time: Date,
    url: String
  ): IResponse = {
    val __obj = js.Dynamic.literal(bodySize = bodySize, contentType = contentType, headers = headers, id = id, redirectURL = redirectURL, stage = stage, status = status, statusText = statusText, time = time, url = url)
  
    __obj.asInstanceOf[IResponse]
  }
}

