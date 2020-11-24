package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new CameraComponentSystem.
  * @property cameras - Holds all the active camera components.
  * @param app - The Application.
  */
@JSImport("playcanvas", "CameraComponentSystem")
@js.native
class CameraComponentSystem protected ()
  extends typings.playcanvas.pc.CameraComponentSystem {
  def this(app: typings.playcanvas.pc.Application) = this()
}
