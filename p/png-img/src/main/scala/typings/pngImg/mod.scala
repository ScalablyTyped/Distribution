package typings.pngImg

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Lite self-contained png image processing library for macOS and Linux.
    */
  @JSImport("png-img", JSImport.Namespace)
  @js.native
  class ^ protected () extends PngImg {
    /**
      * Create PngImg object from passed buffer with image
      */
    def this(buffer: Buffer) = this()
  }
  
  @js.native
  trait Color extends StObject {
    
    var a: Double = js.native
    
    var b: Double = js.native
    
    var g: Double = js.native
    
    var r: Double = js.native
  }
  object Color {
    
    @scala.inline
    def apply(a: Double, b: Double, g: Double, r: Double): Color = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Lite self-contained png image processing library for macOS and Linux.
    */
  @js.native
  trait PngImg extends StObject {
    
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
  
  type SaveCallback = js.Function1[/* error */ String, Unit]
  
  @js.native
  trait Size extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Size {
    
    @scala.inline
    def apply(height: Double, width: Double): Size = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
