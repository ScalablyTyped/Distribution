package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Island extends js.Object {
  var bodies: js.Array[Body]
  var equations: js.Array[Equation]
  def getBodies(result: js.Any): js.Array[Body]
  def reset(): scala.Unit
  def sleep(): scala.Boolean
  def wantsToSleep(): scala.Boolean
}

