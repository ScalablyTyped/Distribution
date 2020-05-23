package typings.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "rmdirSync")
@js.native
object rmdirSync extends js.Object {
  def apply(path: PathLike): Unit = js.native
  def apply(path: PathLike, options: RmDirOptions): Unit = js.native
}

