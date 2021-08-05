package typings.nodelibFsStat

import typings.node.fsMod.BigIntOptions
import typings.node.fsMod.BigIntStats
import typings.node.fsMod.PathLike
import typings.node.fsMod.StatOptions
import typings.node.fsMod.Stats
import typings.nodelibFsStat.anon.FnCall
import typings.nodelibFsStat.anon.PartialFileSystemAdapter
import typings.nodelibFsStat.anon.Typeoflstat
import typings.nodelibFsStat.anon.Typeofstat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsMod {
  
  @JSImport("@nodelib/fs.stat/out/adapters/fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nodelib/fs.stat/out/adapters/fs", "FILE_SYSTEM_ADAPTER")
  @js.native
  val FILE_SYSTEM_ADAPTER: FileSystemAdapter = js.native
  
  inline def createFileSystemAdapter(): FileSystemAdapter = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileSystemAdapter")().asInstanceOf[FileSystemAdapter]
  inline def createFileSystemAdapter(fsMethods: PartialFileSystemAdapter): FileSystemAdapter = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileSystemAdapter")(fsMethods.asInstanceOf[js.Any]).asInstanceOf[FileSystemAdapter]
  
  trait FileSystemAdapter extends StObject {
    
    var lstat: Typeoflstat
    
    def lstatSync(path: PathLike): Stats
    @JSName("lstatSync")
    var lstatSync_Original: js.Function1[/* path */ PathLike, Stats]
    
    var stat: Typeofstat
    
    def statSync(path: PathLike): Stats
    def statSync(path: PathLike, options: BigIntOptions): BigIntStats
    def statSync(path: PathLike, options: StatOptions): Stats | BigIntStats
    @JSName("statSync")
    var statSync_Original: FnCall
  }
  object FileSystemAdapter {
    
    inline def apply(lstat: Typeoflstat, lstatSync: /* path */ PathLike => Stats, stat: Typeofstat, statSync: FnCall): FileSystemAdapter = {
      val __obj = js.Dynamic.literal(lstat = lstat.asInstanceOf[js.Any], lstatSync = js.Any.fromFunction1(lstatSync), stat = stat.asInstanceOf[js.Any], statSync = statSync.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileSystemAdapter]
    }
    
    extension [Self <: FileSystemAdapter](x: Self) {
      
      inline def setLstat(value: Typeoflstat): Self = StObject.set(x, "lstat", value.asInstanceOf[js.Any])
      
      inline def setLstatSync(value: /* path */ PathLike => Stats): Self = StObject.set(x, "lstatSync", js.Any.fromFunction1(value))
      
      inline def setStat(value: Typeofstat): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      inline def setStatSync(value: FnCall): Self = StObject.set(x, "statSync", value.asInstanceOf[js.Any])
    }
  }
}
