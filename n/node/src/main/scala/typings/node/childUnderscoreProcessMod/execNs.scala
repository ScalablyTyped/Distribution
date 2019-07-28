package typings.node.childUnderscoreProcessMod

import typings.node.Anon_Buffer
import typings.node.Anon_Encoding
import typings.node.Anon_EncodingNull
import typings.node.Anon_Stderr
import typings.node.Anon_StderrStdout
import typings.node.Anon_StderrStdoutBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("child_process", "exec")
@js.native
object execNs extends js.Object {
  def __promisify__(command: java.lang.String): PromiseWithChild[Anon_Stderr] = js.native
  def __promisify__(command: java.lang.String, options: Anon_Buffer with ExecOptions): PromiseWithChild[Anon_StderrStdout] = js.native
  def __promisify__(command: java.lang.String, options: Anon_Encoding with ExecOptions): PromiseWithChild[Anon_Stderr] = js.native
  def __promisify__(command: java.lang.String, options: Anon_EncodingNull with ExecOptions): PromiseWithChild[Anon_StderrStdoutBuffer] = js.native
  def __promisify__(command: java.lang.String, options: ExecOptions): PromiseWithChild[Anon_Stderr] = js.native
}

