package typings.nodeHueApi.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Createdate extends js.Object {
  var `create date`: Date = js.native
  var `last use date`: Date = js.native
  var name: String = js.native
}

object Createdate {
  @scala.inline
  def apply(`create date`: Date, `last use date`: Date, name: String): Createdate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("create date")((`create date`).asInstanceOf[js.Any])
    __obj.updateDynamic("last use date")((`last use date`).asInstanceOf[js.Any])
    __obj.asInstanceOf[Createdate]
  }
  @scala.inline
  implicit class CreatedateOps[Self <: Createdate] (val x: Self) extends AnyVal {
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
    def `setCreate date`(value: Date): Self = this.set("create date", value.asInstanceOf[js.Any])
    @scala.inline
    def `setLast use date`(value: Date): Self = this.set("last use date", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

