package typings
package naverDashWhaleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsystem extends js.Object {
  ////////////////////
  // System CPU
  ////////////////////
  /**
    * Use the system.cpu API to query CPU metadata.
    * Permissions: "system.cpu"
    * @since Chrome 32.
    */
  val cpuNs: Typeofcpu
  ////////////////////
  // System Memory
  ////////////////////
  /**
    * The chrome.system.memory API.
    * Permissions:  "system.memory"
    * @since Chrome 32.
    */
  val memoryNs: Typeofmemory
  ////////////////////
  // System Storage
  ////////////////////
  /**
    * Use the chrome.system.storage API to query storage device information and be notified when a removable storage device is attached and detached.
    * Permissions:  "system.storage"
    * @since Chrome 30.
    */
  val storageNs: TypeofstorageCallback
}

object Typeofsystem {
  @scala.inline
  def apply(cpuNs: Typeofcpu, memoryNs: Typeofmemory, storageNs: TypeofstorageCallback): Typeofsystem = {
    val __obj = js.Dynamic.literal(cpuNs = cpuNs, memoryNs = memoryNs, storageNs = storageNs)
  
    __obj.asInstanceOf[Typeofsystem]
  }
}

