package typings.atNivoRadar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoRadarMod {
  import typings.atNivoCore.atNivoCoreMod.MotionProps
  import typings.react.reactMod.ReactNode

  type CustomDotLabel = js.Function1[/* repeated */ js.Any, ReactNode]
  type CustomDotSymbol = js.Function1[/* repeated */ js.Any, ReactNode]
  type CustomFormatter = js.Function1[/* repeated */ js.Any, ReactNode]
  type GridLabelCustomFunction = js.Function1[/* repeated */ js.Any, String]
  type IndexByCustomFunctiono[D] = js.Function1[/* datum */ D, String | Double]
  type RadarProps = CommonRadarProps[_] with MotionProps
}
