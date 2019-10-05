package typings.npmDashRegistryDashFetch.npmDashRegistryDashFetchMod

import typings.nodeDashFetch.nodeDashFetchMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("npm-registry-fetch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Performs a request to a given URL.
    *
    * The URL can be either a full URL, or a path to one. The appropriate registry
    * will be automatically picked if only a URL path is given.
    */
  def apply(url: String): js.Promise[Response] = js.native
  def apply(url: String, opts: Options): js.Promise[Response] = js.native
}

