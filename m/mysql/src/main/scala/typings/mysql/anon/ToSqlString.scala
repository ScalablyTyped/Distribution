package typings.mysql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToSqlString extends js.Object {
  def toSqlString(): String = js.native
}

object ToSqlString {
  @scala.inline
  def apply(toSqlString: () => String): ToSqlString = {
    val __obj = js.Dynamic.literal(toSqlString = js.Any.fromFunction0(toSqlString))
    __obj.asInstanceOf[ToSqlString]
  }
  @scala.inline
  implicit class ToSqlStringOps[Self <: ToSqlString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setToSqlString(value: () => String): Self = this.set("toSqlString", js.Any.fromFunction0(value))
  }
  
}

