package typings.node.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http", "createServer")
@js.native
object createServer extends js.Object {
  def apply(): Server = js.native
  def apply(options: ServerOptions): Server = js.native
  def apply(options: ServerOptions, requestListener: RequestListener): Server = js.native
  def apply(requestListener: RequestListener): Server = js.native
}

