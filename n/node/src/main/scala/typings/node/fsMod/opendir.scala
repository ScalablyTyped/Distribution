package typings.node.fsMod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "opendir")
@js.native
object opendir extends js.Object {
  def apply(path: String, cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ Dir, Unit]): Unit = js.native
  def apply(
    path: String,
    options: OpenDirOptions,
    cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ Dir, Unit]
  ): Unit = js.native
  @JSName("__promisify__")
  def promisify(path: String): js.Promise[Dir] = js.native
  @JSName("__promisify__")
  def promisify(path: String, options: OpenDirOptions): js.Promise[Dir] = js.native
}

