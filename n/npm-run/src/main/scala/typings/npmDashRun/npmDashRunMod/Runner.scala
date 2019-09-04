package typings.npmDashRun.npmDashRunMod

import typings.node.Anon_Buffer
import typings.node.Anon_Encoding
import typings.node.Anon_EncodingNull
import typings.node.Anon_EncodingString
import typings.node.Buffer
import typings.node.childUnderscoreProcessMod.ChildProcess
import typings.node.childUnderscoreProcessMod.ChildProcessByStdio
import typings.node.childUnderscoreProcessMod.ChildProcessWithoutNullStreams
import typings.node.childUnderscoreProcessMod.ExecException
import typings.node.childUnderscoreProcessMod.ExecOptions
import typings.node.childUnderscoreProcessMod.ExecSyncOptions
import typings.node.childUnderscoreProcessMod.ExecSyncOptionsWithBufferEncoding
import typings.node.childUnderscoreProcessMod.ExecSyncOptionsWithStringEncoding
import typings.node.childUnderscoreProcessMod.SpawnOptions
import typings.node.childUnderscoreProcessMod.SpawnOptionsWithStdioTuple
import typings.node.childUnderscoreProcessMod.SpawnOptionsWithoutStdio
import typings.node.childUnderscoreProcessMod.SpawnSyncOptions
import typings.node.childUnderscoreProcessMod.SpawnSyncOptionsWithBufferEncoding
import typings.node.childUnderscoreProcessMod.SpawnSyncOptionsWithStringEncoding
import typings.node.childUnderscoreProcessMod.SpawnSyncReturns
import typings.node.childUnderscoreProcessMod.StdioNull
import typings.node.childUnderscoreProcessMod.StdioPipe
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.npmDashRun.Fn_Args
import typings.npmDashRun.Fn_ArgsCommand
import typings.npmDashRun.Fn_Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Runner extends ExecFunction {
  @JSName("execSync")
  var execSync_Original: Fn_Command = js.native
  @JSName("exec")
  var exec_Original: ExecFunction = js.native
  @JSName("spawnSync")
  var spawnSync_Original: Fn_Args = js.native
  @JSName("spawn")
  var spawn_Original: Fn_ArgsCommand = js.native
  @JSName("sync")
  var sync_Original: Fn_Command = js.native
  def exec(command: String): ChildProcess = js.native
  def exec(
    command: String,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def exec(command: String, options: Anon_EncodingString with ExecOptions): ChildProcess = js.native
  def exec(command: String, options: Anon_Encoding with ExecOptions): ChildProcess = js.native
  def exec(command: String, options: Anon_Buffer with ExecOptions): ChildProcess = js.native
  def exec(command: String, options: Anon_EncodingNull with ExecOptions): ChildProcess = js.native
  def exec(
    command: String,
    options: Anon_EncodingNull with ExecOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def exec(
    command: String,
    options: Anon_Encoding with ExecOptions,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def exec(
    command: String,
    options: Anon_Buffer with ExecOptions,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def exec(
    command: String,
    options: Anon_EncodingString with ExecOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def exec(
    command: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def exec(
    command: String,
    options: Null,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def exec(command: String, options: ExecOptions): ChildProcess = js.native
  def exec(
    command: String,
    options: ExecOptions,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def execSync(command: String): Buffer = js.native
  def execSync(command: String, options: ExecSyncOptions): Buffer = js.native
  def execSync(command: String, options: ExecSyncOptionsWithBufferEncoding): Buffer = js.native
  def execSync(command: String, options: ExecSyncOptionsWithStringEncoding): String = js.native
  @JSName("execSync")
  def execSync_String(command: String): String = js.native
  def spawn(command: String): ChildProcessWithoutNullStreams = js.native
  def spawn(command: String, args: js.Array[String]): ChildProcessWithoutNullStreams = js.native
  def spawn(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = js.native
  def spawn(
    command: String,
    args: js.Array[String],
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Writable, Readable, Readable] = js.native
  def spawn(command: String, args: js.Array[String], options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
  def spawn(command: String, options: SpawnOptions): ChildProcess = js.native
  def spawn(
    command: String,
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Writable, Readable, Readable] = js.native
  def spawn(command: String, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
  def spawnSync(command: String): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: String, args: js.Array[String]): SpawnSyncReturns[String] = js.native
  def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
  def spawnSync(command: String, options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: String, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: String, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
  def sync(command: String): Buffer = js.native
  def sync(command: String, options: ExecSyncOptions): Buffer = js.native
  def sync(command: String, options: ExecSyncOptionsWithBufferEncoding): Buffer = js.native
  def sync(command: String, options: ExecSyncOptionsWithStringEncoding): String = js.native
  @JSName("sync")
  def sync_String(command: String): String = js.native
}

