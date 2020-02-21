package typings.node.httpsMod

import typings.node.httpMod.HttpBase
import typings.node.httpMod.RequestListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("https", "Server")
@js.native
class Server ()
  extends typings.node.tlsMod.Server
     with HttpBase {
  def this(options: ServerOptions) = this()
  def this(requestListener: RequestListener) = this()
  def this(options: ServerOptions, requestListener: RequestListener) = this()
}

