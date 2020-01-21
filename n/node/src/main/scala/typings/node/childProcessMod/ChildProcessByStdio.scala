package typings.node.childProcessMod

import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// return this object when stdio option is a tuple of 3
@js.native
trait ChildProcessByStdio[I /* <: Null | Writable */, O /* <: Null | Readable */, E /* <: Null | Readable */] extends ChildProcess {
  @JSName("stderr")
  var stderr_ChildProcessByStdio: E = js.native
  @JSName("stdin")
  var stdin_ChildProcessByStdio: I = js.native
  @JSName("stdio")
  val stdio_ChildProcessByStdio: js.Tuple5[I, O, E, js.UndefOr[Readable | Writable | Null], js.UndefOr[Readable | Writable | Null]] = js.native
  @JSName("stdout")
  var stdout_ChildProcessByStdio: O = js.native
}

