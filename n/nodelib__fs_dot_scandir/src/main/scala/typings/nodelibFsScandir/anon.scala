package typings.nodelibFsScandir

import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ErrnoException
import typings.node.anon.BaseEncodingOptionswithFi
import typings.node.anon.BaseEncodingOptionswithFiEncoding
import typings.node.anon.Encoding
import typings.node.anon.WithFileTypes
import typings.node.fsMod.BigIntOptions
import typings.node.fsMod.BigIntStats
import typings.node.fsMod.Dirent
import typings.node.fsMod.PathLike
import typings.node.fsMod.StatOptions
import typings.node.fsMod.Stats
import typings.nodelibFsScandir.nodelibFsScandirStrings.buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: PathLike): Stats = js.native
    def apply(path: PathLike, options: BigIntOptions): BigIntStats = js.native
    def apply(path: PathLike, options: StatOptions): Stats | BigIntStats = js.native
  }
  
  @js.native
  trait FnCallPathOptions extends StObject {
    
    def apply(path: PathLike): js.Array[Buffer | String] = js.native
    def apply(path: PathLike, options: BufferEncoding): js.Array[Buffer | String] = js.native
    def apply(path: PathLike, options: BaseEncodingOptionswithFi): js.Array[Buffer | String] = js.native
    def apply(path: PathLike, options: BaseEncodingOptionswithFiEncoding): js.Array[Dirent] = js.native
    def apply(path: PathLike, options: Encoding): js.Array[Buffer] = js.native
    def apply(path: PathLike, options: WithFileTypes): js.Array[String] = js.native
    def apply(path: PathLike, options: buffer): js.Array[Buffer] = js.native
  }
  
  /* Inlined std.Partial<@nodelib/fs.scandir.@nodelib/fs.scandir/out/adapters/fs.FileSystemAdapter> */
  trait PartialFileSystemAdapter extends StObject {
    
    var lstat: js.UndefOr[Typeoflstat] = js.undefined
    
    var lstatSync: js.UndefOr[js.Function1[/* path */ PathLike, Stats]] = js.undefined
    
    var readdir: js.UndefOr[Typeofreaddir] = js.undefined
    
    var readdirSync: js.UndefOr[FnCallPathOptions] = js.undefined
    
    var stat: js.UndefOr[Typeofstat] = js.undefined
    
    var statSync: js.UndefOr[FnCall] = js.undefined
  }
  object PartialFileSystemAdapter {
    
    inline def apply(): PartialFileSystemAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFileSystemAdapter]
    }
    
    extension [Self <: PartialFileSystemAdapter](x: Self) {
      
      inline def setLstat(value: Typeoflstat): Self = StObject.set(x, "lstat", value.asInstanceOf[js.Any])
      
      inline def setLstatSync(value: /* path */ PathLike => Stats): Self = StObject.set(x, "lstatSync", js.Any.fromFunction1(value))
      
      inline def setLstatSyncUndefined: Self = StObject.set(x, "lstatSync", js.undefined)
      
      inline def setLstatUndefined: Self = StObject.set(x, "lstat", js.undefined)
      
      inline def setReaddir(value: Typeofreaddir): Self = StObject.set(x, "readdir", value.asInstanceOf[js.Any])
      
      inline def setReaddirSync(value: FnCallPathOptions): Self = StObject.set(x, "readdirSync", value.asInstanceOf[js.Any])
      
      inline def setReaddirSyncUndefined: Self = StObject.set(x, "readdirSync", js.undefined)
      
      inline def setReaddirUndefined: Self = StObject.set(x, "readdir", js.undefined)
      
      inline def setStat(value: Typeofstat): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      inline def setStatSync(value: FnCall): Self = StObject.set(x, "statSync", value.asInstanceOf[js.Any])
      
      inline def setStatSyncUndefined: Self = StObject.set(x, "statSync", js.undefined)
      
      inline def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
    }
  }
  
  @js.native
  trait Typeoflstat extends StObject {
    
    def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
  }
  
  @js.native
  trait Typeofreaddir extends StObject {
    
    def apply(
      path: PathLike,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: Null,
      callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: Unit,
      callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: BufferEncoding,
      callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: BaseEncodingOptionswithFiEncoding,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Dirent], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: BaseEncodingOptionswithFi,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: Encoding,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: WithFileTypes,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: buffer,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait Typeofstat extends StObject {
    
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
