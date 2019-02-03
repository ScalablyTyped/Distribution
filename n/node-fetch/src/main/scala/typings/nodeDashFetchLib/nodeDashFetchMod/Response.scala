package typings
package nodeDashFetchLib.nodeDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-fetch", "Response")
@js.native
class Response () extends Body {
  def this(body: BodyInit) = this()
  def this(body: BodyInit, init: ResponseInit) = this()
  var headers: Headers = js.native
  var ok: scala.Boolean = js.native
  var size: scala.Double = js.native
  var status: scala.Double = js.native
  var statusText: java.lang.String = js.native
  var timeout: scala.Double = js.native
  var `type`: ResponseType = js.native
  var url: java.lang.String = js.native
}

/* static members */
@JSImport("node-fetch", "Response")
@js.native
object Response extends js.Object {
  def error(): nodeDashFetchLib.nodeDashFetchMod.Response = js.native
  def redirect(url: java.lang.String, status: scala.Double): nodeDashFetchLib.nodeDashFetchMod.Response = js.native
}

