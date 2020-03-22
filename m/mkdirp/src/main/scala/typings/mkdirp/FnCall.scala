package typings.mkdirp

import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(path: PathLike): Unit = js.native
  def apply(path: PathLike, options: String): Unit = js.native
  def apply(path: PathLike, options: Double): Unit = js.native
  def apply(path: PathLike, options: MakeDirectoryOptions): Unit = js.native
}

