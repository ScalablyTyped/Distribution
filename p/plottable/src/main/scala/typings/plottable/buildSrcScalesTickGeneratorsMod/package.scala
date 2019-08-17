package typings.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcScalesTickGeneratorsMod {
  import typings.plottable.buildSrcScalesQuantitativeScaleMod.QuantitativeScale

  type ITickGenerator[D] = js.Function1[/* scale */ QuantitativeScale[D], js.Array[D]]
}
