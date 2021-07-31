package typings.pixiJs.PIXI

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Class controls uv mapping from Texture normal space to BaseTexture normal space.
  *
  * Takes `trim` and `rotate` into account. May contain clamp settings for Meshes and TilingSprite.
  *
  * Can be used in Texture `uvMatrix` field, or separately, you can use different clamp settings on the same texture.
  * If you want to add support for texture region of certain feature or filter, that's what you're looking for.
  *
  * Takes track of Texture changes through `_lastTextureID` private field.
  * Use `update()` method call to track it from outside.
  *
  * @see PIXI.Texture
  * @see PIXI.Mesh
  * @see PIXI.TilingSprite
  * @class
  * @memberof PIXI
  */
@js.native
trait TextureMatrix extends StObject {
  
  /**
    * Tracks Texture frame changes
    * @member {number} PIXI.TextureMatrix#_textureID
    * @protected
    */
  var _textureID: Double = js.native
  
  /**
    * Tracks Texture frame changes
    * @member {number} PIXI.TextureMatrix#_updateID
    * @protected
    */
  var _updateID: Double = js.native
  
  /**
    * Changes frame clamping
    * Works with TilingSprite and Mesh
    * Change to -0.5 to add a pixel to the edge, recommended for transparent trimmed textures in atlas
    *
    * @default 0.5
    * @member {number} PIXI.TextureMatrix#clampMargin
    */
  var clampMargin: Double = js.native
  
  /**
    * Changes frame clamping
    * Works with TilingSprite and Mesh
    * Change to 1.5 if you texture has repeated right and bottom lines, that leads to smoother borders
    *
    * @default 0
    * @member {number} PIXI.TextureMatrix#clampOffset
    */
  var clampOffset: Double = js.native
  
  /**
    * If texture size is the same as baseTexture
    * @member {boolean} PIXI.TextureMatrix#isSimple
    * @default false
    * @readonly
    */
  val isSimple: Boolean = js.native
  
  /**
    * Matrix operation that converts texture region coords to texture coords
    * @member {PIXI.Matrix} PIXI.TextureMatrix#mapCoord
    * @readonly
    */
  val mapCoord: Matrix = js.native
  
  /**
    * Multiplies uvs array to transform
    * @param {Float32Array} uvs - mesh uvs
    * @param {Float32Array} [out=uvs] output
    * @returns {Float32Array} output
    */
  def multiplyUvs(uvs: Float32Array): Float32Array = js.native
  def multiplyUvs(uvs: Float32Array, out: Float32Array): Float32Array = js.native
  
  /**
    * texture property
    * @member {PIXI.Texture}
    */
  var texture: Texture = js.native
  
  /**
    * Clamp region for normalized coords, left-top pixel center in xy , bottom-right in zw.
    * Calculated based on clampOffset.
    * @member {Float32Array} PIXI.TextureMatrix#uClampFrame
    * @readonly
    */
  val uClampFrame: Float32Array = js.native
  
  /**
    * Normalized clamp offset.
    * Calculated based on clampOffset.
    * @member {Float32Array} PIXI.TextureMatrix#uClampOffset
    * @readonly
    */
  val uClampOffset: Float32Array = js.native
  
  /**
    * updates matrices if texture was changed
    * @param {boolean} [forceUpdate=false] - if true, matrices will be updated any case
    * @returns {boolean} whether or not it was updated
    */
  def update(): Boolean = js.native
  def update(forceUpdate: Boolean): Boolean = js.native
}
