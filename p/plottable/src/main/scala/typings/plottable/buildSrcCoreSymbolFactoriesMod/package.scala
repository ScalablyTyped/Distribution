package typings.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcCoreSymbolFactoriesMod {
  import typings.d3DashShape.d3DashShapeMod.Symbol

  type SymbolFactory = js.Function1[/* symbolSize */ Double, Symbol[js.Any, js.Any]]
}
