package typings.nodelibFsStat

import typings.node.fsMod.Stats
import typings.nodelibFsStat.anon.PartialFileSystemAdapter
import typings.nodelibFsStat.outTypesMod.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outAdaptersFsMod {
  
  @JSImport("@nodelib/fs.stat/out/adapters/fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nodelib/fs.stat/out/adapters/fs", "FILE_SYSTEM_ADAPTER")
  @js.native
  val FILE_SYSTEM_ADAPTER: FileSystemAdapter = js.native
  
  inline def createFileSystemAdapter(): FileSystemAdapter = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileSystemAdapter")().asInstanceOf[FileSystemAdapter]
  inline def createFileSystemAdapter(fsMethods: PartialFileSystemAdapter): FileSystemAdapter = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileSystemAdapter")(fsMethods.asInstanceOf[js.Any]).asInstanceOf[FileSystemAdapter]
  
  trait FileSystemAdapter extends StObject {
    
    def lstat(path: String, callback: js.Function2[/* error */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit
    
    def lstatSync(path: String): Stats
    @JSName("lstatSync")
    var lstatSync_Original: StatSynchronousMethod
    
    @JSName("lstat")
    var lstat_Original: StatAsynchronousMethod
    
    def stat(path: String, callback: js.Function2[/* error */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit
    
    def statSync(path: String): Stats
    @JSName("statSync")
    var statSync_Original: StatSynchronousMethod
    
    @JSName("stat")
    var stat_Original: StatAsynchronousMethod
  }
  object FileSystemAdapter {
    
    inline def apply(
      lstat: (/* path */ String, /* callback */ js.Function2[/* error */ ErrnoException | Null, /* stats */ Stats, Unit]) => Unit,
      lstatSync: /* path */ String => Stats,
      stat: (/* path */ String, /* callback */ js.Function2[/* error */ ErrnoException | Null, /* stats */ Stats, Unit]) => Unit,
      statSync: /* path */ String => Stats
    ): FileSystemAdapter = {
      val __obj = js.Dynamic.literal(lstat = js.Any.fromFunction2(lstat), lstatSync = js.Any.fromFunction1(lstatSync), stat = js.Any.fromFunction2(stat), statSync = js.Any.fromFunction1(statSync))
      __obj.asInstanceOf[FileSystemAdapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileSystemAdapter] (val x: Self) extends AnyVal {
      
      inline def setLstat(
        value: (/* path */ String, /* callback */ js.Function2[/* error */ ErrnoException | Null, /* stats */ Stats, Unit]) => Unit
      ): Self = StObject.set(x, "lstat", js.Any.fromFunction2(value))
      
      inline def setLstatSync(value: /* path */ String => Stats): Self = StObject.set(x, "lstatSync", js.Any.fromFunction1(value))
      
      inline def setStat(
        value: (/* path */ String, /* callback */ js.Function2[/* error */ ErrnoException | Null, /* stats */ Stats, Unit]) => Unit
      ): Self = StObject.set(x, "stat", js.Any.fromFunction2(value))
      
      inline def setStatSync(value: /* path */ String => Stats): Self = StObject.set(x, "statSync", js.Any.fromFunction1(value))
    }
  }
  
  type StatAsynchronousMethod = js.Function2[
    /* path */ String, 
    /* callback */ js.Function2[/* error */ ErrnoException | Null, /* stats */ Stats, Unit], 
    Unit
  ]
  
  type StatSynchronousMethod = js.Function1[/* path */ String, Stats]
}
