package typings.playcanvas.pc

import typings.playcanvas.anon.Border
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A pc.TextureAtlas contains a number of frames from a texture. Each frame
  defines a region in a texture. The pc.TextureAtlas is referenced by {@link pc.Sprite}s.
  * @example
  * var atlas = new pc.TextureAtlas();
  atlas.frames = {
  '0': {
  // rect has u, v, width and height in pixels
  rect: new pc.Vec4(0, 0, 256, 256),
  // pivot has x, y values between 0-1 which define the point
  // within the frame around which rotation and scale is calculated
  pivot: new pc.Vec2(0.5, 0.5),
  // border has left, bottom, right and top in pixels defining regions for 9-slicing
  border: new pc.Vec4(5, 5, 5, 5)
  },
  '1': {
  rect: new pc.Vec4(256, 0, 256, 256),
  pivot: new pc.Vec2(0.5, 0.5),
  border: new pc.Vec4(5, 5, 5, 5)
  }
  };
  * @property texture - The texture atlas.
  * @property frames - Contains frames which define portions of the texture atlas.
  */
@js.native
trait TextureAtlas extends EventHandler {
  /**
    * Contains frames which define portions of the texture atlas.
    */
  var frames: js.Any = js.native
  /**
    * The texture atlas.
    */
  var texture: Texture = js.native
  /**
    * Free up the underlying texture owned by the atlas.
    */
  def destroy(): Unit = js.native
  /**
    * @example
    * atlas.removeFrame('1');
    * @param key - The key of the frame.
    */
  def removeFrame(key: String): Unit = js.native
  /**
    * @example
    * atlas.setFrame('1', {
    rect: new pc.Vec4(0, 0, 128, 128),
    pivot: new pc.Vec2(0.5, 0.5),
    border: new pc.Vec4(5, 5, 5, 5)
    });
    * @param key - The key of the frame.
    * @param data - The properties of the frame.
    * @param data.rect - The u, v, width, height properties of the frame in pixels.
    * @param data.pivot - The pivot of the frame - values are between 0-1.
    * @param data.border - The border of the frame for 9-slicing. Values are ordered
    as follows: left, bottom, right, top border in pixels.
    */
  def setFrame(key: String, data: Border): Unit = js.native
}

