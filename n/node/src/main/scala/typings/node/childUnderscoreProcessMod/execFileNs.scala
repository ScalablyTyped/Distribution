package typings.node.childUnderscoreProcessMod

import typings.node.Anon_EncodingNull
import typings.node.Anon_Stderr
import typings.node.Anon_StderrStdout
import typings.node.Anon_StderrStdoutBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("child_process", "execFile")
@js.native
object execFileNs extends js.Object {
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

