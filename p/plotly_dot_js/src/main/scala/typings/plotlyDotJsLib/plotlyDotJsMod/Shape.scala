package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Shape extends js.Object {
  var fillcolor: java.lang.String
  var layer: plotlyDotJsLib.plotlyDotJsLibStrings.below | plotlyDotJsLib.plotlyDotJsLibStrings.above
  var line: stdLib.Partial[ShapeLine]
  var opacity: scala.Double
  var path: java.lang.String
  var `type`: plotlyDotJsLib.plotlyDotJsLibStrings.rect | plotlyDotJsLib.plotlyDotJsLibStrings.circle | plotlyDotJsLib.plotlyDotJsLibStrings.line | plotlyDotJsLib.plotlyDotJsLibStrings.path
  var visible: scala.Boolean
  var x0: Datum
  var x1: Datum
  // x-reference is assigned to the x-values
  var xref: plotlyDotJsLib.plotlyDotJsLibStrings.x | plotlyDotJsLib.plotlyDotJsLibStrings.paper
  var y0: Datum
  var y1: Datum
  // y-reference is assigned to the plot paper [0,1]
  var yref: plotlyDotJsLib.plotlyDotJsLibStrings.paper | plotlyDotJsLib.plotlyDotJsLibStrings.y
}

