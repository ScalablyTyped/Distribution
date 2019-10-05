package typings.parse.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Parse.Polygon")
@js.native
class Polygon protected () extends BaseObject {
  def this(arg1: js.Array[js.Array[Double] | GeoPoint]) = this()
  def containsPoint(point: GeoPoint): Boolean = js.native
  def equals(other: js.Any): Boolean = js.native
  def equals(other: Polygon): Boolean = js.native
}

