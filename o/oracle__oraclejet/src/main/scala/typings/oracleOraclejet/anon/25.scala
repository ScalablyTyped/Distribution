package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `25`[K] extends js.Object {
  var row: K = js.native
}

object `25` {
  @scala.inline
  def apply[K](row: K): `25`[K] = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[`25`[K]]
  }
  @scala.inline
  implicit class `25Ops`[Self <: `25`[_], K] (val x: Self with `25`[K]) extends AnyVal {
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
    def setRow(value: K): Self = this.set("row", value.asInstanceOf[js.Any])
  }
  
}

