package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopDownVehicle extends js.Object {
  var chasisBody: Body = js.native
  var wheels: js.Array[WheelConstraint] = js.native
  var world: World = js.native
  def addToWorld(world: World): scala.Unit = js.native
  def addWheel(): WheelConstraint = js.native
  def addWheel(wheelOptions: WheelConstraintOptions): WheelConstraint = js.native
  def removeFromWorld(): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

