package typings.maxmind

import typings.maxmind.maxmindStrings.buffer
import typings.node.Anon_BufferEncodingPersistent
import typings.node.Anon_EncodingFlag
import typings.node.Anon_EncodingFlagNull
import typings.node.Anon_EncodingFlagString
import typings.node.Anon_EncodingPersistent
import typings.node.Anon_EncodingPersistentRecursive
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.fsMod.FSWatcher
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maxmind/lib/fs", JSImport.Namespace)
@js.native
object libFsMod extends js.Object {
  @js.native
  object default extends js.Object {
    @JSName("readFileSync")
    var readFileSync_Original: Fn_OptionsPath = js.native
    @JSName("readFile")
    var readFile_Original: Fn_Options = js.native
    @JSName("watch")
    var watch_Original: Fn_Buffer = js.native
    def readFile(path: Double): js.Promise[String | Buffer] = js.native
    def readFile(path: Double, options: String): js.Promise[String | Buffer] = js.native
    def readFile(path: Double, options: Anon_EncodingFlag): js.Promise[Buffer] = js.native
    def readFile(path: Double, options: Anon_EncodingFlagNull): js.Promise[String | Buffer] = js.native
    def readFile(path: Double, options: Anon_EncodingFlagString): js.Promise[String] = js.native
    def readFile(path: PathLike): js.Promise[String | Buffer] = js.native
    def readFile(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
    def readFile(path: PathLike, options: Anon_EncodingFlag): js.Promise[Buffer] = js.native
    def readFile(path: PathLike, options: Anon_EncodingFlagNull): js.Promise[String | Buffer] = js.native
    def readFile(path: PathLike, options: Anon_EncodingFlagString): js.Promise[String] = js.native
    def readFileSync(path: Double): Buffer = js.native
    def readFileSync(path: Double, options: String): String | Buffer = js.native
    def readFileSync(path: Double, options: Anon_EncodingFlag): Buffer = js.native
    def readFileSync(path: Double, options: Anon_EncodingFlagNull): String | Buffer = js.native
    def readFileSync(path: Double, options: Anon_EncodingFlagString): String = js.native
    def readFileSync(path: PathLike): Buffer = js.native
    def readFileSync(path: PathLike, options: String): String | Buffer = js.native
    def readFileSync(path: PathLike, options: Anon_EncodingFlag): Buffer = js.native
    def readFileSync(path: PathLike, options: Anon_EncodingFlagNull): String | Buffer = js.native
    def readFileSync(path: PathLike, options: Anon_EncodingFlagString): String = js.native
    @JSName("readFileSync")
    def readFileSync_String(path: Double, options: String): String = js.native
    @JSName("readFileSync")
    def readFileSync_String(path: PathLike, options: String): String = js.native
    @JSName("readFileSync")
    def readFileSync_Union(path: Double): String | Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Union(path: PathLike): String | Buffer = js.native
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
    def watch(filename: PathLike, options: Anon_BufferEncodingPersistent): FSWatcher = js.native
    def watch(
      filename: PathLike,
      options: Anon_BufferEncodingPersistent,
      listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
    ): FSWatcher = js.native
    def watch(filename: PathLike, options: Anon_EncodingPersistent): FSWatcher = js.native
    def watch(filename: PathLike, options: Anon_EncodingPersistentRecursive): FSWatcher = js.native
    def watch(
      filename: PathLike,
      options: Anon_EncodingPersistentRecursive,
      listener: js.Function2[/* event */ String, /* filename */ String | Buffer, Unit]
    ): FSWatcher = js.native
    def watch(
      filename: PathLike,
      options: Anon_EncodingPersistent,
      listener: js.Function2[/* event */ String, /* filename */ String, Unit]
    ): FSWatcher = js.native
    def watch(filename: PathLike, options: BufferEncoding): FSWatcher = js.native
    def watch(
      filename: PathLike,
      options: BufferEncoding,
      listener: js.Function2[/* event */ String, /* filename */ String, Unit]
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

