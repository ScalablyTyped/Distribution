package typings.pidFromPort

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Get PID from a port
    * @param port Port to lookup.
    */
  @JSImport("pid-from-port", JSImport.Namespace)
  @js.native
  def apply(port: Double): js.Promise[Double] = js.native
  
  /**
    * Get PIDs for a list of ports.
    * @param ports Ports to lookup.
    * @returns A `Promise<Map>` with the port as key and the PID as value.
    */
  @JSImport("pid-from-port", "all")
  @js.native
  def all(ports: js.Array[Double]): js.Promise[Map[Double, Double]] = js.native
  
  /**
    * Get all PIDs from ports.
    * @returns A `Promise<Map>` with the port as key and the PID as value.
    */
  @JSImport("pid-from-port", "list")
  @js.native
  def list(): js.Promise[Map[Double, Double]] = js.native
}
