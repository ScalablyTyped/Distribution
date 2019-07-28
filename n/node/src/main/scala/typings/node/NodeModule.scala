package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeModule extends js.Object {
  var children: js.Array[NodeModule] = js.native
  var exports: js.Any = js.native
  var filename: java.lang.String = js.native
  var id: java.lang.String = js.native
  var loaded: Boolean = js.native
  var parent: NodeModule | Null = js.native
  var paths: js.Array[java.lang.String] = js.native
  @JSName("require")
  var require_Original: NodeRequireFunction = js.native
  def require(id: java.lang.String): js.Any = js.native
}

