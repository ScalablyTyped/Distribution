package typings.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DbName extends js.Object {
  var dbName: js.UndefOr[String] = js.native
}

object DbName {
  @scala.inline
  def apply(): DbName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DbName]
  }
  @scala.inline
  implicit class DbNameOps[Self <: DbName] (val x: Self) extends AnyVal {
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
    def setDbName(value: String): Self = this.set("dbName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDbName: Self = this.set("dbName", js.undefined)
  }
  
}

