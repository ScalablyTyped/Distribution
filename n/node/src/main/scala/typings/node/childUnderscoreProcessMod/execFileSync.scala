package typings.node.childUnderscoreProcessMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("child_process", "execFileSync")
@js.native
object execFileSync extends js.Object {
  def apply(command: java.lang.String): Buffer = js.native
  def apply(command: java.lang.String, args: js.Array[java.lang.String]): Buffer = js.native
  def apply(command: java.lang.String, args: js.Array[java.lang.String], options: ExecFileSyncOptions): Buffer = js.native
  def apply(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileSyncOptionsWithBufferEncoding
  ): Buffer = js.native
  def apply(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: ExecFileSyncOptionsWithStringEncoding
  ): java.lang.String = js.native
  def apply(command: java.lang.String, options: ExecFileSyncOptions): Buffer = js.native
  def apply(command: java.lang.String, options: ExecFileSyncOptionsWithBufferEncoding): Buffer = js.native
  def apply(command: java.lang.String, options: ExecFileSyncOptionsWithStringEncoding): java.lang.String = js.native
}

