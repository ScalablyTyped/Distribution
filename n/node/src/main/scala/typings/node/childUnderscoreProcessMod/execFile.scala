package typings.node.childUnderscoreProcessMod

import typings.node.Anon_EncodingNull
import typings.node.Anon_Stderr
import typings.node.Anon_StderrStdout
import typings.node.Anon_StderrStdoutBuffer
import typings.node.Buffer
import typings.node.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("child_process", "execFile")
@js.native
object execFile extends js.Object {
  def apply(file: java.lang.String): ChildProcess = js.native
  def apply(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      Error | Null, 
      Buffer | (/* stdout */ java.lang.String), 
      Buffer | (/* stderr */ java.lang.String), 
      Unit
    ]
  ): ChildProcess = js.native
  def apply(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: Anon_EncodingNull with ExecFileOptions
  ): ChildProcess = js.native
  def apply(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def apply(
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
  def apply(
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
  def apply(
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
  def apply(file: java.lang.String, args: js.Array[java.lang.String]): ChildProcess = js.native
  def apply(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  def apply(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: Anon_EncodingNull with ExecFileOptions
  ): ChildProcess = js.native
  def apply(
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
  def apply(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def apply(
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
  def apply(
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
  def apply(
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
  def apply(
    file: java.lang.String,
    args: Null,
    callback: js.Function3[
      Error | Null, 
      Buffer | (/* stdout */ java.lang.String), 
      Buffer | (/* stderr */ java.lang.String), 
      Unit
    ]
  ): ChildProcess = js.native
  def apply(file: java.lang.String, args: Null, options: Anon_EncodingNull with ExecFileOptions): ChildProcess = js.native
  def apply(
    file: java.lang.String,
    args: Null,
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def apply(
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
  def apply(
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
  def apply(
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
  def apply(
    file: java.lang.String,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  def apply(file: java.lang.String, options: Anon_EncodingNull with ExecFileOptions): ChildProcess = js.native
  // fallback if nothing else matches. Worst case is always `string | Buffer`.
  def apply(
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
  def apply(
    file: java.lang.String,
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  // `options` with an `encoding` whose type is `string` means stdout/stderr could either be `Buffer` or `string`.
  // There is no guarantee the `encoding` is unknown as `string` is a superset of `BufferEncoding`.
  def apply(
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
  def apply(
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
  def apply(
    file: java.lang.String,
    options: ExecFileOptions,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  def __promisify__(file: java.lang.String): PromiseWithChild[Anon_Stderr] = js.native
  def __promisify__(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: Anon_EncodingNull with ExecFileOptions
  ): PromiseWithChild[Anon_StderrStdoutBuffer] = js.native
  def __promisify__(file: java.lang.String, args: js.UndefOr[scala.Nothing], options: ExecFileOptions): PromiseWithChild[Anon_Stderr] = js.native
  def __promisify__(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileOptionsWithBufferEncoding
  ): PromiseWithChild[Anon_StderrStdout] = js.native
  def __promisify__(file: java.lang.String, args: js.UndefOr[scala.Nothing], options: ExecFileOptionsWithOtherEncoding): PromiseWithChild[Anon_StderrStdoutBuffer] = js.native
  def __promisify__(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileOptionsWithStringEncoding
  ): PromiseWithChild[Anon_Stderr] = js.native
  def __promisify__(file: java.lang.String, args: js.Array[java.lang.String]): PromiseWithChild[Anon_Stderr] = js.native
  def __promisify__(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: Anon_EncodingNull with ExecFileOptions
  ): PromiseWithChild[Anon_StderrStdoutBuffer] = js.native
  def __promisify__(file: java.lang.String, args: js.Array[java.lang.String], options: ExecFileOptions): PromiseWithChild[Anon_Stderr] = js.native
  def __promisify__(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileOptionsWithBufferEncoding
  ): PromiseWithChild[Anon_StderrStdout] = js.native
  def __promisify__(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileOptionsWithOtherEncoding
  ): PromiseWithChild[Anon_StderrStdoutBuffer] = js.native
  def __promisify__(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileOptionsWithStringEncoding
  ): PromiseWithChild[Anon_Stderr] = js.native
  def __promisify__(file: java.lang.String, args: Null, options: Anon_EncodingNull with ExecFileOptions): PromiseWithChild[Anon_StderrStdoutBuffer] = js.native
  def __promisify__(file: java.lang.String, args: Null, options: ExecFileOptions): PromiseWithChild[Anon_Stderr] = js.native
  def __promisify__(file: java.lang.String, args: Null, options: ExecFileOptionsWithBufferEncoding): PromiseWithChild[Anon_StderrStdout] = js.native
  def __promisify__(file: java.lang.String, args: Null, options: ExecFileOptionsWithOtherEncoding): PromiseWithChild[Anon_StderrStdoutBuffer] = js.native
  def __promisify__(file: java.lang.String, args: Null, options: ExecFileOptionsWithStringEncoding): PromiseWithChild[Anon_Stderr] = js.native
  def __promisify__(file: java.lang.String, options: Anon_EncodingNull with ExecFileOptions): PromiseWithChild[Anon_StderrStdoutBuffer] = js.native
  def __promisify__(file: java.lang.String, options: ExecFileOptions): PromiseWithChild[Anon_Stderr] = js.native
  def __promisify__(file: java.lang.String, options: ExecFileOptionsWithBufferEncoding): PromiseWithChild[Anon_StderrStdout] = js.native
  def __promisify__(file: java.lang.String, options: ExecFileOptionsWithOtherEncoding): PromiseWithChild[Anon_StderrStdoutBuffer] = js.native
  def __promisify__(file: java.lang.String, options: ExecFileOptionsWithStringEncoding): PromiseWithChild[Anon_Stderr] = js.native
}

