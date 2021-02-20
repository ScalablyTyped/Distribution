package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Rounded Rectangle object is an area that has nice rounded corners, as indicated by its
  * top-left corner point (x, y) and by its width and its height and its radius.
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait RoundedRectangle extends StObject {
  
  /**
    * Checks whether the x and y coordinates given are contained within this Rounded Rectangle
    *
    * @param {number} x - The X coordinate of the point to test
    * @param {number} y - The Y coordinate of the point to test
    * @return {boolean} Whether the x/y coordinates are within this Rounded Rectangle
    */
  def contains(x: Double, y: Double): Boolean = js.native
  
  /**
    * @member {number} PIXI.RoundedRectangle#height
    * @default 0
    */
  var height: Double = js.native
  
  /**
    * @member {number} PIXI.RoundedRectangle#radius
    * @default 20
    */
  var radius: Double = js.native
  
  /**
    * The type of the object, mainly used to avoid `instanceof` checks
    *
    * @member {number} PIXI.RoundedRectangle#type
    * @readonly
    * @default PIXI.SHAPES.RREC
    * @see PIXI.SHAPES
    */
  val `type`: Double = js.native
  
  /**
    * @member {number} PIXI.RoundedRectangle#width
    * @default 0
    */
  var width: Double = js.native
  
  /**
    * @member {number} PIXI.RoundedRectangle#x
    * @default 0
    */
  var x: Double = js.native
  
  /**
    * @member {number} PIXI.RoundedRectangle#y
    * @default 0
    */
  var y: Double = js.native
}
object RoundedRectangle {
  
  @scala.inline
  def apply(
    contains: (Double, Double) => Boolean,
    height: Double,
    radius: Double,
    `type`: Double,
    width: Double,
    x: Double,
    y: Double
  ): RoundedRectangle = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2(contains), height = height.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoundedRectangle]
  }
  
  @scala.inline
  implicit class RoundedRectangleMutableBuilder[Self <: RoundedRectangle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContains(value: (Double, Double) => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
