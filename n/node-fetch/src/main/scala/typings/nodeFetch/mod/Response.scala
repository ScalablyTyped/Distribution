package typings.nodeFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-fetch", "Response")
@js.native
class Response () extends Body {
  def this(body: BodyInit) = this()
  def this(body: BodyInit, init: ResponseInit) = this()
  var headers: Headers = js.native
  var ok: Boolean = js.native
  var redirected: Boolean = js.native
  var status: Double = js.native
  var statusText: String = js.native
  var `type`: ResponseType = js.native
  var url: String = js.native
}

/* static members */
@JSImport("node-fetch", "Response")
@js.native
object Response extends js.Object {
  def error(): Response = js.native
  def redirect(url: String, status: Double): Response = js.native
}

