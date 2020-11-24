package typings.nodeDhtSensor.mod

import typings.nodeDhtSensor.anon.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-dht-sensor", "promises")
@js.native
object promises extends js.Object {
  
  def initialize(testOptions: Test): Unit = js.native
  def initialize(`type`: SensorType, pin: Double): Boolean = js.native
  
  def read(): js.Promise[SensorData] = js.native
  def read(`type`: js.UndefOr[SensorType], pin: Double): js.Promise[SensorData] = js.native
  def read(`type`: SensorType): js.Promise[SensorData] = js.native
  
  def readSync(): SensorData = js.native
  def readSync(`type`: js.UndefOr[SensorType], pin: Double): SensorData = js.native
  def readSync(`type`: SensorType): SensorData = js.native
  
  def setMaxRetries(maxRetries: Double): Unit = js.native
}
