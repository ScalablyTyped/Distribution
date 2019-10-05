package typings.node.fsMod

import typings.node.Anon_AutoClose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "createReadStream")
@js.native
object createReadStream extends js.Object {
  /**
    * Returns a new `ReadStream` object.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def apply(path: PathLike): ReadStream = js.native
  def apply(path: PathLike, options: java.lang.String): ReadStream = js.native
  def apply(path: PathLike, options: Anon_AutoClose): ReadStream = js.native
}

