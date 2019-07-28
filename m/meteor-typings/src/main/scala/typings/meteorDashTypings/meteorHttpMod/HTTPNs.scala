package typings.meteorDashTypings.meteorHttpMod

import org.scalablytyped.runtime.StringDictionary
import typings.meteorDashTypings.Anon_Auth
import typings.meteorDashTypings.meteorHttpMod.HTTPNs.HTTPRequest
import typings.meteorDashTypings.meteorHttpMod.HTTPNs.HTTPResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/http", "HTTP")
@js.native
object HTTPNs extends js.Object {
  trait HTTPRequest extends js.Object {
    var auth: js.UndefOr[String] = js.undefined
    var content: js.UndefOr[String] = js.undefined
    var data: js.UndefOr[js.Any] = js.undefined
    var followRedirects: js.UndefOr[Boolean] = js.undefined
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    var npmRequestOptions: js.UndefOr[js.Object] = js.undefined
    var params: js.UndefOr[StringDictionary[String]] = js.undefined
    var query: js.UndefOr[String] = js.undefined
    var timeout: js.UndefOr[Double] = js.undefined
  }
  
  trait HTTPResponse extends js.Object {
    var content: js.UndefOr[String] = js.undefined
    var data: js.UndefOr[js.Any] = js.undefined
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    var statusCode: js.UndefOr[Double] = js.undefined
  }
  
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

