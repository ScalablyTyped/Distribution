package typings.microrouter.microrouterMod

import typings.micro.microMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("microrouter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val del: RouteHandler = js.native
  val get: RouteHandler = js.native
  val head: RouteHandler = js.native
  val options: RouteHandler = js.native
  val patch: RouteHandler = js.native
  val post: RouteHandler = js.native
  val put: RouteHandler = js.native
  def router(routes: RequestHandler*): RequestHandler = js.native
  def withNamespace(namespace: String): js.Function1[/* repeated */ RequestHandler, RequestHandler] = js.native
}

