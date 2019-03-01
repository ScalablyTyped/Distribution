package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnRowK[K] extends js.Object {
  var column: K
  var row: K
}

object Anon_ColumnRowK {
  @scala.inline
  def apply[K](column: K, row: K): Anon_ColumnRowK[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColumnRowK[K]]
  }
}

