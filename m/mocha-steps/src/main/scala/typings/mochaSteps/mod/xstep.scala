package typings.mochaSteps.mod

import typings.mocha.Mocha.Func
import typings.mocha.Mocha.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mocha-steps", "xstep")
@js.native
object xstep extends js.Object {
  
  def apply(title: String): Test = js.native
  def apply(title: String, fn: Func): Test = js.native
}
