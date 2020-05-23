package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents XR hit test source, which provides access to hit results of real world geometry from AR session.
  * @example
  * hitTestSource.on('result', function (position, rotation) {
  target.setPosition(position);
  });
  * @param manager - WebXR Manager.
  * @param xrHitTestSource - XRHitTestSource object that is created by WebXR API.
  * @param transient - True if XRHitTestSource created for input source profile.
  */
@JSGlobal("pc.XrHitTestSource")
@js.native
class XrHitTestSource protected ()
  extends typings.playcanvas.pc.XrHitTestSource {
  def this(manager: typings.playcanvas.pc.XrManager, xrHitTestSource: js.Any, transient: Boolean) = this()
}

