package typings.ngDashTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcCoreDataResultsMod {
  import typings.ngDashTable.Anon_VisibleColumnCount

  type DataResult[T] = T | IDataRowGroup[T]
  type DataResults[T] = js.Array[T] with Anon_VisibleColumnCount
  type GroupedDataResults[T] = js.Array[IDataRowGroup[T]] with Anon_VisibleColumnCount
}
