package typings
package microrouterLib.microrouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("microrouter", JSImport.Namespace)
@js.native
object microrouterModMembers extends js.Object {
  val del: RouteHandler = js.native
  val get: RouteHandler = js.native
  val head: RouteHandler = js.native
  val options: RouteHandler = js.native
  val patch: RouteHandler = js.native
  val post: RouteHandler = js.native
  val put: RouteHandler = js.native
  def router(routes: microLib.microMod.RequestHandler*): microLib.microMod.RequestHandler = js.native
  def withNamespace(namespace: java.lang.String): js.Function1[/* repeated */microLib.microMod.RequestHandler, microLib.microMod.RequestHandler] = js.native
}

