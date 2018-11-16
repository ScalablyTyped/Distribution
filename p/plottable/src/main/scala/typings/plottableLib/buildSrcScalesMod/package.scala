package typings
package plottableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcScalesMod {
  type IIncludedValuesProvider[D] = js.Function2[
    /* scale */ plottableLib.buildSrcScalesScaleMod.Scale[D, js.Any], 
    /* ignoreAnchorState */ js.UndefOr[scala.Boolean], 
    js.Array[D]
  ]
  type IPaddingExceptionsProvider[D] = js.Function1[
    /* scale */ plottableLib.buildSrcScalesQuantitativeScaleMod.QuantitativeScale[D], 
    js.Array[D]
  ]
}
