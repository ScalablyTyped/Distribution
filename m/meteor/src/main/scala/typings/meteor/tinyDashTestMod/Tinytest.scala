package typings.meteor.tinyDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/tiny-test", "Tinytest")
@js.native
object Tinytest extends js.Object {
  def add(
    description: String,
    func: js.Function1[/* test */ typings.meteor.tinyDashTestMod.ITinytestAssertions, Unit]
  ): Unit = js.native
  def addAsync(
    description: String,
    func: js.Function1[/* test */ typings.meteor.tinyDashTestMod.ITinytestAssertions, Unit]
  ): Unit = js.native
}

