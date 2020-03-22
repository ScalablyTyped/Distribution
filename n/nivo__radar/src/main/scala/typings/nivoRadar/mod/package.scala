package typings.nivoRadar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomDotLabel = js.Function1[/* repeated */ js.Any, typings.react.mod.ReactNode]
  type CustomDotSymbol = js.Function1[/* repeated */ js.Any, typings.react.mod.ReactNode]
  type CustomFormatter = js.Function1[/* repeated */ js.Any, typings.react.mod.ReactNode]
  type GridLabelCustomFunction = js.Function1[/* repeated */ js.Any, java.lang.String]
  type IndexByCustomFunctiono[D] = js.Function1[/* datum */ D, java.lang.String | scala.Double]
  type RadarProps = typings.nivoRadar.mod.CommonRadarProps[_] with typings.nivoCore.mod.MotionProps
}
