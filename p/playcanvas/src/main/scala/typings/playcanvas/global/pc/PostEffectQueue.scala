package typings.playcanvas.global.pc

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
    * @param {import('../../app-base.js').AppBase} app - The application.
    * @param {import('./component.js').CameraComponent} camera - The camera component.
    */
  def this(app: typings.playcanvas.mod.AppBase, camera: typings.playcanvas.mod.CameraComponent) = this()
}
