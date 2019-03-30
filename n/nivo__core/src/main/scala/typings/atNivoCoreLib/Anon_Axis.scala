package typings
package atNivoCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Axis extends js.Object {
  var axis: stdLib.Partial[Anon_Domain]
  var background: java.lang.String
  var dots: stdLib.Partial[Anon_Text]
  var grid: stdLib.Partial[Anon_Line]
  var labels: stdLib.Partial[Anon_Text]
  var legends: stdLib.Partial[Anon_Text]
  var markers: stdLib.Partial[Anon_0]
  var tooltip: stdLib.Partial[Anon_Basic]
}

object Anon_Axis {
  @scala.inline
  def apply(
    axis: stdLib.Partial[Anon_Domain],
    background: java.lang.String,
    dots: stdLib.Partial[Anon_Text],
    grid: stdLib.Partial[Anon_Line],
    labels: stdLib.Partial[Anon_Text],
    legends: stdLib.Partial[Anon_Text],
    markers: stdLib.Partial[Anon_0],
    tooltip: stdLib.Partial[Anon_Basic]
  ): Anon_Axis = {
    val __obj = js.Dynamic.literal(axis = axis, background = background, dots = dots, grid = grid, labels = labels, legends = legends, markers = markers, tooltip = tooltip)
  
    __obj.asInstanceOf[Anon_Axis]
  }
}

