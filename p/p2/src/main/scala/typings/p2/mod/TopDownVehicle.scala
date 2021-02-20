package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "TopDownVehicle")
@js.native
class TopDownVehicle protected () extends StObject {
  def this(chasisBody: Body) = this()
  def this(chasisBody: Body, options: TopDownVehicleOptions) = this()
  
  def addToWorld(world: World): Unit = js.native
  
  def addWheel(): WheelConstraint = js.native
  def addWheel(wheelOptions: WheelConstraintOptions): WheelConstraint = js.native
  
  var chasisBody: Body = js.native
  
  def removeFromWorld(): Unit = js.native
  
  def update(): Unit = js.native
  
  var wheels: js.Array[WheelConstraint] = js.native
  
  var world: World = js.native
}
