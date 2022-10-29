package typings.pixiMath

import typings.pixiMath.libConstMod.SHAPES.RECT
import typings.pixiMath.libMatrixMod.Matrix
import typings.pixiMath.mod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShapesRectangleMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.Rectangle * / any */ @JSImport("@pixi/math/lib/shapes/Rectangle", "Rectangle")
  @js.native
  open class Rectangle protected ()
    extends StObject
       with IShape {
    /**
      * @param x - The X coordinate of the upper-left corner of the rectangle
      * @param y - The Y coordinate of the upper-left corner of the rectangle
      * @param width - The overall width of the rectangle
      * @param height - The overall height of the rectangle
      */
    def this(
      x: js.UndefOr[String | Double],
      y: js.UndefOr[String | Double],
      width: js.UndefOr[String | Double],
      height: js.UndefOr[String | Double]
    ) = this()
    
    /** Returns the bottom edge of the rectangle. */
    def bottom: Double = js.native
    
    /**
      * Enlarges rectangle that way its corners lie on grid
      * @param resolution - resolution
      * @param eps - precision
      * @returns Returns itself.
      */
    def ceil(): this.type = js.native
    def ceil(resolution: Double): this.type = js.native
    def ceil(resolution: Double, eps: Double): this.type = js.native
    def ceil(resolution: Unit, eps: Double): this.type = js.native
    
    /**
      * Checks whether the x and y coordinates given are contained within this Rectangle
      * @param x - The X coordinate of the point to test
      * @param y - The Y coordinate of the point to test
      * @returns Whether the x/y coordinates are within this Rectangle
      */
    def contains(x: Double, y: Double): Boolean = js.native
    
    /**
      * Copies another rectangle to this one.
      * @param rectangle - The rectangle to copy from.
      * @returns Returns itself.
      */
    def copyFrom(rectangle: Rectangle): Rectangle = js.native
    
    /**
      * Copies this rectangle to another one.
      * @param rectangle - The rectangle to copy to.
      * @returns Returns given parameter.
      */
    def copyTo(rectangle: Rectangle): Rectangle = js.native
    
    /**
      * Enlarges this rectangle to include the passed rectangle.
      * @param rectangle - The rectangle to include.
      * @returns Returns itself.
      */
    def enlarge(rectangle: Rectangle): this.type = js.native
    
    /**
      * Fits this rectangle around the passed one.
      * @param rectangle - The rectangle to fit.
      * @returns Returns itself.
      */
    def fit(rectangle: Rectangle): this.type = js.native
    
    /** @default 0 */
    var height: Double = js.native
    
    /**
      * Determines whether the `other` Rectangle transformed by `transform` intersects with `this` Rectangle object.
      * Returns true only if the area of the intersection is >0, this means that Rectangles
      * sharing a side are not overlapping. Another side effect is that an arealess rectangle
      * (width or height equal to zero) can't intersect any other rectangle.
      * @param {Rectangle} other - The Rectangle to intersect with `this`.
      * @param {Matrix} transform - The transformation matrix of `other`.
      * @returns {boolean} A value of `true` if the transformed `other` Rectangle intersects with `this`; otherwise `false`.
      */
    def intersects(other: Rectangle): Boolean = js.native
    def intersects(other: Rectangle, transform: Matrix): Boolean = js.native
    
    /** Returns the left edge of the rectangle. */
    def left: Double = js.native
    
    /**
      * Pads the rectangle making it grow in all directions.
      * If paddingY is omitted, both paddingX and paddingY will be set to paddingX.
      * @param paddingX - The horizontal padding amount.
      * @param paddingY - The vertical padding amount.
      * @returns Returns itself.
      */
    def pad(): this.type = js.native
    def pad(paddingX: Double): this.type = js.native
    def pad(paddingX: Double, paddingY: Double): this.type = js.native
    def pad(paddingX: Unit, paddingY: Double): this.type = js.native
    
    /** Returns the right edge of the rectangle. */
    def right: Double = js.native
    
    /** Returns the top edge of the rectangle. */
    def top: Double = js.native
    
    /**
      * The type of the object, mainly used to avoid `instanceof` checks
      * @default PIXI.SHAPES.RECT
      * @see PIXI.SHAPES
      */
    val `type`: RECT = js.native
    
    /** @default 0 */
    var width: Double = js.native
    
    /** @default 0 */
    var x: Double = js.native
    
    /** @default 0 */
    var y: Double = js.native
  }
}
