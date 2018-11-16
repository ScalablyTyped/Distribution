package typings
package plottableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcCoreFormattersMod {
  type DatumFormatter = js.Function4[
    /* value */ js.Any, 
    /* datum */ js.Any, 
    /* index */ scala.Double, 
    /* dataset */ plottableLib.buildSrcCoreDatasetMod.Dataset, 
    java.lang.String
  ]
  type Formatter = js.Function1[/* value */ js.Any, java.lang.String]
}
