package typings
package atNivoRadarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoRadarMod {
  type CustomDotLabel = js.Function1[/* repeated */ js.Any, reactLib.reactMod.ReactNode]
  type CustomDotSymbol = js.Function1[/* repeated */ js.Any, reactLib.reactMod.ReactNode]
  type CustomFormatter = js.Function1[/* repeated */ js.Any, reactLib.reactMod.ReactNode]
  type GridLabelCustomFunction = js.Function1[/* repeated */ js.Any, java.lang.String]
  type IndexByCustomFunctiono[D] = js.Function1[/* datum */ D, java.lang.String | scala.Double]
  type RadarProps = CommonRadarProps[_] with atNivoCoreLib.atNivoCoreMod.MotionProps
}
