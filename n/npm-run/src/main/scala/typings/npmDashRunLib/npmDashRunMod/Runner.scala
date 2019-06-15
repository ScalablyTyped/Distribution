package typings
package npmDashRunLib.npmDashRunMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Runner extends ExecFunction {
  @JSName("execSync")
  var execSync_Original: npmDashRunLib.Fn_Command = js.native
  @JSName("exec")
  var exec_Original: ExecFunction = js.native
  @JSName("spawnSync")
  var spawnSync_Original: npmDashRunLib.Fn_Args = js.native
  @JSName("spawn")
  var spawn_Original: npmDashRunLib.Fn_ArgsCommand = js.native
  @JSName("sync")
  var sync_Original: npmDashRunLib.Fn_Command = js.native
  def exec(command: java.lang.String): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: nodeLib.Anon_EncodingNull with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: nodeLib.Anon_Encoding with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: nodeLib.Anon_EncodingString with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: nodeLib.Anon_Buffer with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: nodeLib.Anon_EncodingNull with nodeLib.childUnderscoreProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: nodeLib.Anon_EncodingString with nodeLib.childUnderscoreProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: nodeLib.Anon_Encoding with nodeLib.childUnderscoreProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: nodeLib.Anon_Buffer with nodeLib.childUnderscoreProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ nodeLib.Buffer, 
      /* stderr */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(command: java.lang.String, options: nodeLib.childUnderscoreProcessMod.ExecOptions): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: scala.Null,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execSync(command: java.lang.String): java.lang.String = js.native
  def execSync(command: java.lang.String, options: nodeLib.childUnderscoreProcessMod.ExecSyncOptions): nodeLib.Buffer = js.native
  def execSync(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecSyncOptionsWithBufferEncoding
  ): nodeLib.Buffer = js.native
  def execSync(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecSyncOptionsWithStringEncoding
  ): java.lang.String = js.native
  @JSName("execSync")
  def execSync_Buffer(command: java.lang.String): nodeLib.Buffer = js.native
  def spawn(command: java.lang.String): nodeLib.childUnderscoreProcessMod.ChildProcessWithoutNullStreams = js.native
  def spawn(command: java.lang.String, args: js.Array[java.lang.String]): nodeLib.childUnderscoreProcessMod.ChildProcessWithoutNullStreams = js.native
  def spawn(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.SpawnOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def spawn(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.SpawnOptionsWithoutStdio
  ): nodeLib.childUnderscoreProcessMod.ChildProcessWithoutNullStreams = js.native
  def spawn(command: java.lang.String, options: nodeLib.childUnderscoreProcessMod.SpawnOptions): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def spawn(command: java.lang.String, options: nodeLib.childUnderscoreProcessMod.SpawnOptionsWithoutStdio): nodeLib.childUnderscoreProcessMod.ChildProcessWithoutNullStreams = js.native
  def spawnSync(command: java.lang.String): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[nodeLib.Buffer] = js.native
  def spawnSync(command: java.lang.String, args: js.Array[java.lang.String]): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[java.lang.String] = js.native
  def spawnSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.SpawnSyncOptions
  ): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[nodeLib.Buffer] = js.native
  def spawnSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.SpawnSyncOptionsWithBufferEncoding
  ): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[nodeLib.Buffer] = js.native
  def spawnSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.SpawnSyncOptionsWithStringEncoding
  ): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[java.lang.String] = js.native
  def spawnSync(command: java.lang.String, options: nodeLib.childUnderscoreProcessMod.SpawnSyncOptions): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[nodeLib.Buffer] = js.native
  def spawnSync(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.SpawnSyncOptionsWithBufferEncoding
  ): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[nodeLib.Buffer] = js.native
  def spawnSync(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.SpawnSyncOptionsWithStringEncoding
  ): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[java.lang.String] = js.native
  def sync(command: java.lang.String): java.lang.String = js.native
  def sync(command: java.lang.String, options: nodeLib.childUnderscoreProcessMod.ExecSyncOptions): nodeLib.Buffer = js.native
  def sync(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecSyncOptionsWithBufferEncoding
  ): nodeLib.Buffer = js.native
  def sync(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecSyncOptionsWithStringEncoding
  ): java.lang.String = js.native
  @JSName("sync")
  def sync_Buffer(command: java.lang.String): nodeLib.Buffer = js.native
}

