package typings.p2.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "FrictionEquationPool")
@js.native
class FrictionEquationPool () extends Pool {
  def create(): FrictionEquation = js.native
  def destroy(equation: FrictionEquation): FrictionEquationPool = js.native
}

