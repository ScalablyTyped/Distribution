package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.CameraComponentSystem
  * @extends pc.ComponentSystem
  * @classdesc Used to add and remove {@link pc.CameraComponent}s from Entities. It also holds an
  * array of all active cameras.
  * @description Create a new CameraComponentSystem
  * @param {pc.Application} app The Application
  * @property {pc.CameraComponent[]} cameras Holds all the active camera components
  */
@JSImport("playcanvas", "CameraComponentSystem")
@js.native
class CameraComponentSystem protected ()
  extends typings.playcanvas.pcNs.CameraComponentSystem {
  def this(app: typings.playcanvas.pcNs.Application) = this()
}

