package typings.phantom.phantomMod

import typings.phantom.Anon_Name
import typings.phantom.phantomStrings.end
import typings.phantom.phantomStrings.start
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResponse extends js.Object {
  var bodySize: Double
  var contentType: String
  var headers: js.Array[Anon_Name]
  var id: String
  var redirectURL: String
  var stage: start | end
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
    headers: js.Array[Anon_Name],
    id: String,
    redirectURL: String,
    stage: start | end,
    status: Double,
    statusText: String,
    time: Date,
    url: String
  ): IResponse = {
    val __obj = js.Dynamic.literal(bodySize = bodySize, contentType = contentType, headers = headers, id = id, redirectURL = redirectURL, stage = stage.asInstanceOf[js.Any], status = status, statusText = statusText, time = time, url = url)
  
    __obj.asInstanceOf[IResponse]
  }
}

