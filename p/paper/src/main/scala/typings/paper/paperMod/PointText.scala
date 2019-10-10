package typings.paper.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * A PointText item represents a piece of typography in your Paper.js
  * project which starts from a certain point and extends by the amount of
  * characters contained in it.
  */
@JSImport("paper", "PointText")
@js.native
class PointText protected ()
  extends typings.paper.paper.PointText {
  /** 
    * Creates a point text item from the properties described by an object
    * literal.
    * 
    * @param object - an object containing properties describing the
    *     path's attributes
    */
  def this(`object`: js.Object) = this()
  /** 
    * Creates a point text item
    * 
    * @param point - the position where the text will start
    */
  def this(point: typings.paper.paper.Point) = this()
}

