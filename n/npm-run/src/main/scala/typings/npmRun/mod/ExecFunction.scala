package typings.npmRun.mod

import typings.node.AnonStderr
import typings.node.AnonStderrStdout
import typings.node.AnonStdout
import typings.node.Buffer
import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.ExecException
import typings.node.childProcessMod.ExecOptions
import typings.node.childProcessMod.PromiseWithChild
import typings.node.encodingBufferEncodingExe
import typings.node.encodingbuffernullExecOpt
import typings.node.encodingstringExecOptions
import typings.node.encodingstringnullExecOpt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecFunction extends js.Object {
  // no `options` definitely means stdout/stderr are `string`.
  def apply(command: String): ChildProcess = js.native
  def apply(
    command: String,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def apply(
    command: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def apply(
    command: String,
    options: Null,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // `options` without an `encoding` means stdout/stderr are definitely `string`.
  def apply(command: String, options: ExecOptions): ChildProcess = js.native
  def apply(
    command: String,
    options: ExecOptions,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  // `options` with well known `encoding` means stdout/stderr are definitely `string`.
  def apply(command: String, options: encodingBufferEncodingExe): ChildProcess = js.native
  def apply(
    command: String,
    options: encodingBufferEncodingExe,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  // `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
  def apply(command: String, options: encodingbuffernullExecOpt): ChildProcess = js.native
  def apply(
    command: String,
    options: encodingbuffernullExecOpt,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  // `options` with an `encoding` whose type is `string` means stdout/stderr could either be `Buffer` or `string`.
  // There is no guarantee the `encoding` is unknown as `string` is a superset of `BufferEncoding`.
  def apply(command: String, options: encodingstringExecOptions): ChildProcess = js.native
  def apply(
    command: String,
    options: encodingstringExecOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // fallback if nothing else matches. Worst case is always `string | Buffer`.
  def apply(command: String, options: encodingstringnullExecOpt): ChildProcess = js.native
  def apply(
    command: String,
    options: encodingstringnullExecOpt,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def __promisify__(command: String): PromiseWithChild[AnonStderr] = js.native
  def __promisify__(command: String, options: ExecOptions): PromiseWithChild[AnonStderr] = js.native
  def __promisify__(command: String, options: encodingBufferEncodingExe): PromiseWithChild[AnonStderr] = js.native
  def __promisify__(command: String, options: encodingbuffernullExecOpt): PromiseWithChild[AnonStdout] = js.native
  def __promisify__(command: String, options: encodingstringnullExecOpt): PromiseWithChild[AnonStderrStdout] = js.native
}

