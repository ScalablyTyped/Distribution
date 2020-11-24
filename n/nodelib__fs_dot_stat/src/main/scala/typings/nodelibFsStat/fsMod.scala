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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@nodelib/fs.stat/out/adapters/fs", JSImport.Namespace)
@js.native
object fsMod extends js.Object {
  
  val FILE_SYSTEM_ADAPTER: FileSystemAdapter = js.native
  
  def createFileSystemAdapter(): FileSystemAdapter = js.native
  def createFileSystemAdapter(fsMethods: PartialFileSystemAdapter): FileSystemAdapter = js.native
  
  @js.native
  trait FileSystemAdapter extends js.Object {
    
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
