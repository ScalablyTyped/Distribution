package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `21` extends js.Object {
  var column: single | multiple = js.native
  var row: single | multiple = js.native
}

object `21` {
  @scala.inline
  def apply(column: single | multiple, row: single | multiple): `21` = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[`21`]
  }
  @scala.inline
  implicit class `21Ops`[Self <: `21`] (val x: Self) extends AnyVal {
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
    def setColumn(value: single | multiple): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setRow(value: single | multiple): Self = this.set("row", value.asInstanceOf[js.Any])
  }
  
}

