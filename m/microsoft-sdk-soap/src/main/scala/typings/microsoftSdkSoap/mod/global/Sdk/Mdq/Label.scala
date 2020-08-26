package typings.microsoftSdkSoap.mod.global.Sdk.Mdq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Label extends js.Object {
  var LocalizedLabels: js.Array[LocalizedLabel] = js.native
  var UserLocalizedLabel: LocalizedLabel = js.native
}

object Label {
  @scala.inline
  def apply(LocalizedLabels: js.Array[LocalizedLabel], UserLocalizedLabel: LocalizedLabel): Label = {
    val __obj = js.Dynamic.literal(LocalizedLabels = LocalizedLabels.asInstanceOf[js.Any], UserLocalizedLabel = UserLocalizedLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  @scala.inline
  implicit class LabelOps[Self <: Label] (val x: Self) extends AnyVal {
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
    def setLocalizedLabelsVarargs(value: LocalizedLabel*): Self = this.set("LocalizedLabels", js.Array(value :_*))
    @scala.inline
    def setLocalizedLabels(value: js.Array[LocalizedLabel]): Self = this.set("LocalizedLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserLocalizedLabel(value: LocalizedLabel): Self = this.set("UserLocalizedLabel", value.asInstanceOf[js.Any])
  }
  
}

