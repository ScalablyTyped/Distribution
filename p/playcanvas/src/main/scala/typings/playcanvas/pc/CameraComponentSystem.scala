package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new CameraComponentSystem.
  * @property cameras - Holds all the active camera components.
  * @param app - The Application.
  */
@js.native
trait CameraComponentSystem extends EventHandler {
  /**
    * Holds all the active camera components.
    */
  var cameras: js.Array[CameraComponent] = js.native
}

