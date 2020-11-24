package typings.node.childProcessMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("child_process", "execFileSync")
@js.native
object execFileSync extends js.Object {
  
  def apply(command: String): String = js.native
  def apply(command: String, args: js.UndefOr[scala.Nothing], options: ExecFileSyncOptions): Buffer = js.native
  def apply(command: String, args: js.UndefOr[scala.Nothing], options: ExecFileSyncOptionsWithBufferEncoding): Buffer = js.native
  def apply(command: String, args: js.UndefOr[scala.Nothing], options: ExecFileSyncOptionsWithStringEncoding): String = js.native
  def apply(command: String, args: js.Array[String]): String = js.native
  def apply(command: String, args: js.Array[String], options: ExecFileSyncOptions): Buffer = js.native
  def apply(command: String, args: js.Array[String], options: ExecFileSyncOptionsWithBufferEncoding): Buffer = js.native
  def apply(command: String, args: js.Array[String], options: ExecFileSyncOptionsWithStringEncoding): String = js.native
  def apply(command: String, options: ExecFileSyncOptions): Buffer = js.native
  def apply(command: String, options: ExecFileSyncOptionsWithBufferEncoding): Buffer = js.native
  def apply(command: String, options: ExecFileSyncOptionsWithStringEncoding): String = js.native
}
