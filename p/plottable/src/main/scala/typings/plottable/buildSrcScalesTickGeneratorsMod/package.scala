package typings.plottable

import typings.plottable.buildSrcScalesQuantitativeScaleMod.QuantitativeScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcScalesTickGeneratorsMod {
  type ITickGenerator[D] = js.Function1[/* scale */ QuantitativeScale[D], js.Array[D]]
}
