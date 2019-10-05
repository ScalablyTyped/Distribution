package typings.playcanvas.pc

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
@JSGlobal("pc.CameraComponentSystem")
@js.native
class CameraComponentSystem protected () extends ComponentSystem {
  def this(app: Application) = this()
  /**
    * Holds all the active camera components
    */
  var cameras: js.Array[CameraComponent] = js.native
}

