package typings.pixiCore.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "TextureSystem")
@js.native
open class TextureSystem protected ()
  extends StObject
     with ISystem {
  /**
    * @param renderer - The renderer this system works for.
    */
  def this(renderer: Renderer) = this()
  
  /* protected */ var CONTEXT_UID: Double = js.native
  
  /**
    * Did someone temper with textures state? We'll overwrite them when we need to unbind something.
    * @private
    */
  /* protected */ var _unknownBoundTextures: Boolean = js.native
  
  def bind(texture: BaseTexture[Resource, IAutoDetectOptions]): Unit = js.native
  def bind(texture: BaseTexture[Resource, IAutoDetectOptions], location: Double): Unit = js.native
  /**
    * Bind a texture to a specific location
    *
    * If you want to unbind something, please use `unbind(texture)` instead of `bind(null, textureLocation)`
    * @param texture - Texture to bind
    * @param [location=0] - Location to bind at
    */
  def bind(texture: Texture[Resource]): Unit = js.native
  def bind(texture: Texture[Resource], location: Double): Unit = js.native
  
  /**
    * Bound textures.
    * @readonly
    */
  var boundTextures: js.Array[BaseTexture[Resource, IAutoDetectOptions]] = js.native
  
  /** Sets up the renderer context and necessary buffers. */
  def contextChange(): Unit = js.native
  
  /**
    * Current location.
    * @readonly
    */
  var currentLocation: Double = js.native
  
  /** Generic destroy methods to be overridden by the subclass */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /**
    * Deletes the texture from WebGL
    * @private
    * @param texture - the texture to destroy
    * @param [skipRemove=false] - Whether to skip removing the texture from the TextureManager.
    */
  def destroyTexture(texture: BaseTexture[Resource, IAutoDetectOptions]): Unit = js.native
  def destroyTexture(texture: BaseTexture[Resource, IAutoDetectOptions], skipRemove: Boolean): Unit = js.native
  def destroyTexture(texture: Texture[Resource]): Unit = js.native
  def destroyTexture(texture: Texture[Resource], skipRemove: Boolean): Unit = js.native
  
  var emptyTextures: NumberDictionary[GLTexture] = js.native
  
  /**
    * Ensures that current boundTextures all have FLOAT sampler type,
    * see {@link PIXI.SAMPLER_TYPES} for explanation.
    * @param maxTextures - number of locations to check
    */
  def ensureSamplerType(maxTextures: Double): Unit = js.native
  
  /* protected */ var gl: IRenderingContext = js.native
  
  /** Whether glTexture with int/uint sampler type was uploaded. */
  /* protected */ var hasIntegerTextures: Boolean = js.native
  
  /**
    * Initialize a texture
    * @private
    * @param texture - Texture to initialize
    */
  def initTexture(texture: BaseTexture[Resource, IAutoDetectOptions]): GLTexture = js.native
  
  def initTextureType(texture: BaseTexture[Resource, IAutoDetectOptions], glTexture: GLTexture): Unit = js.native
  
  /* protected */ var internalFormats: NumberDictionary[NumberDictionary[Double]] = js.native
  
  /**
    * List of managed textures.
    * @readonly
    */
  var managedTextures: js.Array[BaseTexture[Resource, IAutoDetectOptions]] = js.native
  
  /* private */ var renderer: Any = js.native
  
  /** Resets texture location and bound textures Actual `bind(null, i)` calls will be performed at next `unbind()` call */
  def reset(): Unit = js.native
  
  /**
    * Set style for texture
    * @private
    * @param texture - Texture to update
    * @param glTexture
    */
  def setStyle(texture: BaseTexture[Resource, IAutoDetectOptions], glTexture: GLTexture): Unit = js.native
  
  /**
    * Unbind a texture.
    * @param texture - Texture to bind
    */
  def unbind(): Unit = js.native
  def unbind(texture: BaseTexture[Resource, IAutoDetectOptions]): Unit = js.native
  
  /**
    * BaseTexture value that shows that we don't know what is bound.
    * @readonly
    */
  /* protected */ var unknownTexture: BaseTexture[Resource, IAutoDetectOptions] = js.native
  
  /**
    * Update a texture
    * @private
    * @param {PIXI.BaseTexture} texture - Texture to initialize
    */
  def updateTexture(texture: BaseTexture[Resource, IAutoDetectOptions]): Unit = js.native
  
  /**
    * Update texture style such as mipmap flag
    * @private
    * @param {PIXI.BaseTexture} texture - Texture to update
    */
  def updateTextureStyle(texture: BaseTexture[Resource, IAutoDetectOptions]): Unit = js.native
  
  /* protected */ var webGLVersion: Double = js.native
}
