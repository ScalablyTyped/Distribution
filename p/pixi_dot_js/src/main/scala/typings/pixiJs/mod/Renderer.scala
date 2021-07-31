package typings.pixiJs.mod

import typings.pixiJs.anon.BackgroundColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Renderer draws the scene and all its content onto a WebGL enabled canvas.
  *
  * This renderer should be used for browsers that support WebGL.
  *
  * This renderer works by automatically managing WebGLBatchesm, so no need for Sprite Batches or Sprite Clouds.
  * Don't forget to add the view to your DOM or you will not see anything!
  *
  * @class
  * @memberof PIXI
  * @extends PIXI.AbstractRenderer
  */
@JSImport("pixi.js", "Renderer")
@js.native
class Renderer ()
  extends StObject
     with typings.pixiJs.PIXI.Renderer {
  def this(options: BackgroundColor) = this()
}
object Renderer {
  
  @JSImport("pixi.js", "Renderer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds a plugin to the renderer.
    *
    * @method
    * @param {string} pluginName - The name of the plugin.
    * @param {Function} ctor - The constructor function or class for the plugin.
    */
  /* static member */
  @scala.inline
  def registerPlugin(pluginName: String, ctor: js.Function1[/* repeated */ js.Any, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(pluginName.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
