package typings.atNivoCore

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Axis extends js.Object {
  var axis: Partial[Anon_Domain]
  var background: String
  var dots: Partial[Anon_Text]
  var grid: Partial[Anon_Line]
  var labels: Partial[Anon_Text]
  var legends: Partial[Anon_Text]
  var markers: Partial[Anon_0]
  var tooltip: Partial[Anon_Basic]
}

object Anon_Axis {
  @scala.inline
  def apply(
    axis: Partial[Anon_Domain],
    background: String,
    dots: Partial[Anon_Text],
    grid: Partial[Anon_Line],
    labels: Partial[Anon_Text],
    legends: Partial[Anon_Text],
    markers: Partial[Anon_0],
    tooltip: Partial[Anon_Basic]
  ): Anon_Axis = {
    val __obj = js.Dynamic.literal(axis = axis, background = background, dots = dots, grid = grid, labels = labels, legends = legends, markers = markers, tooltip = tooltip)
  
    __obj.asInstanceOf[Anon_Axis]
  }
}

