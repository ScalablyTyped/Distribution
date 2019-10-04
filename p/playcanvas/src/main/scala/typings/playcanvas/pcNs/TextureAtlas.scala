package typings.playcanvas.pcNs

import typings.playcanvas.Anon_Border
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.TextureAtlas
  * @extends pc.EventHandler
  * @classdesc A pc.TextureAtlas contains a number of frames from a texture. Each frame defines a region in
  * a texture. The pc.TextureAtlas is referenced by {@link pc.Sprite}s.
  * @property {pc.Texture} texture The texture atlas.
  * @property {Object} frames Contains frames which define portions of the texture atlas.
  * @example
  * var atlas = new pc.TextureAtlas();
  * atlas.frames = {
  *   '0': {
  *       // rect has u, v, width and height in pixels
  *       rect: new pc.Vec4(0, 0, 256, 256),
  *       // pivot has x, y values between 0-1 which define the point
  *       // within the frame around which rotation and scale is calculated
  *       pivot: new pc.Vec2(0.5, 0.5),
  * .      // border has left, bottom, right and top in pixels defining regions for 9-slicing
  * .      border: new pc.Vec4(5, 5, 5, 5)
  *   },
  *   '1': {
  *       rect: new pc.Vec4(256, 0, 256, 256),
  *       pivot: new pc.Vec2(0.5, 0.5),
  *       border: new pc.Vec4(5, 5, 5, 5)
  *   },
  *   ...
  * };
  */
@JSGlobal("pc.TextureAtlas")
@js.native
class TextureAtlas () extends EventHandler {
  /**
    * Contains frames which define portions of the texture atlas.
    */
  var frames: js.Any = js.native
  /**
    * The texture atlas.
    */
  var texture: Texture = js.native
  /**
    * @function
    * @name pc.TextureAtlas#destroy
    * @description Free up the underlying WebGL resource owned by the texture.
    */
  def destroy(): Unit = js.native
  /**
    * @function
    * @name pc.TextureAtlas#removeFrame
    * @param {String} key The key of the frame.
    * @example
    * atlas.removeFrame('1');
    */
  def removeFrame(key: String): Unit = js.native
  /**
    * @function
    * @name pc.TextureAtlas#setFrame
    * @param {String} key The key of the frame.
    * @param {Object} data The properties of the frame.
    * @param {pc.Vec4} [data.rect] The u, v, width, height properties of the frame in pixels.
    * @param {pc.Vec2} [data.pivot] The pivot of the frame - values are between 0-1.
    * @param {pc.Vec4} [data.border] The border of the frame for 9-slicing. Values are left, bottom, right, top border in pixels.
    * @example
    * atlas.setFrame('1', {
    *    rect: new pc.Vec4(0,0,128,128),
    *    pivot: new pc.Vec2(0.5, 0.5),
    *    border: new pc.Vec4(5, 5, 5, 5)
    * });
    */
  def setFrame(key: String, data: Anon_Border): Unit = js.native
}

