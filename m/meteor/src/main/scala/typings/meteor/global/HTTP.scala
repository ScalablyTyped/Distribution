package typings.meteor.global

import typings.meteor.HTTP.AsyncCallback
import typings.meteor.HTTP.HTTPRequest
import typings.meteor.HTTP.HTTPResponse
import typings.meteor.anon.Auth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("HTTP")
@js.native
object HTTP extends js.Object {
  
  def call(method: String, url: String): HTTPResponse = js.native
  def call(method: String, url: String, options: js.UndefOr[scala.Nothing], asyncCallback: AsyncCallback): HTTPResponse = js.native
  def call(method: String, url: String, options: HTTPRequest): HTTPResponse = js.native
  def call(method: String, url: String, options: HTTPRequest, asyncCallback: AsyncCallback): HTTPResponse = js.native
  def call(method: String, url: String, options: Auth): HTTPResponse = js.native
  def call(method: String, url: String, options: Auth, asyncCallback: AsyncCallback): HTTPResponse = js.native
  
  def del(url: String): HTTPResponse = js.native
  def del(url: String, callOptions: js.UndefOr[scala.Nothing], asyncCallback: AsyncCallback): HTTPResponse = js.native
  def del(url: String, callOptions: HTTPRequest): HTTPResponse = js.native
  def del(url: String, callOptions: HTTPRequest, asyncCallback: AsyncCallback): HTTPResponse = js.native
  
  def get(url: String): HTTPResponse = js.native
  def get(url: String, callOptions: js.UndefOr[scala.Nothing], asyncCallback: AsyncCallback): HTTPResponse = js.native
  def get(url: String, callOptions: HTTPRequest): HTTPResponse = js.native
  def get(url: String, callOptions: HTTPRequest, asyncCallback: AsyncCallback): HTTPResponse = js.native
  
  def post(url: String): HTTPResponse = js.native
  def post(url: String, callOptions: js.UndefOr[scala.Nothing], asyncCallback: AsyncCallback): HTTPResponse = js.native
  def post(url: String, callOptions: HTTPRequest): HTTPResponse = js.native
  def post(url: String, callOptions: HTTPRequest, asyncCallback: AsyncCallback): HTTPResponse = js.native
  
  def put(url: String): HTTPResponse = js.native
  def put(url: String, callOptions: js.UndefOr[scala.Nothing], asyncCallback: AsyncCallback): HTTPResponse = js.native
  def put(url: String, callOptions: HTTPRequest): HTTPResponse = js.native
  def put(url: String, callOptions: HTTPRequest, asyncCallback: AsyncCallback): HTTPResponse = js.native
}
