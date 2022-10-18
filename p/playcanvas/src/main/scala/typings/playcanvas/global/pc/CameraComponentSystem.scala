package typings.playcanvas.global.pc

import typings.playcanvas.mod.AppBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to add and remove {@link CameraComponent}s from Entities. It also holds an array of all
  * active cameras.
  *
  * @augments ComponentSystem
  */
@JSGlobal("pc.CameraComponentSystem")
@js.native
open class CameraComponentSystem protected ()
  extends typings.playcanvas.mod.CameraComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
}
