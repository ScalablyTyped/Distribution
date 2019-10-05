package typings.node.fsMod

import typings.node.Anon_AutoCloseEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "createWriteStream")
@js.native
object createWriteStream extends js.Object {
  /**
    * Returns a new `WriteStream` object.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def apply(path: PathLike): WriteStream = js.native
  def apply(path: PathLike, options: java.lang.String): WriteStream = js.native
  def apply(path: PathLike, options: Anon_AutoCloseEncoding): WriteStream = js.native
}

