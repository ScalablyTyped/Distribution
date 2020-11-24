package typings.meteor.httpMod.HTTP

import typings.meteor.anon.Auth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("meteor/http", "HTTP.call")
@js.native
object call extends js.Object {
  
  def apply(method: String, url: String): HTTPResponse = js.native
  def apply(method: String, url: String, options: js.UndefOr[scala.Nothing], asyncCallback: AsyncCallback): HTTPResponse = js.native
  def apply(method: String, url: String, options: Auth): HTTPResponse = js.native
  def apply(method: String, url: String, options: Auth, asyncCallback: AsyncCallback): HTTPResponse = js.native
  def apply(method: String, url: String, options: HTTPRequest): HTTPResponse = js.native
  def apply(method: String, url: String, options: HTTPRequest, asyncCallback: AsyncCallback): HTTPResponse = js.native
}
