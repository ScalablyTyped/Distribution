package typings.mz.childProcessMod

import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.ForkOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/child_process", "fork")
@js.native
object fork extends js.Object {
  def apply(modulePath: String): ChildProcess = js.native
  def apply(modulePath: String, args: js.Array[String]): ChildProcess = js.native
  def apply(modulePath: String, args: js.Array[String], options: ForkOptions): ChildProcess = js.native
}

