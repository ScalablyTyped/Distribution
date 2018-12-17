package typings
package npmDashNameLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("npm-name", JSImport.Namespace)
@js.native
object npmDashNameMod extends js.Object {
  def apply(name: java.lang.String): js.Promise[scala.Boolean] = js.native
  def many[T /* <: java.lang.String */](names: js.Array[T]): js.Promise[stdLib.Map[T, scala.Boolean]] = js.native
}

