package typings
package npmDashPacklistLib.npmDashPacklistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("npm-packlist", JSImport.Namespace)
@js.native
object npmDashPacklistModMembers extends js.Object {
  def apply(): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def apply(options: npmDashPacklistLib.npmDashPacklistMod.packlistNs.Options): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def apply[T](
    options: js.UndefOr[npmDashPacklistLib.npmDashPacklistMod.packlistNs.Options],
    callback: js.Function1[/* result */ js.Array[java.lang.String], T]
  ): stdLib.Promise[T] = js.native
  def sync(): js.Array[java.lang.String] = js.native
  def sync(options: npmDashPacklistLib.npmDashPacklistMod.packlistNs.Options): js.Array[java.lang.String] = js.native
}

