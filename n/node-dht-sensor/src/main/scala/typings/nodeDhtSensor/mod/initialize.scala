package typings.nodeDhtSensor.mod

import typings.nodeDhtSensor.anon.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-dht-sensor", "initialize")
@js.native
object initialize extends js.Object {
  
  def apply(testOptions: Test): Unit = js.native
  def apply(`type`: SensorType, pin: Double): Boolean = js.native
}
