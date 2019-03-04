package typings
package phantomjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebServerRequest extends js.Object {
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var httpVersion: scala.Double
  var method: java.lang.String
  var post: java.lang.String
  var postRaw: java.lang.String
  var url: java.lang.String
}

object WebServerRequest {
  @scala.inline
  def apply(
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    httpVersion: scala.Double,
    method: java.lang.String,
    post: java.lang.String,
    postRaw: java.lang.String,
    url: java.lang.String
  ): WebServerRequest = {
    val __obj = js.Dynamic.literal(headers = headers, httpVersion = httpVersion, method = method, post = post, postRaw = postRaw, url = url)
  
    __obj.asInstanceOf[WebServerRequest]
  }
}

