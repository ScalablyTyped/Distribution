package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new CameraComponentSystem.
  * @property cameras - Holds all the active camera components.
  * @param app - The Application.
  */
@js.native
trait CameraComponentSystem
  extends StObject
     with EventHandler {
  
  /**
    * Holds all the active camera components.
    */
  var cameras: js.Array[CameraComponent] = js.native
}
