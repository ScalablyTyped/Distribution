package typings
package phaserLib.PhaserNs.GameObjectsNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for getting and setting the texture of a Game Object.
  */
@js.native
trait TextureCrop extends js.Object {
  /**
    * The Texture Frame this Game Object is using to render with.
    */
  var frame: phaserLib.PhaserNs.TexturesNs.Frame = js.native
  /**
    * A boolean flag indicating if this Game Object is being cropped or not.
    * You can toggle this at any time after `setCrop` has been called, to turn cropping on or off.
    * Equally, calling `setCrop` with no arguments will reset the crop and disable it.
    */
  var isCropped: scala.Boolean = js.native
  /**
    * The Texture this Game Object is using to render with.
    */
  var texture: phaserLib.PhaserNs.TexturesNs.Texture | phaserLib.PhaserNs.TexturesNs.CanvasTexture = js.native
  /**
    * Applies a crop to a texture based Game Object, such as a Sprite or Image.
    * 
    * The crop is a rectangle that limits the area of the texture frame that is visible during rendering.
    * 
    * Cropping a Game Object does not change its size, dimensions, physics body or hit area, it just
    * changes what is shown when rendered.
    * 
    * The crop coordinates are relative to the texture frame, not the Game Object, meaning 0 x 0 is the top-left.
    * 
    * Therefore, if you had a Game Object that had an 800x600 sized texture, and you wanted to show only the left
    * half of it, you could call `setCrop(0, 0, 400, 600)`.
    * 
    * It is also scaled to match the Game Object scale automatically. Therefore a crop rect of 100x50 would crop
    * an area of 200x100 when applied to a Game Object that had a scale factor of 2.
    * 
    * You can either pass in numeric values directly, or you can provide a single Rectangle object as the first argument.
    * 
    * Call this method with no arguments at all to reset the crop, or toggle the property `isCropped` to `false`.
    * 
    * You should do this if the crop rectangle becomes the same size as the frame itself, as it will allow
    * the renderer to skip several internal calculations.
    * @param x The x coordinate to start the crop from. Or a Phaser.Geom.Rectangle object, in which case the rest of the arguments are ignored.
    * @param y The y coordinate to start the crop from.
    * @param width The width of the crop rectangle in pixels.
    * @param height The height of the crop rectangle in pixels.
    */
  def setCrop(): this.type = js.native
  def setCrop(x: phaserLib.PhaserNs.GeomNs.Rectangle): this.type = js.native
  def setCrop(x: phaserLib.PhaserNs.GeomNs.Rectangle, y: scala.Double): this.type = js.native
  def setCrop(x: phaserLib.PhaserNs.GeomNs.Rectangle, y: scala.Double, width: scala.Double): this.type = js.native
  def setCrop(x: phaserLib.PhaserNs.GeomNs.Rectangle, y: scala.Double, width: scala.Double, height: scala.Double): this.type = js.native
  def setCrop(x: scala.Double): this.type = js.native
  def setCrop(x: scala.Double, y: scala.Double): this.type = js.native
  def setCrop(x: scala.Double, y: scala.Double, width: scala.Double): this.type = js.native
  def setCrop(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): this.type = js.native
  /**
    * Sets the frame this Game Object will use to render with.
    * 
    * The Frame has to belong to the current Texture being used.
    * 
    * It can be either a string or an index.
    * 
    * Calling `setFrame` will modify the `width` and `height` properties of your Game Object.
    * It will also change the `origin` if the Frame has a custom pivot point, as exported from packages like Texture Packer.
    * @param frame The name or index of the frame within the Texture.
    * @param updateSize Should this call adjust the size of the Game Object? Default true.
    * @param updateOrigin Should this call adjust the origin of the Game Object? Default true.
    */
  def setFrame(frame: java.lang.String): this.type = js.native
  def setFrame(frame: java.lang.String, updateSize: scala.Boolean): this.type = js.native
  def setFrame(frame: java.lang.String, updateSize: scala.Boolean, updateOrigin: scala.Boolean): this.type = js.native
  def setFrame(frame: phaserLib.integer): this.type = js.native
  def setFrame(frame: phaserLib.integer, updateSize: scala.Boolean): this.type = js.native
  def setFrame(frame: phaserLib.integer, updateSize: scala.Boolean, updateOrigin: scala.Boolean): this.type = js.native
  /**
    * Sets the texture and frame this Game Object will use to render with.
    * 
    * Textures are referenced by their string-based keys, as stored in the Texture Manager.
    * @param key The key of the texture to be used, as stored in the Texture Manager.
    * @param frame The name or index of the frame within the Texture.
    */
  def setTexture(key: java.lang.String): this.type = js.native
  def setTexture(key: java.lang.String, frame: java.lang.String): this.type = js.native
  def setTexture(key: java.lang.String, frame: phaserLib.integer): this.type = js.native
}

