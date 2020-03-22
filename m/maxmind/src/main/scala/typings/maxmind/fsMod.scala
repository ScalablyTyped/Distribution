package typings.maxmind

import typings.maxmind.maxmindStrings.buffer
import typings.node.AnonEncodingFlag
import typings.node.AnonEncodingPersistent
import typings.node.AnonFlag
import typings.node.AnonFlagString
import typings.node.AnonPersistent
import typings.node.AnonRecursive
import typings.node.Buffer
import typings.node.BufferEncoding
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
    @JSName("readFileSync")
    var readFileSync_Original: FnCallPathOptions = js.native
    @JSName("readFile")
    var readFile_Original: FnCall = js.native
    @JSName("watch")
    var watch_Original: FnCallFilenameOptionsListener = js.native
    def readFile(path: Double): js.Promise[String | Buffer] = js.native
    def readFile(path: Double, options: String): js.Promise[String | Buffer] = js.native
    def readFile(path: Double, options: AnonEncodingFlag): js.Promise[String] = js.native
    def readFile(path: Double, options: AnonFlag): js.Promise[Buffer] = js.native
    def readFile(path: Double, options: AnonFlagString): js.Promise[String | Buffer] = js.native
    def readFile(path: PathLike): js.Promise[String | Buffer] = js.native
    def readFile(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
    def readFile(path: PathLike, options: AnonEncodingFlag): js.Promise[String] = js.native
    def readFile(path: PathLike, options: AnonFlag): js.Promise[Buffer] = js.native
    def readFile(path: PathLike, options: AnonFlagString): js.Promise[String | Buffer] = js.native
    def readFileSync(path: Double): String | Buffer = js.native
    def readFileSync(path: Double, options: String): String = js.native
    def readFileSync(path: Double, options: AnonEncodingFlag): String = js.native
    def readFileSync(path: Double, options: AnonFlag): Buffer = js.native
    def readFileSync(path: Double, options: AnonFlagString): String | Buffer = js.native
    def readFileSync(path: PathLike): String | Buffer = js.native
    def readFileSync(path: PathLike, options: String): String = js.native
    def readFileSync(path: PathLike, options: AnonEncodingFlag): String = js.native
    def readFileSync(path: PathLike, options: AnonFlag): Buffer = js.native
    def readFileSync(path: PathLike, options: AnonFlagString): String | Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Buffer(path: Double): Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Buffer(path: PathLike): Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Union(path: Double, options: String): String | Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Union(path: PathLike, options: String): String | Buffer = js.native
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
    def watch(filename: PathLike, options: AnonEncodingPersistent): FSWatcher = js.native
    def watch(
      filename: PathLike,
      options: AnonEncodingPersistent,
      listener: js.Function2[/* event */ String, /* filename */ String | Buffer, Unit]
    ): FSWatcher = js.native
    def watch(filename: PathLike, options: AnonPersistent): FSWatcher = js.native
    def watch(
      filename: PathLike,
      options: AnonPersistent,
      listener: js.Function2[/* event */ String, /* filename */ String, Unit]
    ): FSWatcher = js.native
    def watch(filename: PathLike, options: AnonRecursive): FSWatcher = js.native
    def watch(
      filename: PathLike,
      options: AnonRecursive,
      listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
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

