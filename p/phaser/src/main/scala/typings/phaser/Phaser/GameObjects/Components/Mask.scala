package typings.phaser.Phaser.GameObjects.Components

import typings.phaser.Phaser.Display.Masks.BitmapMask
import typings.phaser.Phaser.Display.Masks.GeometryMask
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.GameObjects.Graphics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for getting and setting the mask of a Game Object.
  */
@js.native
trait Mask extends js.Object {
  /**
    * The Mask this Game Object is using during render.
    */
  var mask: BitmapMask | GeometryMask = js.native
  /**
    * Clears the mask that this Game Object was using.
    * @param destroyMask Destroy the mask before clearing it? Default false.
    */
  def clearMask(): this.type = js.native
  def clearMask(destroyMask: Boolean): this.type = js.native
  /**
    * Creates and returns a Bitmap Mask. This mask can be used by any Game Object,
    * including this one.
    * 
    * To create the mask you need to pass in a reference to a renderable Game Object.
    * A renderable Game Object is one that uses a texture to render with, such as an
    * Image, Sprite, Render Texture or BitmapText.
    * 
    * If you do not provide a renderable object, and this Game Object has a texture,
    * it will use itself as the object. This means you can call this method to create
    * a Bitmap Mask from any renderable Game Object.
    * @param renderable A renderable Game Object that uses a texture, such as a Sprite.
    */
  def createBitmapMask(): BitmapMask = js.native
  def createBitmapMask(renderable: GameObject): BitmapMask = js.native
  /**
    * Creates and returns a Geometry Mask. This mask can be used by any Game Object,
    * including this one.
    * 
    * To create the mask you need to pass in a reference to a Graphics Game Object.
    * 
    * If you do not provide a graphics object, and this Game Object is an instance
    * of a Graphics object, then it will use itself to create the mask.
    * 
    * This means you can call this method to create a Geometry Mask from any Graphics Game Object.
    * @param graphics A Graphics Game Object. The geometry within it will be used as the mask.
    */
  def createGeometryMask(): GeometryMask = js.native
  def createGeometryMask(graphics: Graphics): GeometryMask = js.native
  /**
    * Sets the mask that this Game Object will use to render with.
    * 
    * The mask must have been previously created and can be either a GeometryMask or a BitmapMask.
    * Note: Bitmap Masks only work on WebGL. Geometry Masks work on both WebGL and Canvas.
    * 
    * If a mask is already set on this Game Object it will be immediately replaced.
    * 
    * Masks are positioned in global space and are not relative to the Game Object to which they
    * are applied. The reason for this is that multiple Game Objects can all share the same mask.
    * 
    * Masks have no impact on physics or input detection. They are purely a rendering component
    * that allows you to limit what is visible during the render pass.
    * @param mask The mask this Game Object will use when rendering.
    */
  def setMask(mask: BitmapMask): this.type = js.native
  def setMask(mask: GeometryMask): this.type = js.native
}

