package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Rectangle object is an area defined by its position, as indicated by its top-left corner
  * point (x, y) and by its width and its height.
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "Rectangle")
@js.native
class Rectangle ()
  extends StObject
     with typings.pixiJs.PIXI.Rectangle {
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
}
object Rectangle {
  
  @JSImport("pixi.js", "Rectangle")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A constant empty rectangle.
    *
    * @static
    * @constant
    * @member {PIXI.Rectangle}
    * @return {PIXI.Rectangle} An empty rectangle
    */
  /* static member */
  @JSImport("pixi.js", "Rectangle.EMPTY")
  @js.native
  def EMPTY: typings.pixiJs.PIXI.Rectangle = js.native
  @scala.inline
  def EMPTY_=(x: typings.pixiJs.PIXI.Rectangle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY")(x.asInstanceOf[js.Any])
}
