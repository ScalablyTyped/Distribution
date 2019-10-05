package typings.node.childUnderscoreProcessMod

import typings.node.Anon_Buffer
import typings.node.Anon_Encoding
import typings.node.Anon_EncodingNull
import typings.node.Anon_EncodingString
import typings.node.Anon_Stderr
import typings.node.Anon_StderrStdout
import typings.node.Anon_StderrStdoutBuffer
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("child_process", "exec")
@js.native
object exec extends js.Object {
  // no `options` definitely means stdout/stderr are `string`.
  def apply(command: java.lang.String): ChildProcess = js.native
  def apply(
    command: java.lang.String,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  // fallback if nothing else matches. Worst case is always `string | Buffer`.
  def apply(command: java.lang.String, options: Anon_EncodingNull with ExecOptions): ChildProcess = js.native
  // `options` with an `encoding` whose type is `string` means stdout/stderr could either be `Buffer` or `string`.
  // There is no guarantee the `encoding` is unknown as `string` is a superset of `BufferEncoding`.
  def apply(command: java.lang.String, options: Anon_EncodingString with ExecOptions): ChildProcess = js.native
  // `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
  def apply(command: java.lang.String, options: Anon_Buffer with ExecOptions): ChildProcess = js.native
  // `options` with well known `encoding` means stdout/stderr are definitely `string`.
  def apply(command: java.lang.String, options: Anon_Encoding with ExecOptions): ChildProcess = js.native
  def apply(
    command: java.lang.String,
    options: Anon_Buffer with ExecOptions,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def apply(
    command: java.lang.String,
    options: Anon_Encoding with ExecOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  def apply(
    command: java.lang.String,
    options: Anon_EncodingNull with ExecOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def apply(
    command: java.lang.String,
    options: Anon_EncodingString with ExecOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def apply(
    command: java.lang.String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String | Buffer, 
      /* stderr */ java.lang.String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def apply(
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
  def apply(command: java.lang.String, options: ExecOptions): ChildProcess = js.native
  def apply(
    command: java.lang.String,
    options: ExecOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      Unit
    ]
  ): ChildProcess = js.native
  def __promisify__(command: java.lang.String): PromiseWithChild[Anon_Stderr] = js.native
  def __promisify__(command: java.lang.String, options: Anon_Buffer with ExecOptions): PromiseWithChild[Anon_StderrStdout] = js.native
  def __promisify__(command: java.lang.String, options: Anon_Encoding with ExecOptions): PromiseWithChild[Anon_Stderr] = js.native
  def __promisify__(command: java.lang.String, options: Anon_EncodingNull with ExecOptions): PromiseWithChild[Anon_StderrStdoutBuffer] = js.native
  def __promisify__(command: java.lang.String, options: ExecOptions): PromiseWithChild[Anon_Stderr] = js.native
}

