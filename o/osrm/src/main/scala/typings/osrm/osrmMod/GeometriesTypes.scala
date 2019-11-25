package typings.osrm.osrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.osrm.osrmStrings.polyline
  - typings.osrm.osrmStrings.geojson
  - typings.osrm.osrmStrings.polyline6
*/
trait GeometriesTypes extends js.Object

object GeometriesTypes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def geojson: typings.osrm.osrmStrings.geojson = this.cast("geojson")
  @scala.inline
  def polyline: typings.osrm.osrmStrings.polyline = this.cast("polyline")
  @scala.inline
  def polyline6: typings.osrm.osrmStrings.polyline6 = this.cast("polyline6")
}

