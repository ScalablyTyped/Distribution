package typings.pixiJs.PIXI.systems

import typings.pixiJs.PIXI.BUFFER_BITS
import typings.pixiJs.PIXI.Graphics
import typings.pixiJs.PIXI.Rectangle
import typings.pixiJs.PIXI.RenderTexture
import typings.pixiJs.PIXI.Renderer
import typings.pixiJs.PIXI.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * System plugin to the renderer to manage render textures.
  *
  * Should be added after FramebufferSystem
  *
  * @class
  * @extends PIXI.System
  * @memberof PIXI.systems
  */
@js.native
trait RenderTextureSystem extends System {
  
  /**
    * Bind the current render texture
    *
    * @param {PIXI.RenderTexture} [renderTexture] - RenderTexture to bind, by default its `null`, the screen
    * @param {PIXI.Rectangle} [sourceFrame] - part of screen that is mapped to the renderTexture
    * @param {PIXI.Rectangle} [destinationFrame] - part of renderTexture, by default it has the same size as sourceFrame
    */
  def bind(): Unit = js.native
  def bind(
    renderTexture: js.UndefOr[scala.Nothing],
    sourceFrame: js.UndefOr[scala.Nothing],
    destinationFrame: Rectangle
  ): Unit = js.native
  def bind(renderTexture: js.UndefOr[scala.Nothing], sourceFrame: Rectangle): Unit = js.native
  def bind(renderTexture: js.UndefOr[scala.Nothing], sourceFrame: Rectangle, destinationFrame: Rectangle): Unit = js.native
  def bind(renderTexture: RenderTexture): Unit = js.native
  def bind(renderTexture: RenderTexture, sourceFrame: js.UndefOr[scala.Nothing], destinationFrame: Rectangle): Unit = js.native
  def bind(renderTexture: RenderTexture, sourceFrame: Rectangle): Unit = js.native
  def bind(renderTexture: RenderTexture, sourceFrame: Rectangle, destinationFrame: Rectangle): Unit = js.native
  
  /**
    * Erases the render texture and fills the drawing area with a colour
    *
    * @param {number[]} [clearColor] - The color as rgba, default to use the renderer backgroundColor
    * @param {PIXI.BUFFER_BITS} [mask=BUFFER_BITS.COLOR | BUFFER_BITS.DEPTH] - Bitwise OR of masks
    *  that indicate the buffers to be cleared, by default COLOR and DEPTH buffers.
    * @return {PIXI.Renderer} Returns itself.
    */
  def clear(): Renderer = js.native
  def clear(clearColor: js.UndefOr[scala.Nothing], mask: BUFFER_BITS): Renderer = js.native
  def clear(clearColor: js.Array[Double]): Renderer = js.native
  def clear(clearColor: js.Array[Double], mask: BUFFER_BITS): Renderer = js.native
  
  /**
    * The clear background color as rgba
    * @member {number[]} PIXI.systems.RenderTextureSystem#clearColor
    */
  var clearColor: js.Array[Double] = js.native
  
  /**
    * Render texture
    * @member {PIXI.RenderTexture} PIXI.systems.RenderTextureSystem#current
    * @readonly
    */
  val current: RenderTexture = js.native
  
  /**
    * List of masks for the StencilSystem
    * @member {PIXI.Graphics[]} PIXI.systems.RenderTextureSystem#defaultMaskStack
    * @readonly
    */
  val defaultMaskStack: js.Array[Graphics] = js.native
  
  /**
    * Destination frame
    * @member {PIXI.Rectangle} PIXI.systems.RenderTextureSystem#destinationFrame
    * @readonly
    */
  val destinationFrame: Rectangle = js.native
  
  /**
    * Resets renderTexture state
    */
  def reset(): Unit = js.native
  
  /**
    * Source frame
    * @member {PIXI.Rectangle} PIXI.systems.RenderTextureSystem#sourceFrame
    * @readonly
    */
  val sourceFrame: Rectangle = js.native
}
