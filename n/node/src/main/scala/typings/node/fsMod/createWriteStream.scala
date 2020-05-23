package typings.node.fsMod

import typings.node.anon.EmitClose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "createWriteStream")
@js.native
object createWriteStream extends js.Object {
  def apply(path: PathLike): WriteStream = js.native
  def apply(path: PathLike, options: String): WriteStream = js.native
  def apply(path: PathLike, options: EmitClose): WriteStream = js.native
}

