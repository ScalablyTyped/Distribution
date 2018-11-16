package typings
package plottableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcScalesTickGeneratorsMod {
  type ITickGenerator[D] = js.Function1[
    /* scale */ plottableLib.buildSrcScalesQuantitativeScaleMod.QuantitativeScale[D], 
    js.Array[D]
  ]
}
