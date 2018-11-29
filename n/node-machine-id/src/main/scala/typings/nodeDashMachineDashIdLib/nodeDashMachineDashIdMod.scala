package typings
package nodeDashMachineDashIdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-machine-id", JSImport.Namespace)
@js.native
object nodeDashMachineDashIdMod extends js.Object {
  /**
       * This function gets the OS native UUID/GUID asynchronously (recommended), hashed by default.
       * @param {boolean} [original=false] - If true return original value of machine id, otherwise return hashed value (sha - 256)
       */
  def machineId(): stdLib.Promise[java.lang.String] = js.native
  /**
       * This function gets the OS native UUID/GUID asynchronously (recommended), hashed by default.
       * @param {boolean} [original=false] - If true return original value of machine id, otherwise return hashed value (sha - 256)
       */
  def machineId(original: scala.Boolean): stdLib.Promise[java.lang.String] = js.native
  /**
       * This function gets the OS native UUID/GUID synchronously, hashed by default.
       * @param {boolean} [original=false] - If true return original value of machine id, otherwise return hashed value (sha - 256)
       */
  def machineIdSync(): java.lang.String = js.native
  /**
       * This function gets the OS native UUID/GUID synchronously, hashed by default.
       * @param {boolean} [original=false] - If true return original value of machine id, otherwise return hashed value (sha - 256)
       */
  def machineIdSync(original: scala.Boolean): java.lang.String = js.native
}

