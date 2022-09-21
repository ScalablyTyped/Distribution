package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../../app-base.js').AppBase} AppBase */
/** @typedef {import('./component.js').CameraComponent} CameraComponent */
/**
  * Base class for all post effects. Post effects take a a render target as input apply effects to
  * it and then render the result to an output render target or the screen if no output is
  * specified.
  */
@JSImport("playcanvas", "PostEffect")
@js.native
open class PostEffect_ protected ()
  extends StObject
     with PostEffect1 {
  /**
    * Create a new PostEffect instance.
    *
    * @param {GraphicsDevice} graphicsDevice - The graphics device of the application.
    */
  def this(graphicsDevice: GraphicsDevice) = this()
  
  var effect: Any = js.native
  
  var inputTarget: Any = js.native
  
  var name: Any = js.native
  
  var outputTarget: Any = js.native
}
