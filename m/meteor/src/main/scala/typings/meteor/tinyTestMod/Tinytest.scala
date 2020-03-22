package typings.meteor.tinyTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/tiny-test", "Tinytest")
@js.native
object Tinytest extends js.Object {
  def add(description: String, func: js.Function1[/* test */ ITinytestAssertions, Unit]): Unit = js.native
  def addAsync(description: String, func: js.Function1[/* test */ ITinytestAssertions, Unit]): Unit = js.native
}

