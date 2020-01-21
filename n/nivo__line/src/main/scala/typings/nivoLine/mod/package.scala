package typings.nivoLine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DataFormatter = js.Function1[/* value */ typings.nivoLine.mod.LineValue, java.lang.String | scala.Double]
  type Layer = typings.nivoLine.mod.LineLayerType | typings.nivoLine.mod.LineCustomLayer
  type LineCustomLayer = js.Function1[/* props */ typings.nivoLine.mod.LineCustomLayerProps, typings.react.mod.ReactNode]
  type LineValue = java.lang.String | scala.Double | typings.std.Date
  type TooltipFormatter = js.Function1[/* value */ typings.nivoLine.mod.LineValue, typings.react.mod.ReactNode]
  type TooltipProp = typings.react.mod.FC[typings.nivoLine.mod.LineTooltipProps]
}
