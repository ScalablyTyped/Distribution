package typings.nodelibFsScandir

import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.anon.BaseEncodingOptionswithFi
import typings.node.anon.BaseEncodingOptionswithFiEncoding
import typings.node.anon.Encoding
import typings.node.anon.WithFileTypes
import typings.node.fsMod.Dirent
import typings.node.fsMod.PathLike
import typings.node.fsMod.Stats
import typings.nodelibFsScandir.anon.FnCall
import typings.nodelibFsScandir.anon.PartialFileSystemAdapter
import typings.nodelibFsScandir.anon.Typeoflstat
import typings.nodelibFsScandir.anon.Typeofreaddir
import typings.nodelibFsScandir.anon.Typeofstat
import typings.nodelibFsScandir.nodelibFsScandirStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.scandir/out/adapters/fs", JSImport.Namespace)
@js.native
object fsMod extends js.Object {
  @js.native
  trait FileSystemAdapter extends js.Object {
    var lstat: Typeoflstat = js.native
    @JSName("lstatSync")
    var lstatSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
    var readdir: Typeofreaddir = js.native
    @JSName("readdirSync")
    var readdirSync_Original: FnCall = js.native
    var stat: Typeofstat = js.native
    @JSName("statSync")
    var statSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
    def lstatSync(path: PathLike): Stats = js.native
    def readdirSync(path: PathLike): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: BufferEncoding): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: BaseEncodingOptionswithFi): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: BaseEncodingOptionswithFiEncoding): js.Array[Dirent] = js.native
    def readdirSync(path: PathLike, options: Encoding): js.Array[Buffer] = js.native
    def readdirSync(path: PathLike, options: WithFileTypes): js.Array[String] = js.native
    @JSName("readdirSync")
    def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = js.native
    def statSync(path: PathLike): Stats = js.native
  }
  
  val FILE_SYSTEM_ADAPTER: FileSystemAdapter = js.native
  def createFileSystemAdapter(): FileSystemAdapter = js.native
  def createFileSystemAdapter(fsMethods: PartialFileSystemAdapter): FileSystemAdapter = js.native
}

