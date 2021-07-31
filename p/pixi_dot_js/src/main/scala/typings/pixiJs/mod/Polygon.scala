package typings.pixiJs.mod

import typings.pixiJs.PIXI.IPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A class to define a shape via user defined co-orinates.
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "Polygon")
@js.native
class Polygon protected ()
  extends StObject
     with typings.pixiJs.PIXI.Polygon {
  def this(points: (js.Array[Double | IPoint])*) = this()
  
  /**
    * `false` after moveTo, `true` after `closePath`. In all other cases it is `true`.
    * @member {boolean} PIXI.Polygon#closeStroke
    * @default true
    */
  /* CompleteClass */
  var closeStroke: Boolean = js.native
  
  /**
    * Checks whether the x and y coordinates passed to this function are contained within this polygon
    *
    * @param {number} x - The X coordinate of the point to test
    * @param {number} y - The Y coordinate of the point to test
    * @return {boolean} Whether the x/y coordinates are within this polygon
    */
  /* CompleteClass */
  override def contains(x: Double, y: Double): Boolean = js.native
  
  /**
    * An array of the points of this polygon
    *
    * @member {number[]} PIXI.Polygon#points
    */
  /* CompleteClass */
  var points: js.Array[Double] = js.native
  
  /**
    * The type of the object, mainly used to avoid `instanceof` checks
    *
    * @member {number} PIXI.Polygon#type
    * @readOnly
    * @default PIXI.SHAPES.POLY
    * @see PIXI.SHAPES
    */
  /* CompleteClass */
  override val `type`: Double = js.native
}
