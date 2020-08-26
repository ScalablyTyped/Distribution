package typings.openfin.logMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLogRequestType extends js.Object {
  var endFile: js.UndefOr[String] = js.native
  var name: String = js.native
  var sizeLimit: js.UndefOr[Double] = js.native
}

object GetLogRequestType {
  @scala.inline
  def apply(name: String): GetLogRequestType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLogRequestType]
  }
  @scala.inline
  implicit class GetLogRequestTypeOps[Self <: GetLogRequestType] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndFile(value: String): Self = this.set("endFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndFile: Self = this.set("endFile", js.undefined)
    @scala.inline
    def setSizeLimit(value: Double): Self = this.set("sizeLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeLimit: Self = this.set("sizeLimit", js.undefined)
  }
  
}

