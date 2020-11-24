package typings.pixiJs.PIXI

import typings.pixiJs.PIXI.utils.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A texture stores the information that represents an image or part of an image.
  *
  * It cannot be added to the display list directly; instead use it as the texture for a Sprite.
  * If no frame is provided for a texture, then the whole image is used.
  *
  * You can directly create a texture from an image and then reuse it multiple times like this :
  *
  * ```js
  * let texture = PIXI.Texture.from('assets/image.png');
  * let sprite1 = new PIXI.Sprite(texture);
  * let sprite2 = new PIXI.Sprite(texture);
  * ```
  *
  * If you didnt pass the texture frame to constructor, it enables `noFrame` mode:
  * it subscribes on baseTexture events, it automatically resizes at the same time as baseTexture.
  *
  * Textures made from SVGs, loaded or not, cannot be used before the file finishes processing.
  * You can check for this by checking the sprite's _textureID property.
  * ```js
  * var texture = PIXI.Texture.from('assets/image.svg');
  * var sprite1 = new PIXI.Sprite(texture);
  * //sprite1._textureID should not be undefined if the texture has finished processing the SVG file
  * ```
  * You can use a ticker or rAF to ensure your sprites load the finished textures after processing. See issue #3068.
  *
  * @class
  * @extends PIXI.utils.EventEmitter
  * @memberof PIXI
  */
@js.native
trait Texture extends EventEmitter {
  
  /**
    * This is the area of the BaseTexture image to actually copy to the Canvas / WebGL when rendering,
    * irrespective of the actual frame size or placement (which can be influenced by trimmed texture atlases)
    *
    * @member {PIXI.Rectangle} PIXI.Texture#_frame
    */
  var _frame: Rectangle = js.native
  
  /**
    * Update ID is observed by sprites and TextureMatrix instances.
    * Call updateUvs() to increment it.
    *
    * @member {number} PIXI.Texture#_updateID
    * @protected
    */
  var _updateID: Double = js.native
  
  /**
    * The WebGL UV data cache. Can be used as quad UV
    *
    * @member {PIXI.TextureUvs} PIXI.Texture#_uvs
    * @protected
    */
  var _uvs: TextureUvs = js.native
  
  /**
    * The base texture that this texture uses.
    *
    * @member {PIXI.BaseTexture} PIXI.Texture#baseTexture
    */
  var baseTexture: BaseTexture = js.native
  
  /**
    * Utility function for BaseTexture|Texture cast
    */
  def castToBaseTexture(): Unit = js.native
  
  /**
    * Anchor point that is used as default if sprite is created with this texture.
    * Changing the `defaultAnchor` at a later point of time will not update Sprite's anchor point.
    * @member {PIXI.Point} PIXI.Texture#defaultAnchor
    * @default {0,0}
    */
  var defaultAnchor: Point = js.native
  
  /**
    * Destroys this texture
    *
    * @param {boolean} [destroyBase=false] - Whether to destroy the base texture as well
    */
  def destroy(): Unit = js.native
  def destroy(destroyBase: Boolean): Unit = js.native
  
  /**
    * The frame specifies the region of the base texture that this texture uses.
    * Please call `updateUvs()` after you change coordinates of `frame` manually.
    *
    * @member {PIXI.Rectangle}
    */
  var frame: Rectangle = js.native
  
  /**
    * The height of the Texture in pixels.
    *
    * @member {number}
    */
  var height: Double = js.native
  
  /**
    * Does this Texture have any frame data assigned to it?
    *
    * This mode is enabled automatically if no frame was passed inside constructor.
    *
    * In this mode texture is subscribed to baseTexture events, and fires `update` on any change.
    *
    * Beware, after loading or resize of baseTexture event can fired two times!
    * If you want more control, subscribe on baseTexture itself.
    *
    * ```js
    * texture.on('update', () => {});
    * ```
    *
    * Any assignment of `frame` switches off `noFrame` mode.
    *
    * @member {boolean} PIXI.Texture#noFrame
    */
  var noFrame: Boolean = js.native
  
  /**
    * Called when the base texture is updated
    *
    * @protected
    * @param {PIXI.BaseTexture} baseTexture - The base texture.
    */
  /* protected */ def onBaseTextureUpdated(baseTexture: BaseTexture): Unit = js.native
  
  /**
    * This is the area of original texture, before it was put in atlas
    *
    * @member {PIXI.Rectangle} PIXI.Texture#orig
    */
  var orig: Rectangle = js.native
  
  /**
    * Returns resolution of baseTexture
    *
    * @member {number}
    * @readonly
    */
  val resolution: Double = js.native
  
  /**
    * Indicates whether the texture is rotated inside the atlas
    * set to 2 to compensate for texture packer rotation
    * set to 6 to compensate for spine packer rotation
    * can be used to rotate or mirror sprites
    * See {@link PIXI.groupD8} for explanation
    *
    * @member {number}
    */
  var rotate: Double = js.native
  
  /**
    * The ids under which this Texture has been added to the texture cache. This is
    * automatically set as long as Texture.addToCache is used, but may not be set if a
    * Texture is added directly to the TextureCache array.
    *
    * @member {string[]} PIXI.Texture#textureCacheIds
    */
  var textureCacheIds: js.Array[String] = js.native
  
  /**
    * This is the trimmed area of original texture, before it was put in atlas
    * Please call `updateUvs()` after you change coordinates of `trim` manually.
    *
    * @member {PIXI.Rectangle} PIXI.Texture#trim
    */
  var trim: Rectangle = js.native
  
  /**
    * Updates this texture on the gpu.
    *
    * Calls the TextureResource update.
    *
    * If you adjusted `frame` manually, please call `updateUvs()` instead.
    *
    */
  def update(): Unit = js.native
  
  /**
    * Updates the internal WebGL UV cache. Use it after you change `frame` or `trim` of the texture.
    * Call it after changing the frame
    */
  def updateUvs(): Unit = js.native
  
  /**
    * Default TextureMatrix instance for this texture
    * By default that object is not created because its heavy
    *
    * @member {PIXI.TextureMatrix} PIXI.Texture#uvMatrix
    */
  var uvMatrix: TextureMatrix = js.native
  
  /**
    * This will let the renderer know if the texture is valid. If it's not then it cannot be rendered.
    *
    * @member {boolean} PIXI.Texture#valid
    */
  var valid: Boolean = js.native
  
  /**
    * The width of the Texture in pixels.
    *
    * @member {number}
    */
  var width: Double = js.native
}
