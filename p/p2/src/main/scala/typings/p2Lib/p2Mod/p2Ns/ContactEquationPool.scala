package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactEquationPool extends Pool {
  def create(): ContactEquation
  def destroy(equation: ContactEquation): ContactEquationPool
}

