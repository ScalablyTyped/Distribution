package typings.pixiJs.PIXI.systems

import typings.pixiJs.PIXI.BaseTexture
import typings.pixiJs.PIXI.System
import typings.pixiJs.PIXI.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * System plugin to the renderer to manage textures.
  *
  * @class
  * @extends PIXI.System
  * @memberof PIXI.systems
  */
@js.native
trait TextureSystem extends System {
  
  def bind(texture_ : BaseTexture): Unit = js.native
  def bind(texture_ : BaseTexture, location: Double): Unit = js.native
  /**
    * Bind a texture to a specific location
    *
    * If you want to unbind something, please use `unbind(texture)` instead of `bind(null, textureLocation)`
    *
    * @param {PIXI.Texture|PIXI.BaseTexture} texture_ - Texture to bind
    * @param {number} [location=0] - Location to bind at
    */
  def bind(texture_ : Texture): Unit = js.native
  def bind(texture_ : Texture, location: Double): Unit = js.native
  
  /**
    * Bound textures
    * @member {PIXI.BaseTexture[]} PIXI.systems.TextureSystem#boundTextures
    * @readonly
    */
  val boundTextures: js.Array[BaseTexture] = js.native
  
  /**
    * Sets up the renderer context and necessary buffers.
    */
  def contextChange(): Unit = js.native
  
  /**
    * Current location
    * @member {number} PIXI.systems.TextureSystem#currentLocation
    * @readonly
    */
  val currentLocation: Double = js.native
  
  /**
    * List of managed textures
    * @member {PIXI.BaseTexture[]} PIXI.systems.TextureSystem#managedTextures
    * @readonly
    */
  val managedTextures: js.Array[BaseTexture] = js.native
  
  /**
    * Resets texture location and bound textures
    *
    * Actual `bind(null, i)` calls will be performed at next `unbind()` call
    */
  def reset(): Unit = js.native
  
  /**
    * Unbind a texture
    * @param {PIXI.BaseTexture} texture - Texture to bind
    */
  def unbind(texture: BaseTexture): Unit = js.native
  
  /**
    * BaseTexture value that shows that we don't know what is bound
    * @member {PIXI.BaseTexture} PIXI.systems.TextureSystem#unknownTexture
    * @readonly
    */
  val unknownTexture: BaseTexture = js.native
}
