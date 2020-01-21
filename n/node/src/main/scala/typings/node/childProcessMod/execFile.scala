package typings.node.childProcessMod

import typings.node.AnonEncodingNull
import typings.node.AnonStderr
import typings.node.AnonStderrStdout
import typings.node.AnonStderrStdoutBuffer
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("child_process", "execFile")
@js.native
object execFile extends js.Object {
  def apply(file: String): ChildProcess = js.native
  def apply(
    file: String,
    args: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      ExecException | Null, 
      Buffer | (/* stdout */ String), 
      Buffer | (/* stderr */ String), 
      Unit
    ]
  ): ChildProcess = js.native
  def apply(file: String, args: js.UndefOr[scala.Nothing], options: AnonEncodingNull with ExecFileOptions): ChildProcess = js.native
  def apply(
    file: String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def apply(
    file: String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def apply(
    file: String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def apply(
    file: String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileOptions,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def apply(file: String, args: js.Array[String]): ChildProcess = js.native
  def apply(
    file: String,
    args: js.Array[String],
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def apply(file: String, args: js.Array[String], options: AnonEncodingNull with ExecFileOptions): ChildProcess = js.native
  def apply(
    file: String,
    args: js.Array[String],
    options: AnonEncodingNull with ExecFileOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def apply(
    file: String,
    args: js.Array[String],
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def apply(
    file: String,
    args: js.Array[String],
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def apply(
    file: String,
    args: js.Array[String],
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def apply(
    file: String,
    args: js.Array[String],
    options: ExecFileOptions,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def apply(
    file: String,
    args: Null,
    callback: js.Function3[
      ExecException | Null, 
      Buffer | (/* stdout */ String), 
      Buffer | (/* stderr */ String), 
      Unit
    ]
  ): ChildProcess = js.native
  def apply(file: String, args: Null, options: AnonEncodingNull with ExecFileOptions): ChildProcess = js.native
  def apply(
    file: String,
    args: Null,
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def apply(
    file: String,
    args: Null,
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def apply(
    file: String,
    args: Null,
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def apply(
    file: String,
    args: Null,
    options: ExecFileOptions,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  // no `options` definitely means stdout/stderr are `string`.
  def apply(
    file: String,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def apply(file: String, options: AnonEncodingNull with ExecFileOptions): ChildProcess = js.native
  // fallback if nothing else matches. Worst case is always `string | Buffer`.
  def apply(
    file: String,
    options: AnonEncodingNull with ExecFileOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
  def apply(
    file: String,
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  // `options` with an `encoding` whose type is `string` means stdout/stderr could either be `Buffer` or `string`.
  // There is no guarantee the `encoding` is unknown as `string` is a superset of `BufferEncoding`.
  def apply(
    file: String,
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // `options` with well known `encoding` means stdout/stderr are definitely `string`.
  def apply(
    file: String,
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  // `options` without an `encoding` means stdout/stderr are definitely `string`.
  def apply(
    file: String,
    options: ExecFileOptions,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  @JSName("__promisify__")
  def promisify(file: String): PromiseWithChild[AnonStderr] = js.native
  @JSName("__promisify__")
  def promisify(file: String, args: js.UndefOr[scala.Nothing], options: AnonEncodingNull with ExecFileOptions): PromiseWithChild[AnonStderrStdoutBuffer] = js.native
  @JSName("__promisify__")
  def promisify(file: String, args: js.UndefOr[scala.Nothing], options: ExecFileOptions): PromiseWithChild[AnonStderr] = js.native
  @JSName("__promisify__")
  def promisify(file: String, args: js.UndefOr[scala.Nothing], options: ExecFileOptionsWithBufferEncoding): PromiseWithChild[AnonStderrStdout] = js.native
  @JSName("__promisify__")
  def promisify(file: String, args: js.UndefOr[scala.Nothing], options: ExecFileOptionsWithOtherEncoding): PromiseWithChild[AnonStderrStdoutBuffer] = js.native
  @JSName("__promisify__")
  def promisify(file: String, args: js.UndefOr[scala.Nothing], options: ExecFileOptionsWithStringEncoding): PromiseWithChild[AnonStderr] = js.native
  @JSName("__promisify__")
  def promisify(file: String, args: js.Array[String]): PromiseWithChild[AnonStderr] = js.native
  @JSName("__promisify__")
  def promisify(file: String, args: js.Array[String], options: AnonEncodingNull with ExecFileOptions): PromiseWithChild[AnonStderrStdoutBuffer] = js.native
  @JSName("__promisify__")
  def promisify(file: String, args: js.Array[String], options: ExecFileOptions): PromiseWithChild[AnonStderr] = js.native
  @JSName("__promisify__")
  def promisify(file: String, args: js.Array[String], options: ExecFileOptionsWithBufferEncoding): PromiseWithChild[AnonStderrStdout] = js.native
  @JSName("__promisify__")
  def promisify(file: String, args: js.Array[String], options: ExecFileOptionsWithOtherEncoding): PromiseWithChild[AnonStderrStdoutBuffer] = js.native
  @JSName("__promisify__")
  def promisify(file: String, args: js.Array[String], options: ExecFileOptionsWithStringEncoding): PromiseWithChild[AnonStderr] = js.native
  @JSName("__promisify__")
  def promisify(file: String, args: Null, options: AnonEncodingNull with ExecFileOptions): PromiseWithChild[AnonStderrStdoutBuffer] = js.native
  @JSName("__promisify__")
  def promisify(file: String, args: Null, options: ExecFileOptions): PromiseWithChild[AnonStderr] = js.native
  @JSName("__promisify__")
  def promisify(file: String, args: Null, options: ExecFileOptionsWithBufferEncoding): PromiseWithChild[AnonStderrStdout] = js.native
  @JSName("__promisify__")
  def promisify(file: String, args: Null, options: ExecFileOptionsWithOtherEncoding): PromiseWithChild[AnonStderrStdoutBuffer] = js.native
  @JSName("__promisify__")
  def promisify(file: String, args: Null, options: ExecFileOptionsWithStringEncoding): PromiseWithChild[AnonStderr] = js.native
  @JSName("__promisify__")
  def promisify(file: String, options: AnonEncodingNull with ExecFileOptions): PromiseWithChild[AnonStderrStdoutBuffer] = js.native
  @JSName("__promisify__")
  def promisify(file: String, options: ExecFileOptions): PromiseWithChild[AnonStderr] = js.native
  @JSName("__promisify__")
  def promisify(file: String, options: ExecFileOptionsWithBufferEncoding): PromiseWithChild[AnonStderrStdout] = js.native
  @JSName("__promisify__")
  def promisify(file: String, options: ExecFileOptionsWithOtherEncoding): PromiseWithChild[AnonStderrStdoutBuffer] = js.native
  @JSName("__promisify__")
  def promisify(file: String, options: ExecFileOptionsWithStringEncoding): PromiseWithChild[AnonStderr] = js.native
}

