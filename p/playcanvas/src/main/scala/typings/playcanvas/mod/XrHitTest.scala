package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.XrHitTest
  * @augments pc.EventHandler
  * @classdesc Hit Test provides ability to get position and rotation of ray intersecting point with representation of real world geometry by underlying AR system.
  * @description Hit Test provides ability to get position and rotation of ray intersecting point with representation of real world geometry by underlying AR system.
  * @param {pc.XrManager} manager - WebXR Manager.
  * @property {boolean} supported True if AR Hit Test is supported.
  * @property {pc.XrHitTestSource[]} sources list of active {@link pc.XrHitTestSource}.
  */
@JSImport("playcanvas", "XrHitTest")
@js.native
class XrHitTest protected ()
  extends typings.playcanvas.pc.XrHitTest {
  def this(manager: typings.playcanvas.pc.XrManager) = this()
}

