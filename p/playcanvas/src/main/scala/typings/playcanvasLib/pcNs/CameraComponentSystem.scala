package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @name pc.CameraComponentSystem
     * @class Used to add and remove {@link pc.CameraComponent}s from Entities. It also holds an
     * array of all active cameras.
     * @description Create a new CameraComponentSystem
     * @param {pc.Application} app The Application
     *
     * @property {pc.CameraComponent[]} cameras Holds all the active camera components
     * @extends pc.ComponentSystem
     */
@JSGlobal("pc.CameraComponentSystem")
@js.native
class CameraComponentSystem protected () extends ComponentSystem {
  def this(app: Application) = this()
  var cameras: js.Array[CameraComponent] = js.native
}

