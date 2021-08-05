package typings.mz

import typings.mz.anon.encodingBufferEncodingund
import typings.mz.anon.encodingbuffernullundefin
import typings.mz.anon.encodingstringnullundefin
import typings.mz.mzStrings.buffer
import typings.node.Buffer
import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.ChildProcessByStdio
import typings.node.childProcessMod.ChildProcessWithoutNullStreams
import typings.node.childProcessMod.ExecException
import typings.node.childProcessMod.ExecFileOptions
import typings.node.childProcessMod.ExecFileOptionsWithStringEncoding
import typings.node.childProcessMod.ExecFileSyncOptions
import typings.node.childProcessMod.ExecFileSyncOptionsWithBufferEncoding
import typings.node.childProcessMod.ExecFileSyncOptionsWithStringEncoding
import typings.node.childProcessMod.ExecSyncOptions
import typings.node.childProcessMod.ExecSyncOptionsWithBufferEncoding
import typings.node.childProcessMod.ExecSyncOptionsWithStringEncoding
import typings.node.childProcessMod.ForkOptions
import typings.node.childProcessMod.SpawnOptions
import typings.node.childProcessMod.SpawnOptionsWithStdioTuple
import typings.node.childProcessMod.SpawnOptionsWithoutStdio
import typings.node.childProcessMod.SpawnSyncOptions
import typings.node.childProcessMod.SpawnSyncOptionsWithBufferEncoding
import typings.node.childProcessMod.SpawnSyncOptionsWithStringEncoding
import typings.node.childProcessMod.SpawnSyncReturns
import typings.node.childProcessMod.StdioNull
import typings.node.childProcessMod.StdioPipe
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object childProcessMod {
  
  @JSImport("mz/child_process", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exec(command: String): js.Promise[js.Tuple2[String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Tuple2[String, String]]]
  inline def exec(
    command: String,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def exec(
    command: String,
    options: Null,
    callback: js.Function3[
      ExecException | Null, 
      Buffer | (/* stdout */ String), 
      Buffer | (/* stderr */ String), 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def exec(
    command: String,
    options: Unit,
    callback: js.Function3[
      ExecException | Null, 
      Buffer | (/* stdout */ String), 
      Buffer | (/* stderr */ String), 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def exec(command: String, options: encodingBufferEncodingund): js.Promise[js.Tuple2[String, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[String, String]]]
  inline def exec(
    command: String,
    options: encodingBufferEncodingund,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def exec(command: String, options: encodingbuffernullundefin): js.Promise[js.Tuple2[Buffer, Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[Buffer, Buffer]]]
  inline def exec(
    command: String,
    options: encodingbuffernullundefin,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def exec(command: String, options: encodingstringnullundefin): js.Promise[js.Tuple2[String | Buffer, String | Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[String | Buffer, String | Buffer]]]
  inline def exec(
    command: String,
    options: encodingstringnullundefin,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  
  inline def execFile(file: String): js.Promise[js.Tuple2[String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Tuple2[String, String]]]
  inline def execFile(file: String, args: js.Array[String]): js.Promise[js.Tuple2[String, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[String, String]]]
  inline def execFile(
    file: String,
    args: js.Array[String],
    callback: js.Function3[/* error */ Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(
    file: String,
    args: js.Array[String],
    options: Null,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(
    file: String,
    args: js.Array[String],
    options: Unit,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(file: String, args: js.Array[String], options: ExecFileOptionsWithBufferEncoding): js.Promise[js.Tuple2[Buffer, Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[Buffer, Buffer]]]
  inline def execFile(
    file: String,
    args: js.Array[String],
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(file: String, args: js.Array[String], options: ExecFileOptionsWithOtherEncoding): js.Promise[js.Tuple2[String | Buffer, String | Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[String | Buffer, String | Buffer]]]
  inline def execFile(
    file: String,
    args: js.Array[String],
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(file: String, args: js.Array[String], options: ExecFileOptions): js.Promise[js.Tuple2[String, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[String, String]]]
  inline def execFile(file: String, args: js.Array[String], options: ExecFileOptionsWithStringEncoding): js.Promise[js.Tuple2[String, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[String, String]]]
  inline def execFile(
    file: String,
    args: js.Array[String],
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(
    file: String,
    args: js.Array[String],
    options: ExecFileOptions,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(
    file: String,
    args: Null,
    callback: js.Function3[Error | Null, Buffer | (/* stdout */ String), Buffer | (/* stderr */ String), Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(
    file: String,
    args: Null,
    options: Null,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(
    file: String,
    args: Null,
    options: Unit,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(file: String, args: Null, options: ExecFileOptionsWithBufferEncoding): js.Promise[js.Tuple2[Buffer, Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[Buffer, Buffer]]]
  inline def execFile(
    file: String,
    args: Null,
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(file: String, args: Null, options: ExecFileOptionsWithOtherEncoding): js.Promise[js.Tuple2[String | Buffer, String | Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[String | Buffer, String | Buffer]]]
  inline def execFile(
    file: String,
    args: Null,
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(file: String, args: Null, options: ExecFileOptions): js.Promise[js.Tuple2[String, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[String, String]]]
  inline def execFile(file: String, args: Null, options: ExecFileOptionsWithStringEncoding): js.Promise[js.Tuple2[String, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[String, String]]]
  inline def execFile(
    file: String,
    args: Null,
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(
    file: String,
    args: Null,
    options: ExecFileOptions,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(
    file: String,
    args: Unit,
    callback: js.Function3[Error | Null, Buffer | (/* stdout */ String), Buffer | (/* stderr */ String), Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(
    file: String,
    args: Unit,
    options: Null,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(
    file: String,
    args: Unit,
    options: Unit,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(file: String, args: Unit, options: ExecFileOptionsWithBufferEncoding): js.Promise[js.Tuple2[Buffer, Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[Buffer, Buffer]]]
  inline def execFile(
    file: String,
    args: Unit,
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(file: String, args: Unit, options: ExecFileOptionsWithOtherEncoding): js.Promise[js.Tuple2[String | Buffer, String | Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[String | Buffer, String | Buffer]]]
  inline def execFile(
    file: String,
    args: Unit,
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(file: String, args: Unit, options: ExecFileOptions): js.Promise[js.Tuple2[String, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[String, String]]]
  inline def execFile(file: String, args: Unit, options: ExecFileOptionsWithStringEncoding): js.Promise[js.Tuple2[String, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[String, String]]]
  inline def execFile(
    file: String,
    args: Unit,
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(
    file: String,
    args: Unit,
    options: ExecFileOptions,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(
    file: String,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(file: String, options: ExecFileOptionsWithBufferEncoding): js.Promise[js.Tuple2[Buffer, Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[Buffer, Buffer]]]
  inline def execFile(
    file: String,
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(file: String, options: ExecFileOptionsWithOtherEncoding): js.Promise[js.Tuple2[String | Buffer, String | Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[String | Buffer, String | Buffer]]]
  inline def execFile(
    file: String,
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(file: String, options: ExecFileOptions): js.Promise[js.Tuple2[String, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[String, String]]]
  inline def execFile(file: String, options: ExecFileOptionsWithStringEncoding): js.Promise[js.Tuple2[String, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[String, String]]]
  inline def execFile(
    file: String,
    // `options` can't be mixed into `args`
  // tslint:disable-next-line: unified-signatures
  options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def execFile(
    file: String,
    // `options` can't be mixed into `args`
  // tslint:disable-next-line: unified-signatures
  options: ExecFileOptions,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  
  inline def execFileSync(command: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def execFileSync(command: String, args: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def execFileSync(command: String, args: js.Array[String], options: ExecFileSyncOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def execFileSync(command: String, args: js.Array[String], options: ExecFileSyncOptionsWithBufferEncoding): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def execFileSync(command: String, args: js.Array[String], options: ExecFileSyncOptionsWithStringEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def execFileSync(command: String, args: Unit, options: ExecFileSyncOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def execFileSync(command: String, args: Unit, options: ExecFileSyncOptionsWithBufferEncoding): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def execFileSync(command: String, args: Unit, options: ExecFileSyncOptionsWithStringEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def execFileSync(command: String, options: ExecFileSyncOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def execFileSync(command: String, options: ExecFileSyncOptionsWithBufferEncoding): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def execFileSync(command: String, options: ExecFileSyncOptionsWithStringEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def execFileSync_Buffer(command: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def execFileSync_Buffer(command: String, args: js.Array[String]): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def execSync(command: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def execSync(command: String, options: ExecSyncOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def execSync(command: String, options: ExecSyncOptionsWithBufferEncoding): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def execSync(command: String, options: ExecSyncOptionsWithStringEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def execSync_Buffer(command: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def fork(modulePath: String): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
  inline def fork(modulePath: String, args: js.Array[String]): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def fork(modulePath: String, args: js.Array[String], options: ForkOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def fork(modulePath: String, args: Unit, options: ForkOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def fork(modulePath: String, options: ForkOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  
  // overloads of spawn without 'args'
  inline def spawn(command: String): ChildProcessWithoutNullStreams = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any]).asInstanceOf[ChildProcessWithoutNullStreams]
  inline def spawn(command: String, args: js.Array[String]): ChildProcessWithoutNullStreams = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ChildProcessWithoutNullStreams]
  inline def spawn(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def spawn(
    command: String,
    args: js.Array[String],
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Writable, Readable, Readable] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessByStdio[Writable, Readable, Readable]]
  inline def spawn(command: String, args: js.Array[String], options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessWithoutNullStreams]
  inline def spawn(command: String, args: Unit, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessWithoutNullStreams]
  inline def spawn(command: String, options: SpawnOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def spawn(
    command: String,
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Writable, Readable, Readable] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessByStdio[Writable, Readable, Readable]]
  inline def spawn(command: String, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessWithoutNullStreams]
  
  inline def spawnSync(command: String): SpawnSyncReturns[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any]).asInstanceOf[SpawnSyncReturns[Buffer]]
  inline def spawnSync(command: String, args: js.Array[String]): SpawnSyncReturns[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[String]]
  inline def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[Buffer]]
  inline def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[Buffer]]
  inline def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[String]]
  inline def spawnSync(command: String, args: Unit, options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[Buffer]]
  inline def spawnSync(command: String, args: Unit, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[Buffer]]
  inline def spawnSync(command: String, args: Unit, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[String]]
  inline def spawnSync(command: String, options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[Buffer]]
  inline def spawnSync(command: String, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[Buffer]]
  inline def spawnSync(command: String, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[String]]
  
  trait ExecFileOptionsWithBufferEncoding
    extends StObject
       with ExecFileOptions {
    
    var encoding: js.UndefOr[buffer | Null] = js.undefined
  }
  object ExecFileOptionsWithBufferEncoding {
    
    inline def apply(): ExecFileOptionsWithBufferEncoding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecFileOptionsWithBufferEncoding]
    }
    
    extension [Self <: ExecFileOptionsWithBufferEncoding](x: Self) {
      
      inline def setEncoding(value: buffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
  
  trait ExecFileOptionsWithOtherEncoding
    extends StObject
       with ExecFileOptions {
    
    var encoding: js.UndefOr[String | Null] = js.undefined
  }
  object ExecFileOptionsWithOtherEncoding {
    
    inline def apply(): ExecFileOptionsWithOtherEncoding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecFileOptionsWithOtherEncoding]
    }
    
    extension [Self <: ExecFileOptionsWithOtherEncoding](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
}
