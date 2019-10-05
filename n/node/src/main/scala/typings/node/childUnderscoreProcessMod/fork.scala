package typings.node.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("child_process", "fork")
@js.native
object fork extends js.Object {
  def apply(modulePath: java.lang.String): ChildProcess = js.native
  def apply(modulePath: java.lang.String, args: js.Array[java.lang.String]): ChildProcess = js.native
  def apply(modulePath: java.lang.String, args: js.Array[java.lang.String], options: ForkOptions): ChildProcess = js.native
}

