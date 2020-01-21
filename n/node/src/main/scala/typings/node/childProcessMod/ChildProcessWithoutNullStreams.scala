package typings.node.childProcessMod

import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// return this object when stdio option is undefined or not specified
@js.native
trait ChildProcessWithoutNullStreams extends ChildProcess {
  @JSName("stderr")
  var stderr_ChildProcessWithoutNullStreams: Readable = js.native
  @JSName("stdin")
  var stdin_ChildProcessWithoutNullStreams: Writable = js.native
  @JSName("stdio")
  val stdio_ChildProcessWithoutNullStreams: js.Tuple5[
    Writable, 
    Readable, 
    Readable, 
    js.UndefOr[Readable | Writable | Null], 
    js.UndefOr[Readable | Writable | Null]
  ] = js.native
  @JSName("stdout")
  var stdout_ChildProcessWithoutNullStreams: Readable = js.native
}

