package typings
package micromodalLib.micromodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MicroModal controller
  */
@JSImport("micromodal", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  /**
    * Closes the active modal
    */
  def close(): scala.Unit = js.native
  /**
    * Binds click handlers to all modal triggers
    * @param config configuration options
    */
  def init(): scala.Unit = js.native
  def init(config: micromodalLib.micromodalMod.MicroModalConfig): scala.Unit = js.native
  /**
    * Shows a particular modal
    * @param targetModal The id of the modal to display
    * @param config configuration options
    */
  def show(targetModal: java.lang.String): scala.Unit = js.native
  def show(targetModal: java.lang.String, config: micromodalLib.micromodalMod.MicroModalConfig): scala.Unit = js.native
}

