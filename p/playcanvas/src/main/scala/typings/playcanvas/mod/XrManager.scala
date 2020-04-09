package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.XrManager
  * @augments pc.EventHandler
  * @classdesc Manage and update XR session and its states.
  * @description Manage and update XR session and its states.
  * @param {pc.Application} app - The main application.
  * @property {boolean} supported True if XR is supported.
  * @property {boolean} active True if XR session is running.
  * @property {string|null} type Returns type of currently running XR session or null if no session is running. Can be
  * any of pc.XRTYPE_*.
  * @property {string|null} spaceType Returns reference space type of currently running XR session or null if no session
  * is running. Can be any of pc.XRSPACE_*.
  * @property {pc.Entity|null} camera Active camera for which XR session is running or null.
  * @property {pc.XrInput} input provides access to Input Sources.
  * @property {pc.XrHitTest} hitTest provides ability to hit test representation of real world geometry of underlying AR system.
  */
@JSImport("playcanvas", "XrManager")
@js.native
class XrManager protected ()
  extends typings.playcanvas.pc.XrManager {
  def this(app: typings.playcanvas.pc.Application) = this()
}

