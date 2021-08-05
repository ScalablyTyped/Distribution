package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generalized convenience utilities for Graphics.
  *
  * @namespace graphicsUtils
  * @memberof PIXI
  */
object graphicsUtils {
  
  /**
    * A structure to hold interim batch objects for Graphics.
    * @class
    * @memberof PIXI.graphicsUtils
    */
  @js.native
  trait BatchPart extends StObject {
    
    /**
      * Begin batch part
      *
      * @param {PIXI.FillStyle | PIXI.LineStyle} style
      * @param {number} startIndex
      * @param {number} attribStart
      */
    def begin(style: FillStyle, startIndex: Double, attribStart: Double): Unit = js.native
    def begin(style: LineStyle, startIndex: Double, attribStart: Double): Unit = js.native
    
    /**
      * End batch part
      *
      * @param {number} endIndex
      * @param {number} endAttrib
      */
    def end(endIndex: Double, endAttrib: Double): Unit = js.native
  }
  
  /**
    * Draw a star shape with an arbitrary number of points.
    *
    * @class
    * @extends PIXI.Polygon
    * @memberof PIXI.graphicsUtils
    * @param {number} x - Center X position of the star
    * @param {number} y - Center Y position of the star
    * @param {number} points - The number of points of the star, must be > 1
    * @param {number} radius - The outer radius of the star
    * @param {number} [innerRadius] - The inner radius between points, default half `radius`
    * @param {number} [rotation=0] - The rotation of the star in radians, where 0 is vertical
    * @return {PIXI.Graphics} This Graphics object. Good for chaining method calls
    */
  trait Star
    extends StObject
       with Polygon
  object Star {
    
    inline def apply(
      closeStroke: Boolean,
      contains: (Double, Double) => Boolean,
      points: js.Array[Double],
      `type`: Double
    ): Star = {
      val __obj = js.Dynamic.literal(closeStroke = closeStroke.asInstanceOf[js.Any], contains = js.Any.fromFunction2(contains), points = points.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Star]
    }
  }
}
