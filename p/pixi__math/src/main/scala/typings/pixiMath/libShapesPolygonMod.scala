package typings.pixiMath

import typings.pixiMath.libConstMod.SHAPES.POLY
import typings.pixiMath.libIpointdataMod.IPointData
import typings.pixiMath.mod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShapesPolygonMod {
  
  @JSImport("@pixi/math/lib/shapes/Polygon", "Polygon")
  @js.native
  open class Polygon protected ()
    extends StObject
       with IShape {
    def this(points: js.Array[Double | IPointData]) = this()
    
    /** `false` after moveTo, `true` after `closePath`. In all other cases it is `true`. */
    var closeStroke: Boolean = js.native
    
    /**
      * Checks whether the x and y coordinates passed to this function are contained within this polygon.
      * @param x - The X coordinate of the point to test.
      * @param y - The Y coordinate of the point to test.
      * @returns - Whether the x/y coordinates are within this polygon.
      */
    def contains(x: Double, y: Double): Boolean = js.native
    
    /** An array of the points of this polygon. */
    var points: js.Array[Double] = js.native
    
    /**
      * The type of the object, mainly used to avoid `instanceof` checks
      * @default PIXI.SHAPES.POLY
      * @see PIXI.SHAPES
      */
    val `type`: POLY = js.native
  }
}
