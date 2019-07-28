package typings.pidDashFromDashPort

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pid-from-port", JSImport.Namespace)
@js.native
object pidDashFromDashPortMod extends js.Object {
  /**
    * Get PID from a port
    * @param port Port to lookup.
    */
  def apply(port: Double): js.Promise[Double] = js.native
  /**
    * Get PIDs for a list of ports.
    * @param ports Ports to lookup.
    * @returns A `Promise<Map>` with the port as key and the PID as value.
    */
  def all(ports: js.Array[Double]): js.Promise[Map[Double, Double]] = js.native
  /**
    * Get all PIDs from ports.
    * @returns A `Promise<Map>` with the port as key and the PID as value.
    */
  def list(): js.Promise[Map[Double, Double]] = js.native
}

