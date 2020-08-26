package typings.maxmind

import typings.maxmind.anon.FnCall
import typings.maxmind.anon.FnCallFilenameOptionsListener
import typings.maxmind.anon.FnCallPathOptions
import typings.maxmind.maxmindStrings.buffer
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.anon.BaseEncodingOptionsflagst
import typings.node.anon.EncodingBufferEncoding
import typings.node.anon.Persistent
import typings.node.anon.Recursive
import typings.node.anon.`3`
import typings.node.fsMod.FSWatcher
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maxmind/lib/fs", JSImport.Namespace)
@js.native
object fsMod extends js.Object {
  @js.native
  object default extends js.Object {
    @JSName("existsSync")
    var existsSync_Original: js.Function1[/* path */ PathLike, Boolean] = js.native
    @JSName("readFileSync")
    var readFileSync_Original: FnCallPathOptions = js.native
    @JSName("readFile")
    var readFile_Original: FnCall = js.native
    @JSName("watch")
    var watch_Original: FnCallFilenameOptionsListener = js.native
    def existsSync(path: PathLike): Boolean = js.native
    def readFile(path: Double): js.Promise[String | Buffer] = js.native
    def readFile(path: Double, options: String): js.Promise[String | Buffer] = js.native
    def readFile(path: Double, options: BaseEncodingOptionsflagst): js.Promise[String | Buffer] = js.native
    def readFile(path: Double, options: EncodingBufferEncoding): js.Promise[String] = js.native
    def readFile(path: Double, options: `3`): js.Promise[Buffer] = js.native
    def readFile(path: PathLike): js.Promise[String | Buffer] = js.native
    def readFile(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
    def readFile(path: PathLike, options: BaseEncodingOptionsflagst): js.Promise[String | Buffer] = js.native
    def readFile(path: PathLike, options: EncodingBufferEncoding): js.Promise[String] = js.native
    def readFile(path: PathLike, options: `3`): js.Promise[Buffer] = js.native
    def readFileSync(path: Double): String | Buffer = js.native
    def readFileSync(path: Double, options: BufferEncoding): String = js.native
    def readFileSync(path: Double, options: BaseEncodingOptionsflagst): String | Buffer = js.native
    def readFileSync(path: Double, options: EncodingBufferEncoding): String = js.native
    def readFileSync(path: Double, options: `3`): Buffer = js.native
    def readFileSync(path: PathLike): String | Buffer = js.native
    def readFileSync(path: PathLike, options: BufferEncoding): String = js.native
    def readFileSync(path: PathLike, options: BaseEncodingOptionsflagst): String | Buffer = js.native
    def readFileSync(path: PathLike, options: EncodingBufferEncoding): String = js.native
    def readFileSync(path: PathLike, options: `3`): Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Buffer(path: Double): Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Buffer(path: PathLike): Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Union(path: Double, options: BufferEncoding): String | Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Union(path: PathLike, options: BufferEncoding): String | Buffer = js.native
    def watch(filename: PathLike): FSWatcher = js.native
    def watch(filename: PathLike, listener: js.Function2[/* event */ String, /* filename */ String, _]): FSWatcher = js.native
    def watch(
      filename: PathLike,
      options: js.UndefOr[scala.Nothing],
      listener: js.Function2[/* event */ String, /* filename */ String, Unit]
    ): FSWatcher = js.native
    def watch(filename: PathLike, options: String): FSWatcher = js.native
    def watch(
      filename: PathLike,
      options: String,
      listener: js.Function2[/* event */ String, /* filename */ String | Buffer, Unit]
    ): FSWatcher = js.native
    def watch(
      filename: PathLike,
      options: Null,
      listener: js.Function2[/* event */ String, Buffer | (/* filename */ String), Unit]
    ): FSWatcher = js.native
    def watch(filename: PathLike, options: BufferEncoding): FSWatcher = js.native
    def watch(
      filename: PathLike,
      options: BufferEncoding,
      listener: js.Function2[/* event */ String, /* filename */ String, Unit]
    ): FSWatcher = js.native
    def watch(filename: PathLike, options: Persistent): FSWatcher = js.native
    def watch(
      filename: PathLike,
      options: Persistent,
      listener: js.Function2[/* event */ String, Buffer | (/* filename */ String), Unit]
    ): FSWatcher = js.native
    def watch(filename: PathLike, options: Recursive): FSWatcher = js.native
    def watch(
      filename: PathLike,
      options: Recursive,
      listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
    ): FSWatcher = js.native
    @JSName("watch")
    def watch_buffer(filename: PathLike, options: buffer): FSWatcher = js.native
    @JSName("watch")
    def watch_buffer(
      filename: PathLike,
      options: buffer,
      listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
    ): FSWatcher = js.native
  }
  
}

