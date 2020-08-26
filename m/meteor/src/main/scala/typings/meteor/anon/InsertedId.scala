package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertedId extends js.Object {
  var insertedId: js.UndefOr[String] = js.native
  var numberAffected: js.UndefOr[Double] = js.native
}

object InsertedId {
  @scala.inline
  def apply(): InsertedId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertedId]
  }
  @scala.inline
  implicit class InsertedIdOps[Self <: InsertedId] (val x: Self) extends AnyVal {
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
    def setInsertedId(value: String): Self = this.set("insertedId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertedId: Self = this.set("insertedId", js.undefined)
    @scala.inline
    def setNumberAffected(value: Double): Self = this.set("numberAffected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberAffected: Self = this.set("numberAffected", js.undefined)
  }
  
}

