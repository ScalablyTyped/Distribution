package typings
package meteorDashTypingsLib.meteorHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/http", "HTTP")
@js.native
object HTTPNs extends js.Object {
  trait HTTPRequest extends js.Object {
    var auth: js.UndefOr[java.lang.String] = js.undefined
    var content: js.UndefOr[java.lang.String] = js.undefined
    var data: js.UndefOr[js.Any] = js.undefined
    var followRedirects: js.UndefOr[scala.Boolean] = js.undefined
    var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
    var npmRequestOptions: js.UndefOr[js.Object] = js.undefined
    var params: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
    var query: js.UndefOr[java.lang.String] = js.undefined
    var timeout: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait HTTPResponse extends js.Object {
    var content: js.UndefOr[java.lang.String] = js.undefined
    var data: js.UndefOr[js.Any] = js.undefined
    var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
    var statusCode: js.UndefOr[scala.Double] = js.undefined
  }
  
  def call(method: java.lang.String, url: java.lang.String): HTTPResponse = js.native
  def call(method: java.lang.String, url: java.lang.String, options: meteorDashTypingsLib.Anon_Auth): HTTPResponse = js.native
  def call(
    method: java.lang.String,
    url: java.lang.String,
    options: meteorDashTypingsLib.Anon_Auth,
    asyncCallback: js.Function
  ): HTTPResponse = js.native
  def call(method: java.lang.String, url: java.lang.String, options: HTTPRequest): HTTPResponse = js.native
  def call(method: java.lang.String, url: java.lang.String, options: HTTPRequest, asyncCallback: js.Function): HTTPResponse = js.native
  def del(url: java.lang.String): HTTPResponse = js.native
  def del(url: java.lang.String, callOptions: HTTPRequest): HTTPResponse = js.native
  def del(url: java.lang.String, callOptions: HTTPRequest, asyncCallback: js.Function): HTTPResponse = js.native
  def get(url: java.lang.String): HTTPResponse = js.native
  def get(url: java.lang.String, callOptions: HTTPRequest): HTTPResponse = js.native
  def get(url: java.lang.String, callOptions: HTTPRequest, asyncCallback: js.Function): HTTPResponse = js.native
  def post(url: java.lang.String): HTTPResponse = js.native
  def post(url: java.lang.String, callOptions: HTTPRequest): HTTPResponse = js.native
  def post(url: java.lang.String, callOptions: HTTPRequest, asyncCallback: js.Function): HTTPResponse = js.native
  def put(url: java.lang.String): HTTPResponse = js.native
  def put(url: java.lang.String, callOptions: HTTPRequest): HTTPResponse = js.native
  def put(url: java.lang.String, callOptions: HTTPRequest, asyncCallback: js.Function): HTTPResponse = js.native
}

