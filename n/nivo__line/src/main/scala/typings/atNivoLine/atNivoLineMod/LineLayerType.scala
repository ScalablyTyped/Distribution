package typings.atNivoLine.atNivoLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atNivoLine.atNivoLineStrings.grid
  - typings.atNivoLine.atNivoLineStrings.markers
  - typings.atNivoLine.atNivoLineStrings.axes
  - typings.atNivoLine.atNivoLineStrings.areas
  - typings.atNivoLine.atNivoLineStrings.lines
  - typings.atNivoLine.atNivoLineStrings.slices
  - typings.atNivoLine.atNivoLineStrings.points
  - typings.atNivoLine.atNivoLineStrings.mesh
  - typings.atNivoLine.atNivoLineStrings.legends
*/
trait LineLayerType extends js.Object

object LineLayerType {
  @scala.inline
  def areas: typings.atNivoLine.atNivoLineStrings.areas = this.cast("areas")
  @scala.inline
  def axes: typings.atNivoLine.atNivoLineStrings.axes = this.cast("axes")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def grid: typings.atNivoLine.atNivoLineStrings.grid = this.cast("grid")
  @scala.inline
  def legends: typings.atNivoLine.atNivoLineStrings.legends = this.cast("legends")
  @scala.inline
  def lines: typings.atNivoLine.atNivoLineStrings.lines = this.cast("lines")
  @scala.inline
  def markers: typings.atNivoLine.atNivoLineStrings.markers = this.cast("markers")
  @scala.inline
  def mesh: typings.atNivoLine.atNivoLineStrings.mesh = this.cast("mesh")
  @scala.inline
  def points: typings.atNivoLine.atNivoLineStrings.points = this.cast("points")
  @scala.inline
  def slices: typings.atNivoLine.atNivoLineStrings.slices = this.cast("slices")
}

