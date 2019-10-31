package typings.node.fsMod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "opendir")
@js.native
object opendir extends js.Object {
  def apply(path: java.lang.String, cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ Dir, Unit]): Unit = js.native
  def apply(
    path: java.lang.String,
    options: OpenDirOptions,
    cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ Dir, Unit]
  ): Unit = js.native
  def __promisify__(path: java.lang.String): js.Promise[Dir] = js.native
  def __promisify__(path: java.lang.String, options: OpenDirOptions): js.Promise[Dir] = js.native
}

