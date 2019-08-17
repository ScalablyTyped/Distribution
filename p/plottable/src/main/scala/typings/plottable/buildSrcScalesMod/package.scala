package typings.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcScalesMod {
  import typings.plottable.buildSrcScalesQuantitativeScaleMod.QuantitativeScale
  import typings.plottable.buildSrcScalesScaleMod.Scale

  type IIncludedValuesProvider[D] = js.Function2[
    /* scale */ Scale[D, js.Any], 
    /* ignoreAnchorState */ js.UndefOr[Boolean], 
    js.Array[D]
  ]
  type IPaddingExceptionsProvider[D] = js.Function1[/* scale */ QuantitativeScale[D], js.Array[D]]
}
