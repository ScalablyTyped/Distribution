package typings.nodeMachineId

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This function gets the OS native UUID/GUID asynchronously (recommended), hashed by default.
    * @param {boolean} [original=false] - If true return original value of machine id, otherwise return hashed value (sha - 256)
    */
  @JSImport("node-machine-id", "machineId")
  @js.native
  def machineId(): js.Promise[String] = js.native
  @JSImport("node-machine-id", "machineId")
  @js.native
  def machineId(original: Boolean): js.Promise[String] = js.native
  
  /**
    * This function gets the OS native UUID/GUID synchronously, hashed by default.
    * @param {boolean} [original=false] - If true return original value of machine id, otherwise return hashed value (sha - 256)
    */
  @JSImport("node-machine-id", "machineIdSync")
  @js.native
  def machineIdSync(): String = js.native
  @JSImport("node-machine-id", "machineIdSync")
  @js.native
  def machineIdSync(original: Boolean): String = js.native
}
