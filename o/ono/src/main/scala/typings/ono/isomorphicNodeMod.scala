package typings.ono

import typings.ono.typesMod.OnoError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ono/esm/isomorphic.node", JSImport.Namespace)
@js.native
object isomorphicNodeMod extends js.Object {
  val format: js.Function2[/* format */ js.Any, /* repeated */ js.Any, String] = js.native
  def addInspectMethod[T](newError: OnoError[T]): Unit = js.native
}

