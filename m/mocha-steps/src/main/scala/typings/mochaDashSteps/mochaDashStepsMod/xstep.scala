package typings.mochaDashSteps.mochaDashStepsMod

import typings.mocha.Mocha.Func
import typings.mocha.Mocha.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mocha-steps", "xstep")
@js.native
object xstep extends js.Object {
  def apply(title: String): Test = js.native
  def apply(title: String, fn: Func): Test = js.native
}

