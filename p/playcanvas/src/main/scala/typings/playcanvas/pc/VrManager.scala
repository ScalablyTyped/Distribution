package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.VrManager
  * @extends pc.EventHandler
  * @classdesc Manage and update {@link pc.VrDisplay}s that are attached to this device.
  * @description Manage and update {@link pc.VrDisplay}s that are attached to this device.
  * @param {pc.Application} app The main application
  * @property {pc.VrDisplay[]} displays The list of {@link pc.VrDisplay}s that are attached to this device
  * @property {pc.VrDisplay} display The default {@link pc.VrDisplay} to be used. Usually the first in the `displays` list
  * @property {Boolean} isSupported Reports whether this device supports the WebVR API
  */
@JSGlobal("pc.VrManager")
@js.native
class VrManager protected () extends EventHandler {
  def this(app: Application) = this()
  /**
    * The default {@link pc.VrDisplay} to be used. Usually the first in the `displays` list
    */
  var display: VrDisplay = js.native
  /**
    * The list of {@link pc.VrDisplay}s that are attached to this device
    */
  var displays: js.Array[VrDisplay] = js.native
  /**
    * Reports whether this device supports the WebVR API
    */
  var isSupported: Boolean = js.native
  /**
    * @function
    * @name pc.VrManager#destroy
    * @description Remove events and clear up manager
    */
  def destroy(): Unit = js.native
  /**
    * @function
    * @name pc.VrManager#poll
    * @description Called once per frame to poll all attached displays
    */
  def poll(): Unit = js.native
}

/* static members */
@JSGlobal("pc.VrManager")
@js.native
object VrManager extends js.Object {
  /**
    * @static
    * @name pc.VrManager.isSupported
    * @type Boolean
    * @description Reports whether this device supports the WebVR API
    */
  var isSupported: Boolean = js.native
}

