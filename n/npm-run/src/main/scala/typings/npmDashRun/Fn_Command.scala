package typings.npmDashRun

import typings.node.Buffer
import typings.node.childUnderscoreProcessMod.ExecSyncOptions
import typings.node.childUnderscoreProcessMod.ExecSyncOptionsWithBufferEncoding
import typings.node.childUnderscoreProcessMod.ExecSyncOptionsWithStringEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Command extends js.Object {
  def apply(command: String): String = js.native
  def apply(command: String, options: ExecSyncOptions): Buffer = js.native
  def apply(command: String, options: ExecSyncOptionsWithBufferEncoding): Buffer = js.native
  def apply(command: String, options: ExecSyncOptionsWithStringEncoding): String = js.native
}

