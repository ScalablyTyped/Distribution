package typings.mocha.commonMod

import typings.mocha.Mocha
import typings.mocha.Mocha.MochaGlobals
import typings.mocha.Mocha.Suite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mocha/lib/interfaces/common", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(suites: js.Array[Suite], context: MochaGlobals, mocha: Mocha): CommonFunctions = js.native
}

