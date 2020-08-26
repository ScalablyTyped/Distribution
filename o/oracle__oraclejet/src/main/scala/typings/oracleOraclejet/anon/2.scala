package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.`oj-datagrid-header`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `2` extends js.Object {
  var subId: `oj-datagrid-header` = js.native
}

object `2` {
  @scala.inline
  def apply(subId: `oj-datagrid-header`): `2` = {
    val __obj = js.Dynamic.literal(subId = subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  @scala.inline
  implicit class `2Ops`[Self <: `2`] (val x: Self) extends AnyVal {
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
    def setSubId(value: `oj-datagrid-header`): Self = this.set("subId", value.asInstanceOf[js.Any])
  }
  
}

