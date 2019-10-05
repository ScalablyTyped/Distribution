package typings.meteorDashTypings.meteorTinyDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/tiny-test", "Tinytest")
@js.native
object Tinytest extends js.Object {
  def add(
    description: String,
    func: js.Function1[
      /* test */ typings.meteorDashTypings.meteorTinyDashTestMod.ITinytestAssertions, 
      Unit
    ]
  ): Unit = js.native
  def addAsync(
    description: String,
    func: js.Function1[
      /* test */ typings.meteorDashTypings.meteorTinyDashTestMod.ITinytestAssertions, 
      Unit
    ]
  ): Unit = js.native
}

