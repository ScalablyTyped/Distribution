package typings
package meteorLib.tinyDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/tiny-test", "Tinytest")
@js.native
object TinytestNs extends js.Object {
  def add(
    description: java.lang.String,
    func: js.Function1[/* test */ meteorLib.tinyDashTestMod.ITinytestAssertions, scala.Unit]
  ): scala.Unit = js.native
  def addAsync(
    description: java.lang.String,
    func: js.Function1[/* test */ meteorLib.tinyDashTestMod.ITinytestAssertions, scala.Unit]
  ): scala.Unit = js.native
}

