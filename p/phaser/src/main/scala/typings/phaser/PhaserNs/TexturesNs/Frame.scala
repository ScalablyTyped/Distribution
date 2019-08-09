package typings.phaser.PhaserNs.TexturesNs

import typings.phaser.integer
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Frame is a section of a Texture.
  */
@JSGlobal("Phaser.Textures.Frame")
@js.native
class Frame protected () extends js.Object {
  def this(
    texture: Texture,
    name: String,
    sourceIndex: integer,
    x: Double,
    y: Double,
    width: Double,
    height: Double
  ) = this()
  /**
    * 
    * @param texture The Texture this Frame is a part of.
    * @param name The name of this Frame. The name is unique within the Texture.
    * @param sourceIndex The index of the TextureSource that this Frame is a part of.
    * @param x The x coordinate of the top-left of this Frame.
    * @param y The y coordinate of the top-left of this Frame.
    * @param width The width of this Frame.
    * @param height The height of this Frame.
    */
  def this(
    texture: Texture,
    name: integer,
    sourceIndex: integer,
    x: Double,
    y: Double,
    width: Double,
    height: Double
  ) = this()
  /**
    * Over-rides the Renderer setting.
    * -1 = use Renderer Setting
    * 0 = No rounding
    * 1 = Round
    */
  var autoRound: integer = js.native
  /**
    * The Canvas drawImage data object.
    */
  val canvasData: js.Object = js.native
  /**
    * The x center of this frame, floored.
    */
  var centerX: integer = js.native
  /**
    * The y center of this frame, floored.
    */
  var centerY: integer = js.native
  /**
    * Any Frame specific custom data can be stored here.
    */
  var customData: js.Object = js.native
  /**
    * Does this Frame have a custom pivot point?
    */
  var customPivot: Boolean = js.native
  /**
    * The height of the area in the source image to cut.
    */
  var cutHeight: integer = js.native
  /**
    * The width of the area in the source image to cut.
    */
  var cutWidth: integer = js.native
  /**
    * X position within the source image to cut from.
    */
  var cutX: integer = js.native
  /**
    * Y position within the source image to cut from.
    */
  var cutY: integer = js.native
  /**
    * A reference to the Texture Source WebGL Texture that this Frame is using.
    */
  var glTexture: WebGLTexture = js.native
  /**
    * Half the height, floored.
    * Precalculated for the renderer.
    */
  var halfHeight: integer = js.native
  /**
    * Half the width, floored.
    * Precalculated for the renderer.
    */
  var halfWidth: integer = js.native
  /**
    * The rendering height of this Frame, taking trim into account.
    */
  var height: integer = js.native
  /**
    * The name of this Frame.
    * The name is unique within the Texture.
    */
  var name: String = js.native
  /**
    * The horizontal pivot point of this Frame.
    */
  var pivotX: Double = js.native
  /**
    * The vertical pivot point of this Frame.
    */
  var pivotY: Double = js.native
  /**
    * The radius of the Frame (derived from sqrt(w * w + h * h) / 2)
    */
  val radius: Double = js.native
  /**
    * The height of the Frame in its un-trimmed, un-padded state, as prepared in the art package,
    * before being packed.
    */
  val realHeight: Double = js.native
  /**
    * The width of the Frame in its un-trimmed, un-padded state, as prepared in the art package,
    * before being packed.
    */
  val realWidth: Double = js.native
  /**
    * **CURRENTLY UNSUPPORTED**
    * 
    * Is this frame is rotated or not in the Texture?
    * Rotation allows you to use rotated frames in texture atlas packing.
    * It has nothing to do with Sprite rotation.
    */
  var rotated: Boolean = js.native
  /**
    * The TextureSource this Frame is part of.
    */
  var source: TextureSource = js.native
  /**
    * The index of the TextureSource in the Texture sources array.
    */
  var sourceIndex: integer = js.native
  /**
    * The Texture this Frame is a part of.
    */
  var texture: Texture = js.native
  /**
    * Is the Frame trimmed or not?
    */
  val trimmed: Boolean = js.native
  /**
    * WebGL UV u0 value.
    */
  var u0: Double = js.native
  /**
    * WebGL UV u1 value.
    */
  var u1: Double = js.native
  /**
    * WebGL UV v0 value.
    */
  var v0: Double = js.native
  /**
    * WebGL UV v1 value.
    */
  var v1: Double = js.native
  /**
    * The rendering width of this Frame, taking trim into account.
    */
  var width: integer = js.native
  /**
    * The X rendering offset of this Frame, taking trim into account.
    */
  var x: integer = js.native
  /**
    * The Y rendering offset of this Frame, taking trim into account.
    */
  var y: integer = js.native
  /**
    * Destroys this Frame by nulling its reference to the parent Texture and and data objects.
    */
  def destroy(): Unit = js.native
  /**
    * Takes a crop data object and, based on the rectangular region given, calculates the
    * required UV coordinates in order to crop this Frame for WebGL and Canvas rendering.
    * 
    * This is called directly by the Game Object Texture Components `setCrop` method.
    * Please use that method to crop a Game Object.
    * @param crop The crop data object. This is the `GameObject._crop` property.
    * @param x The x coordinate to start the crop from. Cannot be negative or exceed the Frame width.
    * @param y The y coordinate to start the crop from. Cannot be negative or exceed the Frame height.
    * @param width The width of the crop rectangle. Cannot exceed the Frame width.
    * @param height The height of the crop rectangle. Cannot exceed the Frame height.
    * @param flipX Does the parent Game Object have flipX set?
    * @param flipY Does the parent Game Object have flipY set?
    */
  def setCropUVs(
    crop: js.Object,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    flipX: Boolean,
    flipY: Boolean
  ): js.Object = js.native
  /**
    * Sets the width, height, x and y of this Frame.
    * 
    * This is called automatically by the constructor
    * and should rarely be changed on-the-fly.
    * @param width The width of the frame before being trimmed.
    * @param height The height of the frame before being trimmed.
    * @param x The x coordinate of the top-left of this Frame. Default 0.
    * @param y The y coordinate of the top-left of this Frame. Default 0.
    */
  def setSize(width: integer, height: integer): Frame = js.native
  def setSize(width: integer, height: integer, x: integer): Frame = js.native
  def setSize(width: integer, height: integer, x: integer, y: integer): Frame = js.native
  /**
    * If the frame was trimmed when added to the Texture Atlas, this records the trim and source data.
    * @param actualWidth The width of the frame before being trimmed.
    * @param actualHeight The height of the frame before being trimmed.
    * @param destX The destination X position of the trimmed frame for display.
    * @param destY The destination Y position of the trimmed frame for display.
    * @param destWidth The destination width of the trimmed frame for display.
    * @param destHeight The destination height of the trimmed frame for display.
    */
  def setTrim(
    actualWidth: Double,
    actualHeight: Double,
    destX: Double,
    destY: Double,
    destWidth: Double,
    destHeight: Double
  ): Frame = js.native
  /**
    * Takes a crop data object and recalculates the UVs based on the dimensions inside the crop object.
    * Called automatically by `setFrame`.
    * @param crop The crop data object. This is the `GameObject._crop` property.
    * @param flipX Does the parent Game Object have flipX set?
    * @param flipY Does the parent Game Object have flipY set?
    */
  def updateCropUVs(crop: js.Object, flipX: Boolean, flipY: Boolean): js.Object = js.native
  /**
    * Updates the internal WebGL UV cache and the drawImage cache.
    */
  def updateUVs(): Frame = js.native
  /**
    * Updates the internal WebGL UV cache.
    */
  def updateUVsInverted(): Frame = js.native
}

