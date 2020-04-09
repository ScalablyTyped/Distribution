package typings.playcanvas.mod

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
@JSImport("playcanvas", "XrHitTestSource")
@js.native
class XrHitTestSource protected ()
  extends typings.playcanvas.pc.XrHitTestSource {
  def this(manager: typings.playcanvas.pc.XrManager, xrHitTestSource: js.Any, transient: Boolean) = this()
}

