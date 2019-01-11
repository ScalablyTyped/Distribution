package typings
package meteorLib.HTTPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("HTTP")
@js.native
object ^ extends js.Object {
  def call(method: java.lang.String, url: java.lang.String): meteorLib.HTTPNs.HTTPResponse = js.native
  def call(method: java.lang.String, url: java.lang.String, options: meteorLib.Anon_Auth): meteorLib.HTTPNs.HTTPResponse = js.native
  def call(
    method: java.lang.String,
    url: java.lang.String,
    options: meteorLib.Anon_Auth,
    asyncCallback: js.Function
  ): meteorLib.HTTPNs.HTTPResponse = js.native
  def call(method: java.lang.String, url: java.lang.String, options: meteorLib.HTTPNs.HTTPRequest): meteorLib.HTTPNs.HTTPResponse = js.native
  def call(
    method: java.lang.String,
    url: java.lang.String,
    options: meteorLib.HTTPNs.HTTPRequest,
    asyncCallback: js.Function
  ): meteorLib.HTTPNs.HTTPResponse = js.native
  def del(url: java.lang.String): meteorLib.HTTPNs.HTTPResponse = js.native
  def del(url: java.lang.String, callOptions: meteorLib.HTTPNs.HTTPRequest): meteorLib.HTTPNs.HTTPResponse = js.native
  def del(url: java.lang.String, callOptions: meteorLib.HTTPNs.HTTPRequest, asyncCallback: js.Function): meteorLib.HTTPNs.HTTPResponse = js.native
  def get(url: java.lang.String): meteorLib.HTTPNs.HTTPResponse = js.native
  def get(url: java.lang.String, callOptions: meteorLib.HTTPNs.HTTPRequest): meteorLib.HTTPNs.HTTPResponse = js.native
  def get(url: java.lang.String, callOptions: meteorLib.HTTPNs.HTTPRequest, asyncCallback: js.Function): meteorLib.HTTPNs.HTTPResponse = js.native
  def post(url: java.lang.String): meteorLib.HTTPNs.HTTPResponse = js.native
  def post(url: java.lang.String, callOptions: meteorLib.HTTPNs.HTTPRequest): meteorLib.HTTPNs.HTTPResponse = js.native
  def post(url: java.lang.String, callOptions: meteorLib.HTTPNs.HTTPRequest, asyncCallback: js.Function): meteorLib.HTTPNs.HTTPResponse = js.native
  def put(url: java.lang.String): meteorLib.HTTPNs.HTTPResponse = js.native
  def put(url: java.lang.String, callOptions: meteorLib.HTTPNs.HTTPRequest): meteorLib.HTTPNs.HTTPResponse = js.native
  def put(url: java.lang.String, callOptions: meteorLib.HTTPNs.HTTPRequest, asyncCallback: js.Function): meteorLib.HTTPNs.HTTPResponse = js.native
}

