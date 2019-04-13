package typings
package atNivoLineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoLineMod {
  type Layer = LineLayerType | LineCustomLayer
  type LineCustomLayer = js.Function1[/* props */ LineCustomLayerProps, reactLib.reactMod.ReactNode]
  type TooltipFormatter = js.Function1[
    /* value */ java.lang.String | scala.Double | stdLib.Date, 
    reactLib.reactMod.ReactNode
  ]
}
