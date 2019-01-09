package typings
package ngDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcCoreDataResultsMod {
  type DataResult[T] = T | IDataRowGroup[T]
  type DataResults[T] = js.Array[T] with ngDashTableLib.Anon_VisibleColumnCount
  type GroupedDataResults[T] = js.Array[IDataRowGroup[T]] with ngDashTableLib.Anon_VisibleColumnCount
}
