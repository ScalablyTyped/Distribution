package typings.polyfillDashService.polyfillDashServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("polyfill-service", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getPolyfillString(options: GetPolyfillStringOptions): js.Promise[String] = js.native
  def getPolyfills(options: GetPolyfillsOptions): js.Promise[GetPolyfillsResponse] = js.native
  def listAllPolyfills(): js.Promise[js.Array[String]] = js.native
}

