package typings.node.fsMod

import typings.node.anon.Interval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "watchFile")
@js.native
object watchFile extends js.Object {
  def apply(filename: PathLike, listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]): Unit = js.native
  def apply(
    filename: PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]
  ): Unit = js.native
  def apply(
    filename: PathLike,
    options: Interval,
    listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]
  ): Unit = js.native
}

