package typings.numDashSort

import typings.numDashSort.numDashSortMod.NumberComparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("num-sort", JSImport.Namespace)
@js.native
object numDashSortMod extends js.Object {
  val ascending: NumberComparator = js.native
  val descending: NumberComparator = js.native
  type NumberComparator = js.Function2[/* left */ Double, /* right */ Double, Double]
}

