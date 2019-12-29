package typings.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Module extends js.Object {
  var children: js.Array[Module] = js.native
  var exports: js.Any = js.native
  var filename: String = js.native
  var id: String = js.native
  var loaded: Boolean = js.native
  var parent: Module | Null = js.native
  var paths: js.Array[String] = js.native
  @JSName("require")
  var require_Original: Require = js.native
  /* tslint:disable-next-line:callable-types */
  def require(id: String): js.Any = js.native
}

