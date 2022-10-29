package typings.pixiMath

import typings.pixiMath.libConstMod.SHAPES.RREC
import typings.pixiMath.mod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShapesRoundedRectangleMod {
  
  @JSImport("@pixi/math/lib/shapes/RoundedRectangle", "RoundedRectangle")
  @js.native
  /**
    * @param x - The X coordinate of the upper-left corner of the rounded rectangle
    * @param y - The Y coordinate of the upper-left corner of the rounded rectangle
    * @param width - The overall width of this rounded rectangle
    * @param height - The overall height of this rounded rectangle
    * @param radius - Controls the radius of the rounded corners
    */
  open class RoundedRectangle ()
    extends StObject
       with IShape {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, width: Double) = this()
    def this(x: Double, y: Unit, width: Double) = this()
    def this(x: Unit, y: Double, width: Double) = this()
    def this(x: Unit, y: Unit, width: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Double) = this()
    def this(x: Double, y: Double, width: Unit, height: Double) = this()
    def this(x: Double, y: Unit, width: Double, height: Double) = this()
    def this(x: Double, y: Unit, width: Unit, height: Double) = this()
    def this(x: Unit, y: Double, width: Double, height: Double) = this()
    def this(x: Unit, y: Double, width: Unit, height: Double) = this()
    def this(x: Unit, y: Unit, width: Double, height: Double) = this()
    def this(x: Unit, y: Unit, width: Unit, height: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Double, radius: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Unit, radius: Double) = this()
    def this(x: Double, y: Double, width: Unit, height: Double, radius: Double) = this()
    def this(x: Double, y: Double, width: Unit, height: Unit, radius: Double) = this()
    def this(x: Double, y: Unit, width: Double, height: Double, radius: Double) = this()
    def this(x: Double, y: Unit, width: Double, height: Unit, radius: Double) = this()
    def this(x: Double, y: Unit, width: Unit, height: Double, radius: Double) = this()
    def this(x: Double, y: Unit, width: Unit, height: Unit, radius: Double) = this()
    def this(x: Unit, y: Double, width: Double, height: Double, radius: Double) = this()
    def this(x: Unit, y: Double, width: Double, height: Unit, radius: Double) = this()
    def this(x: Unit, y: Double, width: Unit, height: Double, radius: Double) = this()
    def this(x: Unit, y: Double, width: Unit, height: Unit, radius: Double) = this()
    def this(x: Unit, y: Unit, width: Double, height: Double, radius: Double) = this()
    def this(x: Unit, y: Unit, width: Double, height: Unit, radius: Double) = this()
    def this(x: Unit, y: Unit, width: Unit, height: Double, radius: Double) = this()
    def this(x: Unit, y: Unit, width: Unit, height: Unit, radius: Double) = this()
    
    /**
      * Checks whether the x and y coordinates given are contained within this Rounded Rectangle
      * @param x - The X coordinate of the point to test.
      * @param y - The Y coordinate of the point to test.
      * @returns - Whether the x/y coordinates are within this Rounded Rectangle.
      */
    def contains(x: Double, y: Double): Boolean = js.native
    
    /** @default 0 */
    var height: Double = js.native
    
    /** @default 20 */
    var radius: Double = js.native
    
    /**
      * The type of the object, mainly used to avoid `instanceof` checks
      * @default PIXI.SHAPES.RREC
      * @see PIXI.SHAPES
      */
    val `type`: RREC = js.native
    
    /** @default 0 */
    var width: Double = js.native
    
    /** @default 0 */
    var x: Double = js.native
    
    /** @default 0 */
    var y: Double = js.native
  }
}
