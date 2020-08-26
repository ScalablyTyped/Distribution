package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountBy extends js.Object {
  var countBy: String = js.native
}

object CountBy {
  @scala.inline
  def apply(countBy: String): CountBy = {
    val __obj = js.Dynamic.literal(countBy = countBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountBy]
  }
  @scala.inline
  implicit class CountByOps[Self <: CountBy] (val x: Self) extends AnyVal {
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
    def setCountBy(value: String): Self = this.set("countBy", value.asInstanceOf[js.Any])
  }
  
}

