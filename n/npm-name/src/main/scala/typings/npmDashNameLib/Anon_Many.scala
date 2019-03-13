package typings
package npmDashNameLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Many extends js.Object {
  /**
  	 * Check whether a package name is available (not registered) on npm.
  	 *
  	 * @param name - Name to check.
  	 * @returns Whether the given name is available.
  	 */
  def apply(name: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
  	 * Check whether multiple package names are available (not registered) on npm.
  	 *
  	 * @param names - Multiple names to check.
  	 * @returns A `Map` of name and status.
  	 */
  def many[NameType /* <: java.lang.String */](names: js.Array[NameType]): js.Promise[stdLib.Map[NameType, scala.Boolean]] = js.native
}

