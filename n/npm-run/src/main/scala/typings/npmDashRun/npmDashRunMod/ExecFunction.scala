package typings.npmDashRun.npmDashRunMod

import typings.node.Anon_Buffer
import typings.node.Anon_Encoding
import typings.node.Anon_EncodingNull
import typings.node.Anon_EncodingString
import typings.node.Anon_Stderr
import typings.node.Anon_StderrStdout
import typings.node.Anon_StderrStdoutBuffer
import typings.node.Buffer
import typings.node.childUnderscoreProcessMod.ChildProcess
import typings.node.childUnderscoreProcessMod.ExecException
import typings.node.childUnderscoreProcessMod.ExecOptions
import typings.node.childUnderscoreProcessMod.PromiseWithChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecFunction extends js.Object {
  def apply(command: String): ChildProcess = js.native
  def apply(
    command: String,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def apply(command: String, options: Anon_EncodingNull with ExecOptions): ChildProcess = js.native
  def apply(command: String, options: Anon_EncodingString with ExecOptions): ChildProcess = js.native
  def apply(command: String, options: Anon_Buffer with ExecOptions): ChildProcess = js.native
  def apply(command: String, options: Anon_Encoding with ExecOptions): ChildProcess = js.native
  def apply(
    command: String,
    options: Anon_Buffer with ExecOptions,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def apply(
    command: String,
    options: Anon_Encoding with ExecOptions,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def apply(
    command: String,
    options: Anon_EncodingNull with ExecOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def apply(
    command: String,
    options: Anon_EncodingString with ExecOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
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
  def apply(command: String, options: ExecOptions): ChildProcess = js.native
  def apply(
    command: String,
    options: ExecOptions,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def __promisify__(command: String): PromiseWithChild[Anon_Stderr] = js.native
  def __promisify__(command: String, options: Anon_Buffer with ExecOptions): PromiseWithChild[Anon_StderrStdout] = js.native
  def __promisify__(command: String, options: Anon_Encoding with ExecOptions): PromiseWithChild[Anon_Stderr] = js.native
  def __promisify__(command: String, options: Anon_EncodingNull with ExecOptions): PromiseWithChild[Anon_StderrStdoutBuffer] = js.native
  def __promisify__(command: String, options: ExecOptions): PromiseWithChild[Anon_Stderr] = js.native
}

