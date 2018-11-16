package typings
package polyfillDashServiceLib.polyfillDashServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("polyfill-service", JSImport.Namespace)
@js.native
object polyfillDashServiceModMembers extends js.Object {
  def getPolyfillString(options: GetPolyfillStringOptions): stdLib.Promise[java.lang.String] = js.native
  def getPolyfills(options: GetPolyfillsOptions): stdLib.Promise[GetPolyfillsResponse] = js.native
  def listAllPolyfills(): stdLib.Promise[js.Array[java.lang.String]] = js.native
}

