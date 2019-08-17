package typings.atNivoLine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoLineMod {
  import typings.react.reactMod.FC
  import typings.react.reactMod.ReactNode
  import typings.std.Date

  type DataFormatter = js.Function1[/* value */ LineValue, String | Double]
  type Layer = LineLayerType | LineCustomLayer
  type LineCustomLayer = js.Function1[/* props */ LineCustomLayerProps, ReactNode]
  type LineValue = String | Double | Date
  type TooltipFormatter = js.Function1[/* value */ LineValue, ReactNode]
  type TooltipProp = FC[LineTooltipProps]
}
