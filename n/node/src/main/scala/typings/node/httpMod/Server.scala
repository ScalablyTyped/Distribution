package typings.node.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("http", "Server")
@js.native
class Server ()
  extends typings.node.netMod.Server
     with HttpBase {
  def this(options: ServerOptions) = this()
  def this(requestListener: RequestListener) = this()
  def this(options: ServerOptions, requestListener: RequestListener) = this()
}

