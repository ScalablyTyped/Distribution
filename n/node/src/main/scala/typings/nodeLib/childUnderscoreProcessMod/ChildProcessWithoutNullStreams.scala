package typings
package nodeLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// return this object when stdio option is undefined or not specified
@js.native
trait ChildProcessWithoutNullStreams extends ChildProcess {
  @JSName("stderr")
  var stderr_ChildProcessWithoutNullStreams: nodeLib.streamMod.Readable = js.native
  @JSName("stdin")
  var stdin_ChildProcessWithoutNullStreams: nodeLib.streamMod.Writable = js.native
  @JSName("stdio")
  val stdio_ChildProcessWithoutNullStreams: js.Tuple5[
    nodeLib.streamMod.Writable, 
    nodeLib.streamMod.Readable, 
    nodeLib.streamMod.Readable, 
    js.UndefOr[nodeLib.streamMod.Readable | nodeLib.streamMod.Writable | scala.Null], 
    js.UndefOr[nodeLib.streamMod.Readable | nodeLib.streamMod.Writable | scala.Null]
  ] = js.native
  @JSName("stdout")
  var stdout_ChildProcessWithoutNullStreams: nodeLib.streamMod.Readable = js.native
}

