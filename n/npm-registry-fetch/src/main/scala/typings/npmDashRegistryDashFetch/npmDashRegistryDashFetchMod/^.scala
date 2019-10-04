package typings.npmDashRegistryDashFetch.npmDashRegistryDashFetchMod

import typings.nodeDashFetch.nodeDashFetchMod.Response
import typings.std.Record
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
  /**
    * Performs a request to a given registry URL, parses the body of the
    * response as JSON, and returns it as its final value. This is a utility
    * shorthand for `fetch(url).then(res => res.json())`.
    */
  def json(url: String): js.Promise[Record[String, _]] = js.native
  def json(url: String, opts: Options): js.Promise[Record[String, _]] = js.native
  def pickRegistry(spec: String): String = js.native
  def pickRegistry(spec: String, opts: Options): String = js.native
}

