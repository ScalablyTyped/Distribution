package typings
package atPollyjsCoreLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pollyjs/core", "PollyServer")
@js.native
class PollyServer () extends js.Object {
  def any(args: js.Any*): RouteHandler = js.native
  def delete(args: js.Any*): RouteHandler = js.native
  def get(args: js.Any*): RouteHandler = js.native
  def head(args: js.Any*): RouteHandler = js.native
  def host(host: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def namespace(path: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def options(args: js.Any*): RouteHandler = js.native
  def patch(args: js.Any*): RouteHandler = js.native
  def post(args: js.Any*): RouteHandler = js.native
  def put(args: js.Any*): RouteHandler = js.native
  def timeout(ms: scala.Double): stdLib.Promise[scala.Unit] = js.native
}

