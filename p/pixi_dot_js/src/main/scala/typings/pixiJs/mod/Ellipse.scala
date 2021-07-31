package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Ellipse object is used to help draw graphics and can also be used to specify a hit area for displayObjects.
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "Ellipse")
@js.native
class Ellipse ()
  extends StObject
     with typings.pixiJs.PIXI.Ellipse {
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
    *
    * @param {number} x - The X coordinate of the point to test
    * @param {number} y - The Y coordinate of the point to test
    * @return {boolean} Whether the x/y coords are within this ellipse
    */
  /* CompleteClass */
  override def contains(x: Double, y: Double): Boolean = js.native
  
  /**
    * Returns the framing rectangle of the ellipse as a Rectangle object
    *
    * @return {PIXI.Rectangle} the framing rectangle
    */
  /* CompleteClass */
  override def getBounds(): typings.pixiJs.PIXI.Rectangle = js.native
  
  /**
    * @member {number} PIXI.Ellipse#height
    * @default 0
    */
  /* CompleteClass */
  var height: Double = js.native
  
  /**
    * The type of the object, mainly used to avoid `instanceof` checks
    *
    * @member {number} PIXI.Ellipse#type
    * @readOnly
    * @default PIXI.SHAPES.ELIP
    * @see PIXI.SHAPES
    */
  /* CompleteClass */
  override val `type`: Double = js.native
  
  /**
    * @member {number} PIXI.Ellipse#width
    * @default 0
    */
  /* CompleteClass */
  var width: Double = js.native
  
  /**
    * @member {number} PIXI.Ellipse#x
    * @default 0
    */
  /* CompleteClass */
  var x: Double = js.native
  
  /**
    * @member {number} PIXI.Ellipse#y
    * @default 0
    */
  /* CompleteClass */
  var y: Double = js.native
}
