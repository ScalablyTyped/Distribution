package typings.node.childUnderscoreProcessMod

import typings.node.Anon_Buffer
import typings.node.Anon_Encoding
import typings.node.Anon_EncodingNull
import typings.node.Anon_EncodingString
import typings.node.Buffer
import typings.node.Error
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("child_process", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // no `options` definitely means stdout/stderr are `string`.
  def exec(command: java.lang.String): ChildProcess = js.native
  def exec(
    command: java.lang.String,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  // `options` with an `encoding` whose type is `string` means stdout/stderr could either be `Buffer` or `string`.
  // There is no guarantee the `encoding` is unknown as `string` is a superset of `BufferEncoding`.
  def exec(command: java.lang.String, options: Anon_EncodingString with ExecOptions): ChildProcess = js.native
  // `options` with well known `encoding` means stdout/stderr are definitely `string`.
  def exec(command: java.lang.String, options: Anon_Encoding with ExecOptions): ChildProcess = js.native
  // `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
  def exec(command: java.lang.String, options: Anon_Buffer with ExecOptions): ChildProcess = js.native
  // fallback if nothing else matches. Worst case is always `string | Buffer`.
  def exec(command: java.lang.String, options: Anon_EncodingNull with ExecOptions): ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: Anon_EncodingNull with ExecOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: Anon_Encoding with ExecOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: Anon_Buffer with ExecOptions,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: Anon_EncodingString with ExecOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: Null,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // `options` without an `encoding` means stdout/stderr are definitely `string`.
  def exec(command: java.lang.String, options: ExecOptions): ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: ExecOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  def execFile(file: java.lang.String): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      Error | Null, 
      Buffer | (/* stdout */ java.lang.String), 
      Buffer | (/* stderr */ java.lang.String), 
      Unit
    ]
  ): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: Anon_EncodingNull with ExecFileOptions
  ): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileOptions,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  def execFile(file: java.lang.String, args: js.Array[java.lang.String]): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: Anon_EncodingNull with ExecFileOptions
  ): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: Anon_EncodingNull with ExecFileOptions,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileOptions,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: Null,
    callback: js.Function3[
      Error | Null, 
      Buffer | (/* stdout */ java.lang.String), 
      Buffer | (/* stderr */ java.lang.String), 
      Unit
    ]
  ): ChildProcess = js.native
  def execFile(file: java.lang.String, args: Null, options: Anon_EncodingNull with ExecFileOptions): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: Null,
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: Null,
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: Null,
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: Null,
    options: ExecFileOptions,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  // no `options` definitely means stdout/stderr are `string`.
  def execFile(
    file: java.lang.String,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  def execFile(file: java.lang.String, options: Anon_EncodingNull with ExecFileOptions): ChildProcess = js.native
  // fallback if nothing else matches. Worst case is always `string | Buffer`.
  def execFile(
    file: java.lang.String,
    options: Anon_EncodingNull with ExecFileOptions,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
  def execFile(
    file: java.lang.String,
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  // `options` with an `encoding` whose type is `string` means stdout/stderr could either be `Buffer` or `string`.
  // There is no guarantee the `encoding` is unknown as `string` is a superset of `BufferEncoding`.
  def execFile(
    file: java.lang.String,
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // `options` with well known `encoding` means stdout/stderr are definitely `string`.
  def execFile(
    file: java.lang.String,
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  // `options` without an `encoding` means stdout/stderr are definitely `string`.
  def execFile(
    file: java.lang.String,
    options: ExecFileOptions,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  def execFileSync(command: java.lang.String): Buffer = js.native
  def execFileSync(command: java.lang.String, args: js.Array[java.lang.String]): Buffer = js.native
  def execFileSync(command: java.lang.String, args: js.Array[java.lang.String], options: ExecFileSyncOptions): Buffer = js.native
  def execFileSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileSyncOptionsWithBufferEncoding
  ): Buffer = js.native
  def execFileSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileSyncOptionsWithStringEncoding
  ): java.lang.String = js.native
  def execFileSync(command: java.lang.String, options: ExecFileSyncOptions): Buffer = js.native
  def execFileSync(command: java.lang.String, options: ExecFileSyncOptionsWithBufferEncoding): Buffer = js.native
  def execFileSync(command: java.lang.String, options: ExecFileSyncOptionsWithStringEncoding): java.lang.String = js.native
  @JSName("execFileSync")
  def execFileSync_String(command: java.lang.String): java.lang.String = js.native
  @JSName("execFileSync")
  def execFileSync_String(command: java.lang.String, args: js.Array[java.lang.String]): java.lang.String = js.native
  def execSync(command: java.lang.String): Buffer = js.native
  def execSync(command: java.lang.String, options: ExecSyncOptions): Buffer = js.native
  def execSync(command: java.lang.String, options: ExecSyncOptionsWithBufferEncoding): Buffer = js.native
  def execSync(command: java.lang.String, options: ExecSyncOptionsWithStringEncoding): java.lang.String = js.native
  @JSName("execSync")
  def execSync_String(command: java.lang.String): java.lang.String = js.native
  def fork(modulePath: java.lang.String): ChildProcess = js.native
  def fork(modulePath: java.lang.String, args: js.Array[java.lang.String]): ChildProcess = js.native
  def fork(modulePath: java.lang.String, args: js.Array[java.lang.String], options: ForkOptions): ChildProcess = js.native
  // overloads of spawn without 'args'
  // overloads of spawn with 'args'
  def spawn(command: java.lang.String): ChildProcessWithoutNullStreams = js.native
  def spawn(command: java.lang.String, args: js.Array[java.lang.String]): ChildProcessWithoutNullStreams = js.native
  def spawn(command: java.lang.String, args: js.Array[java.lang.String], options: SpawnOptions): ChildProcess = js.native
  def spawn(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Writable, Readable, Readable] = js.native
  def spawn(command: java.lang.String, args: js.Array[java.lang.String], options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
  def spawn(command: java.lang.String, options: SpawnOptions): ChildProcess = js.native
  def spawn(
    command: java.lang.String,
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Writable, Readable, Readable] = js.native
  def spawn(command: java.lang.String, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
  def spawnSync(command: java.lang.String): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: java.lang.String, args: js.Array[java.lang.String]): SpawnSyncReturns[java.lang.String] = js.native
  def spawnSync(command: java.lang.String, args: js.Array[java.lang.String], options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: SpawnSyncOptionsWithBufferEncoding
  ): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: SpawnSyncOptionsWithStringEncoding
  ): SpawnSyncReturns[java.lang.String] = js.native
  def spawnSync(command: java.lang.String, options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: java.lang.String, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: java.lang.String, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[java.lang.String] = js.native
}

