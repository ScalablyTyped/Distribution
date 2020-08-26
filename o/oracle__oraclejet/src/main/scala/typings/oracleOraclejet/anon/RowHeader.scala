package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowHeader extends js.Object {
  var rowHeader: String = js.native
}

object RowHeader {
  @scala.inline
  def apply(rowHeader: String): RowHeader = {
    val __obj = js.Dynamic.literal(rowHeader = rowHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowHeader]
  }
  @scala.inline
  implicit class RowHeaderOps[Self <: RowHeader] (val x: Self) extends AnyVal {
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
    def setRowHeader(value: String): Self = this.set("rowHeader", value.asInstanceOf[js.Any])
  }
  
}

