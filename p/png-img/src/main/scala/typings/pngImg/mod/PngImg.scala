package typings.pngImg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lite self-contained png image processing library for macOS and Linux.
  */
@js.native
trait PngImg extends js.Object {
  
  /**
    * Crop image. Modifies current image.
    * Throws if new image is not inside the current image.
    */
  def crop(offsetX: Double, offsetY: Double, width: Double, height: Double): this.type = js.native
  
  def fill(x: Double, y: Double, width: Double, height: Double, color: String): this.type = js.native
  /**
    * Fill region with passed color. Modifies current image.
    * @param x x coordinate (left to right)
    * @param y y coordinate (top to bottom)
    * @param color color as rgb object or as a '#XXXXXX' string
    */
  def fill(x: Double, y: Double, width: Double, height: Double, color: Color): this.type = js.native
  
  /**
    * Get pixel color and alpha.
    * @param x x coordinate (left to right)
    * @param y y coordinate (top to bottom)
    */
  def get(x: Double, y: Double): Color = js.native
  
  /**
    * Inserts image into specified place.
    * @param img image to insert
    *
    */
  def insert(img: PngImg, offsetX: Double, offsetY: Double): this.type = js.native
  
  /**
    * Rotates image 90 degress counterclockwise
    */
  def rotateLeft(): this.type = js.native
  
  /**
    * Rotates image 90 degrees clockwise
    */
  def rotateRight(): this.type = js.native
  
  /**
    * Save image to file. Asynchronous operation.
    * @param file - path to file to save image
    * @param callback - will be called after save operation finish or on error
    */
  def save(file: String, callback: SaveCallback): Unit = js.native
  
  def set(x: Double, y: Double, color: String): this.type = js.native
  /**
    * Set pixel color
    * Same as fill(x, y, 1, 1, color)
    * (shorthand)
    * @param x x coordinate (left to right)
    * @param y y coordinate (top to bottom)
    * @param color color as rgb object or as a '#XXXXXX' string
    */
  def set(x: Double, y: Double, color: Color): this.type = js.native
  
  /**
    * Sets new image size. Modifies current image.
    * If new size is less or equal than current size, than crop will be performed.
    */
  def setSize(width: Double, height: Double): this.type = js.native
  
  /**
    * Get image size as an object.
    */
  def size(): Size = js.native
}
