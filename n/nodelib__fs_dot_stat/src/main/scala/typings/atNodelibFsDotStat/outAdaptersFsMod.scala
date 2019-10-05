package typings.atNodelibFsDotStat

import typings.atNodelibFsDotStat.outAdaptersFsMod.FileSystemAdapter
import typings.node.fsMod.PathLike
import typings.node.fsMod.Stats
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.stat/out/adapters/fs", JSImport.Namespace)
@js.native
object outAdaptersFsMod extends js.Object {
  @js.native
  trait FileSystemAdapter extends js.Object {
    var lstat: Typeoflstat = js.native
    @JSName("lstatSync")
    var lstatSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
    var stat: Typeofstat = js.native
    @JSName("statSync")
    var statSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
    def lstatSync(path: PathLike): Stats = js.native
    def statSync(path: PathLike): Stats = js.native
  }
  
  val FILE_SYSTEM_ADAPTER: FileSystemAdapter = js.native
  def getFileSystemAdapter(): FileSystemAdapter = js.native
  def getFileSystemAdapter(fsMethods: Partial[FileSystemAdapter]): FileSystemAdapter = js.native
}

