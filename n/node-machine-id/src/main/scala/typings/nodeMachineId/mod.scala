package typings.nodeMachineId

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-machine-id", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * This function gets the OS native UUID/GUID asynchronously (recommended), hashed by default.
    * @param {boolean} [original=false] - If true return original value of machine id, otherwise return hashed value (sha - 256)
    */
  def machineId(): js.Promise[String] = js.native
  def machineId(original: Boolean): js.Promise[String] = js.native
  /**
    * This function gets the OS native UUID/GUID synchronously, hashed by default.
    * @param {boolean} [original=false] - If true return original value of machine id, otherwise return hashed value (sha - 256)
    */
  def machineIdSync(): String = js.native
  def machineIdSync(original: Boolean): String = js.native
}

