package typings.node.childProcessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// no `options` definitely means stdout/stderr are `string`.
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
// fallback if nothing else matches. Worst case is always `string | Buffer`.
inline def exec(command: java.lang.String): typings.node.childProcessMod.ChildProcess = typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any]).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def exec(
  command: java.lang.String,
  callback: js.Function3[
  /* error */ typings.node.childProcessMod.ExecException | scala.Null, 
  /* stdout */ java.lang.String, 
  /* stderr */ java.lang.String, 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// `options` without an `encoding` means stdout/stderr are definitely `string`.
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def exec(
  command: java.lang.String,
  options: (typings.node.fsMod.BaseEncodingOptions & typings.node.childProcessMod.ExecOptions) | typings.node.childProcessMod.ExecOptions
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def exec(
  command: java.lang.String,
  options: (typings.node.fsMod.BaseEncodingOptions & typings.node.childProcessMod.ExecOptions) | typings.node.childProcessMod.ExecOptions,
  callback: js.Function3[
  typings.node.childProcessMod.ExecException | scala.Null, 
  typings.node.Buffer | (/* stdout */ java.lang.String), 
  typings.node.Buffer | (/* stderr */ java.lang.String), 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def exec(
  command: java.lang.String,
  options: scala.Null,
  callback: js.Function3[
  /* error */ typings.node.childProcessMod.ExecException | scala.Null, 
  /* stdout */ java.lang.String | typings.node.Buffer, 
  /* stderr */ java.lang.String | typings.node.Buffer, 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def exec(
  command: java.lang.String,
  options: scala.Unit,
  callback: js.Function3[
  /* error */ typings.node.childProcessMod.ExecException | scala.Null, 
  /* stdout */ java.lang.String | typings.node.Buffer, 
  /* stderr */ java.lang.String | typings.node.Buffer, 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// `options` with well known `encoding` means stdout/stderr are definitely `string`.
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
// `options` with an `encoding` whose type is `string` means stdout/stderr could either be `Buffer` or `string`.
// There is no guarantee the `encoding` is unknown as `string` is a superset of `BufferEncoding`.
inline def exec(command: java.lang.String, options: typings.node.anon.encodingBufferEncodingExe): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def exec(
  command: java.lang.String,
  options: typings.node.anon.encodingBufferEncodingExe,
  callback: js.Function3[
  typings.node.childProcessMod.ExecException | scala.Null, 
  typings.node.Buffer | (/* stdout */ java.lang.String), 
  typings.node.Buffer | (/* stderr */ java.lang.String), 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def exec(command: java.lang.String, options: typings.node.anon.encodingbuffernullExecOpt): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def exec(
  command: java.lang.String,
  options: typings.node.anon.encodingbuffernullExecOpt,
  callback: js.Function3[
  /* error */ typings.node.childProcessMod.ExecException | scala.Null, 
  /* stdout */ typings.node.Buffer, 
  /* stderr */ typings.node.Buffer, 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
// fallback if nothing else matches. Worst case is always `string | Buffer`.
inline def execFile(file: java.lang.String): typings.node.childProcessMod.ChildProcess = typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any]).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(file: java.lang.String, args: js.Array[java.lang.String]): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  args: js.Array[java.lang.String],
  callback: js.Function3[
  /* error */ typings.node.childProcessMod.ExecException | scala.Null, 
  /* stdout */ java.lang.String, 
  /* stderr */ java.lang.String, 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  args: js.Array[java.lang.String],
  options: typings.node.fsMod.BaseEncodingOptions & typings.node.childProcessMod.ExecFileOptions
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  args: js.Array[java.lang.String],
  options: (typings.node.fsMod.BaseEncodingOptions & typings.node.childProcessMod.ExecFileOptions) | typings.node.childProcessMod.ExecFileOptions,
  callback: js.Function3[
  typings.node.childProcessMod.ExecException | scala.Null, 
  typings.node.Buffer | (/* stdout */ java.lang.String), 
  typings.node.Buffer | (/* stderr */ java.lang.String), 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  args: js.Array[java.lang.String],
  options: scala.Null,
  callback: js.Function3[
  /* error */ typings.node.childProcessMod.ExecException | scala.Null, 
  /* stdout */ java.lang.String | typings.node.Buffer, 
  /* stderr */ java.lang.String | typings.node.Buffer, 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  args: js.Array[java.lang.String],
  options: scala.Unit,
  callback: js.Function3[
  /* error */ typings.node.childProcessMod.ExecException | scala.Null, 
  /* stdout */ java.lang.String | typings.node.Buffer, 
  /* stderr */ java.lang.String | typings.node.Buffer, 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  args: js.Array[java.lang.String],
  options: typings.node.childProcessMod.ExecFileOptionsWithBufferEncoding,
  callback: js.Function3[
  /* error */ typings.node.childProcessMod.ExecException | scala.Null, 
  /* stdout */ typings.node.Buffer, 
  /* stderr */ typings.node.Buffer, 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  args: js.Array[java.lang.String],
  options: typings.node.childProcessMod.ExecFileOptionsWithOtherEncoding,
  callback: js.Function3[
  /* error */ typings.node.childProcessMod.ExecException | scala.Null, 
  /* stdout */ java.lang.String | typings.node.Buffer, 
  /* stderr */ java.lang.String | typings.node.Buffer, 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  args: js.Array[java.lang.String],
  options: typings.node.childProcessMod.ExecFileOptionsWithStringEncoding,
  callback: js.Function3[
  /* error */ typings.node.childProcessMod.ExecException | scala.Null, 
  /* stdout */ java.lang.String, 
  /* stderr */ java.lang.String, 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  args: scala.Null,
  callback: js.Function3[
  typings.node.childProcessMod.ExecException | scala.Null, 
  typings.node.Buffer | (/* stdout */ java.lang.String), 
  typings.node.Buffer | (/* stderr */ java.lang.String), 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  args: scala.Null,
  options: typings.node.fsMod.BaseEncodingOptions & typings.node.childProcessMod.ExecFileOptions
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  args: scala.Null,
  options: (typings.node.fsMod.BaseEncodingOptions & typings.node.childProcessMod.ExecFileOptions) | typings.node.childProcessMod.ExecFileOptions,
  callback: js.Function3[
  typings.node.childProcessMod.ExecException | scala.Null, 
  typings.node.Buffer | (/* stdout */ java.lang.String), 
  typings.node.Buffer | (/* stderr */ java.lang.String), 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  args: scala.Null,
  options: scala.Null,
  callback: js.Function3[
  /* error */ typings.node.childProcessMod.ExecException | scala.Null, 
  /* stdout */ java.lang.String | typings.node.Buffer, 
  /* stderr */ java.lang.String | typings.node.Buffer, 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  args: scala.Null,
  options: scala.Unit,
  callback: js.Function3[
  /* error */ typings.node.childProcessMod.ExecException | scala.Null, 
  /* stdout */ java.lang.String | typings.node.Buffer, 
  /* stderr */ java.lang.String | typings.node.Buffer, 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  args: scala.Null,
  options: typings.node.childProcessMod.ExecFileOptionsWithBufferEncoding,
  callback: js.Function3[
  /* error */ typings.node.childProcessMod.ExecException | scala.Null, 
  /* stdout */ typings.node.Buffer, 
  /* stderr */ typings.node.Buffer, 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  args: scala.Null,
  options: typings.node.childProcessMod.ExecFileOptionsWithOtherEncoding,
  callback: js.Function3[
  /* error */ typings.node.childProcessMod.ExecException | scala.Null, 
  /* stdout */ java.lang.String | typings.node.Buffer, 
  /* stderr */ java.lang.String | typings.node.Buffer, 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  args: scala.Null,
  options: typings.node.childProcessMod.ExecFileOptionsWithStringEncoding,
  callback: js.Function3[
  /* error */ typings.node.childProcessMod.ExecException | scala.Null, 
  /* stdout */ java.lang.String, 
  /* stderr */ java.lang.String, 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  args: scala.Unit,
  callback: js.Function3[
  typings.node.childProcessMod.ExecException | scala.Null, 
  typings.node.Buffer | (/* stdout */ java.lang.String), 
  typings.node.Buffer | (/* stderr */ java.lang.String), 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  args: scala.Unit,
  options: typings.node.fsMod.BaseEncodingOptions & typings.node.childProcessMod.ExecFileOptions
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  args: scala.Unit,
  options: (typings.node.fsMod.BaseEncodingOptions & typings.node.childProcessMod.ExecFileOptions) | typings.node.childProcessMod.ExecFileOptions,
  callback: js.Function3[
  typings.node.childProcessMod.ExecException | scala.Null, 
  typings.node.Buffer | (/* stdout */ java.lang.String), 
  typings.node.Buffer | (/* stderr */ java.lang.String), 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  args: scala.Unit,
  options: scala.Null,
  callback: js.Function3[
  /* error */ typings.node.childProcessMod.ExecException | scala.Null, 
  /* stdout */ java.lang.String | typings.node.Buffer, 
  /* stderr */ java.lang.String | typings.node.Buffer, 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  args: scala.Unit,
  options: scala.Unit,
  callback: js.Function3[
  /* error */ typings.node.childProcessMod.ExecException | scala.Null, 
  /* stdout */ java.lang.String | typings.node.Buffer, 
  /* stderr */ java.lang.String | typings.node.Buffer, 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  args: scala.Unit,
  options: typings.node.childProcessMod.ExecFileOptionsWithBufferEncoding,
  callback: js.Function3[
  /* error */ typings.node.childProcessMod.ExecException | scala.Null, 
  /* stdout */ typings.node.Buffer, 
  /* stderr */ typings.node.Buffer, 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  args: scala.Unit,
  options: typings.node.childProcessMod.ExecFileOptionsWithOtherEncoding,
  callback: js.Function3[
  /* error */ typings.node.childProcessMod.ExecException | scala.Null, 
  /* stdout */ java.lang.String | typings.node.Buffer, 
  /* stderr */ java.lang.String | typings.node.Buffer, 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  args: scala.Unit,
  options: typings.node.childProcessMod.ExecFileOptionsWithStringEncoding,
  callback: js.Function3[
  /* error */ typings.node.childProcessMod.ExecException | scala.Null, 
  /* stdout */ java.lang.String, 
  /* stderr */ java.lang.String, 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// no `options` definitely means stdout/stderr are `string`.
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  callback: js.Function3[
  /* error */ typings.node.childProcessMod.ExecException | scala.Null, 
  /* stdout */ java.lang.String, 
  /* stderr */ java.lang.String, 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  options: typings.node.fsMod.BaseEncodingOptions & typings.node.childProcessMod.ExecFileOptions
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// `options` without an `encoding` means stdout/stderr are definitely `string`.
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  options: (typings.node.fsMod.BaseEncodingOptions & typings.node.childProcessMod.ExecFileOptions) | typings.node.childProcessMod.ExecFileOptions,
  callback: js.Function3[
  typings.node.childProcessMod.ExecException | scala.Null, 
  typings.node.Buffer | (/* stdout */ java.lang.String), 
  typings.node.Buffer | (/* stderr */ java.lang.String), 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  options: typings.node.childProcessMod.ExecFileOptionsWithBufferEncoding,
  callback: js.Function3[
  /* error */ typings.node.childProcessMod.ExecException | scala.Null, 
  /* stdout */ typings.node.Buffer, 
  /* stderr */ typings.node.Buffer, 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// `options` with an `encoding` whose type is `string` means stdout/stderr could either be `Buffer` or `string`.
// There is no guarantee the `encoding` is unknown as `string` is a superset of `BufferEncoding`.
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  options: typings.node.childProcessMod.ExecFileOptionsWithOtherEncoding,
  callback: js.Function3[
  /* error */ typings.node.childProcessMod.ExecException | scala.Null, 
  /* stdout */ java.lang.String | typings.node.Buffer, 
  /* stderr */ java.lang.String | typings.node.Buffer, 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
// `options` with well known `encoding` means stdout/stderr are definitely `string`.
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
inline def execFile(
  file: java.lang.String,
  options: typings.node.childProcessMod.ExecFileOptionsWithStringEncoding,
  callback: js.Function3[
  /* error */ typings.node.childProcessMod.ExecException | scala.Null, 
  /* stdout */ java.lang.String, 
  /* stderr */ java.lang.String, 
  scala.Unit
]
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFile")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]

inline def execFileSync(command: java.lang.String): java.lang.String = typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def execFileSync(command: java.lang.String, args: js.Array[java.lang.String]): java.lang.String = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def execFileSync(
  command: java.lang.String,
  args: js.Array[java.lang.String],
  options: typings.node.childProcessMod.ExecFileSyncOptions
): typings.node.Buffer = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
inline def execFileSync(
  command: java.lang.String,
  args: js.Array[java.lang.String],
  options: typings.node.childProcessMod.ExecFileSyncOptionsWithBufferEncoding
): typings.node.Buffer = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
inline def execFileSync(
  command: java.lang.String,
  args: js.Array[java.lang.String],
  options: typings.node.childProcessMod.ExecFileSyncOptionsWithStringEncoding
): java.lang.String = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def execFileSync(
  command: java.lang.String,
  args: scala.Unit,
  options: typings.node.childProcessMod.ExecFileSyncOptions
): typings.node.Buffer = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
inline def execFileSync(
  command: java.lang.String,
  args: scala.Unit,
  options: typings.node.childProcessMod.ExecFileSyncOptionsWithBufferEncoding
): typings.node.Buffer = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
inline def execFileSync(
  command: java.lang.String,
  args: scala.Unit,
  options: typings.node.childProcessMod.ExecFileSyncOptionsWithStringEncoding
): java.lang.String = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def execFileSync(command: java.lang.String, options: typings.node.childProcessMod.ExecFileSyncOptions): typings.node.Buffer = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
inline def execFileSync(
  command: java.lang.String,
  options: typings.node.childProcessMod.ExecFileSyncOptionsWithBufferEncoding
): typings.node.Buffer = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
inline def execFileSync(
  command: java.lang.String,
  options: typings.node.childProcessMod.ExecFileSyncOptionsWithStringEncoding
): java.lang.String = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def execFileSync_Buffer(command: java.lang.String): typings.node.Buffer = typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any]).asInstanceOf[typings.node.Buffer]
inline def execFileSync_Buffer(command: java.lang.String, args: js.Array[java.lang.String]): typings.node.Buffer = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]

inline def execSync(command: java.lang.String): java.lang.String = typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def execSync(command: java.lang.String, options: typings.node.childProcessMod.ExecSyncOptions): typings.node.Buffer = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
inline def execSync(command: java.lang.String, options: typings.node.childProcessMod.ExecSyncOptionsWithBufferEncoding): typings.node.Buffer = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
inline def execSync(command: java.lang.String, options: typings.node.childProcessMod.ExecSyncOptionsWithStringEncoding): java.lang.String = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def execSync_Buffer(command: java.lang.String): typings.node.Buffer = typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any]).asInstanceOf[typings.node.Buffer]

inline def fork(modulePath: java.lang.String): typings.node.childProcessMod.ChildProcess = typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any]).asInstanceOf[typings.node.childProcessMod.ChildProcess]
inline def fork(modulePath: java.lang.String, args: js.Array[java.lang.String]): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
inline def fork(
  modulePath: java.lang.String,
  args: js.Array[java.lang.String],
  options: typings.node.childProcessMod.ForkOptions
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
inline def fork(modulePath: java.lang.String, args: scala.Unit, options: typings.node.childProcessMod.ForkOptions): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
inline def fork(modulePath: java.lang.String, options: typings.node.childProcessMod.ForkOptions): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]

// overloads of spawn without 'args'
// overloads of spawn with 'args'
inline def spawn(command: java.lang.String): typings.node.childProcessMod.ChildProcessWithoutNullStreams = typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any]).asInstanceOf[typings.node.childProcessMod.ChildProcessWithoutNullStreams]
inline def spawn(command: java.lang.String, args: js.Array[java.lang.String]): typings.node.childProcessMod.ChildProcessWithoutNullStreams = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcessWithoutNullStreams]
inline def spawn(
  command: java.lang.String,
  args: js.Array[java.lang.String],
  options: typings.node.childProcessMod.SpawnOptions
): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
inline def spawn(
  command: java.lang.String,
  args: js.Array[java.lang.String],
  options: typings.node.childProcessMod.SpawnOptionsWithStdioTuple[
  typings.node.childProcessMod.StdioNull | typings.node.childProcessMod.StdioPipe, 
  typings.node.childProcessMod.StdioNull | typings.node.childProcessMod.StdioPipe, 
  typings.node.childProcessMod.StdioNull | typings.node.childProcessMod.StdioPipe
]
): typings.node.childProcessMod.ChildProcessByStdio[
typings.node.streamMod.Writable, 
typings.node.streamMod.Readable, 
typings.node.streamMod.Readable] = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcessByStdio[
typings.node.streamMod.Writable, 
typings.node.streamMod.Readable, 
typings.node.streamMod.Readable]]
inline def spawn(
  command: java.lang.String,
  args: js.Array[java.lang.String],
  options: typings.node.childProcessMod.SpawnOptionsWithoutStdio
): typings.node.childProcessMod.ChildProcessWithoutNullStreams = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcessWithoutNullStreams]
inline def spawn(
  command: java.lang.String,
  args: scala.Unit,
  options: typings.node.childProcessMod.SpawnOptionsWithoutStdio
): typings.node.childProcessMod.ChildProcessWithoutNullStreams = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcessWithoutNullStreams]
inline def spawn(command: java.lang.String, options: typings.node.childProcessMod.SpawnOptions): typings.node.childProcessMod.ChildProcess = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcess]
inline def spawn(
  command: java.lang.String,
  options: typings.node.childProcessMod.SpawnOptionsWithStdioTuple[
  typings.node.childProcessMod.StdioNull | typings.node.childProcessMod.StdioPipe, 
  typings.node.childProcessMod.StdioNull | typings.node.childProcessMod.StdioPipe, 
  typings.node.childProcessMod.StdioNull | typings.node.childProcessMod.StdioPipe
]
): typings.node.childProcessMod.ChildProcessByStdio[
typings.node.streamMod.Writable, 
typings.node.streamMod.Readable, 
typings.node.streamMod.Readable] = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcessByStdio[
typings.node.streamMod.Writable, 
typings.node.streamMod.Readable, 
typings.node.streamMod.Readable]]
inline def spawn(command: java.lang.String, options: typings.node.childProcessMod.SpawnOptionsWithoutStdio): typings.node.childProcessMod.ChildProcessWithoutNullStreams = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.ChildProcessWithoutNullStreams]

inline def spawnSync(command: java.lang.String): typings.node.childProcessMod.SpawnSyncReturns[typings.node.Buffer] = typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any]).asInstanceOf[typings.node.childProcessMod.SpawnSyncReturns[typings.node.Buffer]]
inline def spawnSync(command: java.lang.String, args: js.Array[java.lang.String]): typings.node.childProcessMod.SpawnSyncReturns[java.lang.String] = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.SpawnSyncReturns[java.lang.String]]
inline def spawnSync(
  command: java.lang.String,
  args: js.Array[java.lang.String],
  options: typings.node.childProcessMod.SpawnSyncOptions
): typings.node.childProcessMod.SpawnSyncReturns[typings.node.Buffer] = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.SpawnSyncReturns[typings.node.Buffer]]
inline def spawnSync(
  command: java.lang.String,
  args: js.Array[java.lang.String],
  options: typings.node.childProcessMod.SpawnSyncOptionsWithBufferEncoding
): typings.node.childProcessMod.SpawnSyncReturns[typings.node.Buffer] = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.SpawnSyncReturns[typings.node.Buffer]]
inline def spawnSync(
  command: java.lang.String,
  args: js.Array[java.lang.String],
  options: typings.node.childProcessMod.SpawnSyncOptionsWithStringEncoding
): typings.node.childProcessMod.SpawnSyncReturns[java.lang.String] = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.SpawnSyncReturns[java.lang.String]]
inline def spawnSync(
  command: java.lang.String,
  args: scala.Unit,
  options: typings.node.childProcessMod.SpawnSyncOptions
): typings.node.childProcessMod.SpawnSyncReturns[typings.node.Buffer] = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.SpawnSyncReturns[typings.node.Buffer]]
inline def spawnSync(
  command: java.lang.String,
  args: scala.Unit,
  options: typings.node.childProcessMod.SpawnSyncOptionsWithBufferEncoding
): typings.node.childProcessMod.SpawnSyncReturns[typings.node.Buffer] = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.SpawnSyncReturns[typings.node.Buffer]]
inline def spawnSync(
  command: java.lang.String,
  args: scala.Unit,
  options: typings.node.childProcessMod.SpawnSyncOptionsWithStringEncoding
): typings.node.childProcessMod.SpawnSyncReturns[java.lang.String] = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.SpawnSyncReturns[java.lang.String]]
inline def spawnSync(command: java.lang.String, options: typings.node.childProcessMod.SpawnSyncOptions): typings.node.childProcessMod.SpawnSyncReturns[typings.node.Buffer] = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.SpawnSyncReturns[typings.node.Buffer]]
inline def spawnSync(
  command: java.lang.String,
  options: typings.node.childProcessMod.SpawnSyncOptionsWithBufferEncoding
): typings.node.childProcessMod.SpawnSyncReturns[typings.node.Buffer] = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.SpawnSyncReturns[typings.node.Buffer]]
inline def spawnSync(
  command: java.lang.String,
  options: typings.node.childProcessMod.SpawnSyncOptionsWithStringEncoding
): typings.node.childProcessMod.SpawnSyncReturns[java.lang.String] = (typings.node.childProcessMod.^.asInstanceOf[js.Dynamic].applyDynamic("spawnSync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.childProcessMod.SpawnSyncReturns[java.lang.String]]

type Serializable = java.lang.String | js.Object | scala.Double | scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.node.nodeStrings.pipe
  - typings.node.nodeStrings.ignore
  - typings.node.nodeStrings.inherit
  - js.Array[
js.UndefOr[
  typings.node.nodeStrings.pipe | typings.node.nodeStrings.ipc | typings.node.nodeStrings.ignore | typings.node.nodeStrings.inherit | typings.node.streamMod.Stream | scala.Double | scala.Null
]]
*/
type StdioOptions = typings.node.childProcessMod._StdioOptions | (js.Array[
js.UndefOr[
  typings.node.nodeStrings.pipe | typings.node.nodeStrings.ipc | typings.node.nodeStrings.ignore | typings.node.nodeStrings.inherit | typings.node.streamMod.Stream | scala.Double | scala.Null
]])

type StdioPipe = js.UndefOr[scala.Null | typings.node.nodeStrings.pipe]
