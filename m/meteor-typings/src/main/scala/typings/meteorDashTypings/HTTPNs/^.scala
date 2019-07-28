package typings.meteorDashTypings.HTTPNs

import typings.meteorDashTypings.Anon_Auth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("HTTP")
@js.native
object ^ extends js.Object {
  def call(method: String, url: String): HTTPResponse = js.native
  def call(method: String, url: String, options: Anon_Auth): HTTPResponse = js.native
  def call(method: String, url: String, options: Anon_Auth, asyncCallback: js.Function): HTTPResponse = js.native
  def call(method: String, url: String, options: HTTPRequest): HTTPResponse = js.native
  def call(method: String, url: String, options: HTTPRequest, asyncCallback: js.Function): HTTPResponse = js.native
  def del(url: String): HTTPResponse = js.native
  def del(url: String, callOptions: HTTPRequest): HTTPResponse = js.native
  def del(url: String, callOptions: HTTPRequest, asyncCallback: js.Function): HTTPResponse = js.native
  def get(url: String): HTTPResponse = js.native
  def get(url: String, callOptions: HTTPRequest): HTTPResponse = js.native
  def get(url: String, callOptions: HTTPRequest, asyncCallback: js.Function): HTTPResponse = js.native
  def post(url: String): HTTPResponse = js.native
  def post(url: String, callOptions: HTTPRequest): HTTPResponse = js.native
  def post(url: String, callOptions: HTTPRequest, asyncCallback: js.Function): HTTPResponse = js.native
  def put(url: String): HTTPResponse = js.native
  def put(url: String, callOptions: HTTPRequest): HTTPResponse = js.native
  def put(url: String, callOptions: HTTPRequest, asyncCallback: js.Function): HTTPResponse = js.native
}

