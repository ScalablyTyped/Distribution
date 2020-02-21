package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.VrManager
  * @augments pc.EventHandler
  * @classdesc Manage and update {@link pc.VrDisplay}s that are attached to this device.
  * @description Manage and update {@link pc.VrDisplay}s that are attached to this device.
  * @param {pc.Application} app - The main application.
  * @property {pc.VrDisplay[]} displays The list of {@link pc.VrDisplay}s that are attached to this device.
  * @property {pc.VrDisplay} display The default {@link pc.VrDisplay} to be used. Usually the first in the `displays` list.
  * @property {boolean} isSupported Reports whether this device supports the WebVR API.
  */
@JSImport("playcanvas", "VrManager")
@js.native
class VrManager protected ()
  extends typings.playcanvas.pc.VrManager {
  def this(app: typings.playcanvas.pc.Application) = this()
}

/* static members */
@JSImport("playcanvas", "VrManager")
@js.native
object VrManager extends js.Object {
  /**
    * @static
    * @name pc.VrManager.isSupported
    * @type {boolean}
    * @description Reports whether this device supports the WebVR API.
    */
  var isSupported: Boolean = js.native
}

