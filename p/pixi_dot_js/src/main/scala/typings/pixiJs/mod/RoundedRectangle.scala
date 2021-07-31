package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Rounded Rectangle object is an area that has nice rounded corners, as indicated by its
  * top-left corner point (x, y) and by its width and its height and its radius.
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "RoundedRectangle")
@js.native
class RoundedRectangle ()
  extends StObject
     with typings.pixiJs.PIXI.RoundedRectangle {
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
    *
    * @param {number} x - The X coordinate of the point to test
    * @param {number} y - The Y coordinate of the point to test
    * @return {boolean} Whether the x/y coordinates are within this Rounded Rectangle
    */
  /* CompleteClass */
  override def contains(x: Double, y: Double): Boolean = js.native
  
  /**
    * @member {number} PIXI.RoundedRectangle#height
    * @default 0
    */
  /* CompleteClass */
  var height: Double = js.native
  
  /**
    * @member {number} PIXI.RoundedRectangle#radius
    * @default 20
    */
  /* CompleteClass */
  var radius: Double = js.native
  
  /**
    * The type of the object, mainly used to avoid `instanceof` checks
    *
    * @member {number} PIXI.RoundedRectangle#type
    * @readonly
    * @default PIXI.SHAPES.RREC
    * @see PIXI.SHAPES
    */
  /* CompleteClass */
  override val `type`: Double = js.native
  
  /**
    * @member {number} PIXI.RoundedRectangle#width
    * @default 0
    */
  /* CompleteClass */
  var width: Double = js.native
  
  /**
    * @member {number} PIXI.RoundedRectangle#x
    * @default 0
    */
  /* CompleteClass */
  var x: Double = js.native
  
  /**
    * @member {number} PIXI.RoundedRectangle#y
    * @default 0
    */
  /* CompleteClass */
  var y: Double = js.native
}
