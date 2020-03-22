package typings.nodelibFsScandir

import typings.node.Anon4
import typings.node.Anon5
import typings.node.AnonEncodingWithFileTypes
import typings.node.AnonWithFileTypes
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.fsMod.Dirent
import typings.node.fsMod.PathLike
import typings.node.fsMod.Stats
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
    def readdirSync(path: PathLike, options: String): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: Anon4): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: Anon5): js.Array[Dirent] = js.native
    def readdirSync(path: PathLike, options: AnonEncodingWithFileTypes): js.Array[Buffer] = js.native
    def readdirSync(path: PathLike, options: AnonWithFileTypes): js.Array[String] = js.native
    def readdirSync(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
    @JSName("readdirSync")
    def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = js.native
    def statSync(path: PathLike): Stats = js.native
  }
  
  val FILE_SYSTEM_ADAPTER: FileSystemAdapter = js.native
  def createFileSystemAdapter(): FileSystemAdapter = js.native
  def createFileSystemAdapter(fsMethods: PartialFileSystemAdapter): FileSystemAdapter = js.native
}

