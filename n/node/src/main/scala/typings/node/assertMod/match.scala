package typings.node.assertMod

import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("assert", "match")
@js.native
object `match` extends js.Object {
  
  def apply(value: String, regExp: RegExp): Unit = js.native
  def apply(value: String, regExp: RegExp, message: String): Unit = js.native
  def apply(value: String, regExp: RegExp, message: Error): Unit = js.native
}
