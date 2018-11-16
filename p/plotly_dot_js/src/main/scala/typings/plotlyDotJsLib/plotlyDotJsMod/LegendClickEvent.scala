package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LegendClickEvent extends js.Object {
  var config: stdLib.Partial[Config]
  var curveNumber: scala.Double
  var data: js.Array[Data]
  var event: stdLib.MouseEvent
  var expandedIndex: scala.Double
  var frames: js.Array[Frame]
  var fullData: js.Array[Data]
  var fullLayout: stdLib.Partial[Layout]
  var layout: stdLib.Partial[Layout]
  var node: PlotlyHTMLElement
}

