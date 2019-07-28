package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeRequire extends NodeRequireFunction {
  var cache: js.Any = js.native
  /**
    * @deprecated
    */
  var extensions: NodeExtensions = js.native
  var main: js.UndefOr[NodeModule] = js.native
  @JSName("resolve")
  var resolve_Original: RequireResolve = js.native
  def resolve(id: java.lang.String): java.lang.String = js.native
  def resolve(id: java.lang.String, options: Anon_Paths): java.lang.String = js.native
}

/* This can be used to `require` the library as a side effect.
  If it is a global library this will make scalajs-bundler include it */
@JSImport("node", JSImport.Namespace)
@js.native
object nodeRequire extends js.Object

