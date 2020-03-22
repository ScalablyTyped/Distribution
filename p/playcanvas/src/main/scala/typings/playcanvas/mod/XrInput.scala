package typings.playcanvas.mod

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
@JSImport("playcanvas", "XrInput")
@js.native
class XrInput protected ()
  extends typings.playcanvas.pc.XrInput {
  def this(manager: typings.playcanvas.pc.XrManager) = this()
}

