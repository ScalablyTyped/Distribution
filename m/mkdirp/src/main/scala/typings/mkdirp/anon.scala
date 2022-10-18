package typings.mkdirp

import typings.node.NodeJS.ErrnoException
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.anon.StatOptionsbigintfalseund
import typings.node.anon.StatOptionsbiginttrue
import typings.node.fsMod.BigIntStats
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.Mode
import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import typings.node.fsMod.StatOptions
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: PathLike): js.UndefOr[String] = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecur): js.UndefOr[String] = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
    def apply(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
    def apply(path: PathLike, options: Mode): js.UndefOr[String] = js.native
  }
  
  @js.native
  trait Typeofmkdir extends StObject {
    
    def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
    def apply(
      path: PathLike,
      options: Null,
      callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def apply(path: PathLike, options: Null, callback: NoParamCallback): Unit = js.native
    def apply(
      path: PathLike,
      options: Unit,
      callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def apply(path: PathLike, options: Unit, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecurMode, callback: NoParamCallback): Unit = js.native
    def apply(
      path: PathLike,
      options: MakeDirectoryOptionsrecur,
      callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: MakeDirectoryOptions,
      callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: Mode,
      callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def apply(path: PathLike, options: Mode, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  trait Typeofstat extends StObject {
    
    def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
    def apply(
      path: PathLike,
      options: Unit,
      callback: js.Function2[ErrnoException | Null, BigIntStats | (/* stats */ Stats), Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: StatOptionsbigintfalseund,
      callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: StatOptionsbiginttrue,
      callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ BigIntStats, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: StatOptions,
      callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats | BigIntStats, Unit]
    ): Unit = js.native
  }
}
