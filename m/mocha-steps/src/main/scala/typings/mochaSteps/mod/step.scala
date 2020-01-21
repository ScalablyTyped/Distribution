package typings.mochaSteps.mod

import typings.mocha.Mocha_.Func
import typings.mocha.Mocha_.Test_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mocha-steps", "step")
@js.native
object step extends js.Object {
  def apply(title: String): Test_ = js.native
  def apply(title: String, fn: Func): Test_ = js.native
}

