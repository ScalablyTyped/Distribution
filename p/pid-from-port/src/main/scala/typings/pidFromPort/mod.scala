package typings.pidFromPort

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Get PID from a port
    * @param port Port to lookup.
    */
  inline def apply(port: Double): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].apply(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  
  @JSImport("pid-from-port", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get PIDs for a list of ports.
    * @param ports Ports to lookup.
    * @returns A `Promise<Map>` with the port as key and the PID as value.
    */
  inline def all(ports: js.Array[Double]): js.Promise[Map[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(ports.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Map[Double, Double]]]
  
  /**
    * Get all PIDs from ports.
    * @returns A `Promise<Map>` with the port as key and the PID as value.
    */
  inline def list(): js.Promise[Map[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[Map[Double, Double]]]
}
