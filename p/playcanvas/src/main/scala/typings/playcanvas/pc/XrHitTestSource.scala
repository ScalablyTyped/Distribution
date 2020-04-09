package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.XrHitTestSource
  * @augments pc.EventHandler
  * @classdesc Represents XR hit test source, which provides access to hit results of real world geometry from AR session.
  * @description Represents XR hit test source, which provides access to hit results of real world geometry from AR session.
  * @param {pc.XrManager} manager - WebXR Manager.
  * @param {object} xrHitTestSource - XRHitTestSource object that is created by WebXR API.
  * @param {boolean} transient - True if XRHitTestSource created for input source profile.
  * @example
  * hitTestSource.on('result', function (position, rotation) {
  *     target.setPosition(position);
  * });
  */
@JSGlobal("pc.XrHitTestSource")
@js.native
class XrHitTestSource protected () extends EventHandler {
  def this(manager: XrManager, xrHitTestSource: js.Any, transient: Boolean) = this()
  /**
    * @function
    * @name pc.XrHitTestSource#remove
    * @description Stop and remove hit test source.
    */
  def remove(): Unit = js.native
}

