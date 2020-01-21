package typings.nodelibFsStat

import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.PathLike
import typings.node.fsMod.Stats
import typings.nodelibFsStat.optionsMod.StrictOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.stat/out/providers/stat", JSImport.Namespace)
@js.native
object statMod extends js.Object {
  def async(path: PathLike, options: StrictOptions, callback: AsyncCallback): Unit = js.native
  def isFollowedSymlink(stat: Stats, options: StrictOptions): Boolean = js.native
  def sync(path: PathLike, options: StrictOptions): Stats = js.native
  type AsyncCallback = js.Function2[/* err */ ErrnoException | Null, /* stats */ js.UndefOr[Stats], Unit]
}

