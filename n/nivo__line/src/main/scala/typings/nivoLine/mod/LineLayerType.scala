package typings.nivoLine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nivoLine.nivoLineStrings.grid
  - typings.nivoLine.nivoLineStrings.markers
  - typings.nivoLine.nivoLineStrings.axes
  - typings.nivoLine.nivoLineStrings.areas
  - typings.nivoLine.nivoLineStrings.lines
  - typings.nivoLine.nivoLineStrings.slices
  - typings.nivoLine.nivoLineStrings.points
  - typings.nivoLine.nivoLineStrings.mesh
  - typings.nivoLine.nivoLineStrings.legends
*/
trait LineLayerType extends js.Object

object LineLayerType {
  @scala.inline
  def areas: typings.nivoLine.nivoLineStrings.areas = this.cast("areas")
  @scala.inline
  def axes: typings.nivoLine.nivoLineStrings.axes = this.cast("axes")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def grid: typings.nivoLine.nivoLineStrings.grid = this.cast("grid")
  @scala.inline
  def legends: typings.nivoLine.nivoLineStrings.legends = this.cast("legends")
  @scala.inline
  def lines: typings.nivoLine.nivoLineStrings.lines = this.cast("lines")
  @scala.inline
  def markers: typings.nivoLine.nivoLineStrings.markers = this.cast("markers")
  @scala.inline
  def mesh: typings.nivoLine.nivoLineStrings.mesh = this.cast("mesh")
  @scala.inline
  def points: typings.nivoLine.nivoLineStrings.points = this.cast("points")
  @scala.inline
  def slices: typings.nivoLine.nivoLineStrings.slices = this.cast("slices")
}

