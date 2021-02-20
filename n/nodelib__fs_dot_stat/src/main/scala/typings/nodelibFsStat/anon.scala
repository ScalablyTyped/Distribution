package typings.nodelibFsStat

import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.BigIntOptions
import typings.node.fsMod.BigIntStats
import typings.node.fsMod.PathLike
import typings.node.fsMod.StatOptions
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: PathLike): Stats = js.native
    def apply(path: PathLike, options: BigIntOptions): BigIntStats = js.native
    def apply(path: PathLike, options: StatOptions): Stats | BigIntStats = js.native
  }
  
  /* Inlined std.Partial<@nodelib/fs.stat.@nodelib/fs.stat/out/adapters/fs.FileSystemAdapter> */
  @js.native
  trait PartialFileSystemAdapter extends StObject {
    
    var lstat: js.UndefOr[Typeoflstat] = js.native
    
    var lstatSync: js.UndefOr[js.Function1[/* path */ PathLike, Stats]] = js.native
    
    var stat: js.UndefOr[Typeofstat] = js.native
    
    var statSync: js.UndefOr[FnCall] = js.native
  }
  object PartialFileSystemAdapter {
    
    @scala.inline
    def apply(): PartialFileSystemAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFileSystemAdapter]
    }
    
    @scala.inline
    implicit class PartialFileSystemAdapterMutableBuilder[Self <: PartialFileSystemAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLstat(value: Typeoflstat): Self = StObject.set(x, "lstat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLstatSync(value: /* path */ PathLike => Stats): Self = StObject.set(x, "lstatSync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLstatSyncUndefined: Self = StObject.set(x, "lstatSync", js.undefined)
      
      @scala.inline
      def setLstatUndefined: Self = StObject.set(x, "lstat", js.undefined)
      
      @scala.inline
      def setStat(value: Typeofstat): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatSync(value: FnCall): Self = StObject.set(x, "statSync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatSyncUndefined: Self = StObject.set(x, "statSync", js.undefined)
      
      @scala.inline
      def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
    }
  }
  
  @js.native
  trait Typeoflstat extends StObject {
    
    def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
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
