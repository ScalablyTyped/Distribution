package typings.paper.paperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.PointText")
@js.native
class PointText protected () extends TextItem {
  /**
    * Creates a point text item from the properties described by an object literal.
    * @param object - an object literal containing properties describing the path's attributes
    */
  def this(`object`: js.Any) = this()
  /**
    * Creates a point text item
    * @param point - the position where the text will start
    */
  def this(point: Point) = this()
  /**
    * The PointText's anchor point
    */
  var point: Point = js.native
}

