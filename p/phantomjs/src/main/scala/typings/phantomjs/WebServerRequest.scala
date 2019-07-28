package typings.phantomjs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebServerRequest extends js.Object {
  var headers: StringDictionary[String]
  var httpVersion: Double
  var method: String
  var post: String
  var postRaw: String
  var url: String
}

object WebServerRequest {
  @scala.inline
  def apply(
    headers: StringDictionary[String],
    httpVersion: Double,
    method: String,
    post: String,
    postRaw: String,
    url: String
  ): WebServerRequest = {
    val __obj = js.Dynamic.literal(headers = headers, httpVersion = httpVersion, method = method, post = post, postRaw = postRaw, url = url)
  
    __obj.asInstanceOf[WebServerRequest]
  }
}

