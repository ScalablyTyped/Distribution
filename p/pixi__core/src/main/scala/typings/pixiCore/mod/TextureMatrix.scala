package typings.pixiCore.mod

import typings.pixiMath.mod.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "TextureMatrix")
@js.native
open class TextureMatrix protected () extends StObject {
  /**
    * @param texture - observed texture
    * @param clampMargin - Changes frame clamping, 0.5 by default. Use -0.5 for extra border.
    */
  def this(texture: Texture[Resource]) = this()
  def this(texture: Texture[Resource], clampMargin: Double) = this()
  
  var _texture: Texture[Resource] = js.native
  
  /**
    * Tracks Texture frame changes.
    * @protected
    */
  var _textureID: Double = js.native
  
  /**
    * Tracks Texture frame changes.
    * @protected
    */
  var _updateID: Double = js.native
  
  /**
    * Changes frame clamping
    * Works with TilingSprite and Mesh
    * Change to -0.5 to add a pixel to the edge, recommended for transparent trimmed textures in atlas
    * @default 0.5
    */
  var clampMargin: Double = js.native
  
  /**
    * Changes frame clamping
    * Works with TilingSprite and Mesh
    * Change to 1.5 if you texture has repeated right and bottom lines, that leads to smoother borders
    * @default 0
    */
  var clampOffset: Double = js.native
  
  /**
    * If texture size is the same as baseTexture.
    * @default false
    * @readonly
    */
  var isSimple: Boolean = js.native
  
  /**
    * Matrix operation that converts texture region coords to texture coords
    * @readonly
    */
  var mapCoord: Matrix = js.native
  
  /**
    * Multiplies uvs array to transform
    * @param uvs - mesh uvs
    * @param [out=uvs] - output
    * @returns - output
    */
  def multiplyUvs(uvs: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
  def multiplyUvs(uvs: js.typedarray.Float32Array, out: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
  
  /** Texture property. */
  def texture: Texture[Resource] = js.native
  def texture_=(value: Texture[Resource]): Unit = js.native
  
  /**
    * Clamp region for normalized coords, left-top pixel center in xy , bottom-right in zw.
    * Calculated based on clampOffset.
    */
  val uClampFrame: js.typedarray.Float32Array = js.native
  
  /** Normalized clamp offset. Calculated based on clampOffset. */
  val uClampOffset: js.typedarray.Float32Array = js.native
  
  /**
    * Updates matrices if texture was changed.
    * @param [forceUpdate=false] - if true, matrices will be updated any case
    * @returns - Whether or not it was updated
    */
  def update(): Boolean = js.native
  def update(forceUpdate: Boolean): Boolean = js.native
}
