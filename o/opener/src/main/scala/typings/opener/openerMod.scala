package typings.opener

import typings.node.childUnderscoreProcessMod.ChildProcess
import typings.opener.openerMod.Callback
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opener", JSImport.Namespace)
@js.native
object openerMod extends js.Object {
  def apply(args: String): ChildProcess = js.native
  def apply(args: String, options: js.Object): ChildProcess = js.native
  def apply(args: String, options: js.Object, callback: Callback): ChildProcess = js.native
  def apply(args: js.Array[String]): ChildProcess = js.native
  def apply(args: js.Array[String], options: js.Object): ChildProcess = js.native
  def apply(args: js.Array[String], options: js.Object, callback: Callback): ChildProcess = js.native
  type Callback = js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
}

