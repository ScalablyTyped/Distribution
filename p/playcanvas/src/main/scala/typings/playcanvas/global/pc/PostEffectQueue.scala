package typings.playcanvas.global.pc

import typings.playcanvas.mod.AppBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to manage multiple post effects for a camera.
  */
@JSGlobal("pc.PostEffectQueue")
@js.native
open class PostEffectQueue protected ()
  extends typings.playcanvas.mod.PostEffectQueue {
  /**
    * Create a new PostEffectQueue instance.
    *
    * @param {AppBase} app - The application.
    * @param {CameraComponent} camera - The camera component.
    */
  def this(app: AppBase, camera: typings.playcanvas.mod.CameraComponent) = this()
}
