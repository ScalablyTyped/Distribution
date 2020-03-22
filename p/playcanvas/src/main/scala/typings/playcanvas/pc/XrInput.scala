package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.XrInput
  * @augments pc.EventHandler
  * @classdesc Provides access to input sources for WebXR.
  * @description Provides access to input sources for WebXR.
  * @param {pc.XrManager} manager - WebXR Manager.
  * @property {pc.XrInputSource[]} inputSources List of active {pc.XrInputSource}
  */
@JSGlobal("pc.XrInput")
@js.native
class XrInput protected () extends EventHandler {
  def this(manager: XrManager) = this()
  /**
    * List of active {pc.XrInputSource}
    */
  var inputSources: js.Array[XrInputSource] = js.native
}

