package typings.node.childUnderscoreProcessMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("child_process", "execSync")
@js.native
object execSync extends js.Object {
  def apply(command: java.lang.String): Buffer = js.native
  def apply(command: java.lang.String, options: ExecSyncOptions): Buffer = js.native
  def apply(command: java.lang.String, options: ExecSyncOptionsWithBufferEncoding): Buffer = js.native
  def apply(command: java.lang.String, options: ExecSyncOptionsWithStringEncoding): java.lang.String = js.native
}

