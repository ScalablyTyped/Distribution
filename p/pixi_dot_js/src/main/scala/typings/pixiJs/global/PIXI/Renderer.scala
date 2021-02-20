package typings.pixiJs.global.PIXI

import typings.pixiJs.anon.BackgroundColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
@JSGlobal("PIXI.Renderer")
@js.native
class Renderer ()
  extends typings.pixiJs.PIXI.Renderer {
  def this(options: BackgroundColor) = this()
}
object Renderer {
  
  /**
    * Adds a plugin to the renderer.
    *
    * @method
    * @param {string} pluginName - The name of the plugin.
    * @param {Function} ctor - The constructor function or class for the plugin.
    */
  /* static member */
  @JSGlobal("PIXI.Renderer.registerPlugin")
  @js.native
  def registerPlugin(pluginName: String, ctor: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
}
