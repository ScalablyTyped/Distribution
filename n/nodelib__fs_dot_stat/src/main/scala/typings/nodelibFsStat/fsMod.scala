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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsMod {
  
  @JSImport("@nodelib/fs.stat/out/adapters/fs", "FILE_SYSTEM_ADAPTER")
  @js.native
  val FILE_SYSTEM_ADAPTER: FileSystemAdapter = js.native
  
  @JSImport("@nodelib/fs.stat/out/adapters/fs", "createFileSystemAdapter")
  @js.native
  def createFileSystemAdapter(): FileSystemAdapter = js.native
  @JSImport("@nodelib/fs.stat/out/adapters/fs", "createFileSystemAdapter")
  @js.native
  def createFileSystemAdapter(fsMethods: PartialFileSystemAdapter): FileSystemAdapter = js.native
  
  @js.native
  trait FileSystemAdapter extends StObject {
    
    var lstat: Typeoflstat = js.native
    
    def lstatSync(path: PathLike): Stats = js.native
    @JSName("lstatSync")
    var lstatSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
    
    var stat: Typeofstat = js.native
    
    def statSync(path: PathLike): Stats = js.native
    def statSync(path: PathLike, options: BigIntOptions): BigIntStats = js.native
    def statSync(path: PathLike, options: StatOptions): Stats | BigIntStats = js.native
    @JSName("statSync")
    var statSync_Original: FnCall = js.native
  }
}
