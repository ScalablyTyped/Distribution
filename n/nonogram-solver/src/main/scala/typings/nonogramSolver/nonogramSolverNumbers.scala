package typings.nonogramSolver

import typings.nonogramSolver.mod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nonogramSolverNumbers {
  @js.native
  sealed trait `-1` extends State
  
  @js.native
  sealed trait `0` extends State
  
  @js.native
  sealed trait `1` extends State
  
  @scala.inline
  def `-1`: `-1` = -1.asInstanceOf[`-1`]
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
}

