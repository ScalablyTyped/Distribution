package typings.npmRun

import typings.node.Buffer
import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.ChildProcessByStdio
import typings.node.childProcessMod.ChildProcessWithoutNullStreams
import typings.node.childProcessMod.ExecSyncOptions
import typings.node.childProcessMod.ExecSyncOptionsWithBufferEncoding
import typings.node.childProcessMod.ExecSyncOptionsWithStringEncoding
import typings.node.childProcessMod.SpawnOptions
import typings.node.childProcessMod.SpawnOptionsWithStdioTuple
import typings.node.childProcessMod.SpawnOptionsWithoutStdio
import typings.node.childProcessMod.SpawnSyncOptions
import typings.node.childProcessMod.SpawnSyncOptionsWithBufferEncoding
import typings.node.childProcessMod.SpawnSyncOptionsWithStringEncoding
import typings.node.childProcessMod.SpawnSyncReturns
import typings.node.childProcessMod.StdioNull
import typings.node.childProcessMod.StdioPipe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait Fn0 extends js.Object {
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
  
  @js.native
  trait FnCall extends js.Object {
    def apply(command: String): String = js.native
    def apply(command: String, options: ExecSyncOptions): Buffer = js.native
    def apply(command: String, options: ExecSyncOptionsWithBufferEncoding): Buffer = js.native
    def apply(command: String, options: ExecSyncOptionsWithStringEncoding): String = js.native
  }
  
  @js.native
  trait FnCallCommandArgsOptions extends js.Object {
    def apply(command: String): SpawnSyncReturns[Buffer] = js.native
    def apply(command: String, args: js.Array[String]): SpawnSyncReturns[Buffer] = js.native
    def apply(command: String, args: js.Array[String], options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
    def apply(command: String, args: js.Array[String], options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
    def apply(command: String, args: js.Array[String], options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
    def apply(command: String, options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
    def apply(command: String, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
    def apply(command: String, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
  }
  
}

