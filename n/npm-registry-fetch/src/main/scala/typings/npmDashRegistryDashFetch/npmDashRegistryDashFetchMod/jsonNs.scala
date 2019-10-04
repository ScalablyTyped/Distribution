package typings.npmDashRegistryDashFetch.npmDashRegistryDashFetchMod

import typings.node.NodeJSNs.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("npm-registry-fetch", "json")
@js.native
object jsonNs extends js.Object {
  /**
    * Performs a request to a given registry URL and parses the body of the
    * response as JSON, with each entry being emitted through the stream.
    *
    * The jsonPath argument is a `JSONStream.parse()` path, and the returned
    * stream (unlike default `JSONStreams`), has a valid `Symbol.asyncIterator`
    * implementation.
    */
  def stream(url: String, jsonPath: String): ReadWriteStream = js.native
  def stream(url: String, jsonPath: String, opts: Options): ReadWriteStream = js.native
}

