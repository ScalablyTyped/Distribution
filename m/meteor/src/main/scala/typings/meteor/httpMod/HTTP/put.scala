package typings.meteor.httpMod.HTTP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/http", "HTTP.put")
@js.native
object put extends js.Object {
  def apply(url: String): HTTPResponse = js.native
  def apply(url: String, callOptions: HTTPRequest): HTTPResponse = js.native
  def apply(url: String, callOptions: HTTPRequest, asyncCallback: js.Function): HTTPResponse = js.native
}

