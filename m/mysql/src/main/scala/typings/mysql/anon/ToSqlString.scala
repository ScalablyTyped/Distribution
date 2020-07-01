package typings.mysql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToSqlString extends js.Object {
  def toSqlString(): String
}

object ToSqlString {
  @scala.inline
  def apply(toSqlString: () => String): ToSqlString = {
    val __obj = js.Dynamic.literal(toSqlString = js.Any.fromFunction0(toSqlString))
    __obj.asInstanceOf[ToSqlString]
  }
}

