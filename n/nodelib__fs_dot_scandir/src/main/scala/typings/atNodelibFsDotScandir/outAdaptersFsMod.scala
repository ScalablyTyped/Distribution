package typings.atNodelibFsDotScandir

import typings.atNodelibFsDotScandir.atNodelibFsDotScandirStrings.buffer
import typings.node.Anon_BufferEncodingFalse
import typings.node.Anon_EncodingFalse
import typings.node.Anon_EncodingFalseWithFileTypes
import typings.node.Anon_EncodingTrue
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.fsMod.Dirent
import typings.node.fsMod.PathLike
import typings.node.fsMod.Stats
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.scandir/out/adapters/fs", JSImport.Namespace)
@js.native
object outAdaptersFsMod extends js.Object {
  @js.native
  trait FileSystemAdapter extends js.Object {
    var lstat: Typeoflstat = js.native
    @JSName("lstatSync")
    var lstatSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
    var readdir: Typeofreaddir = js.native
    @JSName("readdirSync")
    var readdirSync_Original: Fn_Buffer = js.native
    var stat: Typeofstat = js.native
    @JSName("statSync")
    var statSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
    def lstatSync(path: PathLike): Stats = js.native
    def readdirSync(path: PathLike): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: String): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: Anon_BufferEncodingFalse): js.Array[Buffer] = js.native
    def readdirSync(path: PathLike, options: Anon_EncodingFalse): js.Array[String] = js.native
    def readdirSync(path: PathLike, options: Anon_EncodingFalseWithFileTypes): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: Anon_EncodingTrue): js.Array[Dirent] = js.native
    def readdirSync(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
    @JSName("readdirSync")
    def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = js.native
    def statSync(path: PathLike): Stats = js.native
  }
  
  val FILE_SYSTEM_ADAPTER: FileSystemAdapter = js.native
  def createFileSystemAdapter(): FileSystemAdapter = js.native
  def createFileSystemAdapter(fsMethods: Partial[FileSystemAdapter]): FileSystemAdapter = js.native
}

