package typings.opener

import typings.node.childProcessMod.ChildProcess
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("opener", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(args: String): ChildProcess = js.native
  def apply(args: String, options: js.UndefOr[scala.Nothing], callback: Callback): ChildProcess = js.native
  def apply(args: String, options: js.Object): ChildProcess = js.native
  def apply(args: String, options: js.Object, callback: Callback): ChildProcess = js.native
  def apply(args: js.Array[String]): ChildProcess = js.native
  def apply(args: js.Array[String], options: js.UndefOr[scala.Nothing], callback: Callback): ChildProcess = js.native
  def apply(args: js.Array[String], options: js.Object): ChildProcess = js.native
  def apply(args: js.Array[String], options: js.Object, callback: Callback): ChildProcess = js.native
  
  type Callback = js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
}
