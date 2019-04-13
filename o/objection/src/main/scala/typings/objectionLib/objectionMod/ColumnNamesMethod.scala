package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// commons
@js.native
trait ColumnNamesMethod[QM /* <: Model */, RM, RV] extends js.Object {
  def apply(columnNames: ColumnRef*): QueryBuilder[QM, RM, RV] = js.native
  def apply(columnNames: js.Array[ColumnRef]): QueryBuilder[QM, RM, RV] = js.native
}

