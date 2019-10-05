package typings.pixiDotJs.pixiDotJsMod

import org.scalablytyped.runtime.StringDictionary
import typings.pixiDotJs.Anon_RendererAny
import typings.pixiDotJs.PIXI.WebGLRendererOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The WebGLRenderer draws the scene and all its content onto a webGL enabled canvas. This renderer
  * should be used for browsers that support webGL. This Render works by automatically managing webGLBatchs.
  * So no need for Sprite Batches or Sprite Clouds.
  * Don"t forget to add the view to your DOM or you will not see anything :)
  */
@JSImport("pixi.js", "WebGLRenderer")
@js.native
// plugintarget mixin end
class WebGLRenderer ()
  extends typings.pixiDotJs.PIXI.WebGLRenderer {
  def this(options: WebGLRendererOptions) = this()
  def this(screenWidth: Double) = this()
  def this(screenWidth: Double, screenHeight: Double) = this()
  def this(screenWidth: Double, screenHeight: Double, options: WebGLRendererOptions) = this()
}

/* static members */
@JSImport("pixi.js", "WebGLRenderer")
@js.native
object WebGLRenderer extends js.Object {
  // plugintarget mixin start
  var __plugins: StringDictionary[Anon_RendererAny] = js.native
  /**
    * Adds a plugin to the renderer.
    */
  def registerPlugin(pluginName: String, ctor: Anon_RendererAny): Unit = js.native
}

