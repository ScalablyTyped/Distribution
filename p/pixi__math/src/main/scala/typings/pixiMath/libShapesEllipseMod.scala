package typings.pixiMath

import typings.pixiMath.libConstMod.SHAPES.ELIP
import typings.pixiMath.libShapesRectangleMod.Rectangle
import typings.pixiMath.mod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShapesEllipseMod {
  
  @JSImport("@pixi/math/lib/shapes/Ellipse", "Ellipse")
  @js.native
  /**
    * @param x - The X coordinate of the center of this ellipse
    * @param y - The Y coordinate of the center of this ellipse
    * @param halfWidth - The half width of this ellipse
    * @param halfHeight - The half height of this ellipse
    */
  open class Ellipse ()
    extends StObject
       with IShape {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, halfWidth: Double) = this()
    def this(x: Double, y: Unit, halfWidth: Double) = this()
    def this(x: Unit, y: Double, halfWidth: Double) = this()
    def this(x: Unit, y: Unit, halfWidth: Double) = this()
    def this(x: Double, y: Double, halfWidth: Double, halfHeight: Double) = this()
    def this(x: Double, y: Double, halfWidth: Unit, halfHeight: Double) = this()
    def this(x: Double, y: Unit, halfWidth: Double, halfHeight: Double) = this()
    def this(x: Double, y: Unit, halfWidth: Unit, halfHeight: Double) = this()
    def this(x: Unit, y: Double, halfWidth: Double, halfHeight: Double) = this()
    def this(x: Unit, y: Double, halfWidth: Unit, halfHeight: Double) = this()
    def this(x: Unit, y: Unit, halfWidth: Double, halfHeight: Double) = this()
    def this(x: Unit, y: Unit, halfWidth: Unit, halfHeight: Double) = this()
    
    /**
      * Checks whether the x and y coordinates given are contained within this ellipse
      * @param x - The X coordinate of the point to test
      * @param y - The Y coordinate of the point to test
      * @returns Whether the x/y coords are within this ellipse
      */
    def contains(x: Double, y: Double): Boolean = js.native
    
    /**
      * Returns the framing rectangle of the ellipse as a Rectangle object
      * @returns The framing rectangle
      */
    def getBounds(): Rectangle = js.native
    
    /** @default 0 */
    var height: Double = js.native
    
    /**
      * The type of the object, mainly used to avoid `instanceof` checks
      * @default PIXI.SHAPES.ELIP
      * @see PIXI.SHAPES
      */
    val `type`: ELIP = js.native
    
    /** @default 0 */
    var width: Double = js.native
    
    /** @default 0 */
    var x: Double = js.native
    
    /** @default 0 */
    var y: Double = js.native
  }
}
