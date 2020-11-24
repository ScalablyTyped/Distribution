package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A pc.TextureAtlas contains a number of frames from a texture. Each frame
  * defines a region in a texture. The pc.TextureAtlas is referenced by {@link pc.Sprite}s.
  * @example
  * var atlas = new pc.TextureAtlas();
  * atlas.frames = {
  *     '0': {
  *         // rect has u, v, width and height in pixels
  *         rect: new pc.Vec4(0, 0, 256, 256),
  *         // pivot has x, y values between 0-1 which define the point
  *         // within the frame around which rotation and scale is calculated
  *         pivot: new pc.Vec2(0.5, 0.5),
  *         // border has left, bottom, right and top in pixels defining regions for 9-slicing
  *         border: new pc.Vec4(5, 5, 5, 5)
  *     },
  *     '1': {
  *         rect: new pc.Vec4(256, 0, 256, 256),
  *         pivot: new pc.Vec2(0.5, 0.5),
  *         border: new pc.Vec4(5, 5, 5, 5)
  *     }
  * };
  * @property texture - The texture atlas.
  * @property frames - Contains frames which define portions of the texture atlas.
  */
@JSImport("playcanvas", "TextureAtlas")
@js.native
class TextureAtlas ()
  extends typings.playcanvas.pc.TextureAtlas
