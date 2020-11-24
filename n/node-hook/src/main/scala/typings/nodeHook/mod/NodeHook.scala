package typings.nodeHook.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeHook extends js.Object {
  
  def hook(extension: String, transform: Transform): Unit = js.native
  def hook(extension: String, transform: Transform, options: Options): Unit = js.native
  def hook(transform: Transform): Unit = js.native
  def hook(transform: Transform, _underscore: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  
  def unhook(): Unit = js.native
  def unhook(extension: String): Unit = js.native
}
