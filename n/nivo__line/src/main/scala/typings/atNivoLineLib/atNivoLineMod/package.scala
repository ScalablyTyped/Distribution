package typings
package atNivoLineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoLineMod {
  type DataFormatter = js.Function1[/* value */ LineValue, java.lang.String | scala.Double]
  type Layer = LineLayerType | LineCustomLayer
  type LineCustomLayer = js.Function1[/* props */ LineCustomLayerProps, reactLib.reactMod.ReactNode]
  type LineValue = java.lang.String | scala.Double | stdLib.Date
  type TooltipFormatter = js.Function1[/* value */ LineValue, reactLib.reactMod.ReactNode]
  type TooltipProp = reactLib.reactMod.FC[LineTooltipProps]
}
