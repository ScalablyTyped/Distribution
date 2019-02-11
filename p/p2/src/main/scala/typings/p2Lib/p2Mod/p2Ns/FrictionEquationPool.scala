package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrictionEquationPool extends Pool {
  def create(): FrictionEquation
  def destroy(equation: FrictionEquation): FrictionEquationPool
}

