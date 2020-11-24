package typings.meteor.global

import typings.meteor.ITinytestAssertions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Tinytest")
@js.native
object Tinytest extends js.Object {
  
  def add(description: String, func: js.Function1[/* test */ ITinytestAssertions, Unit]): Unit = js.native
  
  def addAsync(description: String, func: js.Function1[/* test */ ITinytestAssertions, Unit]): Unit = js.native
}
