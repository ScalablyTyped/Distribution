package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SQLTransaction extends js.Object {
  def executeSql(sql: java.lang.String): SQLResultSet
}

object SQLTransaction {
  @scala.inline
  def apply(executeSql: java.lang.String => SQLResultSet): SQLTransaction = {
    val __obj = js.Dynamic.literal(executeSql = js.Any.fromFunction1(executeSql))
  
    __obj.asInstanceOf[SQLTransaction]
  }
}

