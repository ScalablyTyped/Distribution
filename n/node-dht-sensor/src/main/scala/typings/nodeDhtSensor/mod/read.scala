package typings.nodeDhtSensor.mod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-dht-sensor", "read")
@js.native
object read extends js.Object {
  
  def apply(): SensorData = js.native
  def apply(`type`: js.UndefOr[SensorType], pin: Double): SensorData = js.native
  def apply(`type`: SensorType): SensorData = js.native
  def apply(
    `type`: SensorType,
    pin: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* temperature */ Double, /* humidity */ Double, Unit]
  ): Unit = js.native
}
