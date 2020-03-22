package typings.pixiJs.PIXI

import typings.pixiJs.AnonScaleMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Experimental!
  *
  * Texture pool, used by FilterSystem and plugins
  * Stores collection of temporary pow2 or screen-sized renderTextures
  *
  * If you use custom RenderTexturePool for your filters, you can use methods
  * `getFilterTexture` and `returnFilterTexture` same as in
  *
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.RenderTexturePool")
@js.native
class RenderTexturePool () extends js.Object {
  def this(textureOptions: AnonScaleMode) = this()
  /**
    * Allow renderTextures of the same size as screen, not just pow2
    *
    * Automatically sets to true after `setScreenSize`
    *
    * @member {boolean} PIXI.RenderTexturePool#enableFullScreen
    * @default false
    */
  var enableFullScreen: Boolean = js.native
  /**
    * Clears the pool
    *
    * @param {boolean} [destroyTextures=true] destroy all stored textures
    */
  def clear(): Unit = js.native
  def clear(destroyTextures: Boolean): Unit = js.native
  /**
    * creates of texture with params that were specified in pool constructor
    *
    * @param {number} realWidth width of texture in pixels
    * @param {number} realHeight height of texture in pixels
    * @returns {RenderTexture}
    */
  def createTexture(realWidth: Double, realHeight: Double): RenderTexture = js.native
  /**
    * Gets extra texture of the same size as input renderTexture
    *
    * `getFilterTexture(input, 0.5)` or `getFilterTexture(0.5, input)`
    *
    * @param {PIXI.RenderTexture} input renderTexture from which size and resolution will be copied
    * @param {number} [resolution] override resolution of the renderTexture
    *  It overrides, it does not multiply
    * @returns {PIXI.RenderTexture}
    */
  def getFilterTexture(input: RenderTexture): RenderTexture = js.native
  def getFilterTexture(input: RenderTexture, resolution: Double): RenderTexture = js.native
  /**
    * Gets a Power-of-Two render texture or fullScreen texture
    *
    * @protected
    * @param {number} minWidth - The minimum width of the render texture in real pixels.
    * @param {number} minHeight - The minimum height of the render texture in real pixels.
    * @param {number} [resolution=1] - The resolution of the render texture.
    * @return {PIXI.RenderTexture} The new render texture.
    */
  /* protected */ def getOptimalTexture(minWidth: Double, minHeight: Double): RenderTexture = js.native
  /* protected */ def getOptimalTexture(minWidth: Double, minHeight: Double, resolution: Double): RenderTexture = js.native
  /**
    * Alias for returnTexture, to be compliant with FilterSystem interface
    * @param {PIXI.RenderTexture} renderTexture - The renderTexture to free
    */
  def returnFilterTexture(renderTexture: RenderTexture): Unit = js.native
  /**
    * Place a render texture back into the pool.
    * @param {PIXI.RenderTexture} renderTexture - The renderTexture to free
    */
  def returnTexture(renderTexture: RenderTexture): Unit = js.native
  /**
    * If screen size was changed, drops all screen-sized textures,
    * sets new screen size, sets `enableFullScreen` to true
    *
    * Size is measured in pixels, `renderer.view` can be passed here, not `renderer.screen`
    *
    * @param {PIXI.ISize} size - Initial size of screen
    */
  def setScreenSize(size: ISize): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.RenderTexturePool")
@js.native
object RenderTexturePool extends js.Object {
  /**
    * Key that is used to store fullscreen renderTextures in a pool
    *
    * @static
    * @const {string}
    */
  val SCREEN_KEY: String = js.native
}

