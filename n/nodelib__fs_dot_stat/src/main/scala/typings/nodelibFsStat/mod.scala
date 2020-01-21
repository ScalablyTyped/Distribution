package typings.nodelibFsStat

import typings.node.fsMod.PathLike
import typings.node.fsMod.Stats
import typings.nodelibFsStat.statMod.AsyncCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.stat", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def stat(path: PathLike): js.Promise[Stats] = js.native
  def stat(path: PathLike, opts: Options): js.Promise[Stats] = js.native
  def statCallback(path: PathLike, callback: AsyncCallback): Unit = js.native
  def statCallback(path: PathLike, opts: Options, callback: AsyncCallback): Unit = js.native
  def statSync(path: PathLike): Stats = js.native
  def statSync(path: PathLike, opts: Options): Stats = js.native
  type FileSystemAdapter = /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @nodelib/fs.stat.@nodelib/fs.stat.FileSystemAdapter */ js.Object
  type Options = /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @nodelib/fs.stat.@nodelib/fs.stat.Options */ js.Object
  type StatAsyncCallback = AsyncCallback
}

