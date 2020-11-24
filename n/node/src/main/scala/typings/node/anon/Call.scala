package typings.node.anon

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends js.Object {
  
  def apply(value: js.Any): /* asserts value */ Boolean = js.native
  def apply(value: js.Any, message: String): /* asserts value */ Boolean = js.native
  def apply(value: js.Any, message: Error): /* asserts value */ Boolean = js.native
}
