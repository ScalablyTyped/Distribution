package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Circle object is used to help draw graphics and can also be used to specify a hit area for displayObjects.
  *
  * @class
  * @memberof PIXI
  */
trait Circle extends StObject {
  
  /**
    * Checks whether the x and y coordinates given are contained within this circle
    *
    * @param {number} x - The X coordinate of the point to test
    * @param {number} y - The Y coordinate of the point to test
    * @return {boolean} Whether the x/y coordinates are within this Circle
    */
  def contains(x: Double, y: Double): Boolean
  
  /**
    * Returns the framing rectangle of the circle as a Rectangle object
    *
    * @return {PIXI.Rectangle} the framing rectangle
    */
  def getBounds(): Rectangle
  
  /**
    * @member {number} PIXI.Circle#radius
    * @default 0
    */
  var radius: Double
  
  /**
    * The type of the object, mainly used to avoid `instanceof` checks
    *
    * @member {number} PIXI.Circle#type
    * @readOnly
    * @default PIXI.SHAPES.CIRC
    * @see PIXI.SHAPES
    */
  val `type`: Double
  
  /**
    * @member {number} PIXI.Circle#x
    * @default 0
    */
  var x: Double
  
  /**
    * @member {number} PIXI.Circle#y
    * @default 0
    */
  var y: Double
}
object Circle {
  
  @scala.inline
  def apply(
    contains: (Double, Double) => Boolean,
    getBounds: () => Rectangle,
    radius: Double,
    `type`: Double,
    x: Double,
    y: Double
  ): Circle = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2(contains), getBounds = js.Any.fromFunction0(getBounds), radius = radius.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Circle]
  }
  
  @scala.inline
  implicit class CircleMutableBuilder[Self <: Circle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContains(value: (Double, Double) => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetBounds(value: () => Rectangle): Self = StObject.set(x, "getBounds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
