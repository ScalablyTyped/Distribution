package typings.plottable

import typings.plottable.buildSrcCoreDatasetMod.Dataset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcCoreFormattersMod {
  type DatumFormatter = js.Function4[
    /* value */ js.Any, 
    /* datum */ js.Any, 
    /* index */ Double, 
    /* dataset */ Dataset, 
    String
  ]
  type Formatter = js.Function1[/* value */ js.Any, String]
}
