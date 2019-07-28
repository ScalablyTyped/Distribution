package typings.p2.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "TopDownVehicle")
@js.native
class TopDownVehicle protected () extends js.Object {
  def this(chasisBody: Body) = this()
  def this(chasisBody: Body, options: TopDownVehicleOptions) = this()
  var chasisBody: Body = js.native
  var wheels: js.Array[WheelConstraint] = js.native
  var world: World = js.native
  def addToWorld(world: World): Unit = js.native
  def addWheel(): WheelConstraint = js.native
  def addWheel(wheelOptions: WheelConstraintOptions): WheelConstraint = js.native
  def removeFromWorld(): Unit = js.native
  def update(): Unit = js.native
}

