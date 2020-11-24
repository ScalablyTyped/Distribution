package typings.meteor.httpMod.HTTP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("meteor/http", "HTTP.post")
@js.native
object post extends js.Object {
  
  def apply(url: String): HTTPResponse = js.native
  def apply(url: String, callOptions: js.UndefOr[scala.Nothing], asyncCallback: AsyncCallback): HTTPResponse = js.native
  def apply(url: String, callOptions: HTTPRequest): HTTPResponse = js.native
  def apply(url: String, callOptions: HTTPRequest, asyncCallback: AsyncCallback): HTTPResponse = js.native
}
