package typings.mkdirp

import typings.node.NodeJS.ErrnoException
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.fsMod.BigIntOptions
import typings.node.fsMod.BigIntStats
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.Mode
import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import typings.node.fsMod.StatOptions
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait FnCall extends js.Object {
    
    def apply(path: PathLike): js.UndefOr[String] = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecur): String = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
    def apply(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
    def apply(path: PathLike, options: Mode): js.UndefOr[String] = js.native
  }
  
  @js.native
  trait FnCallPathOptions extends js.Object {
    
    def apply(path: PathLike): Stats = js.native
    def apply(path: PathLike, options: BigIntOptions): BigIntStats = js.native
    def apply(path: PathLike, options: StatOptions): Stats | BigIntStats = js.native
  }
  
  @js.native
  trait Typeofmkdir extends js.Object {
    
    def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
    def apply(
      path: PathLike,
      options: js.UndefOr[Mode],
      callback: js.Function2[ErrnoException | Null, js.UndefOr[String], Unit]
    ): Unit = js.native
    def apply(path: PathLike, options: js.UndefOr[Mode], callback: NoParamCallback): Unit = js.native
    def apply(
      path: PathLike,
      options: Null,
      callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def apply(path: PathLike, options: Null, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecurMode, callback: NoParamCallback): Unit = js.native
    def apply(
      path: PathLike,
      options: MakeDirectoryOptionsrecur,
      callback: js.Function2[/* err */ ErrnoException | Null, /* path */ String, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: MakeDirectoryOptions,
      callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait Typeofstat extends js.Object {
    
    def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
    def apply(
      path: PathLike,
      options: BigIntOptions,
      callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ BigIntStats, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: StatOptions,
      callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats | BigIntStats, Unit]
    ): Unit = js.native
  }
}
