package typings.mochaDashSteps.mochaDashStepsMod

import typings.mocha.MochaNs.Func
import typings.mocha.MochaNs.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mocha-steps", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def step(title: String): Test = js.native
  def step(title: String, fn: Func): Test = js.native
  def xstep(title: String): Test = js.native
  def xstep(title: String, fn: Func): Test = js.native
}

