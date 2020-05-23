package typings.node.childProcessMod

import typings.node.Buffer
import typings.node.anon.Stderr
import typings.node.anon.StderrStdout
import typings.node.anon.Stdout
import typings.node.fsMod.BaseEncodingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("child_process", "execFile")
@js.native
object execFile extends js.Object {
  // fallback if nothing else matches. Worst case is always `string | Buffer`.
  def apply(file: String): ChildProcess = js.native
  def apply(
    file: String,
    args: js.UndefOr[js.Array[String] | Null],
    callback: js.Function3[ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def apply(
    file: String,
    args: js.UndefOr[js.Array[String] | Null],
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[ExecException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def apply(
    file: String,
    args: js.UndefOr[js.Array[String] | Null],
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[ExecException | Null, Buffer | String, Buffer | String, Unit]
  ): ChildProcess = js.native
  def apply(
    file: String,
    args: js.UndefOr[js.Array[String] | Null],
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def apply(
    file: String,
    args: js.UndefOr[js.Array[String] | Null],
    options: ExecFileOptions,
    callback: js.Function3[ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def apply(file: String, args: js.Array[String]): ChildProcess = js.native
  def apply(file: String, args: js.Array[String], options: BaseEncodingOptions with ExecFileOptions): ChildProcess = js.native
  def apply(
    file: String,
    args: js.Array[String],
    options: BaseEncodingOptions with ExecFileOptions,
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
    options: Null,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def apply(file: String, args: Null, options: BaseEncodingOptions with ExecFileOptions): ChildProcess = js.native
  def apply(
    file: String,
    args: Null,
    options: BaseEncodingOptions with ExecFileOptions,
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
    options: Null,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // no `options` definitely means stdout/stderr are `string`.
  def apply(
    file: String,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def apply(file: String, options: BaseEncodingOptions with ExecFileOptions): ChildProcess = js.native
  def apply(
    file: String,
    options: BaseEncodingOptions with ExecFileOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def apply(
    file: String,
    options: Null,
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
  def promisify(file: String): PromiseWithChild[Stderr] = js.native
  @JSName("__promisify__")
  def promisify(file: String, args: js.UndefOr[js.Array[String] | Null], options: ExecFileOptions): PromiseWithChild[Stderr] = js.native
  @JSName("__promisify__")
  def promisify(
    file: String,
    args: js.UndefOr[js.Array[String] | Null],
    options: ExecFileOptionsWithBufferEncoding
  ): PromiseWithChild[Stdout] = js.native
  @JSName("__promisify__")
  def promisify(file: String, args: js.UndefOr[js.Array[String] | Null], options: ExecFileOptionsWithOtherEncoding): PromiseWithChild[StderrStdout] = js.native
  @JSName("__promisify__")
  def promisify(
    file: String,
    args: js.UndefOr[js.Array[String] | Null],
    options: ExecFileOptionsWithStringEncoding
  ): PromiseWithChild[Stderr] = js.native
  @JSName("__promisify__")
  def promisify(file: String, args: js.Array[String]): PromiseWithChild[Stderr] = js.native
  @JSName("__promisify__")
  def promisify(file: String, args: js.Array[String], options: BaseEncodingOptions with ExecFileOptions): PromiseWithChild[StderrStdout] = js.native
  @JSName("__promisify__")
  def promisify(file: String, args: Null, options: BaseEncodingOptions with ExecFileOptions): PromiseWithChild[StderrStdout] = js.native
  @JSName("__promisify__")
  def promisify(file: String, options: BaseEncodingOptions with ExecFileOptions): PromiseWithChild[StderrStdout] = js.native
  @JSName("__promisify__")
  def promisify(file: String, options: ExecFileOptions): PromiseWithChild[Stderr] = js.native
  @JSName("__promisify__")
  def promisify(file: String, options: ExecFileOptionsWithBufferEncoding): PromiseWithChild[Stdout] = js.native
  @JSName("__promisify__")
  def promisify(file: String, options: ExecFileOptionsWithOtherEncoding): PromiseWithChild[StderrStdout] = js.native
  @JSName("__promisify__")
  def promisify(file: String, options: ExecFileOptionsWithStringEncoding): PromiseWithChild[Stderr] = js.native
}

