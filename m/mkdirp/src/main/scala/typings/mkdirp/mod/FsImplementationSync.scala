package typings.mkdirp.mod

import typings.mkdirp.FnCall
import typings.node.MakeDirectoryOptionsrecur
import typings.node.MakeDirectoryOptionsrecurMode
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.PathLike
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FsImplementationSync extends js.Object {
  @JSName("mkdirSync")
  var mkdirSync_Original: FnCall = js.native
  @JSName("statSync")
  var statSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
  def mkdirSync(path: PathLike): js.UndefOr[String] = js.native
  def mkdirSync(path: PathLike, options: String): js.UndefOr[String] = js.native
  def mkdirSync(path: PathLike, options: Double): js.UndefOr[String] = js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecur): String = js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
  @JSName("mkdirSync")
  def mkdirSync_Unit(path: PathLike): Unit = js.native
  @JSName("mkdirSync")
  def mkdirSync_Unit(path: PathLike, options: String): Unit = js.native
  @JSName("mkdirSync")
  def mkdirSync_Unit(path: PathLike, options: Double): Unit = js.native
  def statSync(path: PathLike): Stats = js.native
}

