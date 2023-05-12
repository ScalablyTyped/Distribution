package typings.playcanvas.mod

import typings.playcanvas.anon.Border
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A TextureAtlas contains a number of frames from a texture. Each frame defines a region in a
  * texture. The TextureAtlas is referenced by {@link Sprite}s.
  *
  * @augments EventHandler
  */
@JSImport("playcanvas", "TextureAtlas")
@js.native
open class TextureAtlas () extends EventHandler {
  
  /**
    * @type {object}
    * @private
    */
  /* private */ var _frames: Any = js.native
  
  /**
    * @type {import('../platform/graphics/texture.js').Texture}
    * @private
    */
  /* private */ var _texture: Any = js.native
  
  /**
    * Free up the underlying texture owned by the atlas.
    */
  def destroy(): Unit = js.native
  
  def frames: Any = js.native
  /**
    * Contains frames which define portions of the texture atlas.
    *
    * @type {object}
    */
  def frames_=(arg: Any): Unit = js.native
  
  /**
    * Removes a frame from the texture atlas.
    *
    * @param {string} key - The key of the frame.
    * @example
    * atlas.removeFrame('1');
    */
  def removeFrame(key: String): Unit = js.native
  
  /**
    * Set a new frame in the texture atlas.
    *
    * @param {string} key - The key of the frame.
    * @param {object} data - The properties of the frame.
    * @param {import('../core/math/vec4.js').Vec4} data.rect - The u, v, width, height properties
    * of the frame in pixels.
    * @param {import('../core/math/vec2.js').Vec2} data.pivot - The pivot of the frame - values
    * are between 0-1.
    * @param {import('../core/math/vec4.js').Vec4} data.border - The border of the frame for
    * 9-slicing. Values are ordered as follows: left, bottom, right, top border in pixels.
    * @example
    * atlas.setFrame('1', {
    *     rect: new pc.Vec4(0, 0, 128, 128),
    *     pivot: new pc.Vec2(0.5, 0.5),
    *     border: new pc.Vec4(5, 5, 5, 5)
    * });
    */
  def setFrame(key: String, data: Border): Unit = js.native
  
  def texture: Texture = js.native
  /**
    * The texture used by the atlas.
    *
    * @type {import('../platform/graphics/texture.js').Texture}
    */
  def texture_=(arg: Texture): Unit = js.native
}
