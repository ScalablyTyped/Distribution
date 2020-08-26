package typings.officeUiFabricReact.useKeytipDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeytipData extends js.Object {
  var ariaDescribedBy: js.UndefOr[String] = js.native
  var keytipId: js.UndefOr[String] = js.native
}

object IKeytipData {
  @scala.inline
  def apply(): IKeytipData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKeytipData]
  }
  @scala.inline
  implicit class IKeytipDataOps[Self <: IKeytipData] (val x: Self) extends AnyVal {
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
    def setAriaDescribedBy(value: String): Self = this.set("ariaDescribedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaDescribedBy: Self = this.set("ariaDescribedBy", js.undefined)
    @scala.inline
    def setKeytipId(value: String): Self = this.set("keytipId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeytipId: Self = this.set("keytipId", js.undefined)
  }
  
}

