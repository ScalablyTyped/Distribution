package typings.npmDashRun

import typings.node.childUnderscoreProcessMod.ChildProcess
import typings.node.childUnderscoreProcessMod.ChildProcessByStdio
import typings.node.childUnderscoreProcessMod.ChildProcessWithoutNullStreams
import typings.node.childUnderscoreProcessMod.SpawnOptions
import typings.node.childUnderscoreProcessMod.SpawnOptionsWithStdioTuple
import typings.node.childUnderscoreProcessMod.SpawnOptionsWithoutStdio
import typings.node.childUnderscoreProcessMod.StdioNull
import typings.node.childUnderscoreProcessMod.StdioPipe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_ArgsCommand extends js.Object {
  def apply(command: String): ChildProcessWithoutNullStreams = js.native
  def apply(command: String, args: js.Array[String]): ChildProcessWithoutNullStreams = js.native
  def apply(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = js.native
  def apply(
    command: String,
    args: js.Array[String],
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Null, Null, Null] = js.native
  def apply(command: String, args: js.Array[String], options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
  def apply(command: String, options: SpawnOptions): ChildProcess = js.native
  def apply(
    command: String,
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Null, Null, Null] = js.native
  def apply(command: String, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
}

