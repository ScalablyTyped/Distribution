package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeRequire extends NodeRequireFunction {
  var cache: js.Any = js.native
  var extensions: NodeExtensions = js.native
  var main: js.UndefOr[NodeModule] = js.native
  @JSName("resolve")
  var resolve_Original: RequireResolve = js.native
  def resolve(id: java.lang.String): java.lang.String = js.native
  def resolve(id: java.lang.String, options: Anon_Paths): java.lang.String = js.native
}

