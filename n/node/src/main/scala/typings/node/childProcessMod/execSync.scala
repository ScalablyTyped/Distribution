package typings.node.childProcessMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("child_process", "execSync")
@js.native
object execSync extends js.Object {
  def apply(command: String): String = js.native
  def apply(command: String, options: ExecSyncOptions): Buffer = js.native
  def apply(command: String, options: ExecSyncOptionsWithBufferEncoding): Buffer = js.native
  def apply(command: String, options: ExecSyncOptionsWithStringEncoding): String = js.native
}

