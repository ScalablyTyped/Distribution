package typings.npmDashRegistryDashFetch.npmDashRegistryDashFetchMod

import typings.node.NodeJS.ReadWriteStream
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("npm-registry-fetch", "json")
@js.native
object json extends js.Object {
  /**
    * Performs a request to a given registry URL, parses the body of the
    * response as JSON, and returns it as its final value. This is a utility
    * shorthand for `fetch(url).then(res => res.json())`.
    */
  def apply(url: String): js.Promise[Record[String, _]] = js.native
  def apply(url: String, opts: Options): js.Promise[Record[String, _]] = js.native
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

