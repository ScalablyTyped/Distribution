package typings.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "unwatchFile")
@js.native
object unwatchFile extends js.Object {
  /**
    * Stop watching for changes on `filename`.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def apply(filename: PathLike): Unit = js.native
  def apply(filename: PathLike, listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]): Unit = js.native
}

