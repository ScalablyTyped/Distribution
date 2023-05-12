package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.Types.Math.Vector2Like
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Polygon Shape is a Game Object that can be added to a Scene, Group or Container. You can
  * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
  * it for input or physics. It provides a quick and easy way for you to render this shape in your
  * game without using a texture, while still taking advantage of being fully batched in WebGL.
  * 
  * This shape supports both fill and stroke colors.
  * 
  * The Polygon Shape is created by providing a list of points, which are then used to create an
  * internal Polygon geometry object. The points can be set from a variety of formats:
  * 
  * - A string containing paired values separated by a single space: `'40 0 40 20 100 20 100 80 40 80 40 100 0 50'`
  * - An array of Point or Vector2 objects: `[new Phaser.Math.Vector2(x1, y1), ...]`
  * - An array of objects with public x/y properties: `[obj1, obj2, ...]`
  * - An array of paired numbers that represent point coordinates: `[x1,y1, x2,y2, ...]`
  * - An array of arrays with two elements representing x/y coordinates: `[[x1, y1], [x2, y2], ...]`
  * 
  * By default the `x` and `y` coordinates of this Shape refer to the center of it. However, depending
  * on the coordinates of the points provided, the final shape may be rendered offset from its origin.
  */
@js.native
trait Polygon
  extends StObject
     with Shape {
  
  /**
    * Sets this Polygon to the given points.
    * 
    * The points can be set from a variety of formats:
    * 
    * - A string containing paired values separated by a single space: `'40 0 40 20 100 20 100 80 40 80 40 100 0 50'`
    * - An array of Point objects: `[new Phaser.Point(x1, y1), ...]`
    * - An array of objects with public x/y properties: `[obj1, obj2, ...]`
    * - An array of paired numbers that represent point coordinates: `[x1,y1, x2,y2, ...]`
    * - An array of arrays with two elements representing x/y coordinates: `[[x1, y1], [x2, y2], ...]`
    * 
    * Calling this method will reset the size (width, height) and display origin of this Shape.
    * 
    * It also runs both GetAABB and EarCut on the given points, so please be careful not to do this
    * at a high frequency, or with too many points.
    * @param points Points defining the perimeter of this polygon. Please check function description above for the different supported formats.
    */
  def setTo(): this.type = js.native
  def setTo(points: String): this.type = js.native
  def setTo(points: js.Array[Double | Vector2Like]): this.type = js.native
  
  /**
    * Smooths the polygon over the number of iterations specified.
    * The base polygon data will be updated and replaced with the smoothed values.
    * This call can be chained.
    * @param iterations The number of times to apply the polygon smoothing. Default 1.
    */
  def smooth(): this.type = js.native
  def smooth(iterations: Double): this.type = js.native
}
