package typings.playcanvas.mod

import typings.playcanvas.anon.Atlas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Sprite contains references to one or more frames of a {@link TextureAtlas}. It can be used by
  * the {@link SpriteComponent} or the {@link ElementComponent} to render a single frame or a sprite
  * animation.
  *
  * @augments EventHandler
  */
@JSImport("playcanvas", "Sprite")
@js.native
open class Sprite protected () extends EventHandler {
  /**
    * Create a new Sprite instance.
    *
    * @param {import('../platform/graphics/graphics-device.js').GraphicsDevice} device - The
    * graphics device of the application.
    * @param {object} [options] - Options for creating the Sprite.
    * @param {number} [options.pixelsPerUnit] - The number of pixels that map to one PlayCanvas
    * unit. Defaults to 1.
    * @param {number} [options.renderMode] - The rendering mode of the sprite. Can be:
    *
    * - {@link SPRITE_RENDERMODE_SIMPLE}
    * - {@link SPRITE_RENDERMODE_SLICED}
    * - {@link SPRITE_RENDERMODE_TILED}
    *
    * Defaults to {@link SPRITE_RENDERMODE_SIMPLE}.
    * @param {import('./texture-atlas.js').TextureAtlas} [options.atlas] - The texture atlas.
    * Defaults to null.
    * @param {string[]} [options.frameKeys] - The keys of the frames in the sprite atlas that this
    * sprite is using. Defaults to null.
    */
  def this(device: GraphicsDevice) = this()
  def this(device: GraphicsDevice, options: Atlas) = this()
  
  var _atlas: TextureAtlas = js.native
  
  def _create9SliceMesh(): Mesh = js.native
  
  def _createMeshes(): Unit = js.native
  
  def _createSimpleMesh(frame: Any): Mesh = js.native
  
  var _device: GraphicsDevice = js.native
  
  var _frameKeys: js.Array[String] = js.native
  
  var _meshes: js.Array[Any] = js.native
  
  var _meshesDirty: Boolean = js.native
  
  def _onFrameChanged(frameKey: Any, frame: Any): Unit = js.native
  
  def _onFrameRemoved(frameKey: Any): Unit = js.native
  
  def _onSetFrames(frames: Any): Unit = js.native
  
  var _pixelsPerUnit: Double = js.native
  
  var _renderMode: Double = js.native
  
  var _updatingProperties: Boolean = js.native
  
  def atlas: TextureAtlas = js.native
  /**
    * The texture atlas.
    *
    * @type {import('./texture-atlas.js').TextureAtlas}
    */
  def atlas_=(arg: TextureAtlas): Unit = js.native
  
  /**
    * Free up the meshes created by the sprite.
    */
  def destroy(): Unit = js.native
  
  def endUpdate(): Unit = js.native
  
  def frameKeys: js.Array[String] = js.native
  /**
    * The keys of the frames in the sprite atlas that this sprite is using.
    *
    * @type {string[]}
    */
  def frameKeys_=(arg: js.Array[String]): Unit = js.native
  
  /**
    * An array that contains a mesh for each frame.
    *
    * @type {import('./mesh.js').Mesh[]}
    */
  def meshes: js.Array[Mesh] = js.native
  
  def pixelsPerUnit: Double = js.native
  /**
    * The number of pixels that map to one PlayCanvas unit.
    *
    * @type {number}
    */
  def pixelsPerUnit_=(arg: Double): Unit = js.native
  
  def renderMode: Double = js.native
  /**
    * The rendering mode of the sprite. Can be:
    *
    * - {@link SPRITE_RENDERMODE_SIMPLE}
    * - {@link SPRITE_RENDERMODE_SLICED}
    * - {@link SPRITE_RENDERMODE_TILED}
    *
    * @type {number}
    */
  def renderMode_=(arg: Double): Unit = js.native
  
  def startUpdate(): Unit = js.native
}
