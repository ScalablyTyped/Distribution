package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SQLResultSet extends js.Object {
  var insertId: scala.Double
  var rows: SQLResultSetRowList
  var rowsAffected: scala.Double
}

object SQLResultSet {
  @scala.inline
  def apply(insertId: scala.Double, rows: SQLResultSetRowList, rowsAffected: scala.Double): SQLResultSet = {
    val __obj = js.Dynamic.literal(insertId = insertId, rows = rows, rowsAffected = rowsAffected)
  
    __obj.asInstanceOf[SQLResultSet]
  }
}

