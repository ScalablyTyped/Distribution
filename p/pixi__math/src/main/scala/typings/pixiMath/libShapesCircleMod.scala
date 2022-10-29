package typings.pixiMath

import typings.pixiMath.libConstMod.SHAPES.CIRC
import typings.pixiMath.libShapesRectangleMod.Rectangle
import typings.pixiMath.mod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShapesCircleMod {
  
  @JSImport("@pixi/math/lib/shapes/Circle", "Circle")
  @js.native
  /**
    * @param x - The X coordinate of the center of this circle
    * @param y - The Y coordinate of the center of this circle
    * @param radius - The radius of the circle
    */
  open class Circle ()
    extends StObject
       with IShape {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, radius: Double) = this()
    def this(x: Double, y: Unit, radius: Double) = this()
    def this(x: Unit, y: Double, radius: Double) = this()
    def this(x: Unit, y: Unit, radius: Double) = this()
    
    /**
      * Checks whether the x and y coordinates given are contained within this circle
      * @param x - The X coordinate of the point to test
      * @param y - The Y coordinate of the point to test
      * @returns Whether the x/y coordinates are within this Circle
      */
    def contains(x: Double, y: Double): Boolean = js.native
    
    /**
      * Returns the framing rectangle of the circle as a Rectangle object
      * @returns The framing rectangle
      */
    def getBounds(): Rectangle = js.native
    
    /** @default 0 */
    var radius: Double = js.native
    
    /**
      * The type of the object, mainly used to avoid `instanceof` checks
      * @default PIXI.SHAPES.CIRC
      * @see PIXI.SHAPES
      */
    val `type`: CIRC = js.native
    
    /** @default 0 */
    var x: Double = js.native
    
    /** @default 0 */
    var y: Double = js.native
  }
}
