package typings
package parseLib.ParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Parse.Polygon")
@js.native
class Polygon protected () extends BaseObject {
  def this(arg1: js.Array[js.Array[scala.Double] | GeoPoint]) = this()
  def containsPoint(point: GeoPoint): scala.Boolean = js.native
  def equals(other: js.Any): scala.Boolean = js.native
  def equals(other: Polygon): scala.Boolean = js.native
}

