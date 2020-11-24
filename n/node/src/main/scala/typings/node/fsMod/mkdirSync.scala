package typings.node.fsMod

import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "mkdirSync")
@js.native
object mkdirSync extends js.Object {
  
  def apply(path: PathLike): js.UndefOr[String] = js.native
  def apply(path: PathLike, options: MakeDirectoryOptionsrecur): String = js.native
  def apply(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
  def apply(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
  def apply(path: PathLike, options: Mode): js.UndefOr[String] = js.native
}
