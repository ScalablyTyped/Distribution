package typings
package microrouterLib.microrouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("microrouter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val del: microrouterLib.microrouterMod.RouteHandler = js.native
  val get: microrouterLib.microrouterMod.RouteHandler = js.native
  val head: microrouterLib.microrouterMod.RouteHandler = js.native
  val options: microrouterLib.microrouterMod.RouteHandler = js.native
  val patch: microrouterLib.microrouterMod.RouteHandler = js.native
  val post: microrouterLib.microrouterMod.RouteHandler = js.native
  val put: microrouterLib.microrouterMod.RouteHandler = js.native
  def router(routes: microLib.microMod.RequestHandler*): microLib.microMod.RequestHandler = js.native
  def withNamespace(namespace: java.lang.String): js.Function1[/* repeated */ microLib.microMod.RequestHandler, microLib.microMod.RequestHandler] = js.native
}

