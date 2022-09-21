package typings.pngImg

import typings.node.bufferMod.global.Buffer
import typings.pngImg.typesMod.Color
import typings.pngImg.typesMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("png-img", "PngImg")
  @js.native
  open class PngImg protected () extends StObject {
    /**
      * Create PngImg object from passed buffer with image
      */
    def this(rawImg: Buffer) = this()
    
    /**
      * Crop image. Modifies current image.
      * Throws if new image is not inside the current image.
      * @param offsetX offset from left side of the image
      * @param offsetY offset from top side of the image
      */
    def crop(offsetX: Double, offsetY: Double, width: Double, height: Double): this.type = js.native
    
    def fill(offsetX: Double, offsetY: Double, width: Double, height: Double, color: String): this.type = js.native
    /**
      * Fill region with passed color. Modifies current image.
      * @param offsetX offset from left side of the image
      * @param offsetY offset from top side of the image
      * @param x x coordinate (left to right)
      * @param y y coordinate (top to bottom)
      * @param color color as rgb object or as a '#XXXXXX' string
      */
    def fill(offsetX: Double, offsetY: Double, width: Double, height: Double, color: Color): this.type = js.native
    
    /**
      * Get pixel color and alpha.
      * @param x x coordinate (left to right)
      * @param y y coordinate (top to bottom)
      */
    def get(x: Double, y: Double): Color = js.native
    
    /* private */ var img_ : Any = js.native
    
    /**
      * Inserts image into specified place.
      * @param img image to insert
      * @param offsetX offset from left side of the image
      * @param offsetY offset from top side of the image
      */
    def insert(img: PngImg, offsetX: Double, offsetY: Double): this.type = js.native
    
    /**
      * Rotates image 90 degrees counterclockwise
      */
    def rotateLeft(): this.type = js.native
    
    /**
      * Rotates image 90 degrees clockwise
      */
    def rotateRight(): this.type = js.native
    
    /**
      * Save image to file
      */
    def save(file: String): js.Promise[Unit] = js.native
    
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
      * If new size is less or equal than current size, then crop will be performed.
      */
    def setSize(width: Double, height: Double): this.type = js.native
    
    /**
      * Get image size as an object.
      */
    def size(): Size = js.native
  }
}
