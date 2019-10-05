package typings.node.childUnderscoreProcessMod

import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("child_process", "spawn")
@js.native
object spawn extends js.Object {
  // overloads of spawn without 'args'
  def apply(command: java.lang.String): ChildProcessWithoutNullStreams = js.native
  def apply(command: java.lang.String, args: js.Array[java.lang.String]): ChildProcessWithoutNullStreams = js.native
  def apply(command: java.lang.String, args: js.Array[java.lang.String], options: SpawnOptions): ChildProcess = js.native
  def apply(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Writable, Readable, Readable] = js.native
  def apply(command: java.lang.String, args: js.Array[java.lang.String], options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
  def apply(command: java.lang.String, options: SpawnOptions): ChildProcess = js.native
  def apply(
    command: java.lang.String,
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Writable, Readable, Readable] = js.native
  def apply(command: java.lang.String, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
}

