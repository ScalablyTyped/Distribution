package typings.meteor.HTTP

import typings.meteor.AnonAuth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("HTTP.call")
@js.native
object call extends js.Object {
  def apply(method: String, url: String): HTTPResponse = js.native
  def apply(method: String, url: String, options: AnonAuth): HTTPResponse = js.native
  def apply(method: String, url: String, options: AnonAuth, asyncCallback: js.Function): HTTPResponse = js.native
  def apply(method: String, url: String, options: HTTPRequest): HTTPResponse = js.native
  def apply(method: String, url: String, options: HTTPRequest, asyncCallback: js.Function): HTTPResponse = js.native
}

