package typings.mz.childProcessMod

import typings.node.Buffer
import typings.node.childProcessMod.ExecFileSyncOptions
import typings.node.childProcessMod.ExecFileSyncOptionsWithBufferEncoding
import typings.node.childProcessMod.ExecFileSyncOptionsWithStringEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/child_process", "execFileSync")
@js.native
object execFileSync extends js.Object {
  def apply(command: String): String = js.native
  def apply(command: String, args: js.Array[String]): String = js.native
  def apply(command: String, args: js.Array[String], options: ExecFileSyncOptions): Buffer = js.native
  def apply(command: String, args: js.Array[String], options: ExecFileSyncOptionsWithBufferEncoding): Buffer = js.native
  def apply(command: String, args: js.Array[String], options: ExecFileSyncOptionsWithStringEncoding): String = js.native
  def apply(command: String, options: ExecFileSyncOptions): Buffer = js.native
  def apply(command: String, options: ExecFileSyncOptionsWithBufferEncoding): Buffer = js.native
  def apply(command: String, options: ExecFileSyncOptionsWithStringEncoding): String = js.native
}

